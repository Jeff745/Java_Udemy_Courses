package academy.learnprogramming;

public class Main {
	
	public static void main(String[] args) {
		
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus =100 ;
		
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //arguments: actual values that we send to the method. Need to match the actual parameters defined.
		//assign variable to method
		System.out.println(" Your final score was " + highScore);
		
		score = 100;
		levelCompleted = 8;
		bonus = 200;
		calculateScore(gameOver, score, levelCompleted, bonus);
		
//		if (score < 5000 && score >1000) {
//				System.out.println("Your score was less than 5000 but greater than 1000");
//			
//			}
//		
//		else if (score < 1000) {
//			
//			System.out.println("Your score was less than than 1000");
//		}
//		
//		else {
//			System.out.println("Got here");
//			
//		}

		if (gameOver) {
			int finalScore = score + (levelCompleted *bonus);
			System.out.println(" Your final score was " + finalScore);
			
		}
		
			
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		
		if (gameOver) {
			int finalScore = score + (levelCompleted *bonus);
			System.out.println(" Your final score was " + finalScore);
			
		}
		
	}
	
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		if (gameOver) {
			
			int finalScore = score + (levelCompleted *bonus);
			finalScore += 2000;
			System.out.println(" Your final score was " + finalScore);
			return finalScore;
			
		}
		
		else {
			
			return -1;
			
		}
		
	}

}
