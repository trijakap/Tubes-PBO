/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.AdminFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tri Jaka
 */
public class AdminController extends MouseAdapter implements ActionListener {
    private Database db;
    private AdminFrame view;
    
    public AdminController(Database db){
        this.db = db;
        view = new AdminFrame();
        view.addActionListener(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        loadTabelWisata();
        loadTabelNonWisata();
        loadTabelAngkot();
        loadTabelBus();
        loadTabelAdmin();
        loadTabelMember();
    }

    private void btnSubmitActionPerformed() {
        String namaTempat = view.getNamaTempatField();
        String id = view.getIdField();
        String lokasi = view.getPilihLokBox();
        String deskripsi = view.getDescPane();
        if (view.getLokasi() == "wisata"){
            int tarif = Integer.parseInt(view.getTarifLok());
            if (db.cekDuplikatIdWisata(id)){
                view.showMessage("ID sudah terpakai", "Error", 0);
            } else {
                db.addWisata(new Wisata(id, namaTempat, lokasi, deskripsi, tarif));
                view.showMessage("Wisata sudah ditambah", "Success", 1);
                loadTabelWisata();
            }
        } else if (view.getLokasi() == "nonWisata"){
            if (db.cekDuplikatIdNonWisata(id)){
                view.showMessage("ID sudah terpakai", "Error", 0);
            } else {
                db.addNonWisata(new NonWisata(id, namaTempat, lokasi, deskripsi));
                view.showMessage("Non-Wisata sudah ditambah", "Success", 1);
                loadTabelNonWisata();
            }
        }
    }
    
    public void btnSumbitTransActionPerformed(){
        String namaTrans = view.getFieldNamaTrans();
        int kapasitas = view.getFieldKapasitas();
        int tarif = view.getFieldTarifTrans();
        String noPol = view.getFieldNoPol();
        int kodeAngkot = db.getKodeAngkot();
        if(view.getJenisTrans() == "angkot"){
            if (db.cekDuplikatNopolAngkot(noPol)){
                view.showMessage("No. Polisi sudah terpakai", "Error", 0);
            } else {
                db.addAngkot(new Angkot(noPol,tarif,kapasitas,kodeAngkot));
                view.showMessage("Angkot sudah ditambah", "Success", 1);
                loadTabelAngkot();
            }
        } else {
            if (db.cekDuplikatNopolBus(noPol)){
                view.showMessage("No. Polisi sudah terpakai", "Error", 0);
            } else {
                db.addBus(new Bus(noPol,tarif,kapasitas,namaTrans));
                view.showMessage("Bus sudah ditambah", "Success", 1);
                loadTabelBus();
            }
        }
    }
    
    public void btnTambahAdminActionPerformed(){
        String uName = view.getFieldUnameAdmin();
        String pass = view.getFieldPassAdmin();
        String nama = view.getFieldNamaAdmin();
        String email = view.getFieldEmailAdmin();
        String noHP = view.getFieldNoHPAdmin();
        if (db.cekDuplikatUsernameAdmin(uName)){
            view.showMessage("Username sudah terpakai", "Error", 0);
        } else {
            db.addAdmin(new Admin(uName,pass,nama,email,noHP));
            view.showMessage("Admin sudah ditambah", "Success", 1);
            loadTabelAdmin();
        }
    }
    
    public void loadTabelWisata(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Id","Nama","Lokasi","Harga"},0);
        ArrayList<Wisata> wisata = db.getWisata();
        for (Wisata w : wisata){
            model.addRow(new Object[]{w.getId(),w.getNama(),w.getAlamat(),w.getHarga()});
        }
        view.setTbWisata(model);
    }
    
    public void loadTabelNonWisata(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Id","Nama","Lokasi"},0);
        ArrayList<NonWisata> nonWisata = db.getNonWisata();
        for (NonWisata w : nonWisata){
            model.addRow(new Object[]{w.getId(),w.getNama(),w.getAlamat()});
        }
        view.setTbNonWisata(model);
    }
    
    public void loadTabelAngkot(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"No. Polisi","Tarif","Kapasitas","Kode"},0);
        ArrayList<Angkot> angkot = db.getAngkot();
        for (Angkot a : angkot){
            model.addRow(new Object[]{a.getNopol(),a.getTarif(),a.getKapasitas(),a.getKode()});
        }
        view.setTbAngkot(model);
    }
    
    public void loadTabelBus(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"No. Polisi","Tarif","Kapasitas","Nama Bus"},0);
        ArrayList<Bus> bus = db.getBus();
        for (Bus a : bus){
            model.addRow(new Object[]{a.getNopol(),a.getTarif(),a.getKapasitas(),a.getNama()});
        }
        view.setTbBus(model);
    }
    
    public void loadTabelAdmin(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"username","password","nama","email","No. HP"},0);
        ArrayList<Admin> admin = db.getAdmin();
        for (Admin a : admin){
            model.addRow(new Object[]{a.getUser(),a.getPass(),a.getName(),a.getEmail(),a.getHp()});
        }
        view.setTbAdmin(model);
    }
    
    public void loadTabelMember(){
        DefaultTableModel model = new DefaultTableModel(new String[]{"username","password","nama","email","No. HP"},0);
        ArrayList<Member> member = db.getMember();
        for (Member a : member){
            model.addRow(new Object[]{a.getUser(),a.getPass(),a.getName(),a.getEmail(),a.getHp()});
        }
        view.setTbUser(model);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(view.getBtnSubmit())){
            btnSubmitActionPerformed();
        } else if (source.equals(view.getHapusLokBtn())){
        } else if (source.equals(view.getBtnSubmitTrans())){
            btnSumbitTransActionPerformed();
        } else if (source.equals(view.getTambahAdminBtn())){
            btnTambahAdminActionPerformed();
        }
    }
}
