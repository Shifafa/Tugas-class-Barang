public class Kerudung extends Barang {
public void tampilkan(){
     String ukuran= "L";
     String bahan="wolfis";
     String kategori="pashmina";

     Barang m = new Barang();

     m.inputData("rabani", "Hitam", "elegan", 4);
     m.tampilkandata();

      System.out.println("ukuran :"+ukuran);
      System.out.println("jenis bahan  :"+bahan);
      System.out.println("kategori :"+kategori);
    
}    
}