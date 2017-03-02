package fr.esiea.nguyen_sadaoui.objects;

import java.util.ArrayList;

public class Player {
	private String name;
	private int idPlayer;
	private int score;
	private ArrayList<String> words;

	public Player(String name, int id, int score){
		this.setName(name);
		this.setIdPlayer(id);
		this.setScore(score);
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}
