/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author sreek
 */
public class ArrayMinus {
    
    
    private static void reFun(List<Integer> arr, int size){
        
        if(size==0){
            return ;
        }
        int count = 0;
        int i= 0;
        int last = 0;
        while(i < size){
            if(i==0) last = arr.get(0);
            if(arr.get(i)>0){            
                arr.set(i, arr.get(i) - last);
                count++;
            }else{
                arr.remove(i);
            }
            i++;
        }
        System.out.println(arr);    
        System.out.println(count); 
        reFun(arr,size-1);
        
        
        
    }
    
    public static void main(String[] args) throws Exception {
        int size = 6;
        List<Integer> arr = new ArrayList<>();
        arr.add(5);arr.add(4);arr.add(4);arr.add(2);arr.add(2);arr.add(8);
        Collections.sort(arr);
        System.out.println(arr);
        
        reFun(arr,size);
        
        
    }
    
}
