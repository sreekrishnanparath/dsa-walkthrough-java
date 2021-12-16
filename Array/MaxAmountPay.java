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
public class MaxAmountPay {
    
    public static void main(String args[]){
        List<Integer> prices = new ArrayList<Integer>();        
        prices.add(4);
        prices.add(1);
        prices.add(2);
        prices.add(3);
        prices.add(4);
        System.out.println(calculateAmount(prices));
  }
    
    public static long calculateAmount(List<Integer> prices) {
    // Write your code here
        int start = 0;
        int end = prices.size();
        int total = 0;       
        while(start<end){
            if(start==0) {
                total+=prices.get(start);                
            }else{          
                int temp1 = prices.get(start)-minAmount(prices,start);
                int temp  = Math.max(temp1,0);
                total = total+temp;
            }
            start++;            
        }     
        return total;
        
    }
    
    public static int minAmount(List<Integer> prices,int items){        
        if (items==1) return prices.get(0);        
        int min = 0;
        for(int i=0;i<items-1;i++){
            min = Math.min(prices.get(i),prices.get(i+1));
        }
        return min;
    }
    
}
