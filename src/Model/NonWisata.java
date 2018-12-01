package Model;
public class NonWisata extends Lokasi{
    public NonWisata (String id, String nama, String alamat, String deskripsi){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
    }
    
    public NonWisata(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    public NonWisata (String id){
        this.id = id;
    }
}
