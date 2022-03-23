package composition;

/**
 *
 * @author novia
 */
public class Sepeda {
    private String nama;
    private int tahun;
    private Ban ban;
    
    // constructor
    Sepeda(String nama, int tahun, Ban ban){
        this.nama = nama;
        this.tahun = tahun;
        this.ban = ban;
    }
    
    Sepeda(){
        this.nama = " ";
        this.tahun = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String toString(){
        return String.format("Nama Sepeda  : %s\nTahun        : %d\n%s\n", this.nama, this.tahun, this.ban);
    }
}
