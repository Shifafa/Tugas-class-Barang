public class Celana extends Barang {
public void tampilkan(){
     double ukuran= 29;
     String bahan="jeans";
     String kategori="wanita";

     Barang m = new Barang();

     m.inputData("thecloting", "Hitam", "elegan", 4);
     m.tampilkandata();

      System.out.println("ukuran :"+ukuran);
      System.out.println("jenis bahan  :"+bahan);
      System.out.println("kategori :"+kategori);
    
}    
}