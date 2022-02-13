package Strings;
import java.util.Scanner;


/**
 * version 1.0
 * author novia
 * since 12/02/2022
 */
public class Main {
    
    

    public static void main(String[] args) {
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        // deklarasi variabel
        String a, b, output;
        int jumlahStr;
        
        // user menginputkan string
        a = scan.next();
        b = scan.next();
        
        jumlahStr = a.length() + b.length();
        System.out.println(jumlahStr);
        
        if(a.compareTo(b) > 0){
            System.out.println("Yes");
        }else if(b.compareTo(a) > 0){
            System.out.println("No");
        }else{
            System.out.println("Are Equals");
        }
        
        output = a.substring(0,1).toUpperCase() + a.substring(1) + " " + b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(output);
    }
    
}
