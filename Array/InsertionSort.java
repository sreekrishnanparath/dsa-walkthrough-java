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
public class InsertionSort {
    
    public static void main(String args[]){
    int[] array = {2,9,5,4,3,7,6};
    
      
        int[] result = insertSort(array);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
       }
            }
    
    
    private static int[] insertSort(int[] array){
        
        if(array.length ==0){
            return new int[]{};
        }
        
        for(int i=1;i<array.length;i++){
            int j=i;
            
            while(j>0 && array[j]<array[j-1]){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
                j=j-1;
            }
        }
        return array;
    }
    
}
