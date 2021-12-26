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
public class LongestPeak {
    /*
    
    Write a function that takes in an array of integers and returns the length of the longest peak in the array. 
    A peak is defined as adjacent integers in the array that are strictly increasing until 
    they reach a tip (the highest value in the peak), at which point they become strictly decreasing.
    At least three integers are required to form a peak. 
    For example, the integers 1, 4, 10, 2 form a peak, but the integers 4, 0, 10 don't and neither do the integers 1, 2, 2, 0 . 
    Similarly, the integers 1, 2, 3 don't form a peak because there aren't any strictly decreasing integers after the 3 . 
    Sample Input = [1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3] 
    Sample Output  = 6 // 0, 10, 6, 5, -1, 3 

    
    */
    //O(n),O(1)
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,0,10,6,5,-1,-3,2,3};
        System.out.println(longestPeak(array));
    }
    
    public static int longestPeak(int[] array){
        
        int longestPeak = 0;
        
        int i= 1;
        while(i<array.length-1){
            
            if(!(i>=0 && array[i-1]<array[i] && array[i]>array[i+1])){
                i+=1;
                continue;
            }
            
            int leftIndex = i-2;
            while(leftIndex>=0 && array[leftIndex]<array[leftIndex+1]){
                leftIndex--;
            }
            int rightIndex = i+2;
            while(rightIndex<array.length && array[rightIndex]<array[rightIndex-1]){
                rightIndex++;                
            }
            int currRange = rightIndex - leftIndex -1;
            longestPeak = Math.max(longestPeak, currRange);
            i = rightIndex;
        }
        
        return longestPeak;
        
    }
}
