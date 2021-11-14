/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.Arrays;

/**
 *
 * @author sreek
 */
public class BubSort {
    
    
    private static void sort(int[] arr){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
        
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
       }
    }
    
    private static void resort(int[] arr,int n){
        
        if (n == 1)
            return;
      
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }                
            }
        resort(arr,n-1);
        
    }
    
    public static void main(String arg[]){
        
       int[] arr = new int []{10,1,6,12,13,18,9};
        System.out.println(arr);
       for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
       }
       //sort(arr);
       resort(arr,arr.length);
       System.out.println("Sorted array : ");
       System.out.println(Arrays.toString(arr));
    }
    
}
