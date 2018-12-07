/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tri Jaka
 */
public class Database {
    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    private ArrayList<Admin> admin = new ArrayList<>();
    private ArrayList<Member> member = new ArrayList<>();
    private ArrayList<Wisata> wisata = new ArrayList<>();
    private ArrayList<NonWisata> nonWisata = new ArrayList<>();
    private ArrayList<Bus> bus = new ArrayList<>();
    private ArrayList<Angkot> angkot = new ArrayList<>();
    private ArrayList<Rute> rute = new ArrayList<>();
    
    private int kodeAngkot = 1;
    
    public Database() {
        loadAdmin();
        loadMember();
        loadWisata();
        loadNonWisata();
        loadAngkot();
        loadBus();
        loadRute();
    }
    
    public int getKodeAngkot(){
        return kodeAngkot;
    }
    
    public void connect(){
        try {
            String url = "jdbc:mysql://localhost/btg";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect(){
        try {
            conn.close();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean manipulate(String query){
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) cek = true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }
    
    public void loadAdmin() {
        connect();
        try {
            String query = "SELECT * FROM admin";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                admin.add(new Admin(rs.getString("username"), rs.getString("password"), rs.getString("nama"), rs.getString("email"), rs.getString("no_hp")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadMember() {
        connect();
        try {
            String query = "SELECT * FROM member";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                member.add(new Member(rs.getString("username"), rs.getString("password"), rs.getString("nama"), rs.getString("email"), rs.getString("no_hp")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadWisata() {
        connect();
        try {
            String query = "SELECT * FROM wisata";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                wisata.add(new Wisata(rs.getString("id"), rs.getString("nama"), rs.getString("alamat"), rs.getString("deskripsi"), rs.getDouble("harga_tiket")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadNonWisata() {
        connect();
        try {
            String query = "SELECT * FROM `non-wisata`";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                nonWisata.add(new NonWisata(rs.getString("id"), rs.getString("nama"), rs.getString("alamat"), rs.getString("deskripsi")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadAngkot() {
        connect();
        try {
            String query = "SELECT * FROM angkot";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                angkot.add(new Angkot(rs.getString("no_pol"), rs.getDouble("tarif"), rs.getInt("kapasitas"), rs.getInt("kode")));
                kodeAngkot++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadBus() {
        connect();
        try {
            String query = "SELECT * FROM bus";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                bus.add(new Bus(rs.getString("no_pol"), rs.getDouble("tarif"), rs.getInt("kapasitas"), rs.getString("nama")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
    public void loadRute(){
        connect();
        try {
            String query = "SELECT * FROM rute";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                rute.add(new Rute(rs.getString("noPolisi"),rs.getString("lokasi")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public ArrayList<Member> getMember() {
        return member;
    }

    public ArrayList<Wisata> getWisata() {
        return wisata;
    }

    public ArrayList<NonWisata> getNonWisata() {
        return nonWisata;
    }

    public ArrayList<Bus> getBus() {
        return bus;
    }

    public ArrayList<Angkot> getAngkot() {
        return angkot;
    }

    public ArrayList<Rute> getRute() {
        return rute;
    }
    
    
    
    public void addAdmin(Admin m) {
        connect();
        String query = "INSERT INTO admin VALUES (";
        query += "'" + m.getUser() + "',";
        query += "'" + m.getPass() + "',";
        query += "'" + m.getName() + "',";
        query += "'" + m.getEmail() + "',";
        query += "'" + m.getHp()+ "'";
        query += ")";
        if (manipulate(query)) admin.add(m);
        disconnect();
    }
    
    public void addMember(Member m) {
        connect();
        String query = "INSERT INTO member VALUES (";
        query += "'" + m.getUser() + "',";
        query += "'" + m.getPass() + "',";
        query += "'" + m.getName() + "',";
        query += "'" + m.getEmail() + "',";
        query += "'" + m.getHp()+ "'";
        query += ")";
        if (manipulate(query)) member.add(m);
        disconnect();
    }
    public void addWisata(Wisata m) {
        connect();
        String query = "INSERT INTO wisata VALUES (";
        query += "'" + m.getId() + "',";
        query += "'" + m.getNama() + "',";
        query += "'" + m.getAlamat() + "',";
        query += "'" + m.getDeskripsi() + "',";
        query += "'" + m.getHarga()+ "'";
        query += ")";
        if (manipulate(query)) wisata.add(m);
        disconnect();
    }
    
    public void addNonWisata(NonWisata m) {
        connect();
        String query = "INSERT INTO `non-wisata` VALUES (";
        query += "'" + m.getId() + "',";
        query += "'" + m.getNama() + "',";
        query += "'" + m.getAlamat() + "',";
        query += "'" + m.getDeskripsi() + "'";
        query += ")";
        if (manipulate(query)) nonWisata.add(m);
        disconnect();
    }
    
    public void addAngkot(Angkot m) {
        connect();
        String query = "INSERT INTO angkot VALUES (";
        query += "'" + m.getNopol() + "',";
        query += "'" + m.getTarif() + "',";
        query += "'" + m.getKapasitas() + "',";
        query += "'" + m.getKode() + "'";
        query += ")";
        if (manipulate(query)) {
            angkot.add(m);
            kodeAngkot++;
        }
        disconnect();
    }
    
    public void addBus(Bus m) {
        connect();
        String query = "INSERT INTO bus VALUES (";
        query += "'" + m.getNopol() + "',";
        query += "'" + m.getTarif() + "',";
        query += "'" + m.getKapasitas() + "',";
        query += "'" + m.getNama() + "'";
        query += ")";
        if (manipulate(query)) bus.add(m);
        disconnect();
    }
    
    public void addRute(String noPol, String lokasi){
        connect();
        String query = "INSERT INTO rute VALUES (";
        query += "'" + noPol + "',";
        query += "'" + lokasi + "'";
        query += ")";
        if (manipulate(query)) rute.add(new Rute(noPol,lokasi));
        disconnect();
    }
    
    public boolean cekDuplikatUsernameAdmin(String username){
        boolean cek = false;
        for (Admin a : admin) {
            if (a.getUser().equals(username)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekUserPassAdmin(String username, String pass){
        boolean cek = false;
        for (Admin a : admin){
            if(a.getUser().equals(username)){
                if(a.getPass().equals(pass)){
                    cek = true;
                    break;
                }
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatUsernameMember (String username){
        boolean cek = false;
        for (Member a : member) {
            if (a.getUser().equals(username)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekUserPassMember(String username, String pass){
        boolean cek = false;
        for (Member a : member){
            if(a.getUser().equals(username)){
                if(a.getPass().equals(pass)){
                    cek = true;
                    break;
                }
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatIdWisata(String id){
        boolean cek = false;
        for (Wisata a : wisata) {
            if (a.getId().equals(id)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatIdNonWisata(String id){
        boolean cek = false;
        for (NonWisata a : nonWisata) {
            if (a.getId().equals(id)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatNopolBus (String no_pol){
        boolean cek = false;
        for (Bus a : bus) {
            if (a.getNopol().equals(no_pol)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public boolean cekDuplikatNopolAngkot (String no_pol){
        boolean cek = false;
        for (Angkot a : angkot) {
            if (a.getNopol().equals(no_pol)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public void delAdmin(String username) {
        connect();
        String query = "DELETE FROM admin WHERE username='" + username + "'";
        if (manipulate(query)){
            for (Admin m : admin) {
                if (m.getUser().equals(username)){
                    admin.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delMember(String username) {
        connect();
        String query = "DELETE FROM member WHERE username='" + username + "'";
        if (manipulate(query)){
            for (Member m : member) {
                if (m.getUser().equals(username)){
                    member.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delWisata(String id) {
        connect();
        String query = "DELETE FROM wisata WHERE id='" + id + "'";
        if (manipulate(query)){
            for (Wisata m : wisata) {
                if (m.getId().equals(id)){
                    wisata.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delNonWisata(String id) {
        connect();
        String query = "DELETE FROM `non-wisata` WHERE id='" + id + "'";
        if (manipulate(query)){
            for (NonWisata m : nonWisata) {
                if (m.getId().equals(id)){
                    nonWisata.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delAngkot(String no_pol) {
        connect();
        String query = "DELETE FROM angkot WHERE no_pol='" + no_pol + "'";
        if (manipulate(query)){
            for (Angkot m : angkot) {
                if (m.getNopol().equals(no_pol)){
                    angkot.remove(m);
                    kodeAngkot--;
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delBus(String no_pol) {
        connect();
        String query = "DELETE FROM bus WHERE no_pol='" + no_pol + "'";
        if (manipulate(query)){
            for (Bus m : bus) {
                if (m.getNopol().equals(no_pol)){
                    bus.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void delRute(String noPol){
        connect();
        String query = "DELETE FROM rute WHERE noPolisi='" + noPol + "'";
        if (manipulate(query)){
            for (Rute m : rute) {
                if (m.getNoPolisi().equals(noPol)){
                    rute.remove(m);
                    break;
                }
            }
        }
        disconnect();
    }
    
}
