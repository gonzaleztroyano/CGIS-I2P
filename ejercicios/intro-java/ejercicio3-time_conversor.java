/**
 * Main class of the Java program.
 *
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 */

import java.util.Scanner;

public class TimeConversor {

    public static void main(String[] args) {
        
        int segundos, minutos, horas;
        
        System.out.println("Introduce los segundos: ");
        Scanner scanner = new Scanner(System.in);
        segundos = scanner.nextInt();
        
        minutos = (segundos / 60);
        segundos = (segundos - (minutos * 60));
        horas = (minutos / 60);
        minutos = (minutos - (horas * 60));
        
        System.out.println("El resultado son: " + horas + "h " + minutos + " min " + segundos + "s");

    }
}
