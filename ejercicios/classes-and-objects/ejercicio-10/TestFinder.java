/**
 * Class to test the findMaximumElement method 
 * of Finder class
 */ 

 import java.util.*;

 public class TestFinder {
 
     public Map<int[], Integer> getArrays() {
         
         // create the finder and call the function to find the maximum element
         Map<int[], Integer> testInputs = new HashMap<int[], Integer>();
         
         testInputs.put(new int[] {2, 3, 42, 12, 7}, 42);
         testInputs.put(new int[] { -11, -55, -1, -12 }, -1);
         testInputs.put(new int[] { 5, 4, 3, 2, 1 }, 5);
         testInputs.put(new int[] { }, -9999);
         
         return testInputs;
     }
 }
 
 