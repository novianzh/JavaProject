package aggregation;

/**
 *
 * @author novia
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    
    // constructor
    Mahasiswa(){
        this.nama = " ";
        this.nim = " ";
    }
    
    Mahasiswa(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    // method
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}

