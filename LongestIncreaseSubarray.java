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
public class LongestIncreaseSubarray {
    
    
    private static void checkResultArray(List<Integer> re,int value){
       int right=  re.size()-1;
       int left  = 0;
       int result = -1;
       int c = -1;
       System.out.println("Result#"+re);
       
       while(left<=right){
           int mid = left + ((right-left)/2);
           System.out.println("re.get(mid)"+re.get(mid));
           if(value == re.get(mid)){
               c = mid;
               break;
           }else if(re.get(mid) > value){
               right = mid -1;
               c  = mid ;
           }else {
               left = mid +1 ;
           }
           
       }
       re.set(c,value);
    }
    
    public static void main(String args[]){
        
        List<Integer> intList = new ArrayList<>();
        intList.add(6);
        intList.add(2);
        intList.add(4);
        intList.add(3);
        intList.add(7);
        intList.add(4);
        intList.add(5);
        System.out.println(intList);
        List<Integer> reList = new ArrayList<>();
        
        int size = intList.size();
        for(int i = 0;i<size;i++){
            //System.out.println(intList.get(i)+" "+intList.get(i+1));
            if(reList.size()>0){
                if(reList.get(reList.size()-1) < intList.get(i)){
                    reList.add(intList.get(i));
                }else{
                    checkResultArray(reList,intList.get(i));
                }
            }else{
               if(intList.get(i) < intList.get(i+1)){
                    reList.add(intList.get(i));
                    reList.add(intList.get(i+1));
               } else{
                   reList.add(intList.get(i+1));
               }
            }
        }
        System.out.println(reList);
        
    }
    
    
}
