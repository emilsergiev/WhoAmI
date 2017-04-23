package sourceCode;

public class ManageQuestionsAndAnswers {
	QuestionsAndAnswer qAA = new QuestionsAndAnswer();
	private int question = 0;
	private int returnedAnswer;
	String strAnswer;
	public boolean wrongAnswer = false;

	public int getReturnedAnswer() {
		return returnedAnswer;
	}

	public void setReturnedAnswer(int returnedAnswer) {
		this.returnedAnswer = returnedAnswer;
	}

	public int getQuestion() {
		return question;
	}

	public void checkAnswer(int answer) {
		strAnswer = Integer.toString(answer);
		if (strAnswer.equals(qAA.getQuestionsAndAnswers(question, 4))) {
			question += 1;
			WelcomeScreen.scrPan.changeQAA(question);
			ScreenPanel.wrongAnswer.setText("");
			System.out.println("OK" + " // " + question);
			wrongAnswer=false;
		} else {
			ScreenPanel.wrongAnswer.setText("Wrong answer!");
			wrongAnswer = true;
		}
		switch (question) {
		case 3:
			if (!wrongAnswer) {
				new HallRoom();
				ScreenPanel.setImageBackground();
				WelcomeScreen.scrPan.repaint();
			}
			break;
		case 6:
			if (!wrongAnswer) {
				new RoomWithPainting();
				ScreenPanel.setImageBackground();
				WelcomeScreen.scrPan.repaint();
			}
			break;
		case 9:
			if (!wrongAnswer) {
				new Toilet();
				ScreenPanel.setImageBackground();
				WelcomeScreen.scrPan.repaint();
			}
			break;
		case 12:
			if (!wrongAnswer) {
				new ComputerRoom();
				ScreenPanel.setImageBackground();
				WelcomeScreen.scrPan.repaint();
			}
			break;
		case 15:
			if (!wrongAnswer) {
				new Outro();
			}
			break;

		default:
			break;
		}

	}

}
