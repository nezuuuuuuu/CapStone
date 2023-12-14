
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class StudentLogin extends javax.swing.JFrame {
     private String s;
    private int ctr =0;
    private FileReader fileReader;
    private BufferedReader reader;
    private BufferedReader passwordR;
    private boolean aStudent=true;


    /**
     * Creates new form StudentLogin
     */
    public StudentLogin() {
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

        jPanel3 = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        welcomeMsg = new javax.swing.JLabel();
        passwordText = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        usernameText = new javax.swing.JLabel();
        forgotpassLabel = new javax.swing.JLabel();
        rememberCB = new javax.swing.JCheckBox();
        SignInBtn = new javax.swing.JButton();
        SignUp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("La Lune");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanel.setBackground(new java.awt.Color(137, 0, 174));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/moon-removebg-preview (1).png"))); // NOI18N

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jPanel3.add(leftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -10, 470, 570));

        rightPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeMsg.setFont(new java.awt.Font("Tenebra", 0, 48)); // NOI18N
        welcomeMsg.setForeground(new java.awt.Color(137, 0, 174));
        welcomeMsg.setText("Welcome!");
        rightPanel.add(welcomeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 60));

        passwordText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordText.setForeground(new java.awt.Color(137, 0, 174));
        passwordText.setText("Password:");
        rightPanel.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        usernameTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        rightPanel.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, 50));

        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.setPreferredSize(new java.awt.Dimension(68, 22));
        rightPanel.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 330, 50));

        usernameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameText.setForeground(new java.awt.Color(137, 0, 174));
        usernameText.setText("Username:");
        rightPanel.add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        forgotpassLabel.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        forgotpassLabel.setForeground(new java.awt.Color(137, 0, 174));
        forgotpassLabel.setText("Forgot Password?");
        forgotpassLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rightPanel.add(forgotpassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        rememberCB.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        rememberCB.setForeground(new java.awt.Color(137, 0, 174));
        rememberCB.setText("Remember Password");
        rememberCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rememberCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rememberCBActionPerformed(evt);
            }
        });
        rightPanel.add(rememberCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        SignInBtn.setBackground(new java.awt.Color(137, 0, 174));
        SignInBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SignInBtn.setForeground(new java.awt.Color(255, 255, 255));
        SignInBtn.setText("Sign in");
        SignInBtn.setBorder(null);
        SignInBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignInBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInBtnMouseClicked(evt);
            }
        });
        SignInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInBtnActionPerformed(evt);
            }
        });
        rightPanel.add(SignInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 330, 50));

        SignUp.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        SignUp.setForeground(new java.awt.Color(137, 0, 174));
        SignUp.setText("Sign Up");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        rightPanel.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(137, 0, 174));
        jLabel4.setText("Don't have an account?");
        rightPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        exitBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(137, 0, 174));
        exitBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitBtn.setText("x");
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
        });
        rightPanel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        jPanel3.add(rightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 410, 550));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        setSize(new java.awt.Dimension(870, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void rememberCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rememberCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rememberCBActionPerformed

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnMouseClicked

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new RegisterForm().setVisible(true);
    }//GEN-LAST:event_SignUpMouseClicked

    private void SignInBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInBtnMouseClicked
        // TODO add your handling code here:
        try {
        FileReader fileReader = new FileReader("C:\\Users\\janed\\Documents\\Data.txt");//Elisanan
        BufferedReader reader = new BufferedReader(fileReader);

        // Get entered username and password from JTextArea and JPasswordField
        String enteredUsername = usernameTextField.getText();
        char[] enteredPasswordChars = passwordField.getPassword();
        String enteredPassword = new String(enteredPasswordChars);

        String line;
        boolean loginSuccessful = false;

        // Loop through each line in the file
        while ((line = reader.readLine()) != null) {
            // Split the line into username and password using a delimiter (e.g., comma)
            String[] credentials = line.split(",");
            
            // Check if entered credentials match stored credentials
            if (enteredUsername.equals(credentials[0]) && enteredPassword.equals(credentials[1])) {
                loginSuccessful = true;
                break;  // Exit the loop if a match is found
            }
        }

        if (loginSuccessful) {
            this.dispose();
            new Home().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password");
        }

        reader.close();
    } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(this, "File not Found");
    } catch (IOException ex) {
              JOptionPane.showMessageDialog(this, "IOException");
    }
    }//GEN-LAST:event_SignInBtnMouseClicked

    private void SignInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInBtnActionPerformed
         
      
        
    }//GEN-LAST:event_SignInBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new StudentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SignInBtn;
    private javax.swing.JLabel SignUp;
    private javax.swing.JLabel exitBtn;
    private javax.swing.JLabel forgotpassLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordText;
    private javax.swing.JCheckBox rememberCB;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel usernameText;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JLabel welcomeMsg;
    // End of variables declaration//GEN-END:variables
}
