package Model;
public class Wisata extends Lokasi{


    public double harga_tiket;
    
    public Wisata (String id, String nama, String alamat, String deskripsi, double harga_tiket){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.harga_tiket = harga_tiket;
    }
    
    public Wisata (String id){
        this.id = id;
    }
    public void setHarga(double h){
        harga_tiket = h;
    }
    
    public double getHarga(){
        return harga_tiket;
    }
}
