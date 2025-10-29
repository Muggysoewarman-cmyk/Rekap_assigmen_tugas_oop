public class Main {
    public static void main(String[] args) {
        
        Buku b1 = new Buku("Pemrograman OOP", "Galuh Pauline", 2025);
        Buku b2 = new Buku("Pemrograman OOP", "Galuh Pauline");
        Buku b3 = Buku.buatJudulTahun("Pemrograman OOP", 2025);
        Buku b4 = Buku.buatPengarangTahun("Galuh Pauline", 2025);
        Buku b5 = new Buku("Pemrograman OOP");
        Buku b6 = new Buku();

        b1.tampilkanInfo();
        b2.tampilkanInfo();
        b3.tampilkanInfo();
        b4.tampilkanInfo();
        b5.tampilkanInfo();
        b6.tampilkanInfo();
    }
}