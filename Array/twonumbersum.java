/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.HashMap;
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
  
  public static void main(String args[]){
  int[] nums = {3, 5, -4, 8, 11, 1, -1, 6} ;
      twoNumberSum(nums,10);
  }
}