/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author sreek
 */
public class Re_1 {
    
    
    public static int getSum(int n){
        
        if(n==0) return 0;
        
        System.out.println(n);
        
        return n+getSum(n-1);
    }
    
    public static boolean getPali(String str,int s,int e){
        
        if(s>=e) return true;
        
        return (str.charAt(s)==str.charAt(e) && getPali(str,s+1,e-1));
    }
    
    public static void main(String arg[]){
        
        //System.out.println(getSum(5));
        
        String aa = "adcda";
        
         System.out.println(getPali(aa,0,aa.length()-1));
    }
    
}
