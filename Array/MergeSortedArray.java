/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

/**
 *
 * @author sreek
 */
public class MergeSortedArray {
    
    
    public static void main(String args[]){
        
        int[] firstArray = {1,2,3,0,0,0};
        int[] secondArray = {2,5,6};
        
        
        mergeSortedArray(firstArray,secondArray,3,3);
        for(int i=0;i<firstArray.length;i++){
            System.out.println(firstArray[i]);
       }
    }
        
        
       private static int[] mergeSortedArray(int[] first,int[] second,int fs,int ss){
           
           fs--;
           ss--;
           
           int index = first.length-1;
           
           while(index>=0){
               
               if(ss<0){
                   return first;
               }
               
               int fInt = first[fs];
               int sInt = second[ss] ;
               if(sInt > fInt){
                   first[index] = sInt;
                   ss--;
               }else {
                   first[index] = fInt;
                   fs--;
               }
               
               index--;
           }
           
           
           return first;
       }
           
       
        
    
    
}
