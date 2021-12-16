/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.coreJava;

/**
 *
 * @author sreek
 */
public class StudentWithoutImpl {
    
    int id;
    String name;

    public StudentWithoutImpl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentWithoutImpl() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + '}';
    }

    
    
    
    
}
