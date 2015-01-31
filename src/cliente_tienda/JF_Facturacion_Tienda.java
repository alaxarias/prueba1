

package cliente_tienda;
import Logica.Factura;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Logica.conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author German Pulgarin Alex Arias
 */
public class JF_Facturacion_Tienda extends javax.swing.JFrame {

    String [][]data={};
    String [] cabecera={"cod_cliente","descripcion","cantidad","Subtotal"};
    DefaultTableModel md;
    ArrayList<Factura> datos=new ArrayList<Factura>();
    
    public JF_Facturacion_Tienda() {
        initComponents();
        md=new DefaultTableModel(data,cabecera);
        tbl_Datos_Clientes.setModel(md);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        TXTcantidad = new javax.swing.JTextField();
        BTNguardar = new javax.swing.JButton();
        BTNsalir = new javax.swing.JButton();
        BTNnuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Datos_Clientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BTNborrarcte = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        BTN_pagar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();
        comprobarCliente = new javax.swing.JButton();
        respuestaCliente = new javax.swing.JLabel();
        codigoArticulo = new javax.swing.JTextField();
        respuestaArticulo = new javax.swing.JLabel();
        comprobarArticulo = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        Jcliente = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        Jarticulos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        Jfacturacion = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Jacerca = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Facturacion");

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));

        BTNguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNguardar.setText("Agregar");
        BTNguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNguardarActionPerformed(evt);
            }
        });

        BTNsalir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNsalir.setText("Salir");
        BTNsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNsalirActionPerformed(evt);
            }
        });

        BTNnuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNnuevo.setText("Nuevo");
        BTNnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNnuevoActionPerformed(evt);
            }
        });

        tbl_Datos_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cod cliente", "Descripcion", "Cantidad", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(tbl_Datos_Clientes);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Codigo cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Codigo articulo");

        BTNborrarcte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTNborrarcte.setText("Borrar cte");
        BTNborrarcte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNborrarcteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Factuacion_Tienda_Alex_German");

        BTN_pagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BTN_pagar.setText("Pagar");
        BTN_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_pagarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Total");

        jLabel6.setText(" ");

        codigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoClienteActionPerformed(evt);
            }
        });

        comprobarCliente.setText("comprobar");
        comprobarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarClienteActionPerformed(evt);
            }
        });

        comprobarArticulo.setText("comprobar");
        comprobarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprobarArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_pagar)
                .addGap(71, 71, 71))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(respuestaCliente)
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(codigoArticulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(codigoCliente, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comprobarCliente)
                                    .addComponent(comprobarArticulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTNguardar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(BTNsalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTNnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTNborrarcte, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(respuestaArticulo)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel7))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNnuevo)
                    .addComponent(jLabel1)
                    .addComponent(BTNborrarcte)
                    .addComponent(codigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comprobarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNguardar)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(respuestaCliente)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(codigoArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comprobarArticulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(respuestaArticulo))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TXTcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTNsalir))
                            .addComponent(jLabel3))))
                .addGap(48, 48, 48)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BTN_pagar)
                .addGap(40, 40, 40))
        );

        Jcliente.setText("Cliente");

        jMenuItem1.setText("Frclientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Jcliente.add(jMenuItem1);

        jMenuItem2.setText("ListClientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Jcliente.add(jMenuItem2);

        jMenuBar3.add(Jcliente);

        Jarticulos.setText("Articulos");

        jMenuItem3.setText("FrArticulos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Jarticulos.add(jMenuItem3);

        jMenuItem4.setText("ListArticulos");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Jarticulos.add(jMenuItem4);

        jMenuBar3.add(Jarticulos);

        Jfacturacion.setText("Facturacion");

        jMenuItem5.setText("ForFacturacion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Jfacturacion.add(jMenuItem5);

        jMenuItem6.setText("ListVentas");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Jfacturacion.add(jMenuItem6);

        jMenuBar3.add(Jfacturacion);

        Jacerca.setText("Acerca De");

        jMenuItem7.setText("Conozcanos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Jacerca.add(jMenuItem7);

        jMenuItem8.setText("Version");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Jacerca.add(jMenuItem8);

        jMenuBar3.add(Jacerca);

        jMenu1.setText("Salir");

        jMenuItem9.setText("Salir");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem9);

        jMenuBar3.add(jMenu1);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JF_tienda Cliente=new JF_tienda();

        try{

            Cliente =new  JF_tienda();

        }
        catch(Exception ex)
        {
            Logger.getLogger(JF_tienda.class.getName()).log(Level.SEVERE,null,ex);
        }
        Cliente.setLocationRelativeTo(null);
        Cliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:

        JF_producto_tienda articu=new JF_producto_tienda();

        try{

            articu=new JF_producto_tienda();

        }
        catch(Exception ex)
        {
            Logger.getLogger(JF_tienda.class.getName()).log(Level.SEVERE,null,ex);
        }
        articu.setLocationRelativeTo(null);
        articu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        conexion lista=new conexion();
        JOptionPane.showMessageDialog(null,lista.listaArticulo());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        JF_Facturacion_Tienda Fact=new JF_Facturacion_Tienda();

        try{

            Fact =new  JF_Facturacion_Tienda();

        }
        catch(Exception ex)
        {
            Logger.getLogger(JF_tienda.class.getName()).log(Level.SEVERE,null,ex);
        }
        Fact.setLocationRelativeTo(null);
        Fact.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
          try {
            // TODO add your handling code here:
            JF_acerca_de_tienda acerca=new JF_acerca_de_tienda();
            
            try{
                
                acerca =new JF_acerca_de_tienda();
                
            }
            catch(IOException ex)
            {
                Logger.getLogger(JF_acerca_de_tienda.class.getName()).log(Level.SEVERE,null,ex);
            }
            acerca.setLocationRelativeTo(null);
            acerca.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(JF_tienda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        JF_Version Version=new JF_Version();

        try{

            Version=new JF_Version();

        }
        catch(Exception ex)
        {
            Logger.getLogger(JF_Version.class.getName()).log(Level.SEVERE,null,ex);
        }
        Version.setLocationRelativeTo(null);
        Version.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        conexion lista=new conexion();
        JOptionPane.showMessageDialog(null,lista.listaClientes());
        //copiar esta instruccion en todas las demas JFrame
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        conexion lista=new conexion();
        JOptionPane.showMessageDialog(null,lista.listaFactura());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void BTNborrarcteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNborrarcteActionPerformed
        // TODO add your handling code here:
        int borrar = tbl_Datos_Clientes.getSelectedRowCount();
        if(borrar>0){
            md.removeRow(borrar-1);
            JOptionPane.showMessageDialog(null, "Dato borrado satisfactoriamente");
        } else{
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }//GEN-LAST:event_BTNborrarcteActionPerformed

    private void BTNnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNnuevoActionPerformed
        // TODO add your handling code here:
        
        TXTcantidad.setText(" ");
    }//GEN-LAST:event_BTNnuevoActionPerformed

    private void BTNsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNsalirActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_BTNsalirActionPerformed

    private void BTNguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNguardarActionPerformed
        // TODO add your handling code here:
         String cantidad=TXTcantidad.getText();
         String cliente=this.codigoCliente.getText();
         String articulo=this.codigoArticulo.getText();
         String descripcion="";
         double subTotal=0.0;
         
        conexion infoRecibo=new conexion();
        Factura factura;
        factura=infoRecibo.infoFactura(cliente, articulo, cantidad);
        
        String []datos={factura.getCodCliente(),factura.getDescripcion(),factura.getCantidad(),"'"+factura.getSubtotal()+"'"};
        md.addRow(datos);
        this.datos.add(factura);

    }//GEN-LAST:event_BTNguardarActionPerformed

    private void codigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoClienteActionPerformed
        
    }//GEN-LAST:event_codigoClienteActionPerformed

    private void comprobarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarClienteActionPerformed
         conexion cliente=new conexion();
         respuestaCliente.setText(""+cliente.getCliente(codigoCliente.getText()));
    }//GEN-LAST:event_comprobarClienteActionPerformed

    private void comprobarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprobarArticuloActionPerformed
        conexion articulo=new conexion();
         respuestaArticulo.setText(""+articulo.getArticulo(codigoArticulo.getText()));
    }//GEN-LAST:event_comprobarArticuloActionPerformed

    private void BTN_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_pagarActionPerformed
        conexion factura=new conexion();
        
        for(int i=0;i<datos.size();i++)
        {
          factura.InsertarFactura(datos.get(i));
        }
        
        datos.clear();
    }//GEN-LAST:event_BTN_pagarActionPerformed

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
            java.util.logging.Logger.getLogger(JF_Facturacion_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_Facturacion_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_Facturacion_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_Facturacion_Tienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_Facturacion_Tienda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_pagar;
    private javax.swing.JButton BTNborrarcte;
    private javax.swing.JButton BTNguardar;
    private javax.swing.JButton BTNnuevo;
    private javax.swing.JButton BTNsalir;
    private javax.swing.JMenu Jacerca;
    private javax.swing.JMenu Jarticulos;
    private javax.swing.JMenu Jcliente;
    private javax.swing.JMenu Jfacturacion;
    private javax.swing.JTextField TXTcantidad;
    private javax.swing.JTextField codigoArticulo;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JButton comprobarArticulo;
    private javax.swing.JButton comprobarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel respuestaArticulo;
    private javax.swing.JLabel respuestaCliente;
    private javax.swing.JTable tbl_Datos_Clientes;
    // End of variables declaration//GEN-END:variables
}
