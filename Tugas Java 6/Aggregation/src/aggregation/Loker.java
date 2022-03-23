package aggregation;

/**
 *
 * @author novia
 */
public class Loker {
    private String nomor;
    private String warna;
    private String lorong;

    // constructor
    Loker(){
        this.nomor = "";
        this.warna = " ";
        this.lorong = " ";
    }

    Loker(String nomor, String warna, String lorong){
        this.nomor = nomor;
        this.warna = warna;
        this.lorong = lorong;
    }
    
    // method
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String Nomor) {
        this.nomor = Nomor;
    }    
    
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    public String getLorong() {
        return lorong;
    }

    public void setLorong(String lorong) {
        this.lorong = lorong;
    }

    
    
}


