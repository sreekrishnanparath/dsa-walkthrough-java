/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreek
 */
public class MoveItemToEnd {
    
    /*
    You're given an array of integers and an integer. Write a function that moves all
instances of that integer in the array to the end of the array and returns the array.

The function should perform this in place (i.e., it should mutate the input array) and
doesn't need to maintain the order of the other integers.



array = [2, 1, 2, 2, 2, 3, 4, 2]
toMove = 2

Sample Output

[1, 3, 4, 2, 2, 2, 2, 2] // the numbers 1, 3, and 4 could be ordered dit
    */
    
    public static void main(String args[]) {

       
        List<Integer> array = new ArrayList<Integer>();
        array.add(2);
       array.add(1);
       array.add(2);
       array.add(2);
       array.add(2);
       array.add(3);
       array.add(4);
        array.add(2);
       
       List<Integer> arrayNew =   moveElementToEnd(array, 2);
        System.out.println(arrayNew);

    }
    
     public static List<Integer>  moveElementToEnd(List<Integer> array, int toMove) {
         
         int i= 0;
         int j = array.size() -1;
         
         while(i<j){
             while(i<j && array.get(j)==toMove) j--;
             
             if(array.get(i)==toMove){
                 int temp = array.get(j);
                 array.set(j,array.get(i));
                 array.set(i, temp);                 
             }
             i++;
         }
         
    // Write your code here.
    return array;
  }
}
