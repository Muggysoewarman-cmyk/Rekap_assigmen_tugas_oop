public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor 1: semua atribut diisi
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Constructor 2: tanpa tahun terbit
    public Buku(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = 0; // nilai default
    }

//    Karena constructor 3 dan 4 memiliki tipe data yg smaa yaitu string dan int, agar compiler tidak ambigu maka menggunakan teknik Static factory method
    public static Buku buatJudulTahun(String judul, int tahun) {
    return new Buku(judul, "-", tahun);
    }

    public static Buku buatPengarangTahun(String pengarang, int tahun) {
    return new Buku("-", pengarang, tahun);
    }

    // Constructor 5: hanya judul
    public Buku(String judul) {
        this.judul = judul;
        this.pengarang = "-";
        this.tahunTerbit = 0;
    }

    // Constructor 6: semua atribut default
    public Buku() {
        this.judul = "-";
        this.pengarang = "-";
        this.tahunTerbit = 0;
    }

    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Tahun Terbit: " + (tahunTerbit == 0 ? "-" : tahunTerbit));
        System.out.println("-------------------------");
    }
}