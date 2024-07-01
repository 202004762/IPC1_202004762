import javax.swing.JOptionPane;


public class crearCuenta extends javax.swing.JFrame {
    
    crearCliente fp = new crearCliente();
        
    public crearCuenta() {
        
        initComponents();
        initComponents2();
        this.setTitle("Crear cuenta");
        cbx_cuentas.removeAllItems();
        Cliente[] datosTemporales = fp.listaClientes;
        //IMPRIMIR DATOS
        /*for(int i=0;i<datosTemporales.length;i++){
            if(datosTemporales[i] != null){
                System.out.println("Nombre: "+datosTemporales[i].nombre+", Apellido: "+datosTemporales[i].apellido+", CUI: "+String.valueOf(datosTemporales[i].cui));
            } 
        }*/
        
        for(int i=0;i<datosTemporales.length;i++){
            if(datosTemporales[i]!=null){
                cbx_cuentas.addItem(datosTemporales[i].cui+" - "+datosTemporales[i].nombre+" "+datosTemporales[i].apellido);
            }
        }
        
    }
    
    public void initComponents2(){
    
        setLocationRelativeTo(null);
    
    }
    
    private int count = 100;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_cuentas = new javax.swing.JComboBox<>();
        btt_regresar = new javax.swing.JButton();
        btt_crearUsuario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Cliente");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 50, 60, 30);

        cbx_cuentas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel1.add(cbx_cuentas);
        cbx_cuentas.setBounds(20, 80, 360, 30);

        btt_regresar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_regresar.setText("Regresar");
        btt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btt_regresar);
        btt_regresar.setBounds(70, 140, 120, 40);

        btt_crearUsuario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_crearUsuario1.setText("Crear");
        btt_crearUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_crearUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(btt_crearUsuario1);
        btt_crearUsuario1.setBounds(220, 140, 120, 40);

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

    private void btt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_regresarActionPerformed
    
        this.setVisible(false);
        new Opciones().setVisible(true);        
        
    }//GEN-LAST:event_btt_regresarActionPerformed

    private void btt_crearUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_crearUsuario1ActionPerformed
                
        int IDclientes = cbx_cuentas.getSelectedIndex();
        //System.out.println(IDclientes);
        count++;
        boolean bandera = false;
        for(int i=0;i<fp.listaClientes[IDclientes].asociadas.length;i++){
            if(fp.listaClientes[IDclientes].asociadas[i]==null){
                fp.listaClientes[IDclientes].asociadas[i]=new Cuenta(count,fp.listaClientes[IDclientes].cui, 0.0);
                bandera = true;
                JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
        
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "No es posible crear más cuentas para el cliente seleccionado", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        
        //IMPRIMIR CUENTAS
        /*for(int i=0;i<fp.listaClientes.length;i++){
            if(fp.listaClientes[IDclientes]!=null){
                for(int j=0; j<fp.listaClientes[IDclientes].asociadas.length;j++){
                    if(fp.listaClientes[IDclientes].asociadas[j]!=null){
                        fp.listaClientes[IDclientes].asociadas[j].ImprimirCuenta();
                    }
                }
            }
        }*/
                   
    }//GEN-LAST:event_btt_crearUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_crearUsuario1;
    private javax.swing.JButton btt_regresar;
    private javax.swing.JComboBox<String> cbx_cuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}