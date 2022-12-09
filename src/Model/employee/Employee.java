/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

/**
 *
 * @author ramya
 */
public class Employee {
    private String name;
    private static int count = 1;
    private final int id;

    
    public Employee() {
        this.id = count;
        count++;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public String toString(){
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }      
}
