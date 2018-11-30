package Model;

import java.util.*;

public abstract class User {
    public String username, password, nama, email, no_hp;
    
/*    public User(String u, String p, String n, String e, int h){
        username = u;
        password = p;
        nama = n;
        email = e;
        no_hp = h;
    }
*/    
    public void setUser(String u){
        username = u;
    }
    
    public String getUser(){
        return username;
    }
    
    public void setPass(String p){
        password = p;
    }
    
    public String getPass(){
        return password;
    }
    
    public void setName(String n){
        nama = n;
    }
    
    public String getName(){
        return nama;
    }
        
    public void setEmail(String e){
        email = e;
    }
    
    public String getEmail(){
        return email;
    }
        
    public void setHp(String h){
        no_hp = h;
    }
    
    public String getHp(){
        return no_hp;
    }
}
