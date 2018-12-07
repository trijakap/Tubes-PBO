package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class MemberFrame extends javax.swing.JFrame {

    public MemberFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        goBtn = new javax.swing.JButton();
        infoLokBtn = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cBoxLokasiAsal = new javax.swing.JComboBox<>();
        cBoxLokasiTujuan = new javax.swing.JComboBox<>();
        cBoxWisata = new javax.swing.JComboBox<>();
        cBoxTransport = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnGo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLokasi = new javax.swing.JTable();
        cBoxInfoLokasi = new javax.swing.JComboBox<>();
        btnInfoLokasi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        goBtn.setBackground(new java.awt.Color(204, 204, 204));
        goBtn.setText("Pergi ke Tempat Wisata");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        infoLokBtn.setBackground(new java.awt.Color(204, 204, 204));
        infoLokBtn.setText("Info Lokasi");
        infoLokBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoLokBtnActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(204, 204, 204));
        btnLogOut.setText("Log Out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(infoLokBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(goBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLokBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(135, 135, 135)
                    .addComponent(goBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );

        jPanel2.setLayout(new java.awt.CardLayout());

        cBoxLokasiAsal.setBackground(new java.awt.Color(102, 102, 102));
        cBoxLokasiAsal.setForeground(new java.awt.Color(255, 255, 255));
        cBoxLokasiAsal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung Kota", "Bandung Utara", "Bandung Barat", "Bandung Selatan", "", "" }));

        cBoxLokasiTujuan.setBackground(new java.awt.Color(102, 102, 102));
        cBoxLokasiTujuan.setForeground(new java.awt.Color(255, 255, 255));
        cBoxLokasiTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung Kota", "Bandung Utara", "Bandung Barat", "Bandung Selatan" }));

        cBoxWisata.setBackground(new java.awt.Color(102, 102, 102));
        cBoxWisata.setForeground(new java.awt.Color(255, 255, 255));

        cBoxTransport.setBackground(new java.awt.Color(102, 102, 102));
        cBoxTransport.setForeground(new java.awt.Color(255, 255, 255));
        cBoxTransport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Angkot", "Bus" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnGo.setBackground(new java.awt.Color(102, 102, 102));
        btnGo.setForeground(new java.awt.Color(255, 255, 255));
        btnGo.setText("Go");

        jLabel1.setText("Lokasi Asal:");

        jLabel2.setText("Tempat Tujuan:");

        jLabel3.setText("Transportasi:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cBoxLokasiAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cBoxWisata, 0, 156, Short.MAX_VALUE)
                                    .addComponent(cBoxLokasiTujuan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxTransport, 0, 154, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cBoxLokasiAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cBoxLokasiTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cBoxTransport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxWisata, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, "card3");

        tbLokasi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbLokasi);

        cBoxInfoLokasi.setBackground(new java.awt.Color(102, 102, 102));
        cBoxInfoLokasi.setForeground(new java.awt.Color(255, 255, 255));
        cBoxInfoLokasi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung Kota", "Bandung Utara", "Bandung Barat", "Bandung Selatan" }));

        btnInfoLokasi.setBackground(new java.awt.Color(102, 102, 102));
        btnInfoLokasi.setForeground(new java.awt.Color(255, 255, 255));
        btnInfoLokasi.setText("Show Info");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cBoxInfoLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(btnInfoLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(cBoxInfoLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnInfoLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(jPanel4);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_goBtnActionPerformed

    private void infoLokBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoLokBtnActionPerformed
        jPanel2.removeAll();
        jPanel2.add(jPanel3);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_infoLokBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnInfoLokasi;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JComboBox<String> cBoxInfoLokasi;
    private javax.swing.JComboBox<String> cBoxLokasiAsal;
    private javax.swing.JComboBox<String> cBoxLokasiTujuan;
    private javax.swing.JComboBox<String> cBoxTransport;
    private javax.swing.JComboBox<String> cBoxWisata;
    private javax.swing.JButton goBtn;
    private javax.swing.JButton infoLokBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tbLokasi;
    // End of variables declaration//GEN-END:variables


    public String getcBoxLokasiAsal() {
        return cBoxLokasiAsal.getItemAt(cBoxLokasiAsal.getSelectedIndex());
    }

    public void setcBoxLokasiAsal(JComboBox<String> cBoxLokasiAsal) {
        this.cBoxLokasiAsal = cBoxLokasiAsal;
    }

    public String getcBoxLokasiTujuan() {
        return cBoxLokasiTujuan.getItemAt(cBoxLokasiTujuan.getSelectedIndex());
    }
    
    public JComboBox getcBoxLokasiTujuanID(){
        return cBoxLokasiTujuan;
    }

    public void setcBoxLokasiTujuan(JComboBox<String> cBoxLokasiTujuan) {
        this.cBoxLokasiTujuan = cBoxLokasiTujuan;
    }

    public String getcBoxTransport() {
        return cBoxTransport.getItemAt(cBoxTransport.getSelectedIndex());
    }

    public void setcBoxTransport(JComboBox<String> cBoxTransport) {
        this.cBoxTransport = cBoxTransport;
    }

    public String getcBoxWisata() {
        return cBoxWisata.getItemAt(cBoxWisata.getSelectedIndex());
    }

    public void setcBoxWisata(String wisata) {
        this.cBoxWisata.addItem(wisata);
    }
    
    public void delCBoxWisata(){
        this.cBoxWisata.removeAllItems();
    }

    public JButton getGoGoBtn() {
        return btnGo;
    }

    public void setGoGoBtn(JButton goGoBtn) {
        this.btnGo = goGoBtn;
    }

    public JButton getInfoLokBtn() {
        return infoLokBtn;
    }

    public void setInfoLokBtn(JButton infoLokBtn) {
        this.infoLokBtn = infoLokBtn;
    }

    public JTable getTbLokasi() {
        return tbLokasi;
    }

    public void setTbLokasi(DefaultTableModel x) {
        this.tbLokasi.setModel(x);
    }
    
    

    public void setCBoxLokasiTujuan (String lokasi){
        this.cBoxLokasiTujuan.addItem(lokasi);
    }
    
    

    public String getcBoxInfoLokasi() {
        return cBoxInfoLokasi.getItemAt(cBoxInfoLokasi.getSelectedIndex());
    }
    
    public JComboBox getCBoxInfoLokasiID(){
        return cBoxInfoLokasi;
    }

    public JButton getBtnInfoLokasi() {
        return btnInfoLokasi;
    }

    public void setBtnInfoLokasi(JButton btnInfoLokasi) {
        this.btnInfoLokasi = btnInfoLokasi;
    }
    
    public int getSelectedLokasi(){
        return tbLokasi.getSelectedRow();
    }
    
    public JButton getBtnLogOut() {
        return btnLogOut;
    }

    public void setBtnLogOut(JButton btnLogOut) {
        this.btnLogOut = btnLogOut;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(String info) {
        jTextArea1.removeAll();
        jTextArea1.setText(info);
    }
    
    
    
    public void addActionListener(ActionListener x){
        
        btnInfoLokasi.addActionListener(x);
        btnGo.addActionListener(x);
        cBoxLokasiTujuan.addActionListener(x);
        cBoxInfoLokasi.addActionListener(x);
        btnLogOut.addActionListener(x);
    }
    
    public void addMouseAdapter(MouseAdapter x){
        tbLokasi.addMouseListener(x);
    }
    
}
