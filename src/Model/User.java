/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Tri Jaka
 */
public class User {
    private String username;
    private String password;
    private String nama;
    private String email;
    private int no_hp;
    
    public User (String username, String password,
                String nama, String email, int no_hp){
        this.username = username;
        this.password = password;
        this.nama = nama;
        this.email = email;
        this.no_hp = no_hp;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setHp(int no_hp){
        this.no_hp = no_hp;
    }
    public String getUser(){
        return username;
    }
    public String getPass(){
        return password;
    }
    public String getNama(){
        return nama;
    }
    public String getEmail(){
        return email;
    }
    public int no_hp(){
        return no_hp;
    }
}
