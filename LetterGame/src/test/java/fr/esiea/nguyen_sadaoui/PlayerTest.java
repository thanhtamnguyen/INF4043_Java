package fr.esiea.nguyen_sadaoui;

import org.junit.Test;
import static org.junit.Assert.*;

import fr.esiea.nguyen_sadaoui.game_engine.*;
import fr.esiea.nguyen_sadaoui.objects.*;

public class PlayerTest {
	
	@Test
    public void testConstructWord() {
		//avoir le pot rempli
		Dictionary dico = Dictionary.getInstance();
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("t");
		pot.addLetter("e");
		pot.addLetter("s");
		pot.addLetter("p");
		pot.addLetter("a");
		pot.addLetter("o");
		
		//test prompt pour écrire le mot
		//String w =  ManagePlayer.promptForWord();
		//assertNotNull(w);
		
		//test mot et lettre du pot
		String w1 = "est";
		String w2 = "ouesto";
		System.out.println("ok");
		assertTrue(ManageCommonPot.potHasAllLettersForWord(w1));
		assertFalse(ManageCommonPot.potHasAllLettersForWord(w2));
		
		//test isWord(mot)
		assertTrue(dico.isWord(w1));
		assertFalse(dico.isWord(w2));
		
		ManageCommonPot.removeLettersOfWord(w1);
		assertFalse(ManageCommonPot.potHasAllLettersForWord(w1));
		
		//update player
		Player joueur1 = new Player("Person", 1, 0);
		ManagePlayer.addWordForPlayer(joueur1, w1);
		assertEquals(Integer.valueOf(1), Integer.valueOf(joueur1.getScore()));
		System.out.println(joueur1.getWords());
		ManagePlayer.addWordForPlayer(joueur1, w2);
		assertEquals(Integer.valueOf(2), Integer.valueOf(joueur1.getScore()));
		System.out.println(joueur1.getWords());
	}
}
