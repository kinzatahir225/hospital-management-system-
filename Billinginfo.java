
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

public class Billinginfo {
    private int patientID;
    private ArrayList<Integer> medicineID;
    private String recomendations,date;
    private int fee;

    public Billinginfo() {
        this.patientID =0 ;
        this.medicineID = new ArrayList<>();
        this.recomendations ="" ;
        this.date ="" ;
        this.fee = 0;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public ArrayList<Integer> getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(int medicineID) {
        this.medicineID.add( medicineID);
    }

    

   

    public String getRecomendations() {
        return recomendations;
    }

    public void setRecomendations(String recomendations) {
        this.recomendations = recomendations;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    
    
}
