/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Ambulance;

import java.util.ArrayList;

/**
 *
 * @author devikaboddu
 */
public class AmbulanceDirectory {
    private ArrayList<Ambulance> ambulancesList;

    public ArrayList<Ambulance> getAmbulances() {
        return ambulancesList;
    }

    public void setAmbulances(ArrayList<Ambulance> Ambulances) {
        this.ambulancesList = Ambulances;
    }

    public AmbulanceDirectory()
    {
         ambulancesList = new ArrayList<>();
    }
     
    public Ambulance createAmbulance(Ambulance ambulance) 
    {
        ambulancesList.add(ambulance);
        return ambulance;
    }
}
