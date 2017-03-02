package fr.esiea.nguyen_sadaoui.objects;

import java.util.ArrayList;

public class CommonPot {
	private ArrayList<String> letters = new ArrayList<String>();
	private static CommonPot instance = new CommonPot();
	
	private CommonPot(){};

	public static CommonPot getInstance(){
		return instance;
	}
	
	public void addLetter(String c){
		this.letters.add(c);
	}

	public void setLettres(ArrayList<Character> lettres) {
		this.letters = letters;
	}
	
	public void removeLetter(String c){
		this.letters.remove(c);
	}

	public String getLetters(){
		return this.letters.toString();
	}
	
	public ArrayList<String> getAllLetters(){
		return this.letters;
	}
	
	public boolean hasLetter(String c){
		if(this.letters.contains(c)) return true;
		return false;
	}


}
