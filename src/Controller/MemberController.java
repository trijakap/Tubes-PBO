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
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        loadTabelLokasi("Bandung Kota");
    }
    
    public void loadTabelLokasi(String lokasi){
        DefaultTableModel model = new DefaultTableModel(new String[]{"Nama Tempat","id","Jenis Objek"},0);
        ArrayList<Wisata> wisata = db.getWisata();
        ArrayList<NonWisata> nonWisata = db.getNonWisata();
        for (NonWisata w : nonWisata){
            if(w.alamat.equals(lokasi)){
                model.addRow(new Object[]{w.getNama(),w.getId(),"NonWisata"});   
            }
        }
        for (Wisata w : wisata){
            if(w.alamat.equals(lokasi)){
                model.addRow(new Object[]{w.getNama(),w.getId(),"Wisata"});   
            }
        }
        view.setTbLokasi(model);
    }
    
    public void btnSetLokasiActionPerformer(){
        loadTabelLokasi(view.getcBoxInfoLokasi());
    }
    
    public void btnInfoLokActionPerformer(){
        InfoLokasi viewInfoLokasi = new InfoLokasi();
        viewInfoLokasi.setVisible(true);
        viewInfoLokasi.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnSetLokasi())){
            btnSetLokasiActionPerformer();
        } else if (source.equals(view.getBtnInfoLokasi())){
            btnInfoLokActionPerformer();
            System.out.println("wakwaw");
        } else if (source.equals(view.getGoGoBtn())){
            
        }
    }
    
    Wisata wis;
    NonWisata nowis;
    
    @Override
    public void mousePressed(MouseEvent me){
        Object source = me.getSource();
        String jenis;
        if(source.equals(view.getTbLokasi())){
            int i = view.getSelectedLokasi();
            wis = new Wisata(view.getTbLokasi().getModel().getValueAt(i, 1).toString());         
            jenis = view.getTbLokasi().getModel().getValueAt(i, 1).toString();
            if (jenis == "NonWisata"){
                nowis = new NonWisata(wis.getId());
            }
        }
    }
    
}
