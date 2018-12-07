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
    
    public void goGoBtnActionPerformed(){
        ArrayList<Rute> rute = db.getRute();
        ArrayList<Angkot> angkot = db.getAngkot();
        ArrayList<Bus> bus = db.getBus();
        boolean found = false;
        boolean found1 = false;
        String info = "";
        Angkot a;
        Bus b;
        if (view.getcBoxTransport() == "Angkot"){
            info = "Angkot yang sesuai dengan lokasi:" + '\n';
            for (Angkot ang : angkot){
                found1 = false;
                for (Rute r : rute){
                    if (ang.getNopol().equals(r.getNoPolisi())){
                        if (r.getLokasi().equals(view.getcBoxLokasiAsal())){
                            for (Rute s : rute){
                                if (!found1){
                                    if (s.getLokasi().equals(view.getcBoxLokasiTujuan()) && r.getNoPolisi().equals(s.getNoPolisi())){
                                        info += "Kode Angkot: "+ang.getKode()+" , Tarif: "+ang.getTarif()+'\n';
                                        found = true;
                                        found1 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if (view.getcBoxTransport() == "Bus"){
            info = "Bus yang sesuai dengan lokasi:" + '\n';
            for (Bus bu : bus){
                found1 = false;
                for (Rute r : rute){
                    if (bu.getNopol().equals(r.getNoPolisi())){
                        if (r.getLokasi().equals(view.getcBoxLokasiAsal())){
                            for (Rute s : rute){
                                if (!found1){
                                    if (s.getLokasi().equals(view.getcBoxLokasiTujuan()) && r.getNoPolisi().equals(s.getNoPolisi())){
                                        info += "Nama Bus: "+bu.getNama()+" , Tarif: "+bu.getTarif()+'\n';
                                        found = true;
                                        found1 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!found){
            info += "Tidak ditemukan";
        }
        view.setjTextArea1(info);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getCBoxInfoLokasiID())){
            btnSetLokasiActionPerformer();
        } else if (source.equals(view.getBtnInfoLokasi())){
            btnInfoLokActionPerformer();
        } else if (source.equals(view.getGoGoBtn())){
            goGoBtnActionPerformed();
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
