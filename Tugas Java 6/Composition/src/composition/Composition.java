package composition;

/**
 *
 * @author novia
 */
public class Composition {

    public static void main(String[] args) {
        System.out.println("SPESIFIKASI BAN SEPEDA");
        System.out.println("======================");
        Ban ban = new Ban("Continental", "Clincher", "700 x 25");
        Sepeda sepeda = new Sepeda("Aero Road Bike", 2020, ban);
        System.out.println(sepeda);
    
        Ban ban2 = new Ban("Vittoria", "Tubular", "700 x 25");
        Sepeda sepeda2 = new Sepeda("ZX-25R", 2020, ban2);
        System.out.println(ban2);
    }
    
}


    

