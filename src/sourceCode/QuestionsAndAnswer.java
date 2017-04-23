package sourceCode;

public class QuestionsAndAnswer {
	private String[][] questionsAndAnswers = new String[10][5];

	public QuestionsAndAnswer() {
		questionsAndAnswers[0][0] = "Why do I see blurry??";
		questionsAndAnswers[0][1] = "Because I hit my head";
		questionsAndAnswers[0][2] = "Because I usually wear glasses";
		questionsAndAnswers[0][3] = "Because I am drunk";
		questionsAndAnswers[0][4] = "2";
		questionsAndAnswers[1][0] = "How many are the tulips?";
		questionsAndAnswers[1][1] = "9";
		questionsAndAnswers[1][2] = "8";
		questionsAndAnswers[1][3] = "6";
		questionsAndAnswers[1][4] = "1";
		questionsAndAnswers[2][0] = "Where is the cat?";
		questionsAndAnswers[2][1] = "Chasing the doves";
		questionsAndAnswers[2][2] = "Near the car";
		questionsAndAnswers[2][3] = "In front of the door";
		questionsAndAnswers[2][4] = "3";
	}

	public String getQuestionsAndAnswers(int x, int y) {
		return questionsAndAnswers[x][y];
	}

	public void setQuestionsAndAnswers(String[][] questionsAndAnswers) {
		this.questionsAndAnswers = questionsAndAnswers;
	}

}
