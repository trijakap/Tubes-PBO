package tubes;

import java.util.List;

public class Admin extends User {
    
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
    
    public boolean createAdmin (List<Admin> admin){
        boolean check = false;
        Admin a = new Admin();
        
        for(Admin b : admin){
            if(a.username.equals(super.username))
                check = true;
        }
        if (!check){
            return true;
        }
        return false;
    }
    
    public boolean logIn(List<Admin> admin){
        for(Admin a : admin){
            if(a.username.equals(super.username))
                if(a.password.equals(super.password)){
                    return true;
                }
        }
        return false;
    }
}
