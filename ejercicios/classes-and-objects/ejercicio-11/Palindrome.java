/**
 * Implement the method isPalindrome below.
 * It should return true if a word is palindrome; otherwise it should retun false.
 * 
 * A word is a palinedrome if you can read from left-to-right just as you can
 * read it from right-to left. For example, "lagerregal" is a palinedrome.
 * 
 * Test your method using the class TestPalindrome. Your tests are automatically
 * executed when you run the program.
 * 
 * When you think your method works correctly, click "Submit".
 * No worries, you can submit multiple times.
 * 
 * 
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 * 
 */
 
 public class Palindrome {

    /** returns true if the provided argument "word" is a palindrome */
    public boolean isPalindrome(String word) {
        String reversed = reverseWord(word);
        if (word.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
    
    private String reverseWord(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverse = reverse + word.charAt(i); 
            // System.out.println("DEBUG: at POS " + i + " character " + word.charAt(i));
        }
        return reverse;
    }
    
}