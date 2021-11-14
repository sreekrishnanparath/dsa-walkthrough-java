/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreek
 */
public class SubsequenceArray {
    
    public static void main(String args[]){
        
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(22);
        array.add(25);
        array.add(6);
        array.add(-1);
        array.add(8);
        array.add(10);
        
        List<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(6);
        sequence.add(-1);
        sequence.add(10);
        
        System.out.println(isValidSubsequence(array,sequence));
    }
    
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
    // Write your code here.
		
		int counter = 0;
		int index = 0;
		for(int i=0;i<array.size();i++){
					if(sequence.size() == counter){
						return true;
					}
					if(sequence.get(counter)==array.get(i)){
						counter++;
					}
				
		}
    return sequence.size() == counter;
  }
    
    
}
