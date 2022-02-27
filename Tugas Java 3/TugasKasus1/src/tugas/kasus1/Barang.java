package tugas.kasus1;

/**
 * version 1.0
 * author novia
 * since 26/02/2022
 */
public class Barang {

   //attribute
    private String kode_barang;
    private String nama_barang;
    private int stok;
    
    //constructor
      public Barang(String kode, String nama, int stok){
       this.kode_barang = kode;
       this.nama_barang = nama;
       this.stok = stok;
      }
      
      //accessor
      public String getKode() {
          return this.kode_barang;
      }
      
      //accessor
      public String getNama() {
          return this.nama_barang;
      }
      
      //accessor
      public int getStok() {
          return this.stok;
      }
      
      //mutator
      public void setStok(int stok){
          this.stok += stok;
      }
} 
