package fr.esiea.nguyen_sadaoui.game_engine;
import fr.esiea.nguyen_sadaoui.objects.*;

import java.util.ArrayList;

public class ManageCommonPot {
	public static void putInPot(int cas) {
		ArrayList<String> lettres = ManageLetter.generateLetter(cas);
		//ArrayList<String> potCommun = new ArrayList<String>();
		CommonPot pot = CommonPot.getInstance();

		for(int i = 0; i < lettres.size(); i++) { 
			//Boucle pour ajouter au tableau les lettres générées aléatoirement
			pot.addLetter(lettres.get(i));

	    }

		for (String c : pot.getAllLetters()) 
			// Boucle pour afficher l'intégralité des lettres saved dans le pot commun
		    System.out.println("Le pot commun contient la lettre:" + c);
	}
	
	public static boolean potHasAllLettersForWord(String word){
		CommonPot pot = CommonPot.getInstance();
		int count = 0;
		for(char c : word.toCharArray()){
			if(pot.hasLetter(""+c)) count+=1;
			else break;
		}
		if(count == word.length()) return true;
		else return false;
	}

	public static void removeLettersOfWord(String word){
		CommonPot pot = CommonPot.getInstance();
		for(char c : word.toCharArray()){
			if(pot.hasLetter(""+c)) pot.removeLetter(""+c);
		}
	}
}
