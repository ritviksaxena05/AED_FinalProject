/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.ReceptionService;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class ReceptionService {
    private ArrayList<Patient> patientRecord;

    public ArrayList<Patient> getPatientRecord() {
        return patientRecord;
    }

    public void setPatientRecord(ArrayList<Patient> patientRecord) {
        this.patientRecord = patientRecord;
    }
}
