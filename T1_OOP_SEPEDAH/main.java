package T1_OOP_Sepedah;
import java.util.Scanner;

public class main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat objek sepeda 
        Sepedah s = new Sepedah();
        System.out.print("Masukkan Merk Sepeda: ");
        s.merk = input.nextLine();
        System.out.print("Masukkan kecepatan sepeda: ");
        s.kecepatan = input.nextInt();
        input.nextLine(); // buang enter
        s.tampilMenu(); // langsung tampilkan menu untuk s1

        input.close();
    }
}
