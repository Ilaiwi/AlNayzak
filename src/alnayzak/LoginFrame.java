package alnayzak;

import java.sql.ResultSetMetaData;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BaRa' DwEiKaT
 */

public class LoginFrame extends javax.swing.JFrame {
    AdministratorFrame af = null;
    TrainerFrame tf = null; 
    EntityManagerFactory emf=null;
    EntityManager em=null;
    Query qr=null;
    List<Users> usr=null;
    
    public LoginFrame() {
        initComponents();
        af = new AdministratorFrame();
        tf = new TrainerFrame();   
        emf=Persistence.createEntityManagerFactory("AlNayzakPU");
        em=emf.createEntityManager();
        qr=em.createNamedQuery("Users.findAll");
        usr= qr.getResultList();    
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        UserNameCompoBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        UserPasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel1.setText("User Name");

        UserNameCompoBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Trainer" }));

        jLabel2.setText("Password");

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UserNameCompoBox, 0, 150, Short.MAX_VALUE)
                    .addComponent(UserPasswordField))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(UserNameCompoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(UserPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
   
        String user,pwd;
        user = (String) UserNameCompoBox.getSelectedItem();
        pwd = new String (UserPasswordField.getPassword());
        
        if(user.equals("Administrator")&&pwd.equals("@database"))
        {
            JOptionPane.showMessageDialog(null,"The Password is "+usr.get(0).getPassword());
            this.UserPasswordField.setText("");
        }
        else if(user.equals("Trainer")&&pwd.equals("@database"))
        {
            JOptionPane.showMessageDialog(null,"The Password is "+usr.get(1).getPassword());
            this.UserPasswordField.setText("");
        }
        else if(!(user.equals("Administrator")&&pwd.equals(usr.get(0).getPassword()))&&!(user.equals("Trainer")&&pwd.equals(usr.get(1).getPassword()))){
            JOptionPane.showMessageDialog(null,"Inalid Password","Error",JOptionPane.ERROR_MESSAGE);
            this.UserPasswordField.setText("");
        }
        else if(user.equals("Administrator")&&pwd.equals(usr.get(0).getPassword())){
            af.setVisible(true);
            af.setLocationRelativeTo(null);
            af.setExtendedState(JFrame.MAXIMIZED_BOTH);
            af.setResizable(false);
            this.dispose();
        }
        else if(user.equals("Trainer")&&pwd.equals(usr.get(1).getPassword())){
            tf.setVisible(true);
            tf.setLocationRelativeTo(null);
            tf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            tf.setResizable(false);
            this.dispose();
        }
                   
    }//GEN-LAST:event_LoginButtonActionPerformed
    /**
     * @param args the command line arguments

    **/
    public static void main(String args[])
    {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.setLocationRelativeTo(null);
        lf.setResizable(false);
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JComboBox UserNameCompoBox;
    private javax.swing.JPasswordField UserPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
