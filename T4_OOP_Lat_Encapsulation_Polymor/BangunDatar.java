package T4_OOP_Lat_Encapsulation_Polymorphism;

public class BangunDatar {
    private float luas;
    private float keliling;
    
    public float getLuas(){
        return luas;
    }
    
    public float getKeliling(){
        return keliling;
    }
    
//    Methode yang akan di override oleh subsclass
    public void hitungLuas(){}
    public void hitungKeliling(){}
}