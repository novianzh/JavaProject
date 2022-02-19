package gajiagent;

import java.util.Scanner;

/**
 * version 1.0
 * author novia
 * since 19/02/2022
 */
public class GajiAgent {

    public static void main(String[] args) {
        // Deklarasi variabel
        int jumlahItem;
        double bonus, denda, totalGaji;
        
        // Membuat scanner baru dan memasukkannya ke variabel
        Scanner input = new Scanner(System.in);
        jumlahItem = input.nextInt();
        
        // Pengecekan kondisi berdasarkan penjualan item yang akan menentukan bonus dan denda
        if(jumlahItem >= 40){
            bonus = (25*0.01)*(jumlahItem*50000);
            totalGaji = 500000 + bonus;
        }else if(jumlahItem > 80){
            bonus = (35*0.01)*(jumlahItem*50000);
            totalGaji = 500000 + bonus;
        }else if(jumlahItem < 15){
            jumlahItem = 15 - jumlahItem;
            denda = (15*0.01)*(jumlahItem*50000);
            totalGaji = 500000 - denda;
        }else{
            bonus = (10*0.01)*(jumlahItem*50000);
            totalGaji = 500000 + bonus;
        }
        
        // Mencetak total gaji Agent, (int) digunakan untuk casting yang mengubah tipe data totalGaji ke tipe int
        System.out.println((int)totalGaji);
    }
    
}
