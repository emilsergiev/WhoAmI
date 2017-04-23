package sourceCode;

public class QuestionsAndAnswer {
	private String[][] questionsAndAnswers = new String[15][5];

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
		
		questionsAndAnswers[3][0] = "How many people are in the house?";
		questionsAndAnswers[3][1] = "1";
		questionsAndAnswers[3][2] = "2";
		questionsAndAnswers[3][3] = "3";
		questionsAndAnswers[3][4] = "2";
		
		questionsAndAnswers[4][0] = "What is the date?";
		questionsAndAnswers[4][1] = "September 1";
		questionsAndAnswers[4][2] = "June 27";
		questionsAndAnswers[4][3] = "Jully 4";
		questionsAndAnswers[4][4] = "1";
		
		questionsAndAnswers[5][0] = "What color is the vacum cleaner?";
		questionsAndAnswers[5][1] = "green";
		questionsAndAnswers[5][2] = "orange";
		questionsAndAnswers[5][3] = "yellow";
		questionsAndAnswers[5][4] = "2";
		
		questionsAndAnswers[6][0] = "What is the time?";
		questionsAndAnswers[6][1] = "10:20";
		questionsAndAnswers[6][2] = "11:11";
		questionsAndAnswers[6][3] = "13:50";
		questionsAndAnswers[6][4] = "3";
		
		questionsAndAnswers[7][0] = "What is that smell?";
		questionsAndAnswers[7][1] = "sauerkraut";
		questionsAndAnswers[7][2] = "coffee";
		questionsAndAnswers[7][3] = "deodorant";
		questionsAndAnswers[7][4] = "2";
		
		questionsAndAnswers[8][0] = "This picture looks familiar, who is the artist?";
		questionsAndAnswers[8][1] = "Leonardo da Vinci";
		questionsAndAnswers[8][2] = "Picasso";
		questionsAndAnswers[8][3] = "Kalin Tzilev";
		questionsAndAnswers[8][4] = "1";
		
		questionsAndAnswers[9][0] = "Why was is slippery?";
		questionsAndAnswers[9][1] = "banana pill";
		questionsAndAnswers[9][2] = "soap bar on the floor";
		questionsAndAnswers[9][3] = "water spill on the floor";
		questionsAndAnswers[9][4] = "3";
		
		questionsAndAnswers[10][0] = "I scared myself to death, why?";
		questionsAndAnswers[10][1] = "I saw myself in the mirror";
		questionsAndAnswers[10][2] = "I saw a rat";
		questionsAndAnswers[10][3] = "I saw a spider";
		questionsAndAnswers[10][4] = "1";
		
		questionsAndAnswers[11][0] = "What is my motto?";
		questionsAndAnswers[11][1] = "We are stronger together";
		questionsAndAnswers[11][2] = "Later equals never";
		questionsAndAnswers[11][3] = "Last but not least";
		questionsAndAnswers[11][4] = "2";
		
		questionsAndAnswers[12][0] = "Is there a tool that can bring back my memories?";
		questionsAndAnswers[12][1] = "A USB flash drive";
		questionsAndAnswers[12][2] = "A screw driver";
		questionsAndAnswers[12][3] = "A knife";
		questionsAndAnswers[12][4] = "1";
		
		questionsAndAnswers[13][0] = "What we all need to do?";
		questionsAndAnswers[13][1] = "love";
		questionsAndAnswers[13][2] = "win";
		questionsAndAnswers[13][3] = "loose";
		questionsAndAnswers[13][4] = "2";
		
		questionsAndAnswers[14][0] = "What is my favorite programming language?";
		questionsAndAnswers[14][1] = "Java";
		questionsAndAnswers[14][2] = "PHP";
		questionsAndAnswers[14][3] = "Python";
		questionsAndAnswers[14][4] = "1";
	}

	public String getQuestionsAndAnswers(int x, int y) {
		return questionsAndAnswers[x][y];
	}

	public void setQuestionsAndAnswers(String[][] questionsAndAnswers) {
		this.questionsAndAnswers = questionsAndAnswers;
	}

}
