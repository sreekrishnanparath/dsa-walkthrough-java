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
public class SmallestDifference {

    /*
    Write a function that takes in two non-empty arrays of integers, finds the pair of
numbers (one from each array) whose absolute difference is closest to zero, and
Fe-1K0 a= 1 ORSON eA MUM OAL LAN ee LATO at el ROR RIL
the first position.

Note that the absolute difference of two integers is the distance between them on the
real number line. For example, the absolute difference of -5 and 5 is 10, and the
absolute difference of -5 and -4 is 1.

oS CoLO eT aR-IOL tN MUN 1M UNC B Yea) Yee a C= ov OLN eR eT) ol
hic alae
Benne Cem neem

arrayOne = [-1, 5, 10, 20, 28, 3]
[26, 134, 135, 15, 17]
    
    Answer is [28,26]
     */
    public static void main(String args[]) {

        int[] arrayOne = new int[6];
        arrayOne[0] = (-1);
        arrayOne[1] = (5);
        arrayOne[2] = (10);
        arrayOne[3] = (20);
        arrayOne[4] = (3);
       // arrayOne[5] = (3);
        

        int[] arrayTwo = new int[5];
        arrayTwo[0] = (26);
        arrayTwo[1] = (134);
        arrayTwo[2] = (135);
        arrayTwo[3] = (15);
        arrayTwo[4] = (17);

        int[] result  = smallestDifference(arrayOne, arrayTwo);
         System.out.println(result[0] + " " + result[1]);

    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int[] result = new int[2];
        Arrays .sort(arrayOne) ;
        Arrays .sort(arrayTwo) ;
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer .MAX_VALUE;
        int[] smallestPair = new int[2];
        while (idxOne < arrayOne.length && idxTwo < arrayTwo.length){
        int firstNum = arrayOne[idxOne];
        int secondNum = arrayTwo[idxTwo];
         if (firstNum < secondNum) {      
            current = secondNum - firstNum;
            idxOne++;

        } else if (secondNum < firstNum) {      
            current = firstNum - secondNum;
            idxTwo++;

        } else {

            return new int[] {firstNum, secondNum};
        }
       
        if(smallest > current){
            smallest = current;
            result =  new int[] {firstNum, secondNum};
            }
        }
        return result;
    }
}
