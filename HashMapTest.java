/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author sreek
 */
public class HashMapTest {
    
    public static void main(String args[]){
        
        
        HashMap<String,String> map = new HashMap<>();
        map.put("sree","krishnan");
        map.put("xaver","mathwes");
        Iterator ite = map.keySet().iterator();
//        while(ite.hasNext()){
//            String key = (String) ite.next();
//            System.out.println(key);
//            System.out.println(map.get(key));
//        }
        
        for(String key : map.keySet()){
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
    
}
