/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sreek
 */
public class firstDuplicateValue {
    
     public static void main(String args[]) {

       
        int[] arrayOne = new int[6];
        
        arrayOne[0] = (2);
        arrayOne[1] = (1);
        arrayOne[2] = (5);
        arrayOne[3] = (2);
        arrayOne[4] = (8);
        arrayOne[5] = (3);
       
        System.out.println(firstDuplicateValue(arrayOne));

    }
    
    
    public  static int firstDuplicateValue(int[] array) {
    // Write your code here.
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<array.length;i++){
			
			if(map.containsKey(array[i])){
				return array[i];
			}else{
				map.put(array[i],array[i]);
			}
			
		}
		
    return -1;
  }
    
    
}
