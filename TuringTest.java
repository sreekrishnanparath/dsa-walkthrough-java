/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author sreek
 */
public class TuringTest {
    
    public static void main(String args[]){
        List<String> list1 = new ArrayList<>();
        list1.add("foo");
        
        List<String> list2 = list1;
        List<String> list3 = new ArrayList(list2);
        
        list1.clear();
         list2.add("bar");
          list3.add("baz");
          
          System.out.println(list1);
                System.out.println(list2);
                System.out.println(list3);
                
                int x = 1;
                System.out.println(x ++);
                int y = 1;
                System.out.println(++y);
                
                int a=0;
                int b=9;
                if(a==0|| (b/a==3)){
                    
                    System.out.println("dsds");
                }else{
                    System.out.println("gggg");
                }
                System.out.println("13"+5+3);
                        
    }
    
    
}
