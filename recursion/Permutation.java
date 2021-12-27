/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreek
 */
public class Permutation {
    
    public static void main(String[] args) {
        
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        
        List<List<Integer>> re = getPermutations(intList);
        System.out.println(re);
    }
    
    public static List<List<Integer>> getPermutations(List<Integer> array){
        
         List<List<Integer>> result = new ArrayList<>();
         List<Integer> temp = null;
         for(int i = 0;i<array.size();i++){
             temp = new ArrayList<>();
             temp.add(array.get(i));
             for(int j=0;j<array.size();j++){
                 if(i!=j){
                    temp.add(array.get(j));
                 }
             }
             result.add(temp);
         }
        
        
        return result;
        
    }
    
}
