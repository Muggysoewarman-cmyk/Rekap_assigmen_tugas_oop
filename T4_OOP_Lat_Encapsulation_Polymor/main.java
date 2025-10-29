package T4_OOP_Lat_Encapsulation_Polymorphism;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        BangunDatar bd = null;
        
        System.out.println("====== Menghitung Luas dan Keliling Bangun Datar ======");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.print("Pilih bangun datar: ");
        int pilihan = input.nextInt();
        
        switch(pilihan){
            case 1:
                Persegi p = new Persegi();
                System.out.print("Masukkan Sisi: ");
                p.setSisi(input.nextFloat());
                bd = p;
                break;
                
            case 2:
                PersegiPanjang pp = new PersegiPanjang();
                System.out.print("Masukkan Panjang: ");
                pp.setPanjang(input.nextFloat());
                System.out.print("Masukkan Lebar: ");
                pp.setLebar(input.nextFloat());
                bd = pp;
                break;
                
            case 3:
                Lingkaran l = new Lingkaran();
                System.out.print("Masukkan Jari-Jari: ");
                l.setJari(input.nextFloat());
                bd = l;
                break;
                
            case 4:
                Segitiga s = new Segitiga();
                System.out.print("Masukkan Alas: ");
                s.setAlas(input.nextFloat());
                System.out.print("Masukkan Tinggi: ");
                s.setTinggi(input.nextFloat());
                bd = s;
                break;
                
            default:
                System.out.println("Pilihan Tidak Valid!");
                break;
        }
        
        System.out.println("======== HASIL PERHITUNGAN ========");
        bd.hitungLuas();
        bd.hitungKeliling();
        
        
        
        
        
    }
}