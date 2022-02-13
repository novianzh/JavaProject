package datatypes;
import java.util.Scanner;

/**
 *
 * author Novia
 * version 1.0
 * since 2022-02-12
 */


public class DataTypes {

 public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi variabel
        int jumlahAngka;
        boolean valid = false;
        
        // Pembuatan Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Input User
        jumlahAngka = keyboard.nextInt();
        
        // Deklarasi Variabel Penampungan
        String[] angka = new String [jumlahAngka];
        
        for (int i = 0; i < jumlahAngka; i++) {
            angka[i] = keyboard.next();
        }
        
        for (int i = 0; i < jumlahAngka; i++){
            long longMin = -9223372036854775808L;
            long longMax = 9223372036854775807L;
            try{
                long parseLong = Long.parseLong(angka[i]);
                System.out.println(parseLong + " can be fitted in:");
                if(parseLong >= longMin && parseLong <= longMax){
                    System.out.println("long");
                    if(parseLong >= -2147483648 && parseLong <= 2147483647){
                         System.out.println("int");
                        if(parseLong >= -32768 && parseLong <= 32767){
                            System.out.println("short");
                        }
                    }
                }
                // Bisa Termasuk ke dalam Long
            }catch(Exception e){
                // Tidak Bisa Masuk Kemanapun
                System.out.println(angka[i] + " can't be fitted anywhere");
                }
        }

    }
    
}
