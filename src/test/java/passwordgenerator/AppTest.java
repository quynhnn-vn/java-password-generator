package passwordgenerator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    private final Password password= new Password("Secret");
	private final Alphabet firstAlphabet = new Alphabet(true,false,false,false);
	private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);

    @Test
    public void testPasswordToString() {
        assertEquals("Secret", password.toString());
    }

    @Test
    public void testAlphabetUppercase() {
        assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    public void testAlphabetCombined() {
		assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS + Alphabet.NUMBERS + Alphabet.SYMBOLS);
	}
}
