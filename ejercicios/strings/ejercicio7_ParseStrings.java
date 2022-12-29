import java.util.Scanner;

/**
 * Main class of the Java program.
 * 
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class ParseStrings {

    public static void main(String[] args) {
        int condicion = 0;
        System.out.println("Enter input: ");
        String input = "";

        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();

        String parsing_info = parseString(input);
        String input_reversed = reverseString(input);
        int num_vowels = checkVowels(input);
        int num_digits = checkDigits(input);
        
        System.out.println(parsing_info);
        System.out.println("The input is: " + input);
        System.out.println("The reverse of the string '" + input + "' is " + input_reversed);
        System.out.println("The input has " + num_vowels + " vowels");
        System.out.println("The input has " + num_digits + " digits");
    }
    
    public static String parseString (String input) {
        String output = "The input has ";
        if (input.length() < 5){
            output = output + "less than 5 characters and ";
        } else if(input.length() > 15)
            output = output + "more than 15 characters and ";
        else {
            output = output + "between 5 and 15 characters and ";
        };
        if (input.charAt(0) == 'a'){
            output = output + "begins with an 'a'.";
        } else {
            output = output + "does not begin with an 'a'";
        };
    return output;
    }
    
    
    public static String reverseString (String input) {
        String output ="";
        for (int i = 0; i < input.length(); i++) {
            output = input.charAt(i) + output;
        }
        return output;        
    }
    
    public static int checkVowels (String input) {
        int count = 0; char letra;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            letra = input.charAt(i);
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            count++;
        };
        };
        return count;
    };
    
    public static int checkDigits (String input) {
        int count = 0;
        // Vease: https://docs.oracle.com/javase/6/docs/api/java/lang/Character.html#isDigit(char)
        for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i); 
            if(Character.isDigit(letra)){
                count++;
            };
        }
    return count;
    }
}
