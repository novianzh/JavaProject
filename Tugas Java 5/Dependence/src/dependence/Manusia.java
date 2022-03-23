package dependence;

/**
 *
 * @author novia
 */
public class Manusia {
    private String nama;
    
    Manusia(String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void display(Handphone l){
        System.out.println("Handphone " + getNama());
        System.out.println("Merk  : " + l.getMerk());
        System.out.println("Warna : " + l.getWarna());
        System.out.println("Harga : " + l.getHarga());
        System.out.println();
    }
    
    public void jualHandphone(Handphone l){
        l.jualHandphone();
        System.out.println("oleh " + getNama());
    }
}

