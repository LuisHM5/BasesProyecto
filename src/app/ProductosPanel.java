package app;
import conn.Conexion;
import AccesoOB.ProductoOBJ;
import AccesoDATABASE.VentasOBJ;
import setgetters.Ventas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductosPanel extends javax.swing.JPanel {
    DefaultTableModel m;
    public static int idprod=0;
    public ProductosPanel() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProductosOrdenes = new javax.swing.JTable();
        btnActualizarPO = new javax.swing.JButton();
        txtNombre1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantOrdenar = new javax.swing.JTextField();
        btnAgregarOrden = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtNombre.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N

        jTextField1.setText("jTextField1");

        setBackground(new java.awt.Color(172, 133, 93));

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tbProductosOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProductosOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProductosOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProductosOrdenes);

        btnActualizarPO.setText("Actualizar");
        btnActualizarPO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnActualizarPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPOActionPerformed(evt);
            }
        });

        txtNombre1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtNombre1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel7.setText("Nombre:");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel10.setText("Cantidad");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel11.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel11.setText("Ordenar:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCantOrdenar.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        txtCantOrdenar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnAgregarOrden.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregarOrden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cart-regular-24_1.png"))); // NOI18N
        btnAgregarOrden.setText("Agregar Orden");
        btnAgregarOrden.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAgregarOrden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarOrdenMouseClicked(evt);
            }
        });
        btnAgregarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnActualizarPO)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnAgregarOrden)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnActualizarPO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtCantOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnActualizarPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPOActionPerformed
        Conexion conn = new Conexion(); 
        ProductoOBJ pdtobj = new ProductoOBJ();
        pdtobj.listarProductosOrdenes(conn, tbProductosOrdenes);
    }//GEN-LAST:event_btnActualizarPOActionPerformed

    private void btnAgregarOrdenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarOrdenMouseClicked

        Conexion conn = new Conexion(); 
        Ventas vent = new Ventas();
        VentasOBJ vntobj = new VentasOBJ();
        vntobj.agregarVenta(conn, vent);
    }//GEN-LAST:event_btnAgregarOrdenMouseClicked

    private void btnAgregarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarOrdenActionPerformed
        String mensaje = "";
        int fsel = tbProductosOrdenes.getSelectedRow();
        try {
            String id, nombre, precio, cantidadStock,importe;
            double calcula=0.0, x = 0.0;
            int cantidadOrd=0;
            
            if(fsel==-1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                m =(DefaultTableModel) tbProductosOrdenes.getModel();
                nombre = tbProductosOrdenes.getValueAt(fsel, 1).toString();
                precio = tbProductosOrdenes.getValueAt(fsel, 3).toString();
                cantidadOrd = Integer.parseInt(txtCantOrdenar.getText());
                if(cantidadOrd>0)
                {
                    x = (Double.parseDouble(precio) * cantidadOrd);
                    importe = String.valueOf(x);

                    PanelOrdenes tabla = new PanelOrdenes();
                    Conexion conn = new Conexion();

                    VentasOBJ vntobj = new VentasOBJ();
                    Ventas vent = new Ventas();
                    
                    vent.setIdprodc(idprod);
                    vent.setNombre(nombre);
                    vent.setPrecio(x);
                    vent.setCantidad(cantidadOrd);
                    mensaje=vntobj.agregarVenta(conn, vent);
                    JOptionPane.showMessageDialog(null,mensaje);

                    txtNombre1.setText(""); 
                    txtCantOrdenar.setText(""); 
                    //m = (DefaultTableModel) tabla.Tabla_Ventas.getModel();
                    //String filaElemento[] = {id,nombre,cantidadOrd,precio};
                    //m.addRow(filaElemento);                           
                }else
                {
                    JOptionPane.showMessageDialog(null, "Cantidad incorrecta","Error",JOptionPane.ERROR_MESSAGE); 
                }                                     
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verificacion de seleccion de producto","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarOrdenActionPerformed

    private void txtNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre1ActionPerformed

    private void tbProductosOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductosOrdenesMouseClicked
        m =(DefaultTableModel) tbProductosOrdenes.getModel();
        int fsel = tbProductosOrdenes.getSelectedRow();
        idprod=Integer.parseInt(tbProductosOrdenes.getValueAt(fsel, 0).toString());
        txtNombre1.setText(tbProductosOrdenes.getValueAt(fsel, 1).toString());
    }//GEN-LAST:event_tbProductosOrdenesMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPO;
    private javax.swing.JButton btnAgregarOrden;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTable tbProductosOrdenes;
    private javax.swing.JTextField txtCantOrdenar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    // End of variables declaration//GEN-END:variables
}
