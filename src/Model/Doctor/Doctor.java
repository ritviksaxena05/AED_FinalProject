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
    private String docUserName;
    private String docPassword;
    private String docFirstName;
    private String docLastName;
    private String docGender;
    private int docAge;
    private Date docDOB;
    private String docContactNumber;
    private String docEmail;
    private String docAddress;
    private String docWorkID;
    private String docSpecialization;
    private String docExperience;
    private String docImagePath;
    private ArrayList<Patient> treatedPatients;

    public Doctor() {
    
    }
     
    public Doctor(String userName) {
        this.setUserName(docUserName); 
        this.setTreatedPatients(new ArrayList<Patient>());
    }
    
    public String getdocUserName() {
        return docUserName;
    }

    public void setdocUserName(String docUserName) {
        this.docUserName = docUserName;
    }

    public String getdocPassword() {
        return docPassword;
    }

    public void setdocPassword(String docPassword) {
        this.docPassword = docPassword;
    }

    public String getdocFirstName() {
        return docFirstName;
    }

    public void setdocFirstName(String docFirstName) {
        this.docFirstName = docFirstName;
    }

    public String getdocLastName() {
        return docLastName;
    }

    public void setdocLastName(String docLastName) {
        this.docLastName = docLastName;
    }

    public String getdocGender() {
        return docGender;
    }

    public void setdocGender(String docGender) {
        this.docGender = docGender;
    }

    public int getdocAge() {
        return docAge;
    }

    public void setdocAge(int docAge) {
        this.docAge = docAge;
    }

    public Date getdocDOB() {
        return docDOB;
    }

    public void setdocDOB(Date docDOB) {
        this.docDOB = docDOB;
    }

    public String getdocContactNumber() {
        return docContactNumber;
    }

    public void setdocContactNumber(String docContactNumber) {
        this.docContactNumber = docContactNumber;
    }

    public String getdocEmail() {
        return docEmail;
    }

    public void setdocEmail(String docEmail) {
        this.docEmail = docEmail;
    }

    public String getdocAddress() {
        return docAddress;
    }

    public void setdocAddress(String docAddress) {
        this.docAddress = docAddress;
    }

    public String getdocWorkID() {
        return docWorkID;
    }

    public void setdocWorkID(String docWorkID) {
        this.docWorkID = docWorkID;
    }
    
    public String getdocSpecialization() {
        return docSpecialization;
    }

    public void setdocSpecialization(String specialization) {
        this.docSpecialization = specialization;
    }

    public String getdocExperience() {
        return docExperience;
    }

    public void setdocExperience(String experience) {
        this.docExperience = experience;
    }

    public String getdocImagePath() {
        return docImagePath;
    }

    public void setdocImagePath(String imagePath) {
        this.docImagePath = imagePath;
    }

    public ArrayList<Patient> getTreatedPatients() {
        return treatedPatients;
    }

    public void setTreatedPatients(ArrayList<Patient> treatedPatients) {
        this.treatedPatients = treatedPatients;
    }
    
    
}
