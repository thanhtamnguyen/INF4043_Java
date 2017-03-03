package fr.esiea.nguyen_sadaoui.game_engine;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import fr.esiea.nguyen_sadaoui.objects.*;


public class ManagePlayer {
	public static void playerInit(Player joueur1, Player joueur2) {
		/*
		 * Player Initialisation
		 */		
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
	
	public static String promptForWord()throws Exception{
		/*
		 * Prompt for the Human Player
		 * Expect a word
		 */
		System.out.println("Saisissez le mot que vous souhaitez écrire: ");
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader brWord = new BufferedReader(isr);
        String texte = "";
		while(true){
			try{
				texte = brWord.readLine();
			}catch (IOException ioexc) {
				ioexc.printStackTrace();
			} 
			System.out.println("before");
			String word = "";
			word = texte.toLowerCase();
			if(word.matches("[a-z]*")){
				brWord.close();
		        isr.close(); 
				return word;
			}
			System.out.println("Le mot saisi est incorrect. Veuillez saisir un seul mot sans chiffre ni accent: ");	
		}
	}

	public static void addWordForPlayer(Player player, String validWord){
		/*
		 * Method to Add a word in Player's Word
		 * Update Player's score
		 */
		player.setWords(validWord);
		player.setScore(player.getWords().size());
	}

	public static void removeWordForPlayer(Player player, String validWord){
		/*
		 * Method to Remove a word in Player's Word
		 * Update Player's score
		 */
		player.removeWord(validWord);
		player.setScore(player.getWords().size());
	}
	
	public static String showPlayerWord(Player player){
		/*
		 * The Player's words are displayed
		 */
		String toReturn = "\nLes mots de "+player.getName()+" ; score : "+player.getScore();
		System.out.println("\nVoici les mots du Joueur "+player.getName()+":");
		for(int i=0; i<player.getWords().size();i++){
			toReturn += "\n  "+i+" - "+player.getWords().get(i);
		}return toReturn;
	}
	
	public static String ifPlayerHasThisWord(Player player, String newWord){
		/*
		 * Check if the word exist in Player's Word
		 */
		for(int i=0; i<player.getWords().size();i++){
			if(newWord.contains(player.getWords().get(i))){
				return player.getWords().get(i);
			}
		}return "";
	}
	
	public static String showAndChoosePlayerWord(Player player)throws Exception{
		/*
		 * TO BE REMOVED
		 */
		int choice = player.getWords().size();
		//Scanner scanInt = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
		while(Integer.valueOf(choice)>=player.getWords().size()){
			System.out.println("\nVoici les mots du Joueur "+player.getName()+":");
			for(int i=0; i<player.getWords().size();i++){
				System.out.println("  "+i+" - "+player.getWords().get(i));
			}
			System.out.println("Saisissez le numéro du mot à modifier: ");		
			//choice = scanInt.nextInt();
			String texte = br.readLine();
		    choice = Integer.valueOf(texte);
			//scanInt.nextLine();
		}
		//scanInt.close();
		br.close();
        isr.close(); 
		return player.getWords().get(choice);
	}

	
}
