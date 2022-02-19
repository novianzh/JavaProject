package inputoutput;

import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class InputOutput {

    public static void main(String[] args) {
        // Deklarasi variabel
        String s; 
        int n;
        
        // Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //Memasukkan scanner ke string s
        s = input.nextLine();
        
        //Membuat array of string untuk memisahkan string menjadi token berdasarkan format specifier
        String[] stringarr = s.split("[@ ? ! _ , . ']+");
        
        //Menginisialisasi n dengan jumlah token pada stringarr
        n = stringarr.length;
        
        //Mencetak n
        System.out.println(n);
        
        //Mencetak token secara berurutan
        for(int i=0; i < n; i++){
            System.out.println(stringarr[i]);
        }   
    }
    
}
