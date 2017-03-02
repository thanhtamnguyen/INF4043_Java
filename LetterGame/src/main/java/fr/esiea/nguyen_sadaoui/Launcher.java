package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.game_engine.*;
import fr.esiea.nguyen_sadaoui.objects.*;

public class Launcher {

	private Player player1;
	private Player player2;
	
	public static void main(String args[]){
		System.out.println("Launching Letter Game");
		Dictionary dico = Dictionary.getInstance();
		ManagePlayer.playerInit();
		//GestionLettres.recupLettres(2);
		ManageCommonPot.putInPot(2);
	}
	
	//shuffle letter au debut
	//Collections.shuffle
}
