package tugas.kasus3;

/**
 * version 1.0
 * author novia
 * since 26/02/2022
 */
public class KelasSatu {

    {
        System.out.println(11); //pemanggilan blok inisialisasi ketika terdapat objek yg dibuat dengan class yang didefinisikan
    }

    static  //pemanggilan class sebanyak satu kali dan blok static pun akan diprint pertama kali
    {
        System.out.println(2);
    }
    public KelasSatu(int i) //blok static dan inisialisasi akan dijalankan terlebih dahulu kemudian dilanjut oleh constructor
    {
        System.out.println(3);
    }
    public KelasSatu() //constructor tanpa parameter akan dijalankan sesuai kondisi saat pemanggilannya
    {
        System.out.println(4);
    }
}
