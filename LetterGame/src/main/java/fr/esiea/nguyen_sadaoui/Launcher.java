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
		ManagePlayer.playerInit(player1, player2);
		int currentPlayerID = 0;
		
		//WORKING
		currentPlayerID = ManageTurn.whoStarts(player1, player2);
		
		while(ManageTurn.checkScoreAndContinue(player1, player2)){
			ManageTurn.gameSummary(player1, player2, currentPlayerID);
		}
		ManageTurn.whoWins(player1, player2);
		System.exit(0);
		
		
		//OLD
		//GestionLettres.recupLettres(2);
		ManageCommonPot.putInPot(2);
		
		ManageTurn.turn(player1, player2);
		//Quelle action faire?
		//1-Ecrire un mot?
			/* 
			String newWord = ManagePlayer.promptForWord();
			////newWord existe dans dico?
			dico.isWord(newWord);
			////on enleve les lettres du pot
			ManageCommonPot.removeLettersOfWord(newWord);
			////mise a jour du joueur
			ManagePlayer.addWordForPlayer(player1, newWord);
			*/
		//2-Passer le tour?
			///on recommence
		//3-Arreter le jeu
			////System.exit(0)
	}
}
