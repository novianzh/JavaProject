package tugas.kasus2;

/**
 * version 1.0
 * author novia
 * since 26/02/2022
 */
public class Item {

    private String name;
    private Item() {
        this.name = "Ipin"; //menambahkan var.this karena mengacu kepada variable yang dimiliki class Item
    }
    public Item(String name) {
     this.name = "Ipin"; //var. this.name diisi oleh string Ipin
     System.out.println(this.name);//menampilkan var. this.name
}
}
