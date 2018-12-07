/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends javax.swing.JFrame {

    public LoginFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        judul = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        usrLab = new javax.swing.JLabel();
        passLab = new javax.swing.JLabel();
        loginUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        clikRegister = new javax.swing.JLabel();
        loginAdmin = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        regNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        regEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        regUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        regPassword = new javax.swing.JPasswordField();
        backLogin = new javax.swing.JLabel();
        regBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        noHPReg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentPanel.setLayout(new java.awt.CardLayout());

        judul.setFont(new java.awt.Font("Gargi-1.2b", 0, 24)); // NOI18N
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("Bandung Tour Guide");

        usrLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usrLab.setText("Username :");

        passLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passLab.setText("Password:");

        loginUser.setBackground(new java.awt.Color(102, 102, 102));
        loginUser.setForeground(new java.awt.Color(255, 255, 255));
        loginUser.setText("Login as User");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doesn't have any account?");

        clikRegister.setBackground(new java.awt.Color(0, 102, 102));
        clikRegister.setForeground(new java.awt.Color(153, 0, 0));
        clikRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clikRegister.setText("Click Here");
        clikRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clikRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clikRegisterMouseClicked(evt);
            }
        });

        loginAdmin.setBackground(new java.awt.Color(102, 102, 102));
        loginAdmin.setForeground(new java.awt.Color(255, 255, 255));
        loginAdmin.setText("Login as Admin");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clikRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(usrLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Password, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(179, 179, 179))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(loginAdmin))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(loginUser)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
                .addContainerGap())
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(judul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usrLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passLab)
                .addGap(4, 4, 4)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clikRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginAdmin)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        parentPanel.add(loginPanel, "card2");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nama:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Email:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Username");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");

        regPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPasswordActionPerformed(evt);
            }
        });

        backLogin.setText("Click Here to LogIn");
        backLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLoginMouseClicked(evt);
            }
        });

        regBtn.setBackground(new java.awt.Color(102, 102, 102));
        regBtn.setForeground(new java.awt.Color(255, 255, 255));
        regBtn.setText("Click Here to Register");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("No. HP:");

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(246, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(noHPReg)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                    .addComponent(regNama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(regPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 163, Short.MAX_VALUE)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(backLogin)
                        .addGap(30, 30, 30)))
                .addGap(228, 228, 228))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noHPReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backLogin)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        parentPanel.add(registerPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPasswordActionPerformed

    }//GEN-LAST:event_regPasswordActionPerformed

    private void backLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLoginMouseClicked
        parentPanel.removeAll();
        parentPanel.add(loginPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
    }//GEN-LAST:event_backLoginMouseClicked

    private void clikRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clikRegisterMouseClicked
        parentPanel.removeAll();
        parentPanel.add(registerPanel);
        parentPanel.repaint();
        parentPanel.revalidate();      
    }//GEN-LAST:event_clikRegisterMouseClicked
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel backLogin;
    private javax.swing.JLabel clikRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel judul;
    private javax.swing.JButton loginAdmin;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JButton loginUser;
    private javax.swing.JTextField noHPReg;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JLabel passLab;
    private javax.swing.JButton regBtn;
    private javax.swing.JTextField regEmail;
    private javax.swing.JTextField regNama;
    private javax.swing.JPasswordField regPassword;
    private javax.swing.JTextField regUsername;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usrLab;
    // End of variables declaration//GEN-END:variables

      public void showMessage(String message, String title, int type){
        JOptionPane.showMessageDialog(null, message, title, type);
    }
    


    public String getPassword() {
        return Password.getText();
    }

    public void setPassword(JPasswordField Password) {
        this.Password = Password;
    }

    public JLabel getClikRegister() {
        return clikRegister;
    }

    public void setClikRegister(JLabel clikRegister) {
        this.clikRegister = clikRegister;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPanel getjPanel2() {
        return loginPanel;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.loginPanel = jPanel2;
    }

    public JLabel getJudul() {
        return judul;
    }

    public void setJudul(JLabel judul) {
        this.judul = judul;
    }

    public JButton getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(JButton loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public JButton getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(JButton loginUser) {
        this.loginUser = loginUser;
    }

    public JLabel getPassLab() {
        return passLab;
    }

    public void setPassLab(JLabel passLab) {
        this.passLab = passLab;
    }

    public String getUsername() {
        return username.getText();
    }

    public void setUsername(JTextField username) {
        this.username = username;
    }

    public JLabel getUsrLab() {
        return usrLab;
    }

    public void setUsrLab(JLabel usrLab) {
        this.usrLab = usrLab;
    }

    public String getNoHPReg() {
        return noHPReg.getText();
    }

    public void setNoHPReg(JTextField noHPReg) {
        this.noHPReg = noHPReg;
    }
    
    
    
    
    public void addMouseAdapter(MouseAdapter x){
        clikRegister.addMouseListener(x);
    }

    public JButton getRegBtn() {
        return regBtn;
    }

    public void setRegBtn(JButton regBtn) {
        this.regBtn = regBtn;
    }

    public String getRegEmail() {
        return regEmail.getText();
    }

    public void setRegEmail(JTextField regEmail) {
        this.regEmail = regEmail;
    }

    public String getRegNama() {
        return regNama.getText();
    }

    public void setRegNama(JTextField regNama) {
        this.regNama = regNama;
    }

    public String getRegPassword() {
        return regPassword.getText();
    }

    public void setRegPassword(JPasswordField regPassword) {
        this.regPassword = regPassword;
    }

    public String getRegUsername() {
        return regUsername.getText();
    }

    public void setRegUsername(JTextField regUsername) {
        this.regUsername = regUsername;
    }
    
    public void addActionListener(ActionListener x){
        loginAdmin.addActionListener(x);
        loginUser.addActionListener(x);
        regBtn.addActionListener(x);
    }
}
