package inputoutput.pkg2;

import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class InputOutput2 {

    public static void main(String[] args) {
        //Deklarasi Variabel
        String word; 
        int num;
        
        //Membuat array of string dan array of int
        String[] arrword = new String[3];
        int[] arrint = new int[3];
        
        //Membuat scanner 
        Scanner sc = new Scanner(System.in);
        
        //Memasukkan scanner ke array dengan looping
        for(int i=0; i<3; i++){
            word = sc.next();
            arrword[i] = word;
            num = sc.nextInt();
            arrint[i] = num;
        }
        
        //Mencetak output 
        System.out.println("====================");
        for(int i=0; i<3; i++){
            //Mencetak output dengan format 15 karakter diluruskan ke kiri dan 
            //karakter ke 16 menghasilkan output 3 digit angka yang dimulai dengan angka 0
            System.out.format("%-15s%03d%n", arrword[i], arrint[i]);
        }
        System.out.println("====================");  
    }
    
}
