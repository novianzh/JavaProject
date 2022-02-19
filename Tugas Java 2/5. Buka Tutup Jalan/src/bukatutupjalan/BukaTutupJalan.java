package bukatutupjalan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class BukaTutupJalan {
    
    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // Membuat array int 
        int[] array = new int[4];
        
        // Memasukkan scanner ke dalam array int
        for(int i=0; i<4; i++ ){
            array[i] = input.nextInt();
        }
        
        //Membuat string untuk menampung hasil convert array int menjadi string
        //replaceAll() digunakan untuk menghapus karakter "[", ",", dan "]" dari output toString()
        String str = Arrays.toString(array).replaceAll("\\[|\\]|,|\\s", "");
        
        //Untuk mengconvert string ke tipe data long
        long angka = Long.parseLong(str);
        
        //Pengecekan kondisi apabila gabungan angka dikurangi 999999 kemudian sisa hasil baginya adalah 0
        //Maka output akan mencetak "berhenti" dan apabila sisa hasil bagi adalah 1 maka akan mencetak "jalan"
        if((angka-999999)%5==0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
    
}
