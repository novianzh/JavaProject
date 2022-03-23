package aggregation;

/**
 *
 * @author novia
 */
public class Aggregation {

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Novia", "211524053");
        Loker loker = new Loker("A01", "Biru", "Lorong Timur");
        
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("Vina");
        mhs2.setNim("211524099");
        Loker loker2 = new Loker();        
        loker2.setNomor("D03");
        loker2.setWarna("Hijau");
        loker2.setLorong("Lorong Barat");

        Mahasiswa mhs3 = new Mahasiswa("Raina", "211524088");
        Loker loker3 = new Loker("F05", "Kuning", "Lorong Utara");
        
        System.out.println("===========================================================");
        System.out.println("Nama     : " + mhs.getNama() + ", " + mhs2.getNama() + ", " + mhs3.getNama());
        System.out.println("NIM      : " + mhs.getNim() + ", " + mhs2.getNim() + ", " + mhs3.getNim());
        System.out.println("No.Loker : " + loker.getNomor() + ", " + loker2.getNomor() + ", " + loker3.getNomor());
        System.out.println("Warna    : " + loker.getWarna() + ", " + loker2.getWarna() + ", " + loker3.getWarna());
        System.out.println("Lokasi   : " + loker.getLorong() + ", " + loker2.getLorong() + ", " + loker3.getLorong());
        System.out.println("===========================================================");
    }
    
}


