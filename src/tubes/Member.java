package tubes;

import java.util.List;

public class Member extends User{
    Lokasi[] lok = new Lokasi[10];
    Transportasi[] trans = new Transportasi[10];
    public String alamat;
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public Lokasi getLokasi(int idx){
        return lok[idx];
    }
    
    public Transportasi getTransportasi(int idx){
        return trans[idx];
    }
    
    public boolean logIn(List<Member> member){
        for(Member a : member){
            if(a.username.equals(super.username))
                if(a.password.equals(super.password)){
                    return true;
                }
        }
        return false;
    }
    
    public boolean createMember(List<Member> member){
        boolean check = false;
        Member a = new Member();
        
        for(Member b : member){
            if(a.username.equals(super.username))
                check = true;
        }
        if (!check){
            return true;
        }
        return false;
    }
}
