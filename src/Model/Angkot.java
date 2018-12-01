package Model;
public class Angkot extends Transportasi {

    public int kode;

    public Angkot(String no_pol, double tarif, int kapasitas, int kode){
        this.no_pol = no_pol;
        this.tarif = tarif;
        this.kapasitas = kapasitas;
        this.kode = kode;
    }
    
    public Angkot(String no_pol){
        this.no_pol = no_pol;
    }
    
    public void setKode(int k){
        kode = k;
    }
    
    public int getKode(){
        return kode;
    }
    
}
