package dependence;

/**
 *
 * @author novia
 */
public class Handphone {
    private String merk;
    private int harga;
    private String warna;

    
    Handphone(String merk, int harga, String warna){
        this.merk = merk;
        this.harga = harga;
        this.warna = warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void jualHandphone(){
        System.out.print("Handphone dijual ");
    }
    
}

