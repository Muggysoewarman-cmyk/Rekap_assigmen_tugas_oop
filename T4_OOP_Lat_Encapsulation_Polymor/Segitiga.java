package T4_OOP_Lat_Encapsulation_Polymorphism;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
    
    public void setAlas(float alas){
        this.alas = alas;
    }
    
    public float getAlas(){
        return alas;
    }
    
    public void setTinggi(){
        this.tinggi = tinggi;
    }
    
    public float getTinggi(){
        return tinggi;
    }
    
    @Override
    public void hitungLuas(){
        System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi));
    }
    
    @Override
    public void hitungKeliling() {
    double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
    System.out.println("Keliling Segitiga (sama kaki): " + (alas + 2 * sisiMiring));
    } 

    void setTinggi(float nextFloat) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}