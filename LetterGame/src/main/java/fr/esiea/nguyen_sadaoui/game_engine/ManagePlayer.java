package fr.esiea.nguyen_sadaoui.game_engine;
import java.util.Scanner;

import fr.esiea.nguyen_sadaoui.objects.*;


public class ManagePlayer {
	public static void playerInit() {
		Player joueur1;
		Player joueur2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Joueur 1?");
		String nomJoueur1 = sc.nextLine();
		joueur1 = new Player(nomJoueur1, 1, 0); //arg: name, id, score
		System.out.println("Le nom du joueur 1 est:" + joueur1.getName());
		System.out.println("Joueur 2?");
		String nomJoueur2 = sc.nextLine();
		joueur2 = new Player(nomJoueur2, 2, 0);
		System.out.println("Le nom du joueur 2 est:" + joueur2.getName());
	}
	
}
