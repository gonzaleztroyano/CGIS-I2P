/**
 * Main class of the Java program.
 * 
 * Alumno: Pablo Gonzalez Troyano
 * Grado en Ciencia, Gestion e Ingenieria de Servicios (Semipresencial)
 * 
 */

public class Marathon {
    
    public static int calcula_menor(int[] lista) {
        int menor = 99999;
        int po_menor = 99;
        int i = 0;
        for (int x: lista) {
            //System.out.println(lista[i]);
            if (lista[i] < menor){
              menor = lista[i];
              po_menor = i;
              
            };
            i += 1;
        };
        return po_menor;
    };
    
    public static int calcula_segundo(int[] lista){
        int menor = 99999;
        int po_menor = 99;
        int i = 0;
        int primero = calcula_menor(lista);
         for (int x: lista) {
            if ( i  == primero ) {
               continue; 
            }; 
            if (lista[i] < menor){
              menor = lista[i];
              po_menor = i;
              
            };
            i += 1;
        };
        return po_menor;
    };
    
    public static void main (String[] arguments) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", 
        "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", 
        "Neda", "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 
            412, 393, 299, 343, 317, 265};
        //for (int i = 0; i < names.length; i++) {
        //    System.out.println(names[i] + ": " + times[i]); 
        //}
        
        System.out.println("==== PRIMERA POSICION ====");
        System.out.println(names[calcula_menor(times)] + ": "+  times[calcula_menor(times)] + " minutos.");
        System.out.println('\n' + " ==== SEGUNDA POSICION ====");
        System.out.println(names[calcula_segundo(times)] + ": "+  times[calcula_segundo(times)] + " minutos.");

    }   
    
}