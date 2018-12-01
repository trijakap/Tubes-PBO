
package Controller;

import Model.*;
import View.LoginFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainController extends MouseAdapter implements ActionListener {
    
    private LoginFrame view;
    private Database db;
    
    public MainController(){
        view = new LoginFrame();
        db = new Database();
        view.addActionListener(this);
        view.addMouseAdapter(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    } 
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if(source.equals(view.getLoginAdmin())){
            loginAdminActionPerformed();
        } else if(source.equals(view.getLoginUser())){
            loginUserActionPerformed();
        } else if(source.equals(view.getRegBtn())){
            regBtnActionPerformed();
        }
    }
    
    private void loginUserActionPerformed() {                                          
        String username = view.getUsername();
        String pass = view.getPassword();
        if(db.cekUserPassMember(username, pass)){
            MemberController mc = new MemberController(db);
            view.dispose();
        } else {
            view.showMessage("Username / Password Salah", "Error", 0);
        }
    }  
    
    private void loginAdminActionPerformed() {                                          
        String username = view.getUsername();
        String pass = view.getPassword();
        if(db.cekUserPassAdmin(username, pass)){
            AdminController ac = new AdminController(db);
            view.dispose();
        }else {
            view.showMessage("Username / Password Salah", "Error", 0);
        }
    }  

    private void regBtnActionPerformed() {
        String nama = view.getRegNama();
        String email = view.getRegEmail();
        String username = view.getRegUsername();
        String pass = view.getRegPassword();
        String noHP = view.getNoHPReg();
        if(nama.isEmpty() || email.isEmpty() || username.isEmpty() || pass.isEmpty()){
            view.showMessage("Data masih ada yang belum terisi", "Error", 0);
        } else {
            if(db.cekDuplikatUsernameMember(username)){
                view.showMessage("Username sudah terpakai", "Error", 0);
            } else {
                db.addMember(new Member(username,pass,nama,email,noHP));
                view.showMessage("Data berhasil terisi", "Success", 1);
            }
        }
    }
}
