/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.String;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sreek
 */
public class GenerateDocument {

    /*
    You're given a string of available characters and a string representing a document that you need to generate.
    Write a function that determines if you can generate the document using the available characters. 
    If you can generate the document, your function should return true ; otherwise, it should return false . 
    You're only able to generate the document if the frequency of unique characters in the characters string is greater
    than or equal to the frequency of unique characters in the document string. For example,
    if you're given characters = "abcabc" and document = "aabbccc" you cannot generate the document because you're missing one c . 
    The document that you need to create may contain any characters, including special characters, capital letters, numbers, and spaces. 
     */
    public static void main(String args[]) {
        String characters = "abcabc";
        String document = "aabbccc";

        System.out.println(generateDocument(characters,document));
    }

    public static boolean generateDocument(String characters, String document) {
        // Write your code here.
        int start = 0;
        int counter = 0;
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < characters.length(); i++) {            
            if(map.containsKey(characters.charAt(i))){
                map.put(characters.charAt(i),map.get(characters.charAt(i))+1);
            }else{
                 map.put(characters.charAt(i),1);
            }
        }
        
        for (int i = 0; i < document.length(); i++) {            
           if(!map.containsKey(document.charAt(i)) || map.get(document.charAt(i))==0 ){
               return false;
           }
           map.put(document.charAt(i),map.get(document.charAt(i))-1);
        }
        
        
        return true;
    
    
}
    
}