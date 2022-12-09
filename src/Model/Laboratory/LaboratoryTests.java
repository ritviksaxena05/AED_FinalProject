package Model.Laboratory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devikaboddu
 */
public class LaboratoryTests {

    
    private String labTestName;
    private int labTestprice;
    private String labTestUsage;
    
    public String getLabTestName() {
        return labTestName;
    }

    public void setLabTestName(String labTestName) {
        this.labTestName = labTestName;
    }

    public int getLabTestprice() {
        return labTestprice;
    }

    public void setLabTestprice(int labTestprice) {
        this.labTestprice = labTestprice;
    }

    public String getLabTestUsage() {
        return labTestUsage;
    }

    public void setLabTestUsage(String labTestUsage) {
        this.labTestUsage = labTestUsage;
    }
    
        @Override
    public String toString() {
        return labTestName;
    }
}
