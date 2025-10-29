package T4_OOP_Lat_Encapsulation_Polymorphism;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;
    
//    Constructor
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    
    public float getPanjang(){
        return panjang;
    }
    
    public void setLebar (float lebar){
        this.lebar = lebar;
    }
    
    public float getLebar(){
        return lebar;
    }
    
    @Override
    public void hitungLuas(){
        System.out.println("Luas Persegi Panjang: " +(panjang * lebar) );
    }
    
    @Override
    public void hitungKeliling(){
        System.out.println("Keliling Persegi Panjang: " + (2 * (panjang + lebar)));
    }
    
    
}