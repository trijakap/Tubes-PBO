/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import View.AdminFrame;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tri Jaka
 */
public class AdminController extends MouseAdapter implements ActionListener {
    private Database db;
    private AdminFrame view;
    private DefaultTableModel modelTbRute = new DefaultTableModel(new String[]{"Nama Lokasi"},0);
    
    
    public AdminController(Database db){
        this.db = db;
        view = new AdminFrame();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        loadTabelWisata();
        loadTabelNonWisata();
        loadTabelAngkot();
        loadTabelBus();
        loadTabelAdmin();
        loadTabelMember();
        view.setLabelKode(Integer.toString(db.getKodeAngkot()));
        view.setTbRute(modelTbRute);
    }

    private void btnSubmitActionPerformed() {
        String namaTempat = view.getNamaTempatField();
        String id = view.getIdField();
        String lokasi = view.getPilihLokBox();
        String deskripsi = view.getDescPane();
        if (view.getLokasi() == "wisata"){
            try 
            {
                int tarif = Integer.parseInt(view.getTarifLok());
                if (db.cekDuplikatIdWisata(id)){
                    view.showMessage("ID sudah terpakai", "Error", 0);
                } else {
                    db.addWisata(new Wisata(id, namaTempat, lokasi, deskripsi, tarif));
                    view.showMessage("Wisata sudah ditambah", "Success", 1);
                    view.resetLokasi();
                    loadTabelWisata();
                } 
            }
            catch (NumberFormatException e)
            {
                view.showMessage("Tarif harus berupa angka", "Error", 0);
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
        try{
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
                    for (int i = 0; i < view.getRowTbRute(); i++){
                        db.addRute(noPol, view.getIsiTbRute(i));
                    }
                    view.showMessage("Angkot sudah ditambah", "Success", 1);
                    loadTabelAngkot();
                    

                }
            } else {
                if (db.cekDuplikatNopolBus(noPol)){
                    view.showMessage("No. Polisi sudah terpakai", "Error", 0);
                } else {
                    db.addBus(new Bus(noPol,tarif,kapasitas,namaTrans));
                    for (int i = 0; i < view.getRowTbRute(); i++){
                        db.addRute(noPol, view.getIsiTbRute(i));
                    }
                    view.showMessage("Bus sudah ditambah", "Success", 1);
                    loadTabelBus();
                }
            }
            view.setLabelKode(Integer.toString(db.getKodeAngkot()));
            
            
        } catch (NumberFormatException e){
            view.showMessage("Tarif & Kapasitas harus berupa angka", "Error", 0);
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
    
    public void btnHapusAdminActionPerformed(){
        if (adm.getUser().equals("admin")){
            view.showMessage("Admin tidak boleh dihapus", "Error", 0);
        } else {
            db.delAdmin(adm.getUser());
            loadTabelAdmin();
            view.showMessage("Data Berhasil Dihapus", "Success", 1);
        }
    }
    
    public void btnHapusUserActionPerformed(){
        db.delMember(mem.getUser());
        loadTabelMember();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    public void btnHapusWisataActionPerformed(){
        db.delWisata(wis.getId());
        loadTabelWisata();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    
    public void btnHapusNonWisataActionPerformed(){
        db.delNonWisata(nowis.getId());
        loadTabelNonWisata();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    
    public void btnHapusAngkotActionPerformed(){
        db.delAngkot(ang.getNopol());
        db.delRute(ang.getNopol());
        loadTabelAngkot();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
        view.setLabelKode(Integer.toString(db.getKodeAngkot()));
    }
    
    public void btnHapusBusActionPerformed(){
        db.delBus(bu.getNopol());
        db.delRute(bu.getNopol());
        loadTabelBus();
        view.showMessage("Data Berhasil Dihapus", "Success", 1);
    }
    
    public void btnTambahRuteActionPerformed(){
        boolean check = true;
        for (int i = 0; i < view.getRowTbRute(); i++){
            if (view.getcBoxLokasi() == view.getIsiTbRute(i)){
                check = false;
            }
        }
        if (check){
            modelTbRute.addRow(new Object[]{view.getcBoxLokasi()});
        }
    }
    
    public void btnHapusRuteActionPerformed(){
        view.hapusRowTbRute(a);
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
        } else if (source.equals(view.getBtnSubmitTrans())){
            btnSumbitTransActionPerformed();
        } else if (source.equals(view.getTambahAdminBtn())){
            btnTambahAdminActionPerformed();
        } else if (source.equals(view.getBtnHapusAdmin())){
            btnHapusAdminActionPerformed();
        } else if (source.equals(view.getBtnHapusUser())){
            btnHapusUserActionPerformed();
        } else if (source.equals(view.getBtnHapusWisata())){
            btnHapusWisataActionPerformed();
        } else if (source.equals(view.getBtnHapusNonWisata())){
            btnHapusNonWisataActionPerformed();
        } else if (source.equals(view.getBtnHapusAngkot())){
            btnHapusAngkotActionPerformed();
        } else if (source.equals(view.getBtnHapusBus())){
            btnHapusBusActionPerformed();
        } else if (source.equals(view.getBtnLogOut())){
            view.dispose();
            new MainController();
        } else if (source.equals(view.getBtnTambahRute())){
            btnTambahRuteActionPerformed();
        } else if (source.equals(view.getBtnHapusRute())){
            btnHapusRuteActionPerformed();
        }
    }
    
    private Admin adm;
    private Member mem;
    private Wisata wis;
    private NonWisata nowis;
    private Angkot ang;
    private Bus bu;
    int a;
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if(source.equals(view.getTbAdmin())){
            int i = view.getSelectedAdmin();
            adm = new Admin( view.getTbAdmin().getModel().getValueAt(i, 0).toString());
        } else if(source.equals(view.getTbUser())){
            int i = view.getSelectedUser();
            mem = new Member (view.getTbUser().getModel().getValueAt(i, 0).toString());
        } else if  (source.equals(view.getTbWisata())){
            int i = view.getSelectedWisata();
            wis = new Wisata(view.getTbWisata().getModel().getValueAt(i, 0).toString());
        } else if (source.equals(view.getTbNonWisata())){
            int i = view.getSelectedNonWisata();
            nowis = new NonWisata(view.getTbNonWisata().getModel().getValueAt(i, 0).toString());
        } else if (source.equals(view.getTbAngkot())){
            int i = view.getSelectedAngkot();
            ang = new Angkot(view.getTbAngkot().getModel().getValueAt(i, 0).toString());
        } else if (source.equals(view.getTbBus())){
            int i = view.getSelectedBus();
            bu = new Bus(view.getTbBus().getModel().getValueAt(i, 0).toString());
        } else if (source.equals(view.getTbRute())){
            a = view.getSelectedRute();
        }
    }
}
