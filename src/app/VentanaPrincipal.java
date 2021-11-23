package app;

//import AccesoDATABASE.VentasOBJ;
import AccesoOB.ProductoOBJ;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import conn.Conexion;
        
public class VentanaPrincipal extends javax.swing.JFrame {
    
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        pnlAdminProductos.setVisible(false);
    }
    static boolean maximized=false;
    static boolean expand=false;    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pnlSuperior = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        lblMaximizar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        pnlLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JPanel();
        lblHome6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        lblHome2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnOrdenes = new javax.swing.JPanel();
        lblHome3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExportar = new javax.swing.JPanel();
        lblHome5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAdminProcutos = new javax.swing.JPanel();
        lblHome4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnlAdminProductos = new javax.swing.JPanel();
        btnAddStock = new javax.swing.JPanel();
        lblHome12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JPanel();
        lblHome13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnListaProductos = new javax.swing.JPanel();
        lblHome7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnModificarProductos = new javax.swing.JPanel();
        lblHome9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnEliminarProductos = new javax.swing.JPanel();
        lblHome8 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblIcono = new javax.swing.JLabel();
        jSep = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CAFÉ LAVAZZA");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Te presentamos el Café Lavazza se elabora desde 1895, el café que usamos ");

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("en nuestro negocio, este es elaborado en Torino y es la marca número 1 en italia");

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("por sus famosas mezclas con gramos de todo el mundo. El balance perfecto entre granos de la");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("variedad arábica y robusta, brindando una mezcla ideal para cada uno de los gustos de los");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("consumidores más exigentes del mundo. Lavazza tiene una mezcla y una");

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("presentación pensada especialmente en cada necesidad, desde cápsulas para brindar la mezcla de café");

        jLabel16.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("y la molienda perfecta para el hogar hasta  soluciones en cápsulas para centros de consumo facilitando el control");

        jLabel17.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("de inventarios y reduciendo mermas.");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cafeteria-caffesito3.jpg"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/CaféLavazza.jpg"))); // NOI18N
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel11))
                    .addComponent(jLabel16)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10))
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(260, 260, 260))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(143, 143, 143))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(322, 322, 322)))))
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pnlSuperior.setBackground(new java.awt.Color(234, 239, 211));
        pnlSuperior.setAlignmentX(0.0F);
        pnlSuperior.setAlignmentY(0.01F);
        pnlSuperior.setPreferredSize(new java.awt.Dimension(1000, 100));
        pnlSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlSuperiorMouseDragged(evt);
            }
        });
        pnlSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlSuperiorMousePressed(evt);
            }
        });

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x-regular-24.png"))); // NOI18N
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        lblMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rectangle-regular-24 (2).png"))); // NOI18N
        lblMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMaximizarMouseClicked(evt);
            }
        });

        lblMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minus-regular-24.png"))); // NOI18N
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlSuperiorLayout = new javax.swing.GroupLayout(pnlSuperior);
        pnlSuperior.setLayout(pnlSuperiorLayout);
        pnlSuperiorLayout.setHorizontalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar)
                .addGap(6, 6, 6)
                .addComponent(lblMaximizar)
                .addGap(6, 6, 6)
                .addComponent(lblCerrar)
                .addContainerGap())
        );
        pnlSuperiorLayout.setVerticalGroup(
            pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMinimizar)
                    .addComponent(lblMaximizar)
                    .addComponent(lblCerrar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlLateral.setBackground(new java.awt.Color(41, 31, 21));
        pnlLateral.setAlignmentX(0.0F);
        pnlLateral.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlLateralMouseDragged(evt);
            }
        });
        pnlLateral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlLateralMousePressed(evt);
            }
        });

        btnInicio.setBackground(new java.awt.Color(89, 54, 14));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        lblHome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/home-regular-24.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnProductos.setBackground(new java.awt.Color(89, 54, 14));
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });

        lblHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/store-regular-24.png"))); // NOI18N
        lblHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHome2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOrdenes.setBackground(new java.awt.Color(89, 54, 14));
        btnOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrdenesMouseClicked(evt);
            }
        });

        lblHome3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cart-regular-24.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Ordenes");

        javax.swing.GroupLayout btnOrdenesLayout = new javax.swing.GroupLayout(btnOrdenes);
        btnOrdenes.setLayout(btnOrdenesLayout);
        btnOrdenesLayout.setHorizontalGroup(
            btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrdenesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        btnOrdenesLayout.setVerticalGroup(
            btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrdenesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnOrdenesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHome3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExportar.setBackground(new java.awt.Color(89, 54, 14));
        btnExportar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExportarMouseClicked(evt);
            }
        });

        lblHome5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/file-export-solid-24.png"))); // NOI18N
        lblHome5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Exportar productos");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnExportarLayout = new javax.swing.GroupLayout(btnExportar);
        btnExportar.setLayout(btnExportarLayout);
        btnExportarLayout.setHorizontalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExportarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnExportarLayout.setVerticalGroup(
            btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExportarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnExportarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHome5)
                    .addComponent(jLabel6))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnAdminProcutos.setBackground(new java.awt.Color(89, 54, 14));
        btnAdminProcutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdminProcutosMouseClicked(evt);
            }
        });

        lblHome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spreadsheet-regular-24.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Administracion productos");

        javax.swing.GroupLayout btnAdminProcutosLayout = new javax.swing.GroupLayout(btnAdminProcutos);
        btnAdminProcutos.setLayout(btnAdminProcutosLayout);
        btnAdminProcutosLayout.setHorizontalGroup(
            btnAdminProcutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdminProcutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAdminProcutosLayout.setVerticalGroup(
            btnAdminProcutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdminProcutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAdminProcutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHome4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAdminProductos.setBackground(new java.awt.Color(41, 31, 21));

        btnAddStock.setBackground(new java.awt.Color(65, 73, 82));
        btnAddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddStockMouseClicked(evt);
            }
        });

        lblHome12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add-to-queue-regular-24.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Añadir Stock");

        javax.swing.GroupLayout btnAddStockLayout = new javax.swing.GroupLayout(btnAddStock);
        btnAddStock.setLayout(btnAddStockLayout);
        btnAddStockLayout.setHorizontalGroup(
            btnAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddStockLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome12)
                .addGap(18, 18, 18)
                .addComponent(jLabel14))
        );
        btnAddStockLayout.setVerticalGroup(
            btnAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAddStockLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(btnAddStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)))
        );

        btnNuevoProducto.setBackground(new java.awt.Color(65, 73, 82));
        btnNuevoProducto.setPreferredSize(new java.awt.Dimension(173, 50));
        btnNuevoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoProductoMouseClicked(evt);
            }
        });

        lblHome13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cart-add-solid-24.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Nuevo producto");

        javax.swing.GroupLayout btnNuevoProductoLayout = new javax.swing.GroupLayout(btnNuevoProducto);
        btnNuevoProducto.setLayout(btnNuevoProductoLayout);
        btnNuevoProductoLayout.setHorizontalGroup(
            btnNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoProductoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome13)
                .addGap(18, 18, 18)
                .addComponent(jLabel15))
        );
        btnNuevoProductoLayout.setVerticalGroup(
            btnNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnNuevoProductoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(btnNuevoProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)))
        );

        btnListaProductos.setBackground(new java.awt.Color(65, 73, 82));
        btnListaProductos.setPreferredSize(new java.awt.Dimension(173, 50));
        btnListaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaProductosMouseClicked(evt);
            }
        });

        lblHome7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/notepad-regular-24.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Lista productos");

        javax.swing.GroupLayout btnListaProductosLayout = new javax.swing.GroupLayout(btnListaProductos);
        btnListaProductos.setLayout(btnListaProductosLayout);
        btnListaProductosLayout.setHorizontalGroup(
            btnListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListaProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8))
        );
        btnListaProductosLayout.setVerticalGroup(
            btnListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnListaProductosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(btnListaProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)))
        );

        btnModificarProductos.setBackground(new java.awt.Color(65, 73, 82));
        btnModificarProductos.setPreferredSize(new java.awt.Dimension(173, 50));
        btnModificarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProductosMouseClicked(evt);
            }
        });

        lblHome9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit-regular-24.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Modificar producto");

        javax.swing.GroupLayout btnModificarProductosLayout = new javax.swing.GroupLayout(btnModificarProductos);
        btnModificarProductos.setLayout(btnModificarProductosLayout);
        btnModificarProductosLayout.setHorizontalGroup(
            btnModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome9)
                .addGap(18, 18, 18)
                .addComponent(jLabel22))
        );
        btnModificarProductosLayout.setVerticalGroup(
            btnModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnModificarProductosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(btnModificarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)))
        );

        btnEliminarProductos.setBackground(new java.awt.Color(65, 73, 82));
        btnEliminarProductos.setPreferredSize(new java.awt.Dimension(173, 50));
        btnEliminarProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarProductosMouseClicked(evt);
            }
        });

        lblHome8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash-solid-24.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Eliminar producto");

        javax.swing.GroupLayout btnEliminarProductosLayout = new javax.swing.GroupLayout(btnEliminarProductos);
        btnEliminarProductos.setLayout(btnEliminarProductosLayout);
        btnEliminarProductosLayout.setHorizontalGroup(
            btnEliminarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarProductosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome8)
                .addGap(18, 18, 18)
                .addComponent(jLabel21))
        );
        btnEliminarProductosLayout.setVerticalGroup(
            btnEliminarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEliminarProductosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(btnEliminarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)))
        );

        javax.swing.GroupLayout pnlAdminProductosLayout = new javax.swing.GroupLayout(pnlAdminProductos);
        pnlAdminProductos.setLayout(pnlAdminProductosLayout);
        pnlAdminProductosLayout.setHorizontalGroup(
            pnlAdminProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(btnListaProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(btnModificarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(btnEliminarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        pnlAdminProductosLayout.setVerticalGroup(
            pnlAdminProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminProductosLayout.createSequentialGroup()
                .addComponent(btnAddStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnListaProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEliminarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnModificarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pnlAdminProductosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddStock, btnEliminarProductos, btnListaProductos, btnModificarProductos, btnNuevoProducto});

        btnModificarProductos.getAccessibleContext().setAccessibleDescription("");

        btnCerrarSesion.setBackground(new java.awt.Color(89, 54, 14));
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit-regular-24.png"))); // NOI18N
        lblHome.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cerrar Sesion");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblHome)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHome)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoPequeño.png"))); // NOI18N

        javax.swing.GroupLayout pnlLateralLayout = new javax.swing.GroupLayout(pnlLateral);
        pnlLateral.setLayout(pnlLateralLayout);
        pnlLateralLayout.setHorizontalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdminProcutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAdminProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblIcono))
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jSep, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLateralLayout.setVerticalGroup(
            pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLateralLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblIcono)
                .addGap(11, 11, 11)
                .addComponent(jSep, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnOrdenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAdminProcutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAdminProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(pnlLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLateralLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public void mostrarPanel(javax.swing.JPanel pnl)
    {
        //pnl.setSize(920,540);
        if(maximized==true)
        {
            pnl.setSize(1680,1000);            
        }else
        {
            pnl.setSize(1040, 630);    
        }
        
        pnl.setLocation(0,0);
        pnlPrincipal.removeAll();
        pnlPrincipal.add(pnl, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();   

    }

    //Tipo=true cafe Tipo=false gris
    private void colorBoton(javax.swing.JPanel pnl,boolean tipo)
    {
        //Cafe
        btnInicio.setBackground(new Color(89,54,14));
        btnProductos.setBackground(new Color(89,54,14));
        btnOrdenes.setBackground(new Color(89,54,14));     
        btnAdminProcutos.setBackground(new Color(89,54,14));       
        btnExportar.setBackground(new Color(89,54,14));        
        btnCerrarSesion.setBackground(new Color(89,54,14)); 
        //Gris
        btnNuevoProducto.setBackground(new Color(65,73,82));
        btnAddStock.setBackground(new Color(65,73,82));
        btnListaProductos.setBackground(new Color(65,73,82));
        btnModificarProductos.setBackground(new Color(65,73,82));
        btnEliminarProductos.setBackground(new Color(65,73,82));                 
        if(tipo)
            //Cafe obscuro
             pnl.setBackground(new Color(124,109,91));
        else
            //Gris obscuro
            pnl.setBackground(new Color(106,114,122));        
    }
    private void arrastrarVentana(java.awt.event.MouseEvent evt)
    {
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        setLocation(x-xMouse,y-yMouse);        
    }
    private void mousePresionadoVentana(java.awt.event.MouseEvent evt)
    {
        xMouse=evt.getX();
        yMouse=evt.getY();     
    }    
    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setExtendedState(VentanaPrincipal.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMaximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizarMouseClicked
        
        if(maximized==false)
        {
            this.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
            GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
            this.setMaximizedBounds(env.getMaximumWindowBounds());
            maximized=true;            
        }
        else if(maximized)
        {
            setExtendedState(VentanaPrincipal.NORMAL);
            maximized=false;
        }
                
    }//GEN-LAST:event_lblMaximizarMouseClicked
    private int xMouse,yMouse;    
    private void pnlSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMouseDragged
        arrastrarVentana(evt);
    }//GEN-LAST:event_pnlSuperiorMouseDragged

    private void pnlSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuperiorMousePressed
        mousePresionadoVentana(evt);
    }//GEN-LAST:event_pnlSuperiorMousePressed

    private void pnlLateralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLateralMousePressed
        mousePresionadoVentana(evt);
    }//GEN-LAST:event_pnlLateralMousePressed

    private void pnlLateralMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLateralMouseDragged
        arrastrarVentana(evt);
    }//GEN-LAST:event_pnlLateralMouseDragged

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        colorBoton(btnCerrarSesion, true);
        Conexion conn = new Conexion();
        conn.desconexion();
        this.setVisible(false);
        LoginDb login = new LoginDb();
        login.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnListaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaProductosMouseClicked
        colorBoton(btnListaProductos, false);
        ListaProductos listprod = new ListaProductos();
        mostrarPanel(listprod);
        Conexion conn = new Conexion();
        ProductoOBJ pdtobj = new ProductoOBJ();
        pdtobj.listarProductos(conn, listprod.tbProductos);
    }//GEN-LAST:event_btnListaProductosMouseClicked

    private void btnNuevoProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoProductoMouseClicked
        colorBoton(btnNuevoProducto, false);
        NuevoProducto nuevoprod = new NuevoProducto();
        mostrarPanel(nuevoprod);
    }//GEN-LAST:event_btnNuevoProductoMouseClicked

    private void btnAddStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddStockMouseClicked
        colorBoton(btnAddStock, false);
        AniadirStock addstock = new AniadirStock();
        mostrarPanel(addstock);
        addstock.actualizarTablaStock(addstock.tbStock);
    }//GEN-LAST:event_btnAddStockMouseClicked

    private void btnAdminProcutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdminProcutosMouseClicked
        colorBoton(btnAdminProcutos, true);
        if(expand==false)
        {
            pnlAdminProductos.setVisible(true);
            expand=true;
        }
        else
        {
            pnlAdminProductos.setVisible(false);
            expand=false;
        }
    }//GEN-LAST:event_btnAdminProcutosMouseClicked

    private void btnOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrdenesMouseClicked
        colorBoton(btnOrdenes, true);        
        PanelOrdenes orden = new PanelOrdenes();
        mostrarPanel(orden);
        orden.actualizarTablaVentas(orden.Tabla_Ventas);
        orden.mostrarTotal(orden.Tabla_Ventas, orden.txtTotal);
    }//GEN-LAST:event_btnOrdenesMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        colorBoton(btnProductos,true);
        ProductosPanel productos = new ProductosPanel();
        mostrarPanel(productos);
        Conexion conn = new Conexion();
        ProductoOBJ pdtobj = new ProductoOBJ();
        pdtobj.listarProductosOrdenes(conn, productos.tbProductosOrdenes);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        colorBoton(btnInicio, true);
        Principal inicio = new Principal();
        mostrarPanel(inicio);
    }//GEN-LAST:event_btnInicioMouseClicked

    private void btnEliminarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductosMouseClicked
        colorBoton(btnEliminarProductos, false);
        EliminarProductos productoElim = new EliminarProductos();
        mostrarPanel(productoElim);
        productoElim.actualizarTablaElim(productoElim.tbProductosOrdenes);
    }//GEN-LAST:event_btnEliminarProductosMouseClicked

    private void btnModificarProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProductosMouseClicked
        colorBoton(btnModificarProductos, false);        
        ModificarProductos productoMod = new ModificarProductos();
        mostrarPanel(productoMod);
        productoMod.actualizarTabla(productoMod.tbProductosOrdenes);
        
    }//GEN-LAST:event_btnModificarProductosMouseClicked

    private void btnExportarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExportarMouseClicked
        colorBoton(btnExportar,true);
        ListaProductos lt = new ListaProductos();
        Conexion conn = new Conexion();
        ProductoOBJ obj = new ProductoOBJ();
        obj.listarProductos(conn, lt.tbProductos);
        ExportarExel exportar = new ExportarExel();
        exportar.exportarExcel(lt.tbProductos);
    }//GEN-LAST:event_btnExportarMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginDb().setVisible(true);              
                //new VentanaPrincipal().setVisible(true);
                //Conexion conn = new Conexion("Cafeteria","2401","189.154.164.177","1521","xe");
                //conn.getConnection();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAddStock;
    private javax.swing.JPanel btnAdminProcutos;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnEliminarProductos;
    private javax.swing.JPanel btnExportar;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnListaProductos;
    private javax.swing.JPanel btnModificarProductos;
    private javax.swing.JPanel btnNuevoProducto;
    private javax.swing.JPanel btnOrdenes;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSep;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblHome12;
    private javax.swing.JLabel lblHome13;
    private javax.swing.JLabel lblHome2;
    private javax.swing.JLabel lblHome3;
    private javax.swing.JLabel lblHome4;
    private javax.swing.JLabel lblHome5;
    private javax.swing.JLabel lblHome6;
    private javax.swing.JLabel lblHome7;
    private javax.swing.JLabel lblHome8;
    private javax.swing.JLabel lblHome9;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JLabel lblMaximizar;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JPanel pnlAdminProductos;
    private javax.swing.JPanel pnlLateral;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlSuperior;
    // End of variables declaration//GEN-END:variables
}
