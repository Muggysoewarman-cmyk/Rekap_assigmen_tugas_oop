package T2_OOP;

public class mobil {
  String merek, model;
  int tahun;
  
  
public mobil(String merek,String model){
    this.merek = merek;
    this.model = model;
    this.tahun = 2025;
}

public mobil(String merek, String model, int tahun){
    this.merek = merek;
    this.model = model;
    this.tahun = tahun;
}

public void tampilkanInfo(){
    System.out.println("Merek: " + merek);
    System.out.println("Model: " + model);
    System.out.println("Tahun: " + tahun);
    System.out.println("--------------------");
}
  
}