/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;


import Cotroller.Conexion;
import Modell.Cliente;
import Modell.Empleado;
import Modell.Venta;
import Modell.detalleVenta;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;

/**
 *
 * @author Antony
 */
public class Window_RegistrarVenta extends javax.swing.JFrame {
	Conexion db = new Conexion();
    public Window_RegistrarVenta() {
    	
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        LabelNombreCliente = new javax.swing.JLabel();
        jTextFieldNombreCliente = new javax.swing.JTextField();
        RegistrarVenta = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Venta");
        setResizable(false);

        LabelNombreCliente.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        LabelNombreCliente.setText("Nombre Cliente:");

        jTextFieldNombreCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        RegistrarVenta.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        RegistrarVenta.setText("Registrar Venta");
        RegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEraseActionPerformed(evt);
            }
        });

        jButtonCancel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        
        jTextFieldApellidoCliente = new JTextField();
        jTextFieldApellidoCliente.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        jTextFieldDireccionCliente = new JTextField();
        jTextFieldDireccionCliente.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        JLabel LabelApellidoCliente = new JLabel();
        LabelApellidoCliente.setText("Apellido Cliente :");
        LabelApellidoCliente.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        JLabel LabelDireccionCliente = new JLabel();
        LabelDireccionCliente.setText("Direccion Cliente :");
        LabelDireccionCliente.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        JLabel LabelTelefonoCliente = new JLabel();
        LabelTelefonoCliente.setText("Telefono Cliente :");
        LabelTelefonoCliente.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        jTextFieldTelefonoCliente = new JTextField();
        jTextFieldTelefonoCliente.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        jTextFieldFechaVenta = new JTextField();
        jTextFieldFechaVenta.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        LabelFechaVenta = new JLabel();
        LabelFechaVenta.setText("Fecha Venta :");
        LabelFechaVenta.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        jTextFieldPrecioAuto = new JTextField();
        jTextFieldPrecioAuto.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        LabelPrecioAuto = new JLabel();
        LabelPrecioAuto.setText("Precio Auto :");
        LabelPrecioAuto.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        jTextFieldNombreEmpleado = new JTextField();
        jTextFieldNombreEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        jTextFieldApellidoEmpleado = new JTextField();
        jTextFieldApellidoEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        jTextFieldCargoEmpleado = new JTextField();
        jTextFieldCargoEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        LableNombreEmpleado = new JLabel();
        LableNombreEmpleado.setText("Nombre Empleado :");
        LableNombreEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        LableApellidoEmpleado = new JLabel();
        LableApellidoEmpleado.setText("Apellido Empleado :");
        LableApellidoEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        LableCargoEmpleado = new JLabel();
        LableCargoEmpleado.setText("Cargo Empleado :");
        LableCargoEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        LabelCantidadAuto = new JLabel();
        LabelCantidadAuto.setText("CantidadAuto :");
        LabelCantidadAuto.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        jTextFieldCantidadAuto = new JTextField();
        jTextFieldCantidadAuto.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        jTextFieldDescuentoAuto = new JTextField();
        jTextFieldDescuentoAuto.setFont(new Font("Century Gothic", Font.PLAIN, 12));
        
        LabelDescuentoAuto = new JLabel();
        LabelDescuentoAuto.setText("Descuento Auto :");
        LabelDescuentoAuto.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        LabelTelefonoEmpleado = new JLabel();
        LabelTelefonoEmpleado.setText("Telefono Empleado :");
        LabelTelefonoEmpleado.setFont(new Font("Century Gothic", Font.BOLD, 14));
        
        jTextFieldTelefonoEmpleado = new JTextField();
        jTextFieldTelefonoEmpleado.setFont(new Font("Century Gothic", Font.PLAIN, 12));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(LabelNombreCliente, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
        							.addComponent(jTextFieldNombreCliente, 206, 206, 206))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(LabelDireccionCliente, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        								.addComponent(LabelApellidoCliente, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextFieldDireccionCliente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextFieldApellidoCliente, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        									.addComponent(LabelFechaVenta, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        									.addComponent(LabelPrecioAuto, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
        								.addComponent(LabelTelefonoCliente, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jTextFieldPrecioAuto, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextFieldFechaVenta, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jTextFieldTelefonoCliente, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(55)
        					.addComponent(RegistrarVenta)
        					.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
        					.addComponent(jButtonCancel))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(LableNombreEmpleado, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        					.addComponent(jTextFieldNombreEmpleado, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(LableApellidoEmpleado, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        						.addComponent(LabelTelefonoEmpleado, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        							.addComponent(jTextFieldApellidoEmpleado, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(18)
        							.addComponent(jTextFieldTelefonoEmpleado, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(LableCargoEmpleado, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        					.addComponent(jTextFieldCargoEmpleado, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(LabelCantidadAuto, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addComponent(jTextFieldCantidadAuto, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(LabelDescuentoAuto, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        					.addComponent(jTextFieldDescuentoAuto, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LabelNombreCliente)
        				.addComponent(jTextFieldNombreCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldApellidoCliente, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelApellidoCliente, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldDireccionCliente, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelDireccionCliente, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldTelefonoCliente, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelTelefonoCliente, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldFechaVenta, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelFechaVenta, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldPrecioAuto, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelPrecioAuto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldNombreEmpleado, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LableNombreEmpleado, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextFieldApellidoEmpleado, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(LableApellidoEmpleado, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(LabelTelefonoEmpleado, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jTextFieldTelefonoEmpleado, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldCargoEmpleado, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LableCargoEmpleado, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LabelCantidadAuto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jTextFieldCantidadAuto, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jTextFieldDescuentoAuto, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
        				.addComponent(LabelDescuentoAuto, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButtonCancel)
        				.addComponent(RegistrarVenta))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEraseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEraseActionPerformed
       
     
    	Cliente cliente = new Cliente(jTextFieldNombreCliente.getText(), jTextFieldApellidoCliente.getText(), jTextFieldDireccionCliente.getText(),Integer.parseInt(jTextFieldTelefonoCliente.getText()));
    	Empleado empleado = new Empleado(jTextFieldNombreEmpleado.getText(), jTextFieldApellidoEmpleado.getText(), jTextFieldCargoEmpleado.getText(), Integer.parseInt(jTextFieldTelefonoEmpleado.getText()));
    	Venta venta = new Venta(jTextFieldFechaVenta.getText(), Integer.parseInt(jTextFieldPrecioAuto.getText()));
        detalleVenta detalleventa = new detalleVenta(Integer.parseInt(jTextFieldCantidadAuto.getText()), Integer.parseInt(jTextFieldDescuentoAuto.getText()));
        
        Cotroller.Cliente.insert(cliente, db);
        Cotroller.Empleado.insert(empleado, db);
        
        Cotroller.Venta.insert(venta, db, empleado, cliente);
        Cotroller.detalleVenta.insert(detalleventa, db, venta);
        
       this.dispose();
    }

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
     this.dispose();
    }

    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_RegistrarVenta().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton RegistrarVenta;
    private javax.swing.JLabel LabelNombreCliente;
    private javax.swing.JTextField jTextFieldNombreCliente;
    private JTextField jTextFieldApellidoCliente;
    private JTextField jTextFieldDireccionCliente;
    private JTextField jTextFieldTelefonoCliente;
    private JTextField jTextFieldFechaVenta;
    private JLabel LabelFechaVenta;
    private JTextField jTextFieldPrecioAuto;
    private JLabel LabelPrecioAuto;
    private JTextField jTextFieldNombreEmpleado;
    private JTextField jTextFieldApellidoEmpleado;
    private JTextField jTextFieldCargoEmpleado;
    private JLabel LableNombreEmpleado;
    private JLabel LableApellidoEmpleado;
    private JLabel LableCargoEmpleado;
    private JLabel LabelCantidadAuto;
    private JTextField jTextFieldCantidadAuto;
    private JTextField jTextFieldDescuentoAuto;
    private JLabel LabelDescuentoAuto;
    private JLabel LabelTelefonoEmpleado;
    private JTextField jTextFieldTelefonoEmpleado;
}
