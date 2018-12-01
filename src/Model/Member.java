package Model;

import java.util.List;

public class Member extends User{
    public String alamat;
    
    public Member(String username, String password, String nama, String email, String no_hp) {
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
    }

    public Member(String username){
        this.username = username;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
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
   
}
