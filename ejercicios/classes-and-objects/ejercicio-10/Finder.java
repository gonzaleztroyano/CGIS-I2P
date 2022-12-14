/**
 * This class provides functions to search in arrays.
 * 
 */

 import java.util.Arrays;

 public class Finder {
 
     /**
      * Finds the maximum element in an integer array.
      * @param input the array to search in
      * @return the maximum element of input
      */
     public int findMaximumElement(int[] input) {
         // Your task:
         // - Check if this function works for all possible integers.
         // - Throw an Error object with message "Array is empty."
         // if the input array is empty.
         
         // Comentar el que no se quiera utilizar. Vease la publicacion en el 
         // foro de la asignatura respecto a las dudas con el retorno de exceptions
         //
         // return calculaMaxException(input);
         return calculaMaxPrint(input);
     }
     
 /**
     private int calculaMaxException (int[] input) {
         if(input.length == 0){
             throw new ArrayIndexOutOfBoundsException("Array is empty.");
         } else {
             Arrays.sort(input);
             int maxElement = input[input.length-1];
             System.out.println(maxElement);
             return maxElement;
         }
     } */
     
     private int calculaMaxPrint (int[] input) {
         if(input.length == 0){
             System.out.println("Array is empty. Returning -9999 as fallback.");
             return -9999;
         } else {
             Arrays.sort(input);
             int maxElement = input[input.length-1];
             System.out.println(maxElement);
             return maxElement;
         }
     }
 }
 