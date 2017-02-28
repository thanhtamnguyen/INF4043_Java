package fr.esiea.nguyen_sadaoui;

import java.util.Optional;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Dictionary implements IDictionary {	

	private static Dictionary instance = new Dictionary();
	private HashSet<String> mots = Fichier();
	private Dictionary(){};

	/*public Dictionary(){
		mots = Fichier();
	}*/

	public static Dictionary getInstance(){
		return instance;
	}
	
	private HashSet<String> Fichier() {
		String fichier = "src/main/resources/dico.txt";
		HashSet<String> hs = new HashSet<String>();
		BufferedReader br = null;
		try {
			// file opening
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			br = new BufferedReader(ipsr);			
		} 
		catch (Exception e) {
			System.err.println(e.toString());
		}
		
		if(br != null){ 
			// file reading 
			String currentLine;
			try{
				do{
					currentLine = br.readLine();
		            hs.add(currentLine);
				} while (br.ready());
				br.close();
			}catch (Exception e){
				System.err.println(e.toString());
			}
		}
		return hs;
	}

	@Override
	public boolean isWord(String motTest) {
		return mots.contains(motTest);
	}
}
/*public class Dictionary implements IDictionary{
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
/*}
		return currentCell.isEndOfWord();
	}

}*/
