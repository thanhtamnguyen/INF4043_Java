package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.game_engine.*;
import fr.esiea.nguyen_sadaoui.objects.*;

public class Launcher {

	private static Player player1;
	private static Player player2;
	
	public static void main(String args[]){
		System.out.println("Launching Letter Game");
		Dictionary dico = Dictionary.getInstance();
		ManagePlayer.playerInit(player1, player2);
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
		
	}
}
