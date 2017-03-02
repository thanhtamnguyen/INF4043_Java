package fr.esiea.nguyen_sadaoui;
import fr.esiea.nguyen_sadaoui.objects.Dictionary;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test sample for Dictionary.
 */
public class DictionaryTest {

    private Dictionary dictionary;

	@Before
	public void setup() {
		Dictionary dict = Dictionary.getInstance();
	}

    @Test
    public void testIsWord() {
    	Dictionary dict = Dictionary.getInstance();
    	dict.toString();
        assertTrue("Papa is not",dict.isWord("maman"));
        assertFalse("Papa is not",dict.isWord("namam"));
    }
    
}

