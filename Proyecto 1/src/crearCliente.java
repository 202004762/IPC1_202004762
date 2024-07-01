import javax.swing.JOptionPane;


public class crearCliente extends javax.swing.JFrame {
    
    public static Cliente[]listaClientes=new Cliente[5];

    public crearCliente() {
        
        initComponents();
        initComponents2();
        this.setTitle("Crear cliente");
        
    }
    
    public void initComponents2(){
    
        setLocationRelativeTo(null);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cui = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        btt_crear = new javax.swing.JButton();
        btt_regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 300));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("CUI");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 30, 30, 30);

        txt_cui.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_cui);
        txt_cui.setBounds(60, 60, 280, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 100, 50, 30);

        txt_nombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_nombre);
        txt_nombre.setBounds(60, 130, 280, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 170, 50, 30);

        txt_apellido.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPanel1.add(txt_apellido);
        txt_apellido.setBounds(60, 200, 280, 30);

        btt_crear.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btt_crear.setText("Crear");
        btt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_crearActionPerformed(evt);
            }
        });
        jPanel1.add(btt_crear);
        btt_crear.setBounds(230, 250, 100, 25);

        btt_regresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btt_regresar.setText("Regresar");
        btt_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_regresarActionPerformed(evt);
            }
        });
        jPanel1.add(btt_regresar);
        btt_regresar.setBounds(70, 250, 100, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_regresarActionPerformed
        
        this.setVisible(false);
        new Opciones().setVisible(true);        
        
    }//GEN-LAST:event_btt_regresarActionPerformed

    private void btt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_crearActionPerformed
        
        Cliente nuevoCliente = new Cliente(Integer.parseInt(txt_cui.getText()), txt_nombre.getText(), txt_apellido.getText());

        boolean bandera = false;
        for(int i=0;i<listaClientes.length;i++){
            if(listaClientes[i]==null){
                listaClientes[i]=nuevoCliente;
                bandera = true;
                JOptionPane.showMessageDialog(null, "Cliente creado exitosamente", "Informacion", JOptionPane.INFORMATION_MESSAGE);
                break;
            }else{
                if(Integer.parseInt(txt_cui.getText())==listaClientes[i].cui){
                    JOptionPane.showMessageDialog(null, "No se pueden crear clientes con CUI duplicados. El CUI ingresado ya existe en el sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    break;
                }
            }
        }
        
        if(bandera==false){
            JOptionPane.showMessageDialog(null, "No es posible crear más clientes", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }

        //VER CLIENTES CREADOS
        /*for(int i=0;i<listaClientes.length;i++){
            if(listaClientes[i]!=null){
                listaClientes[i].imprimir();
            }
        }*/

        txt_cui.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        
        
        
    }//GEN-LAST:event_btt_crearActionPerformed

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
            java.util.logging.Logger.getLogger(crearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_crear;
    private javax.swing.JButton btt_regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cui;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}