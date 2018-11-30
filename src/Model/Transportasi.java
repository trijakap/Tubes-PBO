package Model;
public abstract class Transportasi {
    public String no_pol;
    public double tarif;
    public int kapasitas;
        
    public void setNopol(String no){
        no_pol = no;
    }

    public String getNopol(){
        return no_pol;
    }
        
    public void setTarif(double t){
        tarif = t;
    }

    public double getTarif(){
        return tarif;
    }
        
    public void setKapasitas(int k){
        kapasitas = k;
    }

    public int getKapasitas(){
        return kapasitas;
    }    
}
