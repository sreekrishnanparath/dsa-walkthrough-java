/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sreek
 */
public class ThreeNumberSum {
    
    /*
    Write a function that takes in a non-empty array of distinct integers and an integer
    representing a target sum. The function should find all triplets in the array that sum up
    to the target sum and return a two-dimensional array of all these triplets. The numbers
    in each triplet should be ordered in ascending order, and the triplets themselves
    should be ordered in ascending order with respect to the numbers they hold.
    */
    
    public static void main(String args[]){
       Integer[] array = new Integer[8];
       array[0] = (-8);
     
       array[1] = (-6);
       array[2] = (1);
       array[3] = (2);
       array[4] = (3);
       array[5] = (5);
       array[6] = (6);
       array[7] = (12);
              
              
              Arrays.sort(array);
              //System.out.println(array);
              System.out.println(threeNumberSum(array,0));
        
    }
    
public static List<Integer[]> threeNumberSum(Integer[] array, int targetSum) {
    // Write your code here.
		List<Integer[]> result  = new ArrayList<Integer[]>();
		int rSum = 0;
     //Integer[] temp;
        
        for(int i=0;i<array.length-2;i++){
            int left =i+1;
            int right = array.length-1;
            while(left<right){
                int one = array[i];
                int two = array[left];
                int three = array[right];
                rSum =  one+two+three;
                if(rSum==targetSum){
                    Integer[] temp = {one,two,three};                  
                    result.add(temp);
                    left++;
                    right--;
                }else if(rSum<targetSum){
                    left++;
                }else if(rSum>targetSum){
                    right--;
                }
                
            }
            
        }
    return result;
  }
    
}
