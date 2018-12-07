package Controller;

import Model.*;
import View.InfoLokasi;
import View.MemberFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MemberController extends MouseAdapter implements ActionListener{
    private MemberFrame view;
    private Database db;
    
    public MemberController(Database db){
        this.db = db;
        view = new MemberFrame();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        loadTabelLokasi("Bandung Kota");
        this.cBoxLokasiTujuanActionPerformed();
    }
    
    public void loadTabelLokasi(String lokasi){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama Tempat","Jenis Objek"},0);
        ArrayList<Wisata> wisata = db.getWisata();
        ArrayList<NonWisata> nonWisata = db.getNonWisata();
        for (NonWisata w : nonWisata){
            if(w.alamat.equals(lokasi)){
                model.addRow(new Object[]{w.getNama(),"NonWisata"});   
            }
        }
        for (Wisata w : wisata){
            if(w.alamat.equals(lokasi)){
                model.addRow(new Object[]{w.getNama(),"Wisata"});   
            }
        }
        view.setTbLokasi(model);
    }
    
    public void btnSetLokasiActionPerformer(){
        loadTabelLokasi(view.getcBoxInfoLokasi());
    }
    
    public void btnInfoLokActionPerformer(){        
        InfoLokasi viewInfoLokasi = new InfoLokasi(jenis,wis,nowis);
        viewInfoLokasi.setVisible(true);
        viewInfoLokasi.setLocationRelativeTo(null);
    }
    
    public void cBoxLokasiTujuanActionPerformed(){
        view.delCBoxWisata();
        ArrayList<Wisata> wisata = db.getWisata();
        ArrayList<NonWisata> nonWisata = db.getNonWisata();
        for (NonWisata w : nonWisata){
            if (w.alamat.equals(view.getcBoxLokasiTujuan())){
                view.setcBoxWisata(w.nama);
            }
        }
        for (Wisata w : wisata){
            if (w.alamat.equals(view.getcBoxLokasiTujuan())){
                view.setcBoxWisata(w.nama);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getCBoxInfoLokasiID())){
            btnSetLokasiActionPerformer();
        } else if (source.equals(view.getBtnInfoLokasi())){
            btnInfoLokActionPerformer();
        } else if (source.equals(view.getGoGoBtn())){
            
        } else if (source.equals(view.getcBoxLokasiTujuanID())){
            cBoxLokasiTujuanActionPerformed();
        } else if (source.equals(view.getBtnLogOut())){
            view.dispose();
            new MainController();
        }
    }
    
    private Wisata wis;
    private NonWisata nowis;
    private String jenis;
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        if(source.equals(view.getTbLokasi())){
            int i = view.getSelectedLokasi();         
            jenis = view.getTbLokasi().getModel().getValueAt(i, 2).toString();
            if (jenis == "Wisata"){
            ArrayList<Wisata> wisata = db.getWisata();
            for (Wisata w : wisata){
                if(w.getId().equals(view.getTbLokasi().getModel().getValueAt(i, 1).toString())){
                    wis = w;
                }
            }
            } else {
                ArrayList<NonWisata> nonWisata = db.getNonWisata();
                for (NonWisata w : nonWisata){
                    if(w.getId().equals(view.getTbLokasi().getModel().getValueAt(i, 1).toString())){
                        nowis = w;
                    }
                }
            }
        }
    }
    
}
