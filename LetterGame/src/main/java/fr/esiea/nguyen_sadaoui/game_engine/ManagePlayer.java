package fr.esiea.nguyen_sadaoui.game_engine;
import java.util.Scanner;

import fr.esiea.nguyen_sadaoui.objects.*;


public class ManagePlayer {
	public static void playerInit(Player joueur1, Player joueur2) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Joueur 1?");
		String nomJoueur1 = sc.nextLine();
		joueur1 = new Player(nomJoueur1, 1, 0); //arg: name, id, score
		System.out.println("Le nom du joueur 1 est: " + joueur1.getName());
		System.out.println("Joueur 2?");
		String nomJoueur2 = sc.nextLine();
		joueur2 = new Player(nomJoueur2, 2, 0);
		System.out.println("Le nom du joueur 2 est: " + joueur2.getName());
	}
	
	public static String promptForWord(){
		System.out.println("Saisissez le mot que vous souhaitez écrire: ");
		Scanner sc = new Scanner(System.in);
		while(true){	
			if(sc.hasNextLine()){
				String word = sc.nextLine();
				word = word.toLowerCase();
				if(word.matches("[a-z]*")){
					sc.close();
					return word;
				}
				System.out.println("Le mot saisi est incorrect. Veuillez saisir un seul mot sans chiffre ni accent: ");
			}
			else{
				System.out.println("no line found");
				return "";
			}
		}
	}

	public static void addWordForPlayer(Player player, String validWord){
		player.setWords(validWord);
		player.setScore(player.getWords().size());
	}

	public static void removeWordForPlayer(Player player, String validWord){
		player.setWords(validWord);
		player.setScore(player.getWords().size());
	}
	
	public static String showAndChoosePlayerWord(Player player){
		int choice = player.getWords().size();
		Scanner scanInt = new Scanner(System.in);
		while(Integer.valueOf(choice)>=player.getWords().size()){
			System.out.println("\nVoici les mots du Joueur "+player.getName()+":");
			for(int i=0; i<player.getWords().size();i++){
				System.out.println("  "+i+" - "+player.getWords().get(i));
			}
			System.out.println("Saisissez le numéro du mot à modifier: ");		
			choice = scanInt.nextInt();
			//scanInt.nextLine();
		}
		scanInt.close();
		return player.getWords().get(choice);
	}
}
