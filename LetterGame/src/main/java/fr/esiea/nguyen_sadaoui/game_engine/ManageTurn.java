package fr.esiea.nguyen_sadaoui.game_engine;

import java.util.ArrayList;

import fr.esiea.nguyen_sadaoui.objects.Player;

public class ManageTurn {

	static int turn = 1;
	
	public static void Action() {
		
		
	}
	
	public static void turn(Player player1, Player player2) {
		
		//while (player1.getScore() != 10 || player2.getScore() != 10) {
			
			/*if( turn == 1) {
			
					System.out.println("Tour 1");
					System.out.println("Le joueur 1 tire une lette.");
					ArrayList<String> pot1 = ManageCommonPot.putInPot(1, player1);
					System.out.println("Le joueur 2 tire une lette.");
					ArrayList<String> pot2 = ManageCommonPot.putInPot(1, player1);
					
					for(int i = 0; i < pot1.size(); i++) { 
						for(int j = 0; i < pot2.size(); i++) { 
							//compare les string puis dis quel joueur commence
								
					    }
				    }
			
			} else if( turn !=1) {
				//mettre le if pour savoir quel joueur avait la meilleure
				System.out.println("Tour 1");
				System.out.println("Le joueur 1 tire une lette.");
				ManageCommonPot.putInPot(1, player1);
			}
			*/
			
		//}
		
	}
	 
	public static void playerComparison() {
		
	}

	public static int whoStarts(Player player1, Player player2) {
		/*
		 * The first turn determine who starts
		 * Get two letters and compare
		 * Return ID of player who will start
		 */
		ArrayList<String> pickTwoLetters = ManageLetter.generateLetter(2);
		int letter1 = Character.getNumericValue(pickTwoLetters.get(0).charAt(0));
		int letter2 = Character.getNumericValue(pickTwoLetters.get(1).charAt(0));
		if(letter1<letter2){
			System.out.println("Player"+player1.getName()+"starts with letter "+pickTwoLetters.get(0));
			return player1.getIdPlayer();
		}else{
			System.out.println("Player"+player2.getName()+"starts with letter "+pickTwoLetters.get(1));
			return player2.getIdPlayer();
		}
		
	}
	
	public static boolean checkScoreAndContinue(Player player1, Player player2){
		/*
		 * Check all players' score
		 * True if none has 10 (continue game)
		 * Else False (stop game)
		 */
		boolean continueGame = true;
		if(player1.getScore() == 10 || player2.getScore() == 10) continueGame = false;
		return continueGame;
	}

	public static void whoWins(Player player1, Player player2) {
		/*
		 * Determine which player has the best score
		 */
		String winner = "";
		if(player1.getScore() > player2.getScore()){
			winner = player1.getName();
		}else{
			winner = player2.getName();
		}
		System.out.println("Congratulation to "+winner+", you won!!");
	}

	public static void gameSummary(Player player1, Player player2, int currentPlayerID) {
		/*
		 * Game Summary
		 * Show letters in commonPot and all players' letters
		 * Reminds who plays
		 */
		String summary = "\n*************************\n";
		summary += ManageCommonPot.showPot();
		summary += ManagePlayer.showPlayerWord(player1);
		summary += ManagePlayer.showPlayerWord(player2);
		if(currentPlayerID==1){
			summary += "\nC'est au tour de "+player1.getName();
		}else{
			summary += "\nC'est au tour de "+player2.getName();
		}summary += " de jouer\n*************************\n";
		System.out.println(summary);
	}
}
