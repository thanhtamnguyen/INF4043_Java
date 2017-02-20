package fr.esiea.nguyen_sadaoui;

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
		Dictionary dictionary = Dictionary.getInstance();
	}

    @Test
    public void testIsWord() {
    	Dictionary dictionary = Dictionary.getInstance();
    	dictionary.addWord("papa");
    	dictionary.addWord("maman");
    	dictionary.toString();
        assertTrue("Papa is not",dictionary.isWordValid("maman"));
        //assertFalse("Papa is not",dictionary.isWordValid("namam"));
    }
}

