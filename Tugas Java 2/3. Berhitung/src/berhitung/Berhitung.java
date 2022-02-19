package berhitung;

import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class Berhitung {

    public static void main(String[] args) {
        //Deklarasi variabel
        int A,B,hasil;
        char operator;
        
        //Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        //Memasukkan scanner ke variabel
        A = input.nextInt();
         //charAt digunakan untuk memasukkan scanner ke var tipe data char
        operator = input.next().charAt(0); 
        //Memasukkan scanner ke variabel
        B = input.nextInt();
        
        //Pengecekan operator yang digunakan berdasarkan input user kemudian hasil operasi dicetak
        if((A>=1 && A<=1000)&&(B>=1 && B<=1000)){
            switch(operator){
                case '+':
                    hasil = A + B;
                    System.out.println(hasil);
                    break;
                case '-':
                    hasil = A - B;
                    System.out.println(hasil);
                    break;
                case '*':
                    hasil = A * B;
                    System.out.println(hasil);
                    break;
                case '/':
                    hasil = A / B;
                    System.out.println(hasil);
                    break;
                case '%':
                    hasil = A % B;
                    System.out.println(hasil);
                default:
                    System.out.println("Penggunaan Operator Salah");
                }
        }else
            System.out.println("Input Angka Salah");
    }
    
}
