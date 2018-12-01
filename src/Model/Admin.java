package Model;

import java.util.List;

public class Admin extends User {

    public Admin(String username, String password, String nama, String email, String no_hp) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
    }
    
    public Admin(String username){
        this.username = username;
    }
    
    public void addLokasi(Lokasi l, List list){
        list.add(l);
    }
    
    public void addTransportasi(Transportasi t, List list){
        list.add(t);
    }
    
    public void delLokasi(Lokasi l, List list){
        list.remove(l);
    }
    
    public void delTransportasi(Transportasi t, List list){
        list.remove(t);
    }
    
    
}
