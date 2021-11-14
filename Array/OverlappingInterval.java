/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sreek
 */
public class OverlappingInterval {
    
     public static void main(String args[]) {
         
         int[][] array = new int[][]{new int[]{1,2},new int[]{3,5},new int[]{4,7},new int[]{6,8},new int[]{9,10}};
         //System.out.println((Arrays.toString(mergeOverlappingIntervals(array))));
         for(int[] a : mergeOverlappingIntervals(array)){
             System.out.println((Arrays.toString(a)));
         }
     }
     
     public static int[][] mergeOverlappingIntervals(int[][] intervals) {
         
        // Arrays.sort(intervals,(a,b)-> Integer.compare(a[0], b[0]));
              
         
         List<int[]> result = new ArrayList<>();
         
         int[] currentInt =  intervals[0];
         result.add( currentInt);
         
         for(int[] next : intervals){
             if(currentInt[1]>=next[0] ){
                 currentInt[1] = Math.max(currentInt[1], next[1]);
             }else{
                 currentInt = next;
                 result.add(currentInt);
             }
         }
         
         
  
        return result.toArray(new int[result.size()][]);
    }
    
}
