/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import BLL.ClassLoginInfo;
import BLL.SignIn;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author lsayh
 */
public class FmLogIn extends javax.swing.JFrame {

    /**
     * Creates new form FmLogIn
     */
    //hàm khởi tạo form login
    //biến ReLogin để đánh dấu đây là lần đầu tiên đăng nhập hay là đã đăng nhập và thực hiện đăng xuất
    public FmLogIn(Boolean ReLogin) {
        initComponents();
        ImageLogin.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Presentation/resources/android.jpg")).getImage().getScaledInstance(ImageLogin.getWidth(), ImageLogin.getHeight(), Image.SCALE_DEFAULT)));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        new beatyButton(BtnLogin).start();
        new beatyButton(btnExit).start();
        if(ReLogin){
            PnDangNhapServer.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ImageLogin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PnDangNhapUser = new javax.swing.JPanel();
        PnDangNhapServer = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbDB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TxtPass = new javax.swing.JPasswordField();
        TxtUserID = new javax.swing.JTextField();
        CbDb = new javax.swing.JComboBox<>();
        TxtIP = new javax.swing.JTextField();
        BtnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        BtnULogin = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtUserName = new javax.swing.JTextField();
        TxtUPass = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        ImageLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ImageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Presentation/Resources/android.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 0, 72)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("K&H Shop ");

        PnDangNhapUser.setBackground(new java.awt.Color(0, 0, 51));
        PnDangNhapUser.setLayout(null);

        PnDangNhapServer.setBackground(new java.awt.Color(0, 0, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Server IP");

        lbDB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbDB.setForeground(new java.awt.Color(204, 204, 204));
        lbDB.setText("DataBase List");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("User ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Password");

        TxtPass.setBackground(new java.awt.Color(0, 0, 51));
        TxtPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtPass.setForeground(new java.awt.Color(204, 204, 204));
        TxtPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        TxtPass.setCaretColor(new java.awt.Color(204, 204, 204));

        TxtUserID.setBackground(new java.awt.Color(0, 0, 51));
        TxtUserID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtUserID.setForeground(new java.awt.Color(204, 204, 204));
        TxtUserID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        TxtUserID.setCaretColor(new java.awt.Color(204, 204, 204));

        TxtIP.setBackground(new java.awt.Color(0, 0, 51));
        TxtIP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtIP.setForeground(new java.awt.Color(204, 204, 204));
        TxtIP.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));

        BtnLogin.setBackground(new java.awt.Color(255, 0, 255));
        BtnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnLogin.setText("Connect");
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 0, 255));
        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PnDangNhapServerLayout = new javax.swing.GroupLayout(PnDangNhapServer);
        PnDangNhapServer.setLayout(PnDangNhapServerLayout);
        PnDangNhapServerLayout.setHorizontalGroup(
            PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnDangNhapServerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnDangNhapServerLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnDangNhapServerLayout.createSequentialGroup()
                        .addComponent(lbDB)
                        .addGap(29, 29, 29)
                        .addComponent(CbDb, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnDangNhapServerLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(TxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnDangNhapServerLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PnDangNhapServerLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        PnDangNhapServerLayout.setVerticalGroup(
            PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnDangNhapServerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnDangNhapServerLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TxtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDB, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(PnDangNhapServerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        PnDangNhapUser.add(PnDangNhapServer);
        PnDangNhapServer.setBounds(10, 0, 430, 563);

        BtnULogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnULogin.setText("Login");
        BtnULogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnULoginActionPerformed(evt);
            }
        });
        PnDangNhapUser.add(BtnULogin);
        BtnULogin.setBounds(80, 493, 120, 40);

        BtnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtnCancel.setText("Disconnect");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        PnDangNhapUser.add(BtnCancel);
        BtnCancel.setBounds(260, 490, 120, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        PnDangNhapUser.add(jLabel7);
        jLabel7.setBounds(40, 260, 110, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("User Name");
        PnDangNhapUser.add(jLabel8);
        jLabel8.setBounds(40, 160, 110, 30);

        TxtUserName.setBackground(new java.awt.Color(0, 0, 51));
        TxtUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtUserName.setForeground(new java.awt.Color(204, 204, 204));
        TxtUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        PnDangNhapUser.add(TxtUserName);
        TxtUserName.setBounds(150, 150, 250, 40);

        TxtUPass.setBackground(new java.awt.Color(0, 0, 51));
        TxtUPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TxtUPass.setForeground(new java.awt.Color(204, 204, 204));
        TxtUPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        PnDangNhapUser.add(TxtUPass);
        TxtUPass.setBounds(150, 250, 250, 40);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ImageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(PnDangNhapUser, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PnDangNhapUser, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(ImageLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //button đăng nhập server và chọn database cần sử dụng
    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        SignIn mylogin= new SignIn();
        if(TxtIP.getText().equals("") || TxtUserID.getText().equals("") || TxtPass.getPassword().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please finish filling");
            return;
        }
        if(mylogin.connect(String.valueOf(TxtIP.getText()),TxtUserID.getText(),
            String.valueOf(TxtPass.getPassword()),CbDb.getSelectedIndex(),String.valueOf(CbDb.getSelectedItem()))==1)
    {

        if(CbDb.getSelectedIndex()==-1){
            CbDb.setModel(mylogin.takeDBMS());
            TxtPass.setEditable(false);
            TxtUserID.setEditable(false);
            TxtIP.setEditable(false);
            lbDB.setVisible(true);
            CbDb.setVisible(true);
        }
        else{
            PnDangNhapServer.setVisible(false);
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Log in Fail");
        }
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed
    //button đăng nhập váo database
    private void BtnULoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnULoginActionPerformed
        try{
        SignIn mylogin= new SignIn();
        ClassLoginInfo NameAndRole = new ClassLoginInfo();
        mylogin.getRole(TxtUserName.getText(), String.valueOf(TxtUPass.getPassword()),NameAndRole);
        switch(NameAndRole.getRole()){
            case 0:
            JOptionPane.showMessageDialog(rootPane, "User name or password are not correct");
            break;
            case 1:
            JOptionPane.showMessageDialog(rootPane, "The access ist under management authority");
            new AdminHomepage()
                    .setInfo(NameAndRole);
            this.dispose();
            break;
            case 2:
            JOptionPane.showMessageDialog(rootPane, "The access ist under employee authority");
            new AdminHomepage()
                    .setInfo(NameAndRole);
            this.dispose();
            break;
            default:
            JOptionPane.showMessageDialog(rootPane, "some thing not true");
        }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, "User Name or password is not true");
        }
    }//GEN-LAST:event_BtnULoginActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        PnDangNhapServer.setVisible(true);
    }//GEN-LAST:event_BtnCancelActionPerformed
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
            java.util.logging.Logger.getLogger(FmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmLogIn(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnULogin;
    private javax.swing.JComboBox<String> CbDb;
    private javax.swing.JLabel ImageLogin;
    private javax.swing.JPanel PnDangNhapServer;
    private javax.swing.JPanel PnDangNhapUser;
    private javax.swing.JTextField TxtIP;
    private javax.swing.JPasswordField TxtPass;
    private javax.swing.JPasswordField TxtUPass;
    private javax.swing.JTextField TxtUserID;
    private javax.swing.JTextField TxtUserName;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbDB;
    // End of variables declaration//GEN-END:variables
}