import javax.swing.JOptionPane;

public class PantallaInicio extends javax.swing.JFrame {
    
    Login l2 = new Login();

    /**
     * Creates new form PantallaInicio
     */
    public PantallaInicio() {
        
        initComponents();
        initComponents2();
        this.setTitle("Home Page");
        
    }
    
    public void initComponents2(){
    
        setLocationRelativeTo(null);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btt_about = new javax.swing.JButton();
        btt_login1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 405));
        jPanel1.setLayout(null);

        btt_about.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_about.setText("About");
        btt_about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_aboutActionPerformed(evt);
            }
        });
        jPanel1.add(btt_about);
        btt_about.setBounds(280, 240, 130, 40);

        btt_login1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_login1.setText("Login");
        btt_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_login1ActionPerformed(evt);
            }
        });
        jPanel1.add(btt_login1);
        btt_login1.setBounds(280, 100, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 120, 150, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_aboutActionPerformed
        
        JOptionPane.showMessageDialog(null, "Angel Guillermo Arreaga Barrientos\n" + "202004762");
        
    }//GEN-LAST:event_btt_aboutActionPerformed

    private void btt_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_login1ActionPerformed
        
        l2.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btt_login1ActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_about;
    private javax.swing.JButton btt_login1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}