package T4_OOP_Lat_Encapsulation_Polymorphism;

public class Lingkaran extends BangunDatar {
    private float jari;
    
    public void setJari(float jari){
        this.jari = jari;
    }
    
    public float getjari(){
        return jari;
    }
    
    @Override
    public void hitungLuas(){
        System.out.println("Luas Lingkaran: "+ (3.14 * jari * jari) );
    }
    
    @Override
    public void hitungKeliling(){
        System.out.println("Keliling Lingkaran: " + (2 * 3.14 * jari));
    } 
}