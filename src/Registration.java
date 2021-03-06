
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Pattern;
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
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Registration() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_atlanta_zoo = new java.awt.Label();
        text_email = new java.awt.Label();
        text_confirm_password = new java.awt.Label();
        text_username = new java.awt.Label();
        text_password = new java.awt.Label();
        jTextField_email = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jButton_register_staff = new javax.swing.JButton();
        jButton_register_visitor = new javax.swing.JButton();
        jPasswordField_password = new javax.swing.JPasswordField();
        jPasswordField_confirm_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        text_atlanta_zoo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        text_atlanta_zoo.setName(""); // NOI18N
        text_atlanta_zoo.setText("Atlanta Zoo");

        text_email.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_email.setText("Email");

        text_confirm_password.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_confirm_password.setText("Confirm Password");

        text_username.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_username.setText("Username");

        text_password.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text_password.setText("Password");

        jTextField_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_emailActionPerformed(evt);
            }
        });

        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_register_staff.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_register_staff.setText("Register Staff");
        jButton_register_staff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_register_staffMouseClicked(evt);
            }
        });

        jButton_register_visitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_register_visitor.setText("Register Visitor");
        jButton_register_visitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_register_visitorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(text_atlanta_zoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(text_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(195, 195, 195))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(62, 62, 62)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(text_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(92, 92, 92)
                                            .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                            .addComponent(jPasswordField_confirm_password)))))
                            .addGap(66, 66, 66)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_register_visitor)
                        .addGap(77, 77, 77)
                        .addComponent(jButton_register_staff)
                        .addGap(164, 164, 164))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(text_atlanta_zoo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_email, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField_password, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_confirm_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordField_confirm_password))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_register_staff)
                            .addComponent(jButton_register_visitor))
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_emailActionPerformed

    private void jButton_register_visitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_register_visitorMouseClicked
        String email = new String(jTextField_email.getText());
        String username = new String(jTextField_username.getText());
        String password = new String(jPasswordField_password.getPassword());
        String confirm_password = new String(jPasswordField_confirm_password.getPassword());
        
        //check passwords
        if (!password.equals(confirm_password)) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password fields must match");
        }
        else if (!isValid(email)) {
            JOptionPane.showMessageDialog(null, "Email must be a valid email");
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters");
        } else {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_group8",
            "cs4400_group8",
            "l5sU95me");
            //"jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_group67"
            //if(!con.isClosed())
            //System.out.println("Successfully connected to " +
            //"MySQL server using TCP/IP...");
            Statement myStmt = null;
            ResultSet myRs = null;
            myStmt = con.createStatement();
            String query = " insert into Users (Username, Password, Email, Role)"
            + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, username);
            preparedStmt.setInt (2, password.hashCode());
            preparedStmt.setString (3, email);
            preparedStmt.setString (4, "visitor");

            // execute the preparedstatement
            preparedStmt.execute();
            Visitor_Main vi = new Visitor_Main(username);
            vi.setVisible(true);
            this.dispose();
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if(con != null)
                con.close();
            } catch(SQLException e) {}
        } 
        }
    }//GEN-LAST:event_jButton_register_visitorMouseClicked

    private void jButton_register_staffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_register_staffMouseClicked
        String email = new String(jTextField_email.getText());
        String username = new String(jTextField_username.getText());
        String password = new String(jPasswordField_password.getPassword());
        String confirm_password = new String(jPasswordField_confirm_password.getPassword());
        
        //check passwords
        if (!password.equals(confirm_password)) {
            JOptionPane.showMessageDialog(null, "Password and Confirm Password fields must match");
        } else if (!isValid(email)) {
            JOptionPane.showMessageDialog(null, "Email must be a valid email");
        } else if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters");
        } else {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://academic-mysql.cc.gatech.edu/cs4400_group8",
            "cs4400_group8",
            "l5sU95me");
            Statement myStmt = null;
            ResultSet myRs = null;
            myStmt = con.createStatement();
            String query = " insert into Users (Username, Password, Email, Role)"
            + " values (?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString (1, username);
            preparedStmt.setInt (2, password.hashCode());
            preparedStmt.setString (3, email);
            preparedStmt.setString (4, "staff");

            // execute the preparedstatement
            preparedStmt.execute();
            
            Staff_Main st = new Staff_Main(username);
            st.setVisible(true);
            this.dispose();
 
        } catch(Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if(con != null)
                con.close();
            } catch(SQLException e) {}
        } 
        }
    }//GEN-LAST:event_jButton_register_staffMouseClicked

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_register_staff;
    private javax.swing.JButton jButton_register_visitor;
    private javax.swing.JPasswordField jPasswordField_confirm_password;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_email;
    private javax.swing.JTextField jTextField_username;
    private java.awt.Label text_atlanta_zoo;
    private java.awt.Label text_confirm_password;
    private java.awt.Label text_email;
    private java.awt.Label text_password;
    private java.awt.Label text_username;
    // End of variables declaration//GEN-END:variables
}
