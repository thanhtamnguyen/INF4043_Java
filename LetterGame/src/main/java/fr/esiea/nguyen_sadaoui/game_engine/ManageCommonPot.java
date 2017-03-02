package fr.esiea.nguyen_sadaoui.game_engine;
import fr.esiea.nguyen_sadaoui.objects.*;

import java.util.ArrayList;

public class ManageCommonPot {
	public static void putInPot(int cas) {
		ArrayList<String> lettres = ManageLetter.generateLetter(cas);
		ArrayList<String> potCommun = new ArrayList<String>();
		
		for(int i = 0; i < lettres.size(); i++) { //Boucle pour ajouter au tableau les lettres générées aléatoirement
			potCommun.add(lettres.get(i));
	    }
		
		for (String c : potCommun) // Boucle pour afficher l'intégralité des lettres saved dans le pot commun
		    System.out.println("Le pot commun contient la lettre:" + c);
	}
}
