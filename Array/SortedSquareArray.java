/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.Arrays;

/**
 *
 * @author sreek
 */
public class SortedSquareArray {
    
     public static void main(String args[]){
         
         
         int[] array = new int[5];
         array[0] = 1;
         array[1] = 2;
         array[2] = 8;
         array[3] = -4;
         array[4] = 12;
         
         int[] sortedArray = new int[array.length];
         
         //soultion 1 with default array sorting O(nlogn)| O(n) ( logn because of array.sort) o(n) space because new array.
         //for(int i= 0;i<array.length;i++){
         //    sortedArray[i] = array[i]*array[i];
         //}         
         //Arrays.sort(sortedArray);
         
         
         //soultion 2 with default array sorting O(n)| O(n)
         int smallIndex = 0;
         int bigIndex = array.length-1;
         for(int i= 0;i<array.length;i++){
             if(Math.abs(array[smallIndex]) >Math.abs(array[bigIndex])){
                 sortedArray[smallIndex] = array[smallIndex]* array[smallIndex];
                 smallIndex++;
             }else{
                 sortedArray[bigIndex] = array[bigIndex]* array[bigIndex];
                 bigIndex--;
             }
             
         }
         
         
         System.out.println(sortedArray);
     }
    
}
