/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.recursion;

/**
 *
 * @author sreek
 */
public class CatalanNumber {
    
    //C(n)  = c(n)* c(n-i-1)
    
    
    public static void main(String[] args) {
        System.out.println(findCatalan(4));
    }
    
    
    static int findCatalan(int n){
        
        int result = 0;
        
        
        if(n==1||n==0){
            return 1;
        }
             
        for (int i = 0; i < n; i++)
        {
            result = result+findCatalan(i)*findCatalan(n-i-1);
            
        }
        return result;
        
    }
}
