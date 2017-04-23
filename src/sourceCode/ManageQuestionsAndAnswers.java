package sourceCode;

public class ManageQuestionsAndAnswers {
	QuestionsAndAnswer qAA = new QuestionsAndAnswer();
	private int question = 0;
	private int returnedAnswer;
	String strAnswer;

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
		switch (question) {
		case 2:
			new HallRoom();
			break;
		case 5:
			new RoomWithPainting();
			break;

		default:
			break;
		}
		if(strAnswer.equals(qAA.getQuestionsAndAnswers(question, 4))){
			question+=1;
			WelcomeScreen.scrPan.changeQAA(question);
			System.out.println("OK"+" // "+question);
		} else {
			System.out.println("wrong");
		}
	}

}
