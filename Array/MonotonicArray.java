/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

/**
 *
 * @author sreek
 */
public class MonotonicArray {
    
    /*
    Monotonic Array — 1

Write a function that takes in an array of integers and returns a boolean representing
whether the array is monotonic.

An array is said to be monotonic if its elements, from left to right, are entirely non-
increasing or entirely non-decreasing.

Non-increasing elements aren't necessarily exclusively decreasing; they simply don't
increase. Similarly, non-decreasing elements aren't necessarily exclusively increasing;
they simply don't decrease.

Note that empty arrays and arrays of one element are monotonic.

array = [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]

Sample Output
true
    
    */
    
     public static void main(String args[]) {

       
        int[] arrayOne = new int[7];
//        arrayOne[0] = (-1);
//        arrayOne[1] = (-5);
//        arrayOne[2] = (-10);
//        arrayOne[3] = ( -1100);
//        arrayOne[4] = (-1101);
//        arrayOne[5] = (-1102);
//        arrayOne[6] = (-9001);
        
        arrayOne[0] = (1);
        arrayOne[1] = (2);
        arrayOne[2] = (3);
        arrayOne[3] = (4);
        arrayOne[4] = (3);
        arrayOne[5] = (6);
        arrayOne[6] = (7);
       
        System.out.println(isMonotonic(arrayOne));

    }
     
     public static boolean isMonotonic(int[] array) {
    // Write your code here.
    
    boolean dec = false;
    boolean inc = false;
    
    
    for(int i = 0;i<array.length-1;i++){
        
        if(array[i]<array[i+1]){
            inc  = true;
        }
        if(array[i]>array[i+1]){
            dec  = true;
        }
    }
    
    return inc || dec;
  }
}
