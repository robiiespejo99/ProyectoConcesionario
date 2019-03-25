package View;

import java.sql.SQLException;

import Cotroller.Conexion;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
//import mysql_test.MySQL;
//import mysql_test.Window;
//import mysql_test.Window_Delete;
//import mysql_test.Window_Register;



public class Window extends javax.swing.JFrame {

    //Conexion db = new Conexion();

    public Window() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonConnect = new javax.swing.JButton();
        jButtonRegistrarCompra = new javax.swing.JButton();
        jButtonObtenerRegistro = new javax.swing.JButton();
        jButtonRegistrarVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonConnect.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonConnect.setText("Conectar a base de Datos");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtonRegistrarCompra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonRegistrarCompra.setText("Registrar Compra");
        jButtonRegistrarCompra.setEnabled(false);
        jButtonRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jButtonObtenerRegistro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonObtenerRegistro.setText("Obtener Registros");
        jButtonObtenerRegistro.setEnabled(false);
        jButtonObtenerRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButtonGetActionPerformed(evt);
            }
        });

        jButtonRegistrarVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jButtonRegistrarVenta.setText("Registrar Venta");
        jButtonRegistrarVenta.setEnabled(false);
        jButtonRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jButtonConnect, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jButtonRegistrarCompra, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(0, 0, Short.MAX_VALUE))
        				.addComponent(jButtonRegistrarVenta, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        				.addComponent(jButtonObtenerRegistro, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jButtonConnect)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonRegistrarCompra)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jButtonRegistrarVenta)
        			.addGap(18)
        			.addComponent(jButtonObtenerRegistro)
        			.addContainerGap(18, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
        /*
         db.MySQLConnection("root", "", "");
         db.createDB("MySQL_Test");
         db.createTable("Registros");
         */
    	
       // db.Conexion();
        jButtonConnect.setEnabled(false);
        jButtonRegistrarVenta.setEnabled(true);
        jButtonObtenerRegistro.setEnabled(true);
        jButtonRegistrarCompra.setEnabled(true);
       /* try {
			db.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        Window_RegistrarCompra wr = new Window_RegistrarCompra();
        wr.setVisible(true);
    }//GEN-LAST:event_jButtonRegisterActionPerformed

   private void jButtonGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGetActionPerformed
    	//db.Conexion();
       // db.getValues("Registros");
       
			/*try {
				db.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
    }//GEN-LAST:event_jButtonGetActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        Window_Delete wd = new Window_Delete();
        wd.setVisible(true);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonRegistrarVenta;
    private javax.swing.JButton jButtonObtenerRegistro;
    private javax.swing.JButton jButtonRegistrarCompra;
    // End of variables declaration//GEN-END:variables
}
