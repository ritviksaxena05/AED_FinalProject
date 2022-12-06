/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Doctor;

import Model.Patient.Patient;
import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;
    
    public Doctor createDoctor(Doctor doc) {
        Doctor doctor = new Doctor(doc.getUserName());
        doctorList.add(doc);
        return doctor;
    }

    public void deleteDoctor(Doctor d) {
        doctorList.remove(d);
    }

    public Doctor addTreatedPatient(Doctor d, Patient p) {
        d.getTreatedPatients().add(p);
        return d;
    }

    public DoctorDirectory() {
        doctorList = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
}
