package fr.esiea.nguyen_sadaoui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Cell {
	static final char EOW = '\0';
	//parcours l'arbre et cree le mot
	private char c;
	Map<Character,Cell> children = new HashMap<Character, Cell>();
	public Cell(char c){
		this.c = c;
	}
	public Cell getOrCreate(char firstLetter){
		/* Java 7
		 * Cell result = cells.get(firstLetter);
		 * if(result == null){
		 * 		cells.put(firstLetter,  new Cell(firstLetter));
		 * }
		 * return cells.getOrCreate(firstLetter);
		*/
		
		return children.computeIfAbsent(firstLetter, l -> new Cell(l));
	}
	public boolean isEndOfWord() {
		// TODO Auto-generated method stub
		return children.get(EOW) != null;
	}
	public Optional<Cell> get(char currentLetter) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(children.get(currentLetter));
	}
	
}
