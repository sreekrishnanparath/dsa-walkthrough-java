/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.HashMap;

/**
 *
 * @author sreek
 */
public class StringPattern {
    
   static  boolean  check(String str,String ptn){
       String[] words = str.split(" ");
       System.out.println(str.length());
        System.out.println(ptn.length());
        if(words.length!= ptn.length()){
            return false;
        }
        
        
        
        HashMap<Character,String> dataMap = new HashMap<>();
        for(int i=0;i<ptn.length();i++){
            if(dataMap.containsKey(ptn.charAt(i))){
                if(!dataMap.get(ptn.charAt(i)).equals(words[i])){
                    return false;
                }
                
            }else{
                dataMap.put(ptn.charAt(i), words[i]);
            }
        }
        return true;
        
    }
    
    public static void main(String args[]){
        
        //String str = "don is not this";
       String str = "this is is this.";
        String pattern = "abba";
        
        System.out.println("result = "+check(str,pattern));
        
        
    }
            
    
}
