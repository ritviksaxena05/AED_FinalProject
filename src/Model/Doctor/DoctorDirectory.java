/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Doctor;

import java.util.ArrayList;

/**
 *
 * @author ramya
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;
    
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
