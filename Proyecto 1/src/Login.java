import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Opciones o2 = new Opciones();

    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        initComponents2();
        this.setTitle("Login");
        
    }
    
    public void initComponents2(){
    
        setLocationRelativeTo(null);
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btt_regresarPrincipal = new javax.swing.JButton();
        btt_ingresarUsuario1 = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 70, 70, 30);

        txt_usuario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel1.add(txt_usuario);
        txt_usuario.setBounds(60, 100, 190, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 190, 90, 30);

        btt_regresarPrincipal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_regresarPrincipal.setText("Regresar");
        btt_regresarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_regresarPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btt_regresarPrincipal);
        btt_regresarPrincipal.setBounds(310, 310, 110, 40);

        btt_ingresarUsuario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_ingresarUsuario1.setText("Ingresar");
        btt_ingresarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_ingresarUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(btt_ingresarUsuario1);
        btt_ingresarUsuario1.setBounds(110, 310, 110, 40);
        jPanel1.add(txt_password);
        txt_password.setBounds(60, 220, 190, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, 80, 150, 180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_regresarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_regresarPrincipalActionPerformed
        
        this.setVisible(false);
        new PantallaInicio().setVisible(true);
        
    }//GEN-LAST:event_btt_regresarPrincipalActionPerformed

    private void btt_ingresarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_ingresarUsuario1ActionPerformed
        
        char clave[]=txt_password.getPassword();
        String clavedef = new String(clave);
        
        if(txt_usuario.getText().equals("administrador")&& clavedef.equals("202004762")){
            this.dispose();
            o2.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "ACCESO DENEGADO\n"+"Usuario o contraseña incorrecta","ALERTA", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btt_ingresarUsuario1ActionPerformed

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
    private javax.swing.JButton btt_ingresarUsuario1;
    private javax.swing.JButton btt_regresarPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}