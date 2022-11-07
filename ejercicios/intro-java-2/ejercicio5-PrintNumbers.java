/**
 * Main class of the Java program.
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class Main {
    
    public static void main(String[] args) {
        System.out.println(Apartado1());
        System.out.println(Apartado2());
        System.out.println(Apartado3());
    };

    public static String Apartado1() {
        String Resul = "7 to 77 increasing by 7 each iteration: ";
        for(int i = 7; i<=77; i += 7){
            //System.out.println(i);
            Resul = Resul + i + ", ";
            //System.out.println(Resul);
        };
        Resul = Resul.substring(0, Resul.length() - 2);
        return Resul;
    };
    
    public static String Apartado2() {
        String Resul = "2-20 aumentando de 3 en 3: ";
        for(int i = 2; i<=20; i += 3){
            Resul = Resul + i + ", ";
        };
        Resul = Resul.substring(0, Resul.length() - 2);
        return Resul;
    };
    
    public static String Apartado3(){
        String Resul = "99 - 0 decreciendo de 11 en 11: ";
        for(int i = 99; i>=0; i -=11){
            Resul = Resul + i + ", ";
        };
        Resul = Resul.substring(0, Resul.length() - 2);
        return Resul;
    }
}
