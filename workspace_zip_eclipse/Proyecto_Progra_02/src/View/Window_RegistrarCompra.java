package View;

import java.sql.SQLException;
import Cotroller.Conexion;
import Modell.Compra;
import Modell.detalleCompra;
import Modell.Proveedor;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JTextField;
import java.awt.Font;

public class Window_RegistrarCompra extends javax.swing.JFrame {
	Conexion db = new Conexion();
    public Window_RegistrarCompra() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombreProveedor = new javax.swing.JTextField();
        jTextFieldPaisProveedor = new javax.swing.JTextField();
        jTextFieldCantidad = new javax.swing.JTextField();
        jTextFieldFechaCompra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonRegister = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuario");
        setResizable(false);

        jTextFieldNombreProveedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldPaisProveedor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldCantidad.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTextFieldFechaCompra.setFont(new java.awt.Font("Century Gothic", 0, 12));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE PROVEEDOR :");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("PAIS PROVEEDOR : ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("FECHA DE COMPRA : ");

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("PRECIO UNITARIO : ");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("CANTIDAD : ");

        jButtonRegister.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonRegister.setText("Registrar");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        
        jTextFieldPrecioUnitario = new JTextField();
        jTextFieldPrecioUnitario.setFont(new Font("Century Gothic", Font.PLAIN, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel6)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldPrecioUnitario, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jLabel7)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldCantidad, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jButtonRegister, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(jButtonCancel))
        				.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(jLabel3)
        						.addPreferredGap(ComponentPlacement.RELATED)
        						.addComponent(jTextFieldNombreProveedor))
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jLabel5)
        							.addComponent(jLabel4))
        						.addGap(18)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(jTextFieldFechaCompra, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        							.addComponent(jTextFieldPaisProveedor, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
        						.addGap(62))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldNombreProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldPaisProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(jTextFieldFechaCompra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel6)
        				.addComponent(jTextFieldCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldPrecioUnitario, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonRegister)
        				.addComponent(jButtonCancel))
        			.addContainerGap(13, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed

        
          
        Proveedor proveedor = new Proveedor(jTextFieldNombreProveedor.getText(), jTextFieldPaisProveedor.getText());
        Compra compra = new Compra(jTextFieldFechaCompra.getText(), Integer.parseInt(jTextFieldPrecioUnitario.getText()));
        detalleCompra detallecompra = new detalleCompra(Integer.parseInt(jTextFieldCantidad.getText()));
     
      //  db.Conexion();
        
        Cotroller.Proveedor.insert(proveedor, db);
        Cotroller.Compra.insert(compra, db);
        Cotroller.detalleCompra.insert(detallecompra, db);
        
        
      /*  Cotroller.Proveedor.list(db);
        Cotroller.Compra.list(db);
        Cotroller.detalleCompra.list(db);
        */
       // Cotroller.Auto.insert(auto, db);
      /*  auto.("Registros", jTextFieldID.getText(),
                jTextFieldNombre.getText(),
                jTextFieldApellido.getText(),
                jTextFieldEdad.getText(),
                jComboBoxSexo.getSelectedItem().toString());*/
        
     /*   try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
        this.dispose();
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Window_RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_RegistrarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    
    private javax.swing.JTextField jTextFieldFechaCompra;
    private javax.swing.JTextField jTextFieldCantidad;
    private javax.swing.JTextField jTextFieldNombreProveedor;
    private javax.swing.JTextField jTextFieldPaisProveedor;
    private javax.swing.JTextField jTextFieldPrecioUnitario;
}
