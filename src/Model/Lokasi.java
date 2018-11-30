package Model;
public abstract class Lokasi {
    public String nama, alamat, id, deskripsi;
    
    public void setNama(String n){
        nama = n;
    }

    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String a){
        alamat = a;
    }

    public String getAlamat(){
        return alamat;
    }
        
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
        
    public void setDeskripsi(String d){
        deskripsi = d;
    }

    public String getDeskripsi(){
        return deskripsi;
    }           
}
