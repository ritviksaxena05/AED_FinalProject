/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

import BusinessModel.Patient.PatientBills;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class Patient_Directory {
    private PatientBills bill;
    private ArrayList<BusinessModel.Patient.Patient> patients;
    
     public PatientBills AddBill(BusinessModel.Patient.Patient patient,String ItemName,String Org,String amount){
        
        bill = new PatientBills(ItemName, Org, (float) 800);
        patient.addbill(bill);
        return bill;
    }
    public ArrayList<BusinessModel.Patient.Patient> getPatientList() {
        return patients;
    }

    public void setPatientList(ArrayList<BusinessModel.Patient.Patient> patientList) {
        this.patients = patientList;
    }
    public void deletePatient(BusinessModel.Patient.Patient p){
        patients.remove(p);
    }
     public Patient_Directory()
     {
         patients = new ArrayList<>();
     }
     
      public BusinessModel.Patient.Patient createPatient(BusinessModel.Patient.Patient patient) {
        patients.add(patient);
        return patient;
    }
    public float billTotal(BusinessModel.Patient.Patient patient){
         float billTotal = patient.totalBill();
         return billTotal;
    }
}
