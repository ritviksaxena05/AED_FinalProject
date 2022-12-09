/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Patient;

import Model.Patient.PatientBills;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class PatientDirectory {
    private PatientBills bill;
    private ArrayList<Model.Patient.Patient> patients;
    
     public PatientBills AddBill(Model.Patient.Patient patient,String ItemName,String Org,String amount){
        
        bill = new PatientBills(ItemName, Org, (float) 800);
        patient.addbill(bill);
        return bill;
    }
    public ArrayList<Model.Patient.Patient> getPatientList() {
        return patients;
    }

    public void setPatientList(ArrayList<Model.Patient.Patient> patientList) {
        this.patients = patientList;
    }
    public void deletePatient(Model.Patient.Patient p){
        patients.remove(p);
    }
     public PatientDirectory()
     {
         patients = new ArrayList<>();
     }
     //Added comment
      public Model.Patient.Patient createPatient(Model.Patient.Patient patient) {
        patients.add(patient);
        return patient;
    }
    public float billTotal(Model.Patient.Patient patient){
         float billTotal = patient.totalBill();
         return billTotal;
    }
}
