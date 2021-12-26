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
public class Fibonacci {
    
    
    public static void main(String[] args) {
        
        System.out.println(System.currentTimeMillis());
        //for(int i=1;i<=10;i++){
            System.out.println(findFib(10000));
        //}
        System.out.println(System.currentTimeMillis());
    }
    
    static int findFib(int n){        
        
        if(n==1 || n==2)
            return 1;
            
        int[] num = new int[n+1];
        num[1] = 1;
        num[2] = 1;
        for(int i=3;i<=n;i++)
            num[i] = num[i-1]+num[i-2];
        
        return num[n];
        
        
        
    }
    
}
