/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Doctor;

import Model.Patient.Patient;
import Model.Person.Person;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ramya
 */
public class Doctor extends Person{
    private String specialization;
    private String experience;
    private String imagePath;
    private ArrayList<Patient> treatedPatients;

    public Doctor() {
    
    }
     
    public Doctor(String userName) {
        this.setUserName(userName); 
        this.setTreatedPatients(new ArrayList<>());
    }
    
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public ArrayList<Patient> getTreatedPatients() {
        return treatedPatients;
    }

    public void setTreatedPatients(ArrayList<Patient> treatedPatients) {
        this.treatedPatients = treatedPatients;
    }
    
    
}
