package tubes;
public abstract class Transportasi {
    xdfcf;
    public String id, no_pol;
    public double tarif;
    public int kapasitas;
    
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }
    
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
