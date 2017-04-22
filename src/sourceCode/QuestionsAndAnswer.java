package sourceCode;

public class QuestionsAndAnswer {
	private String[][] questionsAndAnswers = new String[10][5];

	public QuestionsAndAnswer() {
		questionsAndAnswers[0][0] = "How many flowers?";
		questionsAndAnswers[0][1] = "5";
		questionsAndAnswers[0][2] = "10";
		questionsAndAnswers[0][3] = "9";
		questionsAndAnswers[0][4] = "3";
		questionsAndAnswers[1][0] = "How many cats?";
		questionsAndAnswers[1][1] = "5";
		questionsAndAnswers[1][2] = "1";
		questionsAndAnswers[1][3] = "9";
		questionsAndAnswers[1][4] = "2";
	}

	public String getQuestionsAndAnswers(int x, int y) {
		return questionsAndAnswers[x][y];
	}

	public void setQuestionsAndAnswers(String[][] questionsAndAnswers) {
		this.questionsAndAnswers = questionsAndAnswers;
	}

}
