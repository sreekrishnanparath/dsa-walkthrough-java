/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author sreek
 */
public class FourNumberSum {
    
    /*
    
    Write a function that takes in a non-empty array of distinct integers and an integer 
    representing a target sum. The function should find all quadruplets in the array that sum up to the target sum and return a two-dimensional array of all these quadruplets in no particular order. 
   If no four numbers sum up to the target sum, the function should return an empty array. 
   Sample Input  [ array = [7, 6,4, -1, 1, 2], targetSum = 16 ]
    Sample Output [[7, 6, 4, -1], [7, 6, 1, 2]] 
    */
    
    public static void main(String[] args) {
        int[] array = {7,6,4,-1,1,2};
        List<Integer[]> result = fourNumberSum(array,16);
        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i).toString());
       }
    }
    
    public static List<Integer[]> fourNumberSum(int[] array,int target){
        
        Map<Integer,List<Integer[]>> map = new HashMap<>();
        List<Integer[]> twoSum = new ArrayList<>();
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                int sum = array[i]+array[j];
                int diff = target - sum;
                if(map.containsKey(diff)){
                    for(Integer[] pair : map.get(diff)){
                        Integer [] temp = {pair[0],pair[1],array[i],array[j]};
                        twoSum.add(temp);
                    }
                    
                }
            }
            //System.out.println(twoSum);
            for(int k=0;k<i;k++){
                int currSum =array[i]+array[k];
                Integer[] newPair = {array[i],array[k]};
                if(!map.containsKey(currSum)){
                    List<Integer[]> pairGroup = new ArrayList<>();
                    pairGroup.add(newPair);
                    map.put(currSum, pairGroup);
                }else{
                    map.get(currSum).add(newPair );
                }
                
                    
            }
        }
     
        return twoSum;
    }
    
    
}
