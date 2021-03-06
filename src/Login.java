import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gresh
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_email = new java.awt.Label();
        text_password1 = new java.awt.Label();
        jTextField_Email1 = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jButton1_register_visitor1 = new javax.swing.JButton();
        jButton1_register_staff = new javax.swing.JButton();
        text_atlanta_zoo = new java.awt.Label();
        text_email2 = new java.awt.Label();
        text_password = new java.awt.Label();
        jTextField_email = new javax.swing.JTextField();
        jPasswordField_password2 = new javax.swing.JPasswordField();
        jButton1_login = new javax.swing.JButton();
        jButton_register = new javax.swing.JButton();

        text_email.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_email.setText("Email");

        text_password1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_password1.setText("Password");

        jTextField_Email1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Email1ActionPerformed(evt);
            }
        });

        jButton1_register_visitor1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_register_visitor1.setText("Register Visitor");

        jButton1_register_staff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_register_staff.setText("Register Staff");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        text_atlanta_zoo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        text_atlanta_zoo.setName(""); // NOI18N
        text_atlanta_zoo.setText("Atlanta Zoo");

        text_email2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_email2.setText("Email");

        text_password.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_password.setText("Password");

        jTextField_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jButton1_login.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1_login.setText("Login");
        jButton1_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1_loginMouseClicked(evt);
            }
        });

        jButton_register.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_register.setText("Register");
        jButton_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_registerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(text_email2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordField_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1_login)
                        .addGap(133, 133, 133)
                        .addComponent(jButton_register)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text_atlanta_zoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(285, 285, 285))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_atlanta_zoo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_email2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_register)
                    .addComponent(jButton1_login))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_Email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Email1ActionPerformed

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jButton1_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1_loginMouseClicked
        String email = new String(jTextField_email.getText());
        String password = new String(jPasswordField_password2.getPassword());
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_group8",
            "cs4400_group8",
            "l5sU95me");
            //"jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_group67"
            if(!con.isClosed())
                System.out.println("Successfully connected to " +
                "MySQL server using TCP/IP...");
                Statement myStmt = null;
                ResultSet myRs = null;
                myStmt = con.createStatement();
                myRs = myStmt.executeQuery("select * from Users");
                int found = 0;
                while (myRs.next()) {
                    if (email.equals(myRs.getString("Email")) && password.hashCode() == myRs.getInt("Password")) {
                        System.out.println("LOGGED IN");
                        found = 1;
                        if (myRs.getString("Role").equals("Admin")) {
                            Admin_Main ad = new Admin_Main();
                            ad.setVisible(true);;
                        } else if (myRs.getString("Role").equals("Staff")) {
                            Staff_Main st = new Staff_Main(myRs.getString("Username"));
                            st.setVisible(true);
                            
                        } else if (myRs.getString("Role").equals("Visitor")) {
                            Visitor_Main vi = new Visitor_Main(myRs.getString("Username"));
                            vi.setVisible(true);
                        }
                        this.dispose();
                        break;
                    }
                }
                if (found == 0) {
                    JOptionPane.showMessageDialog(null, "No User found with that email and password");

                }
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if(con != null)
                con.close();
            } catch(SQLException e) {}
        } 
        
    }//GEN-LAST:event_jButton1_loginMouseClicked

    private void jButton_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_registerMouseClicked
        Registration reg = new Registration();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_registerMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_login;
    private javax.swing.JButton jButton1_register_staff;
    private javax.swing.JButton jButton1_register_visitor1;
    private javax.swing.JButton jButton_register;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JPasswordField jPasswordField_password2;
    private javax.swing.JTextField jTextField_Email1;
    private javax.swing.JTextField jTextField_email;
    private java.awt.Label text_atlanta_zoo;
    private java.awt.Label text_email;
    private java.awt.Label text_email2;
    private java.awt.Label text_password;
    private java.awt.Label text_password1;
    // End of variables declaration//GEN-END:variables
}
