/**
 * Class to test the function isPalindrome
 *
 * 
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 * 
 */ 
import java.util.*;

class TestPalindrome {
    
    /**
     * Write your test cases here. Insert in the HashMap "word", true/false 
     * indicating if the word is palindrome or not.
     */ 
    public Map<String, Boolean> getTestsPalindrome() {
        Map<String, Boolean> testInputs = new HashMap<String, Boolean>();
		
		// test inputs
		testInputs.put("lagerregal", true);
		testInputs.put("mama", false);
		testInputs.put("dabalearrozalazorraelabad", true);
		
		return testInputs;
    }
}