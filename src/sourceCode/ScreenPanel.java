package sourceCode;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class ScreenPanel extends JPanel {

	private static final int BTN_WIDTH = 500;
	private static final int BTN_HEIGHT = 50;
	private static final int LEFT_ALIGNMENT = 150;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}

	private QuestionsAndAnswer qAA = new QuestionsAndAnswer();
	private static ManageQuestionsAndAnswers mQAA = new ManageQuestionsAndAnswers();
	private static BufferedImage img;
	JLabel questionLabel = new JLabel();
	static JLabel wrongAnswer = new JLabel();
	JButton firstAnswerBtn = new JButton();
	JButton secondAnswerBtn = new JButton();
	JButton thirdAnswerBtn = new JButton();

	public ScreenPanel() {
		setLayout(null);
		setSize(800, 600);
		setImageBackground();
		questionsAttributes(mQAA.getQuestion());
	}

	public void questionsAttributes(int question) {
		addButtons(question);
		addQuestionLabel(question);
		addWrongAnswerLabel();
		changeQAA(question);
	}

	public void changeQAA(int question) {
		firstAnswerBtn.setText("");
		firstAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 1));
		secondAnswerBtn.setText("");
		secondAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 2));
		thirdAnswerBtn.setText("");
		thirdAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 3));
		questionLabel.setText("");
		questionLabel.setText(qAA.getQuestionsAndAnswers(question, 0));
		wrongAnswer.setText("");
	}

	private void addQuestionLabel(int question) {
		questionLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		questionLabel.setBounds(LEFT_ALIGNMENT, 100, BTN_WIDTH, BTN_HEIGHT);
		add(questionLabel);
	}

	private void addWrongAnswerLabel() {
		wrongAnswer.setForeground(Color.RED);
		wrongAnswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		wrongAnswer.setBounds(LEFT_ALIGNMENT, 500, BTN_WIDTH, BTN_HEIGHT);
		add(wrongAnswer);
	}

	private void addButtons(int question) {
		firstAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mQAA.checkAnswer(1);
			}
		});
		firstAnswerBtn.setBounds(LEFT_ALIGNMENT, 200, BTN_WIDTH, BTN_HEIGHT);

		add(firstAnswerBtn);

		secondAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mQAA.checkAnswer(2);
			}
		});
		secondAnswerBtn.setBounds(LEFT_ALIGNMENT, 300, BTN_WIDTH, BTN_HEIGHT);

		add(secondAnswerBtn);

		thirdAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mQAA.checkAnswer(3);
			}
		});

		thirdAnswerBtn.setBounds(LEFT_ALIGNMENT, 400, BTN_WIDTH, BTN_HEIGHT);
		add(thirdAnswerBtn);

	}

	static void setImageBackground() {
		switch (mQAA.getQuestion()) {
		case 0:
			try {
				img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/pictures/yardblur.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			if (!mQAA.wrongAnswer) {
				try {
					img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/pictures/hallblur.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case 6:
			if (!mQAA.wrongAnswer) {
				try {
					img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/pictures/room1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			break;
		case 9:
			try {
				img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/pictures/toilet.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 12:
			try {
				img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/pictures/room2blur.jpg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		default:
			break;
		}

	}
}
