import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int replay = 1;
		int yourScore = 0;
		int enemyScore = 0;
		int tieGames = 0;
		
		while(replay == 1)
		{
			
		System.out.println("Let's play rock paper scissors! Now type rock, paper, or scissors as your option: ");
		String enemy = s.nextLine();
			
		char enemyChar = enemy.charAt(0);
		int test = (int) (Math.random() * 3) + 1;
		int enemyNumber = 0;
		String ourAnswer = " ";
		
			if (test == 1) {
				ourAnswer = "Rock";
			}
			
			if (test == 2) {
				ourAnswer = "Scissors";
			}
			
			if (test == 3) {
				ourAnswer = "Paper";
			}
			
			if ((enemyChar == 'r') || (enemyChar == 'R'))
			{
				enemyNumber = 1;
				
			}
			
			if  ((enemyChar == 's') || (enemyChar == 'S'))
			{
				enemyNumber = 2;
			}
			
			if ((enemyChar == 'p') || (enemyChar == 'P'))
			{
				enemyNumber = 3;
				
			}	
			
			if (enemyNumber == test) {
				
				System.out.println("The bot chose " + ourAnswer);
				System.out.println("It's a tie!");
				tieGames += 1;
				
			}
			
			if ((test == 1) && (enemyNumber == 3)) {
				System.out.println("Bot chose Rock.");
				System.out.println("You win!");
				yourScore += 1;
			}
			
			if ((test == 1) && (enemyNumber == 2)) {
				System.out.println("Bot chose Rock.");
				System.out.println("You lose!");
				enemyScore += 1;
			}
			
			if ((test == 2) && (enemyNumber == 1)) {
				System.out.println("Bot chose Scissors.");
				System.out.println("You win!");
				yourScore += 1;
			}
			
			if ((test == 2) && (enemyNumber == 3)) {
				System.out.println("Bot chose Scissors.");
				System.out.println("You lose!");
				enemyScore += 1;
			}
			
			if ((test == 3) && (enemyNumber == 1)) {
				System.out.println("Bot chose Paper.");
				System.out.println("You lose!");
				enemyScore += 1;
			}
			
			if ((test == 3) && (enemyNumber == 2)) {
				System.out.println("Bot chose Paper.");
				System.out.println("You win!");
				yourScore += 1;
			}
		
			
			System.out.println("Your wins: " + yourScore + " | Bots wins: " + enemyScore + " | Ties: " + tieGames);
			System.out.println("Do you want to play again? (Yes or No)");
			String again = s.nextLine();
			char againChar = again.charAt(0);

			if((againChar == 'y') || (againChar == 'Y'))
			{
				replay = 1;
			} 
			
			if((againChar == 'n') || (againChar == 'N'))
			{
				replay = 0;
				System.out.println("Game Over.");
				System.out.println("Final score:" + " Your wins: " + yourScore + " | Bots wins: " + enemyScore + " | Ties: " + tieGames);
			}
		}
	} 
}