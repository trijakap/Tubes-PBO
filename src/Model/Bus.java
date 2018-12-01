package Model;
public class Bus extends Transportasi{
    public String nama;
    
    public Bus (String no_pol, double tarif, int kapasitas, String nama){
        this.no_pol = no_pol;
        this.tarif = tarif;
        this.kapasitas = kapasitas;
        this.nama = nama;
        
    }
    
    public Bus (String no_pol){
        this.no_pol = no_pol;
    }
    
    public void setNama(String n){
        nama = n;
    }
    
    public String getNama(){
        return nama;
    }
}
