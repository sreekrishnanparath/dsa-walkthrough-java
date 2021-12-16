/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sreek
 */
class twonumbersum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for(int num : array){
				int match = targetSum - num;
				if( map.containsKey(match)){
						result[0]=num;
						result[1]=match;
						return result;
				}else{
					map.put(match,match);
				}
		}
    return new int[]{};
  
}
  
   public static boolean twoNumberSumList(List<Integer> array, int targetSum) {
    // Write your code here.
		Map<Integer,Integer> map = new HashMap<>();
		 for(int i=0;i<array.size();i++){
                    int match = targetSum - array.get(i);
                    if( map.containsKey(match)){
                           return true;
                    }else{
                            map.put(array.get(i),match);
                    }
		}
    return false;
  
}
   
    public static boolean twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return true;
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return false;
    }
  
  public static void main(String args[]){
  int[] nums = {3, 5, -4, 8, 11, 1, -1, 6} ;
     System.out.println(twoSum(nums,10));
      System.out.println(twoNumberSumList(Arrays.asList(3, 5, -4, 8, 11, 1, -1, 6),10));
      
  }
}