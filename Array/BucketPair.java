/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sreek
 */
public class BucketPair {
    
    public static void main(String args[]){
        
        
        int[] buket = {1,15,80,54,20};
        
        
       // 1,15,20,54,80
         sortArray(buket);
        
        
       List<Integer> result  = new ArrayList<>();
       List<Integer> temp = new ArrayList<>(); 
       int n = buket.length;
       for (int i = 0; i < n - 1; i++) {
 
        // absolute difference between
        // consecutive numbers
        int diff = Math.abs(buket[i] - buket[i + 1]);
        if(diff<=30){
            //System.out.println(diff+" "+buket[i]+" "+buket[i + 1]);
            result.add(buket[i]);
            result.add(buket[i + 1]);
        }else{
            temp.add(buket[i]);
            temp.add(buket[i + 1]);
        }
        
        
        }
       System.out.println(result);
        System.out.println(temp);
       
        
    }
    
    private static int[] sortArray(int[] bArray){
        
        if(bArray.length==0){
            return new int[]{};
        }
        
        for(int i=1;i<bArray.length;i++){
            int j=i;
            while(j>0&& bArray[j]<bArray[j-1]  ){
                int temp = bArray[j];
                bArray[j] = bArray[j-1];
                bArray[j-1]=temp;
                j=j-1;
         
            }
        }        
        
        return bArray;
        
    }
    
}
