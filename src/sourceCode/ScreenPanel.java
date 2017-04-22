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

public class ScreenPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
	}

	private QuestionsAndAnswer qAA = new QuestionsAndAnswer();
	private ManageQuestionsAndAnswers mQAA = new ManageQuestionsAndAnswers();
	private BufferedImage img;

	public ScreenPanel() {
		setLayout(null);
		setSize(800, 600);
		setImageBackground();
		questionsAttributes(mQAA.getQuestion());
	}

	public void questionsAttributes(int question) {
		addButtons(question);
		addQuestionLabel(question);
		repaint();
		System.out.println(question);
		
	}

	private void addQuestionLabel(int question) {
		JLabel questionLabel = new JLabel();
		questionLabel.setForeground(Color.WHITE);
		questionLabel.setBounds(10, 25, 645, 79);
		questionLabel.setText(qAA.getQuestionsAndAnswers(question, 0));
		add(questionLabel);

	}

	private void addButtons(int question) {
		JButton firstAnswerBtn = new JButton();
		firstAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mQAA.checkAnswer(1);
			}
		});
		firstAnswerBtn.setBounds(85, 142, 570, 52);
		firstAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 1));
		add(firstAnswerBtn);

		JButton secondAnswerBtn = new JButton();
		secondAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mQAA.checkAnswer(2);
			}
		});
		secondAnswerBtn.setBounds(85, 205, 571, 44);
		secondAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 2));
		add(secondAnswerBtn);

		JButton thirdAnswerBtn = new JButton("thirdAnswer");
		thirdAnswerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mQAA.checkAnswer(3);
			}
		});
		thirdAnswerBtn.setText(qAA.getQuestionsAndAnswers(question, 3));
		thirdAnswerBtn.setBounds(85, 260, 570, 52);
		add(thirdAnswerBtn);

	}

	private void setImageBackground() {
		try {
			img = ImageIO.read(new File("C:/Users/N/workspace/WhoAmI/src/media/Who-Am-I.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
