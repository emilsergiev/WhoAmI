package sourceCode;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ScreenPanel extends JPanel {
	QuestionsAndAnswer qAA = new QuestionsAndAnswer();

	public ScreenPanel() {
		setLayout(null);
		setSize(800, 600);
		
		JLabel questionLabel = new JLabel("question");
		questionLabel.setBounds(10, 25, 645, 79);
		questionLabel.setText(qAA.getQuestionsAndAnswers(0, 0));
		System.out.println(qAA.getQuestionsAndAnswers(0, 0));
		add(questionLabel);
		
		JButton firstAnswerBtn = new JButton();
		firstAnswerBtn.setBounds(85, 142, 570, 52);
		firstAnswerBtn.setText(qAA.getQuestionsAndAnswers(0,1));
		add(firstAnswerBtn);
		
		JButton secondAnswerBtn = new JButton();
		secondAnswerBtn.setBounds(85, 205, 571, 44);
		secondAnswerBtn.setText(qAA.getQuestionsAndAnswers(0,2));
		add(secondAnswerBtn);
		
		JButton thirdAnswerBtn = new JButton("thirdAnswer");
		thirdAnswerBtn.setText(qAA.getQuestionsAndAnswers(0,3));
		thirdAnswerBtn.setBounds(85, 260, 570, 52);
		add(thirdAnswerBtn);

	}
}
