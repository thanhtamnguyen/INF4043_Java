package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.objects.CommonPot;

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

}
