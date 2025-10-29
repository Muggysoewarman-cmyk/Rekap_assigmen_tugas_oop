package T2_OOP;
import java.util.Scanner;

public class lingkaran {
    double jariJari;
    double phi = 3.141592653589793; // nilai konstanta π

    // Constructor dengan parameter jariJari
    public lingkaran(double jariJari) {
        if (jariJari <= 0) {
            this.jariJari = 1.0; // nilai default jika <= 0
        } else {
            this.jariJari = jariJari;
        }
    }

    // Method menghitung luas
    public double hitungLuas() {
        return phi * jariJari * jariJari;
    }

    // Method menampilkan info
    public void tampilkanInfo() {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan Jari-Jari Lingkaran: ");
        jariJari = input.nextDouble();
        
        if(jariJari <= 0 ){
            jariJari = 1.0;
        }
       
        System.out.println("Jari-jari : " + jariJari);
        System.out.println("Luas      : " + hitungLuas());
        System.out.println("-------------------");
    }
}
