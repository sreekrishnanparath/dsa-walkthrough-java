package dsa;


import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sreek
 */
public class CoinChange {
    
    public static void main(String args[]){
        
        int[] coins = new int[8];
        coins[0]=5;
        coins[1]=7;
                coins[2]=1;
                coins[3]=1;
                coins[4]=2;
                coins[5]=3;
                coins[6]=22;
                
                System.out.println(nonConstructibleChange(coins));
    }
    
    public static int nonConstructibleChange(int[] coins) {
    // Write your code here.
		Arrays.sort(coins);
		
		int change=0;
		
		for(int coin : coins){
			if(coin>change+1){
				return change+1;
			}
			change+=coin;
			
			
		}
		
    return change+1;
  }
    
}
