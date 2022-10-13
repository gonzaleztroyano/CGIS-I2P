/**
 * Main class of the Java program.
 *
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 */

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        int num1, num2;
        
        System.out.println("Introduzca valor para el primer numero");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        
        System.out.println("Introduzca valor para el segundo numero");
        scanner = new Scanner(System.in); // No se vuelve a inicializar y se reusa la variable al no ser necesario. 
        num2 = scanner.nextInt();
        
        if ( num1 > num2 ) {
            System.out.println("El numero " + num1 + " es mayor que el numero " + num2 + ".");
            } else if (num1 < num2) {
                System.out.println("El numero " + num1 + " es menor que el numero " + num2 + ".");
            } else {
                System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales.");
            }
    }
}
