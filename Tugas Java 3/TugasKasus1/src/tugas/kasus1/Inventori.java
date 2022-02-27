package tugas.kasus1;

/**
 * version 1.0
 * author novia
 * since 26/02/2022
 */
public class Inventori {
    Barang[] barangs;  //var.barangs adalah deklarasi class barang dengan tipe data array
    
    
    //(Methods)
    void initBarang() { //merupakan inisialisasi dari objek barang
        barangs = new Barang[2]; //digunakan untuk menginstansiasi(new) dari var. barangs
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    
    //(Methods)
    void showBarang() { //menampilkan nilai dari var. nama_barang dan stok
        System.out.println(barangs[0].getNama() + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].getNama() + "(" + barangs[1].getStok() + ")");  
    }
    
    //(Methods)
    void pengadaan() { //merupakan proses dari pengadaan stok
        initBarang();
        
        barangs[0].setStok(20);
       // barangs[0].stok -= 30; //Bisa juga dikurangi dong?
       // barangs[0].stok *= 30; //dikali juga bisa dong??
        showBarang();
    }
    
    
    //(Main Method)
    public static void main(String[] args) {
        Inventori beli = new Inventori(); //merupakan instansiasi dari var. beli dengan class Inventori
        beli.pengadaan();  //pemanggilan dari var. beli dengan pengadaan
    }
}   
