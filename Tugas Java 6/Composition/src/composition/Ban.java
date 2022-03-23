package composition;

/**
 *
 * @author novia
 */
public class Ban {
    private String merk;
    private String jenis;
    private String ukuran;
    
    Ban(String merk, String jenis, String ukuran){
        this.merk = merk;
        this.jenis = jenis;
        this.ukuran = ukuran;
    }
    
    Ban(){
        this.merk = " ";
        this.jenis = " ";
        this.ukuran = " ";
    }
    
    public String toString(){
        return String.format("Merk Ban     : %s\nJenis Ban    : %s\nUkuran Ban   : %s", this.merk, this.jenis, this.ukuran);
    }
}

