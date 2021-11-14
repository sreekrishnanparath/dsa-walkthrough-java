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
    
    /*
    
    Merge Overlapping Intervals 9

Write a function that takes in a non-empty array of arbitrary intervals, merges any overlapping intervals, and
returns the new intervals in no particular order.

Each interval interval is an array of two integers, with interval[0] as the start of the interval and
interval[1] as the end of the interval.

Note that back-to-back intervals aren't considered to be overlapping. For example, [1, 5] and [6, 7] aren't
overlapping; however, [1, 6] and [6, 7] areindeed overlapping.

Also note that the start of any particular interval will always be less than or equal to the end of that interval.

Benne Cem neem

intervals = [[1, 2], [3, 5], [4 7], [6, 8], [9, 16]]

Sample Output

[[1, 2], [3, 8], [9, 1¢]]
// Merge the intervals [3, 5], [4, 7], and [6, 8].
    
    */
    
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
