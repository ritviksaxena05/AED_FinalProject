/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Ambulance.AmbulanceDirectory;
import Model.Doctor.DoctorDirectory;
import Model.Laboratory.Laboratory;
import Model.Pharmacy.Pharmacy;
import Model.Roles.Role;
import java.util.ArrayList;
import Model.Patient.PatientDirectory;


/**
 *
 * @author ramya
 */
public class EcoModel extends OrganizationModel {
    private static EcoModel business;
    private Laboratory laboratory;
    private DoctorDirectory doctorDirectory;
    private Pharmacy pharmacy;
    private AmbulanceDirectory ambulanceDirectory;
    private PatientDirectory patientDirectory;


    public Pharmacy getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Pharmacy pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Laboratory getLaboratory() {
        return laboratory = (laboratory == null)? new Laboratory() : laboratory;
    }

    public void setLaboratory(Laboratory laboratory) {
        this.laboratory = laboratory;
    }

    public static EcoModel getBusiness() {
        return business;
    }

    public static void setBusiness(EcoModel business) {
        EcoModel.business = business;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public static EcoModel getInstance()
    {
        if(business==null)
        {
            business=new EcoModel();
        }
        
        return business;
    }
     public AmbulanceDirectory getAmbulanceDirectory() {
        return ambulanceDirectory = (ambulanceDirectory == null) ? new AmbulanceDirectory() : ambulanceDirectory;
    }

    public void setAmbulanceDirectory(AmbulanceDirectory ambulanceDirectory) {
        this.ambulanceDirectory = ambulanceDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory = (patientDirectory == null) ? new PatientDirectory() : patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<>();
//        TODO: UNCOMMENT
//        roleList.add(new Administrator());
        return roleList;
    }
    private EcoModel()
    {
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName)
    {
       return false;
    }        
}