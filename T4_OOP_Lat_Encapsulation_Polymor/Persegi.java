package T4_OOP_Lat_Encapsulation_Polymorphism;

public class Persegi extends BangunDatar {
    private float sisi;
    
    public void setSisi(float sisi){
        this.sisi = sisi;
    }
    
    public float getSisi(){
        return sisi;
    }
    
//    getLuas() dari BangunDatar
    @Override
    public void hitungLuas(){
        System.out.println("Luas Persegi: " + (sisi*sisi));
    }

//    gethitungKeliling() dari BangunDatar
    @Override
    public void hitungKeliling(){
        System.out.println("Keliling Persegi: " + (4 * sisi));
    }
}