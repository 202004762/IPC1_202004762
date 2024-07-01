public class Deposito extends javax.swing.JFrame {

    crearCliente fp = new crearCliente();
    
    public Deposito() {
        
        initComponents();
        initComponents2();
        this.setTitle("Depositar a cuenta");        
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
                for(int j=0; j<fp.listaClientes[i].asociadas.length;j++){
                    if(fp.listaClientes[i].asociadas[j]!=null){
                        cbx_cuentas.addItem(datosTemporales[i].asociadas[j].id+" - Cuenta de "+datosTemporales[i].nombre+" "+datosTemporales[i].apellido+" CUI "+datosTemporales[i].cui);
                    }        
                }
            }
        }
        
    }
    
    public void initComponents2(){
    
        setLocationRelativeTo(null);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_cuentas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_monto = new javax.swing.JTextField();
        btt_aceptar = new javax.swing.JButton();
        btt_regresar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Monto");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 170, 50, 30);

        cbx_cuentas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(cbx_cuentas);
        cbx_cuentas.setBounds(70, 70, 300, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cuenta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(190, 40, 60, 30);

        txt_monto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_monto);
        txt_monto.setBounds(70, 200, 300, 30);

        btt_aceptar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_aceptar.setText("Aceptar");
        btt_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_aceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btt_aceptar);
        btt_aceptar.setBounds(260, 280, 110, 40);

        btt_regresar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btt_regresar1.setText("Regresar");
        btt_regresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_regresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btt_regresar1);
        btt_regresar1.setBounds(70, 280, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_regresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_regresar1ActionPerformed
        
        this.setVisible(false);
        new Opciones().setVisible(true);        
        
    }//GEN-LAST:event_btt_regresar1ActionPerformed

    private void btt_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_aceptarActionPerformed
        
        int IDcuentas = cbx_cuentas.getSelectedIndex();
        double montoDeposito = Double.parseDouble(txt_monto.getText());
        
        for(int i=0;i<fp.listaClientes.length;i++){
            if(fp.listaClientes[i]!=null){
                for(int j=0; j<fp.listaClientes[i].asociadas.length;j++){
                    if(fp.listaClientes[i].asociadas[j]!=null){
                        fp.listaClientes[i].asociadas[j].ImprimirCuenta();
                    }
                }
            }
        }
        
        if(montoDeposito<=0){
            System.out.println("error");
        }else{
            for(int i=0;i<fp.listaClientes.length;i++){
                if(fp.listaClientes[i]!=null){
                    if(fp.listaClientes[i].cui==fp.listaClientes[IDcuentas].cui){
                       for(int j=0;j<fp.listaClientes[i].asociadas.length;j++){
                            if(fp.listaClientes[i].asociadas[j]!=null){
                                if(fp.listaClientes[i].asociadas[j].clientedpi==fp.listaClientes[i].asociadas[IDcuentas].id){
                                    fp.listaClientes[i].asociadas[j].saldo+= montoDeposito;
                                }
                            }
                        }
                    }   
                }
            } 
        }
        
        /*for(int i=0;i<fp.listaClientes.length;i++){
            if(fp.listaClientes[i]!=null){
                if(fp.listaClientes[i].cui!=0){
                    for(int j=0;j<fp.listaClientes[i].asociadas.length;j++){
                        if(fp.listaClientes[i].asociadas[j]!=null){
                            if(fp.listaClientes[i].asociadas[j].id==fp.listaClientes[i].asociadas[IDcuentas].id){
                                fp.listaClientes[i].asociadas[j].saldo+= montoDeposito;
                            }
                        }
                    }
                }
            }
        }  */
        
        for(int i=0;i<fp.listaClientes.length;i++){
            if(fp.listaClientes[i]!=null){
                for(int j=0; j<fp.listaClientes[i].asociadas.length;j++){
                    if(fp.listaClientes[i].asociadas[j]!=null){
                        fp.listaClientes[i].asociadas[j].ImprimirCuenta();
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btt_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_aceptar;
    private javax.swing.JButton btt_regresar1;
    private javax.swing.JComboBox<String> cbx_cuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_monto;
    // End of variables declaration//GEN-END:variables


}