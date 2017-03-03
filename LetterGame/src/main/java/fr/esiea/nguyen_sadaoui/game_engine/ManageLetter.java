package fr.esiea.nguyen_sadaoui.game_engine;

import java.util.ArrayList;
import java.util.Random;

public class ManageLetter {

	public static ArrayList<String> generateLetter(int cas) {
		Random r = new Random();
		ArrayList<String> intermediate = new ArrayList();
		
		if(cas == 1) {
			char lettre1 = (char)(r.nextInt(26) + 'a');	
			intermediate.add(""+lettre1);
			
		} else if (cas == 2) {
			char lettre2 = (char)(r.nextInt(26) + 'a');	
			intermediate.add(""+lettre2);
			char lettre3 = (char)(r.nextInt(26) + 'a');
			intermediate.add(""+lettre3);
		}
		return intermediate;
	}
	
}
