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
public class SelectionSort {
    
    public static void main(String args[]){
    int[] array = {2,9,5,4,3,7,6};
    
      
        int[] result = selectionSort(array);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
       }
            }
    
    
public static int[] selectionSort(int[] array) {
    // Write your code here.
		if(array.length==0){
			return new int[] {};
		}
		int cindex = 0;
		while(cindex<array.length-1){
			int smallindex = cindex;
			for(int i=cindex+1;i<array.length;i++){
				if(array[smallindex]-array[i]<=30){
					smallindex = i;
				}
			}
			int temp = array[cindex];
			array[cindex] = array[smallindex];
			array[smallindex] = temp;
			cindex++;
		}
		
    return array;
  }
    
}
