package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.game_engine.ManageCommonPot;
import fr.esiea.nguyen_sadaoui.objects.CommonPot;
import fr.esiea.nguyen_sadaoui.objects.Dictionary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CommonPotTest {

	@Before
	public void setup() {
		CommonPot pot = CommonPot.getInstance();
	}

    @Test
    public void testAddLetter() {
    	CommonPot pot = CommonPot.getInstance();
    	pot.getLetters();
    	pot.addLetter("e");
    	assertNotNull("add letter", pot);
    	pot.getLetters();
    }
    /*@Test
    public void testRemoveLetter() {
    	CommonPot pot = CommonPot.getInstance();
    	pot.getLetters();
    	pot.addLetter("e");
    	pot.getLetters();
    	pot.removeLetter("e");
    	assertNull("remove letter", pot);
    }*/
    
    @Test
    public void testShowPot(){
		CommonPot pot = CommonPot.getInstance();
		pot.addLetter("t");
		pot.addLetter("e");
		pot.addLetter("s");
		pot.addLetter("p");
		pot.addLetter("a");
		pot.addLetter("o");
		pot.addLetter("u");
		pot.addLetter("c");
		
		System.out.println(ManageCommonPot.showPot());
    }

}
