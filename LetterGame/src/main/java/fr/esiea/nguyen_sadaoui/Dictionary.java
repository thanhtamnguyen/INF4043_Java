package fr.esiea.nguyen_sadaoui;

import java.util.Optional;

public class Dictionary implements IDictionary{
	private static Dictionary instance = new Dictionary();
	private Cell origin = new Cell('0');
	
	private Dictionary(){};

	public static Dictionary getInstance(){
		return instance;
	}
	public void addWord(String w){
		// !! ouverture de fichier
		Cell currentCell = origin;
		for(char currentLetter : w.toCharArray()){
			currentCell = currentCell.getOrCreate(currentLetter);
		}
		currentCell.getOrCreate(Cell.EOW);
	}
	public boolean isWord(String word) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isWordValid(String w) {
		Cell currentCell = origin;
		for(char currentLetter : w.toCharArray()){
			Optional<Cell> optional = currentCell.get(currentLetter);
			if(!optional.isPresent()){
				return false;
			}
			/*currentCell = currentCell.get(currentLetter);
			if(currentCell == null){
				return false;
			}*/
		}
		return currentCell.isEndOfWord();
	}

}
