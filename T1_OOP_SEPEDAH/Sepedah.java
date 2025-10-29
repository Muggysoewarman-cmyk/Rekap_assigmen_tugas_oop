package T1_OOP_Sepedah;

import java.util.Scanner;

public class Sepedah{
//  Properti
    String merk;
    int kecepatan;
    int jarak_tempuh = 0;
    
    
// Methode
    void melaju(){
//  Menambah jarak tempuh sepanjang 10 KM
    jarak_tempuh += 10;
        System.out.println(merk + " melaju sejauh 10 KM. Total jarak saat ini: " + jarak_tempuh + " KM");
    }
    
    void berhenti(){
//  Akan menampilkan jarak tempuh terakhir sepeda tersebut
    System.out.println("Jarak tempuh terahir adalah: " + jarak_tempuh);
    }
    
    void mundur(){
//      Mengurangi jarak tempuh 5 KM 
    if(jarak_tempuh >= 5){
        jarak_tempuh -= 5;
        System.out.println(merk + " mundur, sehingga jarak dikurangi 5 KM, dan total jarak saat ini: " + jarak_tempuh + " KM");
        }
    else{
        jarak_tempuh = 0;
    }
    }
    
    void tampilMenu() {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU AKSI untuk " + this.merk + " ===");
            System.out.println("1. Melaju");
            System.out.println("2. Berhenti");
            System.out.println("3. Mundur");
            System.out.println("0. Keluar");
            System.out.print("Pilih aksi: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1: this.melaju(); break;
                case 2: this.berhenti(); break;
                case 3: this.mundur(); break;
                case 0: System.out.println("Exit."); break;
                default: System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    
}