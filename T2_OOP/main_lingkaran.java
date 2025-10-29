package T2_OOP;

public class main_lingkaran {
    public static void main(String[] args) {
        // Input positif
        lingkaran Ll = new lingkaran(5.0);

        // Input nol
        lingkaran L2 = new lingkaran(0);

        // Input negatif
        lingkaran L3 = new lingkaran(-3.0);

        // Menampilkan info
        Ll.tampilkanInfo();
        L2.tampilkanInfo();
        L3.tampilkanInfo();
    }
}