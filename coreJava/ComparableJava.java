/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.coreJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sreek
 */
public class ComparableJava {
    
    public static void main(String args[]){
        
        List<Student> studMap = new ArrayList<>();
        Student student = new Student(1,"sree");
        studMap.add(student);
        Student student1 = new Student(3,"mathwes");
        studMap.add(student1);
        Student student2 = new Student(2,"hari");
        studMap.add(student2);
        Collections.sort(studMap);
       
        
        
        List<StudentWithoutImpl> studMap1 = new ArrayList<>();
        StudentWithoutImpl studentImpl = new StudentWithoutImpl(1,"sree");
        studMap1.add(studentImpl);
        StudentWithoutImpl studentImpl1 = new StudentWithoutImpl(3,"mathwes");
        studMap1.add(studentImpl1);
        StudentWithoutImpl studentImpl2 = new StudentWithoutImpl(2,"hari");
        studMap1.add(studentImpl2);
        Collections.sort(studMap1, new Comparator<StudentWithoutImpl>() {
                @Override
                public int compare(StudentWithoutImpl p1, StudentWithoutImpl p2) {
                    return p1.getId()-p2.getId(); // Descending
                }
            });
        
         System.out.println(studMap1);
         
        
        HashMap<Integer,Student> map = new HashMap<>();
        map.put(1,student);
        map.put(2,student1);
        map.put(3,student2);
        System.out.println(map);
        
        List<Map.Entry<Integer,Student>> mapList = new ArrayList<>(map.entrySet());
         System.out.println(mapList);
        Collections.sort(mapList, new Comparator<Map.Entry<Integer, Student>>(){
        public int compare(Map.Entry<Integer, Student> a,Map.Entry<Integer, Student> b){
            return b.getKey()-a.getKey();
        }
    });
         System.out.println(mapList);
    }
    
}
