/**
 * Main class of the Java program.
 *
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class FooCorporation {

    public static void main(String[] args) {
        pay(7.50, 35);
        pay(8.20, 47);
        pay(8.20, 40); // Added for testing.
        pay(10.0, 73);
    }

    public static double pay(double base_pay, int hours){
        if (base_pay < 8){
            System.out.println("El salario base por hora no ha de ser inferior a $8.");
            return -1;
        } else if (hours > 60) {
            System.out.println("El numero total de horas trabajadas no ha de ser mayor que 60.");
            return -1;
        };
        // Si no entra por ninguno de los otros IF, continua:
        int horas_jornada_base = 40; // De esta manera se puede modificar en el caso de que la jornada no sea de 50h
        int horas_extra = 0;
        double base_horas_extra = 0;
        if (hours > horas_jornada_base){
            horas_extra = hours - horas_jornada_base; 
            base_horas_extra = base_pay * 1.5;
        };
        double salario;
        salario = (base_pay * hours) + (horas_extra * base_horas_extra);
        System.out.println("");
        System.out.println("El salario es: " + salario);
        System.out.println("----------- Detalles del calculo -----------");
        System.out.println("Salario base: " + base_pay + "$/h.");
        System.out.println("Horas trabajadas: " + hours);
        if (horas_extra > 0){
            System.out.println("Horas extra sobre una jornada de " + horas_jornada_base + ": " + horas_extra);
            System.out.println("Estas " + horas_extra + " horas se abonan a " + base_horas_extra + " $/h.");
        };
        System.out.println("---------------------------------------------");
        System.out.println("");
        return salario;
    }
}