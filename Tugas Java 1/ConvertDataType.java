package Operators1;

/**
 * version 1.0
 * author novia
 * since 12/02/2022
 */
public class ConvertDataType {

    
   static short methodOne(long l){
        int i = (int) l;
        return (short)i;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
    
}
