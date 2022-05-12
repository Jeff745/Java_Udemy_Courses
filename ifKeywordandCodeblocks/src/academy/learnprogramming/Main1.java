package academy.learnprogramming;

public class Main1 {
	
	public static void main(String[] args) {
		
		int highScorePosition = calculateHighscorePosition(1500); //create a new variable by calling methods
		displayHighscorePosition("Jack", highScorePosition);

		 highScorePosition = calculateHighscorePosition(900); //create a new variable by calling methods
		displayHighscorePosition("Bob", highScorePosition); //Call display method, pass in name and high score position.
		
		 highScorePosition = calculateHighscorePosition(400); //create a new variable by calling methods
		displayHighscorePosition("Percy", highScorePosition);
		
		 highScorePosition = calculateHighscorePosition(50); //create a new variable by calling methods
		displayHighscorePosition("Prabhu", highScorePosition);
		
		 highScorePosition = calculateHighscorePosition(1000); //create a new variable by calling methods
		displayHighscorePosition("Jane", highScorePosition);

	 highScorePosition = calculateHighscorePosition(500); //create a new variable by calling methods
		displayHighscorePosition("Ricky", highScorePosition);
		
		 highScorePosition = calculateHighscorePosition(100); //create a new variable by calling methods
		displayHighscorePosition("Robert", highScorePosition);
			
		
	}
	

	public static void displayHighscorePosition(String name, int position) {
		
		System.out.println( name +" managed to get into position " + position + " on the high score table ");
		
		
	}
	
	public static int calculateHighscorePosition(int score) {
		
//		if (score >= 1000) {
//			return 1;
//						
//		}
//		
//		else if (score >= 500) {
//				return 2;
//			}
//		
//		else if (score >= 100) {
//				return 3;
//			}
//		
//		else {
//			return 4;
//		}
		
		int position =4; //assume position is 4 from the start
		 
		if (score>=1000) {
			position = 1;
			
		}
		
		else if (score>=500) {
			position = 2;
			
		}
		
		else if (score>=100) {
			position = 3;
			
		}
		
		return position; //return position '4' in last else statement
		
		
	}
	
	
	

}
