package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.game_engine.*;
import fr.esiea.nguyen_sadaoui.objects.*;

public class Launcher {

	private static Player player1;
	private static Player player2;
	
	public static void main(String args[]){
		/*
		 * Letter Game
		 */
		System.out.println("Launching Letter Game");
		
		/*
		 * Object instanciation
		 */
		Dictionary dico = Dictionary.getInstance();
		CommonPot pot = CommonPot.getInstance();
		//ManagePlayer.onePlayerInit(player1, player2);
		player1 = ManagePlayer.onePlayerInit();
		player2 = ManagePlayer.onePlayerInit();
		int currentPlayerID = 0;
		
		//WORKING
		currentPlayerID = ManageTurn.whoStarts(player1, player2);
		
		while(ManageTurn.checkScoreAndContinue(player1, player2)){
			ManageTurn.gameSummary(player1, player2, currentPlayerID);
			int choice = ManageTurn.action();
			switch(choice){
				case 1:
					System.out.println("Vous avez choisi de construire un mot");
					try {
						String newWord = ManagePlayer.promptForWord();
						if(ManageDictionary.existInDico(newWord)){
							if(ManageCommonPot.potHasAllLettersForWord(newWord)){
								ManageCommonPot.removeLettersOfWord(newWord);
								ManagePlayer.addWordForPlayer(ManageTurn.whoPlays(player1, player2, currentPlayerID), newWord);
							}else{
								System.out.println("Soumission de mot non valide. Il peut manquer des lettres dans le pot");
								break;
							}
						}else{
							System.out.println("Ce mot est introuvable dans le dictionnaire");
							break;
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					System.out.println("Vous avez choisi de réutiliser un mot connu");
					break;
				case 3:
					System.out.println("Vous passez le tour");
					currentPlayerID = ManageTurn.switchTurn(currentPlayerID);
					continue;
				case 4:
					System.out.println("Fin du jeu");
					System.exit(0);
			}
			currentPlayerID = ManageTurn.switchTurn(currentPlayerID);
		}
		ManageTurn.whoWins(player1, player2);
		System.exit(0);
		
		
		//OLD
		//GestionLettres.recupLettres(2);
		ManageCommonPot.putInPot(2);
		
		ManageTurn.turn(player1, player2);
	}
}
