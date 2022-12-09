/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Pharmacy;

import java.util.ArrayList;
import Model.Patient.Patient;
/**
 *
 * @author ramya
 */
public class Pharmacy {
    private String name;
    private ArrayList<Patient> patientRecordList;
    private ArrayList<Prescription> prescriptionList;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Patient> getPatientRecordList() {
        return patientRecordList;
    }

    public void setPatientRecordList(ArrayList<Patient> patientRecordList) {
        this.patientRecordList = patientRecordList;
    }

    public ArrayList<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(ArrayList<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
}
