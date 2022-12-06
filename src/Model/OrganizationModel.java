/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ramya
 */
public class OrganizationModel {
    private String name;
    private int id;
    private static int counter = 0;
    
    public OrganizationModel(String name) {        
        this.id = counter;
        this.name = name;
        ++counter;
    }

    public OrganizationModel() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        OrganizationModel.counter = counter;
    }
    
    
}
