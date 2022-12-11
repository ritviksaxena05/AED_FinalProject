/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Ambulance;

import Model.Patient.Patient;
import java.util.ArrayList;


/**
 *
 * @author devikaboddu
 */
public class Ambulance {
    
    private String ambulanceDriverFirstName;
    private String ambulanceDriverLastName;
    private String ambulanceVehicleNo;
    private String ambulanceDriverPhoneNo;
    private String ambulanceDriverStatus;
    private int ambulanceDriverAge;
    private String accidentPlace;
    private ArrayList<Patient> ambulancePatientsList;
    
    public Ambulance()
    {
         this.ambulancePatientsList = new ArrayList<Patient>();
    }

    public String getDriverFirstName() {
        return ambulanceDriverFirstName;
    }

    public void setDriverFirstName(String driverFirstName) {
        this.ambulanceDriverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return ambulanceDriverLastName;
    }

    public void setDriverLastName(String driverLastName) {
        this.ambulanceDriverLastName = driverLastName;
    }

    public String getVehicleNo() {
        return ambulanceVehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.ambulanceVehicleNo = vehicleNo;
    }

    public String getDriverPhoneNo() {
        return ambulanceDriverPhoneNo;
    }

    public void setDriverPhoneNo(String driverPhoneNo) {
        this.ambulanceDriverPhoneNo = driverPhoneNo;
    }

    public String getStatus() {
        
        return ambulanceDriverStatus;
    }

    public void setStatus(String Status) {
        this.ambulanceDriverStatus = Status;
    }

    public int getDriverAge() {
        return ambulanceDriverAge;
    }

    public void setDriverAge(int driverAge) {
        this.ambulanceDriverAge = driverAge;
    }

    public String getAccidentLocation() {
        return accidentPlace;
    }

    public void setAccidentLocation(String accidentLocation) {
        this.accidentPlace = accidentLocation;
    }

    public ArrayList<Patient> getAmbulancePatientsList() {
        return ambulancePatientsList;
    }

    public void setAmbulancePatientsList(ArrayList<Patient> ambulancePatientsList) {
        this.ambulancePatientsList = ambulancePatientsList;
    }
    
    
    
    @Override
    public String toString() {
        return ambulanceDriverFirstName;
    }
}

