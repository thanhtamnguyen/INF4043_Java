package fr.esiea.nguyen_sadaoui;

import java.util.ArrayList;

public class Player {
	private String name;
	private int idPlayer;
	private ArrayList<String> words;

	public Player(String name){
		this.setName(name);
		this.setIdPlayer(1);
		this.words = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public ArrayList<String> getWords() {
		return words;
	}

	public void setWords(String word) {
		this.words.add(word);
	}
	
	public void letterPick(){
		
	}
	
	public void wordConstruct(){
		
	}
}
