package dependence;

/**
 *
 * @author novia
 */
public class Dependence {

    public static void main(String[] args) {
       Manusia manusia = new Manusia("Raka");
       Handphone handphone = new Handphone("Vivo", 2750000, "Hitam");
       manusia.display(handphone);
        

        Manusia manusia2 = new Manusia("Ghessa");
        Handphone handphone2 = new Handphone("Apple", 5500000, "Hitam");
        manusia2.display(handphone2);
        manusia2.jualHandphone(handphone2);
        System.out.println();
    }
    
}
