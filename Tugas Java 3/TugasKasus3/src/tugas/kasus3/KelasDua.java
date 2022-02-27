package tugas.kasus3;

/**
 * version 1.0
 * author novia
 * since 26/02/2022
 */
public class KelasDua {
    {
        System.out.println(5); //tidak ada pembuatan objek dengan class KelasDua sehingga tidak tampil pada output
    }
    
    public static void main(String[] args)
    {
        System.out.println(6);
        KelasSatu satu = new KelasSatu(); //pemanggilan seluruh atribut pada KelasSatu
        KelasSatu dua = new KelasSatu(10);//Pemanggilan parameter agar menggunakan constructor int i
    }
}
