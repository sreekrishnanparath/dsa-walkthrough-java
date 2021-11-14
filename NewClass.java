/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sreek
 */
public class NewClass {
    
    String name;
    int age = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public NewClass(String name,int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    
    
    
   
    
    public static void main(String args[]){
         List<NewClass> employeeMap = new ArrayList<>();

            employeeMap.add(new NewClass("Nitnameish", 26));
            employeeMap.add(new NewClass("Sh", 2));
            employeeMap.add(new NewClass("S", 1));

        NewClass james = employeeMap.stream()
          .filter(customer -> "S".equals(customer.getName()))
          .findAny()
          .orElse(null);

        System.out.println(james.age);
    
    }
    
    
    
}
