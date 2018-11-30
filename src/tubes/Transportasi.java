package tubes;
public abstract class Transportasi {
    public String id, no_pol;
    public double tarif;
    public int kapasitas;
    
    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

        
    public void setTarif(double t){
        tarif = t;
    }

    public double getTarif(){
        return tarif;
    }

    public String getNo_pol() {
        return no_pol;
    }

    public void setNo_pol(String no_pol) {
        this.no_pol = no_pol;
    }
        
    public void setKapasitas(int k){
        kapasitas = k;
    }

    public int getKapasitas(){
        return kapasitas;
    }    
}
