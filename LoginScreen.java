/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package booksort;

import static booksort.Sorting.bookList;
import static booksort.Sorting.userList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginScreen extends javax.swing.JFrame {

    String tmpString = "";
    String tmpUsername = "";
    String tmpPassword = "";
    
    public LoginScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginButtonKeyPressed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/booksort/bookBuddy2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(passwordField)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        File booksFile = new File("users.txt");
        try {
            FileReader freader = new FileReader("users.txt");
            BufferedReader reader = new BufferedReader(freader);
            userList.clear();
            while (tmpString != null) {
		tmpString = reader.readLine();
                if (tmpString != null){
                    String[] tmpStrArr = tmpString.replace("[", "").replace("]", "").split(", ");
                    userList.add(tmpStrArr);
                }
            }
            reader.close();
            tmpString = "";
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < userList.size(); i++){
            if(userList.get(i)[0].compareTo(usernameField.getText()) == 0){
                String passw = new String(passwordField.getPassword());
                if(userList.get(i)[1].compareTo(passw) == 0){
                    if(userList.get(i)[2].compareTo("1") == 0){
                        System.out.println("admin mode");
                        NewGUI gui = new NewGUI();
                        gui.setVisible(true);
                        this.setVisible(false);
                    } else if(userList.get(i)[2].compareTo("0") == 0){
                        System.out.println("user mode");
                        UserGUI gui2 = new UserGUI();
                        gui2.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void loginButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginButtonKeyPressed
        File booksFile = new File("users.txt");
        try {
            FileReader freader = new FileReader("users.txt");
            BufferedReader reader = new BufferedReader(freader);
            userList.clear();
            while (tmpString != null) {
		tmpString = reader.readLine();
                if (tmpString != null){
                    String[] tmpStrArr = tmpString.replace("[", "").replace("]", "").split(", ");
                    userList.add(tmpStrArr);
                }
            }
            reader.close();
            tmpString = "";
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NewGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < userList.size(); i++){
            if(userList.get(i)[0].compareTo(usernameField.getText()) == 0){
                String passw = new String(passwordField.getPassword());
                if(userList.get(i)[1].compareTo(passw) == 0){
                    if(userList.get(i)[2].compareTo("1") == 0){
                        System.out.println("admin mode");
                        NewGUI gui = new NewGUI();
                        gui.setVisible(true);
                        this.setVisible(false);
                    } else if(userList.get(i)[2].compareTo("0") == 0){
                        System.out.println("user mode");
                        UserGUI gui2 = new UserGUI();
                        gui2.setVisible(true);
                        this.setVisible(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_loginButtonKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
