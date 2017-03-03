package fr.esiea.nguyen_sadaoui;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.esiea.nguyen_sadaoui.game_engine.ManagePlayer;
import fr.esiea.nguyen_sadaoui.game_engine.ManageTurn;
import fr.esiea.nguyen_sadaoui.objects.CommonPot;
import fr.esiea.nguyen_sadaoui.objects.Player;

public class ManageTurnTest {

	
	@Test
	public void  whoStartTest(){
		Player joueur1 = new Player("Person1", 1, 0);
		Player joueur2 = new Player("Person2", 2, 0);
		assertNotEquals(Integer.valueOf(0),  Integer.valueOf(ManageTurn.whoStarts(joueur1, joueur2)));
	}

	@Test
	public void  checkScoreTest(){
		Player joueur1 = new Player("Person1", 1, 0);
		Player joueur2 = new Player("Person2", 2, 0);
		assertTrue(ManageTurn.checkScoreAndContinue(joueur1, joueur2));

		joueur2.setScore(10);;
		assertFalse(ManageTurn.checkScoreAndContinue(joueur1, joueur2));
	}
	@Test
	public void  gameSummaryTest(){
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("t");
		pot.addLetter("e");
		pot.addLetter("s");
		pot.addLetter("p");
		pot.addLetter("a");
		pot.addLetter("o");
		pot.addLetter("u");
		pot.addLetter("c");
		
		Player joueur1 = new Player("Person1", 1, 0);
		Player joueur2 = new Player("Person2", 2, 0);
		ManagePlayer.addWordForPlayer(joueur2, "est"); 
		ManagePlayer.addWordForPlayer(joueur2, "lion");
		ManagePlayer.addWordForPlayer(joueur1, "temps"); 
		ManageTurn.gameSummary(joueur1, joueur2, 2);
	}
}
