/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.dynamic;

import dsa.recursion.*;

/**
 *
 * @author sreek
 */
public class CatalanNumberDP {
    
    //C(n)  = c(n)* c(n-i-1)
    
    
    public static void main(String[] args) {
        System.out.println(findCatalan(4));
    }
    
    
    static int findCatalan(int n){
        
        
        int catalan[] = new int[n + 2];
        
        catalan[0] = 1;
        catalan[1] = 1;
        
        
                     
        for (int i = 2; i <= n; i++)
        {
            catalan[i] = 0;
            for (int j = 0; j < i; j++)
        {
             catalan[i]
                    += catalan[j] * catalan[i - j - 1];
        }
           
            
        }
        return catalan[n];
        
    }
}
