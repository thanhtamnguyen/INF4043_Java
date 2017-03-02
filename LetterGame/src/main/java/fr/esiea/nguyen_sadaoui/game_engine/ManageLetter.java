package fr.esiea.nguyen_sadaoui.game_engine;

import java.util.ArrayList;
import java.util.Random;

public class ManageLetter {

	public static ArrayList<String> generateLetter(int cas) {
		
		Random r = new Random();
		ArrayList<String> potCommun = new ArrayList();
		
		switch (cas) {
		
		case 1:
			String lettre1 = (String)(r.nextInt(26) + "a");
			potCommun.add(lettre1);
		case 2:
			String lettre2 = (String)(r.nextInt(26) + "a");	
			potCommun.add(lettre2);
			//System.out.println(lettre2);
			String lettre3 = (String)(r.nextInt(26) + "a");
			potCommun.add(lettre3);
			//System.out.println(lettre3);

		}
		return potCommun;
	}
}
