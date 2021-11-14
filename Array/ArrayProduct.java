/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.Array;

import java.util.Arrays;

/**
 *
 * @author sreek
 */
public class ArrayProduct {
    
    /*
    Array OF Products — ww

Write a function that takes in a non-empty array of integers and returns an array of the
same length, where each element in the output array is equal to the product of every other
alae ema -m a] Ula

in other words, the value at output[i] is equal to the product of every number in the
input array other than input[i] .

Note that you're expected to solve this problem without using division.

Stem etm

array = [5, 1, 4, 2]

Sample Output [8,40,10,20]


// 8 is equal to 1x 4x 2
//40 ie anual to 5x4x2
    */
    
         public static void main(String args[]) {

       
        int[] arrayOne = new int[4];
        
        arrayOne[0] = (5);
        arrayOne[1] = (1);
        arrayOne[2] = (4);
        arrayOne[3] = (2);
       
        System.out.println(Arrays.toString(arrayOfProductsON2(arrayOne)));
        System.out.println(Arrays.toString(arrayOfProductON(arrayOne)));

    }
         
    public static int[] arrayOfProductsON2(int[] array) {
        int result[]= new int[array.length];
		
		
		for(int i=0;i<array.length;i++){
			int sum = 1;
			for(int j=0;j<array.length;j++){
				if(i!=j){
					sum = sum * array[j];
				}
			}
			result[i]=sum;
			
		}
		
		
    return result;
        
    }
    
    public static int[] arrayOfProductON(int[] array) {
    // Write your code here.
		int result[]= new int[array.length];
		
		int leftsum = 1;
		for(int i=0;i<array.length;i++){
			result[i] = leftsum;
			leftsum=leftsum* array[i];
		}
		
		int rightsum = 1;
		for(int i=array.length-1;i>=0;i--){
			result[i] = result[i]*rightsum;
			rightsum=rightsum* array[i];
		}
			
		
		
    return result;
  }
    
}
