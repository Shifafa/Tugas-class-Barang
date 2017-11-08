public class Barang 
{
 private String merek;
 private String warna;
 private int jumlah;
 private String jenis;

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
        System.out.println("merek  :"+getMerek());
        System.out.println("warna :"+getWarna());
        System.out.println("total  :"+getJumlah());
        System.out.println("jenis :"+getJenis());
        
 }
 public void inputData(String m,String w,String j,int jb){
     setMerek(m);
     setWarna(w);
     setJenis(j);
     setJumlah(jb);
     
 }
}