
package app;
import AccesoDATABASE.VentasOBJ;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import conn.Conexion;
import AccesoOB.ProductoOBJ;
public class PanelOrdenes extends javax.swing.JPanel {
    public PanelOrdenes() {
        initComponents();
    }
    DefaultTableModel m;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Ventas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        txtCantAdd = new javax.swing.JTextField();
        txtCambio = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Total:");

        Tabla_Ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Tabla_Ventas);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 24)); // NOI18N
        jLabel2.setText("Cantidad a dar:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel3.setText("Su cambio:");

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCantAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtCambio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnActualizar.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("btnCancelarlar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnComprar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnCancelar)
                        .addGap(75, 75, 75)
                        .addComponent(btnComprar)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(467, 467, 467))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizarTablaVentas(Tabla_Ventas);
        mostrarTotal(Tabla_Ventas, txtTotal);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        String mensaje="";
        Conexion conn = new Conexion();
        VentasOBJ vntobj = new VentasOBJ();
        
        mensaje=vntobj.cancelarVentas(conn);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        double total=0;
        double cantidadDar=0;
        double cambio=0;

        if(txtTotal.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Ingrese todos los campos","Error",JOptionPane.ERROR_MESSAGE); 
        }else
        {
            try {
                total=Double.parseDouble(txtTotal.getText());
                cantidadDar=Double.parseDouble(txtCantAdd.getText()); 
                if(total<=cantidadDar)
                {
                    cambio=cantidadDar-total;
                    //Otra forma
                    //txtCambio.setText(cambio+"");
                    txtCambio.setText(Double.toString(cambio));
                    
                    Conexion conn = new Conexion();
                    VentasOBJ vntobj = new VentasOBJ();

                    
                    ProductoOBJ pdt = new ProductoOBJ();
                    
                    int cantidadActual=0,cantidadRestar=0,cantidadfinal=0,idproductos;
                    
                    m=(DefaultTableModel) Tabla_Ventas.getModel();
                    
                    int fila=Tabla_Ventas.getRowCount();
                    String [][] ventas = new String[100][100];
                    ventas=vntobj.rescatarVentas(conn);
                    boolean stockCorrecto=true;
                    for(int i=0; i<fila; i++)
                    {  
                       idproductos=Integer.parseInt(ventas[4][i]);
                       cantidadRestar=Integer.parseInt(ventas[2][i]);
                       String producto []= new String[5];
                       producto=pdt.buscarProducto(conn, idproductos);                       
                       cantidadActual=Integer.parseInt(producto[3]);
                       cantidadfinal=cantidadActual-cantidadRestar;
                                            
                       if(cantidadfinal<0)
                       {
                           stockCorrecto=false;
                           JOptionPane.showMessageDialog(null,producto[1]+" sin Stock!");
                       }                     
                    }
                    if(stockCorrecto)
                    {
                        for(int i=0; i<fila; i++)
                        {  
                            idproductos=Integer.parseInt(ventas[4][i]);
                            cantidadRestar=Integer.parseInt(ventas[2][i]);
                            String producto []= new String[5];
                            producto=pdt.buscarProducto(conn, idproductos);                       
                            cantidadActual=Integer.parseInt(producto[3]);
                            cantidadfinal=cantidadActual-cantidadRestar;
                            pdt.agregarStock(conn, idproductos, cantidadfinal);                            
                        } 
                        JOptionPane.showMessageDialog(null, "Compra exitosa");
                        vntobj.cancelarVentas(conn);
                        actualizarTablaVentas(Tabla_Ventas); 

                    }else
                    {
                        JOptionPane.showMessageDialog(null, "Compra rechazada:\nfalta de productos","",JOptionPane.WARNING_MESSAGE);
                        vntobj.cancelarVentas(conn);
                        actualizarTablaVentas(Tabla_Ventas);                     
                    }
                    txtCambio.setText("");
                    txtTotal.setText("");
                    txtCantAdd.setText("");
                  

                }else
                {
                    JOptionPane.showMessageDialog(null, "Ingrese mas dinero");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Datos incorrectos","Error",JOptionPane.ERROR_MESSAGE); 
            }           
        }
    }//GEN-LAST:event_btnComprarMouseClicked
    
    public void mostrarTotal(JTable tabla, JTextField t){
        DefaultTableModel modelo;      
        modelo =(DefaultTableModel) tabla.getModel();
        int fila=tabla.getRowCount();
        double total=0;
        for(int i=0; i<fila; i++)
        {
           total+=Double.parseDouble(tabla.getValueAt(i, 3).toString());
        }
        t.setText(Double.toString(total));    
        //t.setText(Double.toString(precio));        
    }
    public void actualizarTablaVentas(JTable tabla){
        DefaultTableModel modelo; 
        Conexion conn = new Conexion();
        VentasOBJ vntobj = new VentasOBJ();
        vntobj.listarVentas(conn, tabla);
        
        modelo =(DefaultTableModel) tabla.getModel();
        String [] columnas = {"ID","NOMBRE","CANTIDAD","IMPORTE"};
        modelo.setColumnIdentifiers(columnas);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Tabla_Ventas;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtCantAdd;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
