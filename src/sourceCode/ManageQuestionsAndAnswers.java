package sourceCode;

public class ManageQuestionsAndAnswers {
	QuestionsAndAnswer qAA = new QuestionsAndAnswer();
	//ScreenPanel scrPanel = new ScreenPanel();
	private int question = 0;
	private int returnedAnswer;

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
		String strAnswer = Integer.toString(answer);
		if(strAnswer.equals(qAA.getQuestionsAndAnswers(question, 4))){
			ScreenPanel scrPanel = new ScreenPanel();
			question+=1;
			scrPanel.questionsAttributes(question);
			System.out.println("OK");
		} else {
			System.out.println("wrong");
		}
	}

}
