package fr.esiea.nguyen_sadaoui.game_engine;

import fr.esiea.nguyen_sadaoui.objects.Dictionary;

public class ManageDictionary {

	public static boolean useAWord(String oldWord, String newWord){
		//newWord contains oldWord
		if(newWord.contains(oldWord)){
			String newLetter = newWord.replace(oldWord,"");
			if(ManageCommonPot.potHasAllLettersForWord(newLetter)){
				//pot has letter(s)
				Dictionary dico = Dictionary.getInstance();
				if(dico.isWord(newWord)){
					ManageCommonPot.removeLettersOfWord(newLetter);
					return true;
				}
			}
		}
		return false;		
	}
}
