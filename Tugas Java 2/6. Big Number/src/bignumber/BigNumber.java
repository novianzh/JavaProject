package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class BigNumber {

    public static void main(String[] args) {
        // Membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // Membuat var dengan tipe data BigInteger dan memasukkan scanner ke dalamnya
        BigInteger a = input.nextBigInteger();
        BigInteger b = input.nextBigInteger();
        
        // Menginisialisasi c sebagai hasil dari a + b
        BigInteger c = a.add(b);
        
        // Menginisialisasi d sebagai hasil dari a * b
        BigInteger d = a.multiply(b);
        
        // Mencetak c dan d 
        System.out.println(c);
        System.out.println(d);
    }
    
}
