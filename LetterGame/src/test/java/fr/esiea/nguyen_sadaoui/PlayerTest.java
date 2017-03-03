package fr.esiea.nguyen_sadaoui;

import org.junit.Test;
import static org.junit.Assert.*;

import fr.esiea.nguyen_sadaoui.game_engine.*;
import fr.esiea.nguyen_sadaoui.objects.*;

public class PlayerTest {
	
	@Test
    public void testConstructWordSimple() {
		//avoir le pot rempli
		Dictionary dico = Dictionary.getInstance();
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("t");
		pot.addLetter("e");
		pot.addLetter("s");
		pot.addLetter("p");
		pot.addLetter("a");
		pot.addLetter("o");
		pot.addLetter("u");
		pot.addLetter("c");
		
		//test prompt pour écrire le mot
		//String w =  ManagePlayer.promptForWord();
		//assertNotNull(w);
		
		//test mot et lettre du pot
		String w1 = "est";
		String w2 = "ouesto";
		String w3 = "nord";
		System.out.println("ok");
		assertTrue(ManageCommonPot.potHasAllLettersForWord(w1));
		assertTrue(ManageCommonPot.potHasAllLettersForWord(w2));
		
		//test isWord(mot)
		assertTrue(dico.isWord(w1));
		assertFalse(dico.isWord(w2));
		
		ManageCommonPot.removeLettersOfWord(w1);
		assertFalse(ManageCommonPot.potHasAllLettersForWord(w1));
		
		//update player
		Player joueur1 = new Player("Person1", 1, 0);
		ManagePlayer.addWordForPlayer(joueur1, w3);
		assertEquals(Integer.valueOf(1), Integer.valueOf(joueur1.getScore()));
		System.out.println(joueur1.getWords());
		
		ManagePlayer.addWordForPlayer(joueur1, w2);
		assertEquals(Integer.valueOf(2), Integer.valueOf(joueur1.getScore()));
		System.out.println(joueur1.getWords());		
	}

	@Test
	public void testStealWord(){
		Dictionary dico = Dictionary.getInstance();
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("e");
		pot.addLetter("a");
		pot.addLetter("u");
		pot.addLetter("c");
		//get a word from a player
		//steal a word - steal est to become test
		Player joueur1 = new Player("Person1", 1, 0);
		Player joueur2 = new Player("Person2", 2, 0);
		ManagePlayer.addWordForPlayer(joueur2, "est"); 
		ManagePlayer.addWordForPlayer(joueur2, "lion"); 
		
		
		String choix ="";
		String newWord = "";
//		try {
//			choix = ManagePlayer.showAndChoosePlayerWord(joueur2);
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		//ManagePlayer.showPlayerWord(joueur2);
		try {
			newWord = ManagePlayer.promptForWord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		choix=ManagePlayer.ifPlayerHasThisWord(joueur2, newWord);
		System.out.println("choix "+choix);
		System.out.println("newWord "+newWord);
		//new word valid
		assertTrue(ManageDictionary.useAWord(choix, newWord));
		ManagePlayer.addWordForPlayer(joueur1, choix);
		ManagePlayer.removeWordForPlayer(joueur2, choix);
		assertEquals(Integer.valueOf(1), Integer.valueOf(joueur1.getScore()));
		assertEquals(Integer.valueOf(1), Integer.valueOf(joueur2.getScore()));
	}
	
	@Test
	public void testUseOwnWord(){
		Dictionary dico = Dictionary.getInstance();
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("t");
		pot.addLetter("e");
		pot.addLetter("a");
		pot.addLetter("u");
		pot.addLetter("c");
		//get a word from a player
		//steal a word - steal est to become test
		Player joueur1 = new Player("Person1", 1, 0); 
		ManagePlayer.addWordForPlayer(joueur1, "lion"); 
		String choix ="lion";
		/*choix = ManagePlayer.showAndChoosePlayerWord(joueur1);
		String newWord =  ManagePlayer.promptForWord();
		//new word valid
		//assertTrue(ManageDictionary.useAWord(choix, newWord));
		ManagePlayer.addWordForPlayer(joueur1, choix);
		//assertEquals(Integer.valueOf(1), Integer.valueOf(joueur1.getScore()));
		 * 
		 */
	}
}
