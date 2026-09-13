// Piña Becerra Victor Osvaldo

package front_end;
import back_end.*;
import javax.swing.JOptionPane;


public class GUIPersona extends javax.swing.JFrame {
    
    private Cocinero cocineroActual = null;
    private Mesero meseroActual = null;
    private Cliente clienteActual = null;
    private Cajero cajeroActual = null;
    private Intendente intendenteActual = null;
    private Bebida bebidaActual = null;
    private Platillo platilloActual = null;
    private Postre postreActual = null;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GUIPersona.class.getName());
    
    
    public GUIPersona() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTNCrear = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        BTNActualizar = new javax.swing.JButton();
        BTNBorrar = new javax.swing.JButton();
        BTNDestruir = new javax.swing.JButton();
        BTNMostrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtRfcMesero = new javax.swing.JTextField();
        txtNombreMesero = new javax.swing.JTextField();
        txtApellidoMesero = new javax.swing.JTextField();
        txtTelefonoMesero = new javax.swing.JTextField();
        txtDireccionMesero = new javax.swing.JTextField();
        txtMesasMesero = new javax.swing.JTextField();
        txtTurnoMesero = new javax.swing.JTextField();
        btnExaminarMesero = new javax.swing.JButton();
        txtImagenRutaMesero = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        lblImagenMesero = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtRfcCajero = new javax.swing.JTextField();
        txtApellidoCajero = new javax.swing.JTextField();
        txtNombreCajero = new javax.swing.JTextField();
        txtTelefonoCajero = new javax.swing.JTextField();
        txtDireccionCajero = new javax.swing.JTextField();
        txtNumCajaCajero = new javax.swing.JTextField();
        txtVentaCajaCajero = new javax.swing.JTextField();
        btnExaminarCajero = new javax.swing.JButton();
        txtImagenRutaCajero = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        lblImagenCajero = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        txtRfcIntendente = new javax.swing.JTextField();
        txtNombreIntendente = new javax.swing.JTextField();
        txtApellidoIntendente = new javax.swing.JTextField();
        txtTelefonoIntendente = new javax.swing.JTextField();
        txtDireccionIntendente = new javax.swing.JTextField();
        txtZonaLimpiezaIntendente = new javax.swing.JTextField();
        btnExaminarIntendente = new javax.swing.JButton();
        txtImagenRutaIntendente = new javax.swing.JTextField();
        txtHerramientaIntendente = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        lblImagenIntendente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtRfcCocinero = new javax.swing.JTextField();
        txtNombreCocinero = new javax.swing.JTextField();
        txtApellidoCocinero = new javax.swing.JTextField();
        txtDireccionCocinero = new javax.swing.JTextField();
        txtZonaCocinaCocinero = new javax.swing.JTextField();
        txtRangoCocinero = new javax.swing.JTextField();
        btnExaminarCocinero = new javax.swing.JButton();
        txtTelefonoCocinero = new javax.swing.JTextField();
        txtImagenRutaCocinero = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        lblImagenCocinero = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtRfcCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        txtDireccionCliente = new javax.swing.JTextField();
        txtMetodoPagoCliente = new javax.swing.JTextField();
        txtMesaCliente = new javax.swing.JTextField();
        btnExaminarCliente = new javax.swing.JButton();
        txtTelefonoCliente = new javax.swing.JTextField();
        txtImagenRutaCliente = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        lblImagenCliente = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        txtNombrePostre = new javax.swing.JTextField();
        txtPrecioPostre = new javax.swing.JTextField();
        txtCantAzucarPostre = new javax.swing.JTextField();
        btnExaminarPostre = new javax.swing.JButton();
        cbGlutenPostre = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        txtIdPostre = new javax.swing.JTextField();
        txtRutaImagenPostre = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        lblImagenPostre = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txtNombrePlatillo = new javax.swing.JTextField();
        txtPrecioPlatillo = new javax.swing.JTextField();
        txtPesoPlatillo = new javax.swing.JTextField();
        btnExaminarPlatillo = new javax.swing.JButton();
        txtCaloriasPlatillo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtIdPlatillo = new javax.swing.JTextField();
        txtRutaImagenPlatillo = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        lblImagenPlatillo = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        txtNombreBebida = new javax.swing.JTextField();
        txtPrecioBebida = new javax.swing.JTextField();
        txtMlBebida = new javax.swing.JTextField();
        btnExaminarBebida = new javax.swing.JButton();
        cbAlcoholBebida = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        txtIdBebida = new javax.swing.JTextField();
        txtRutaImagenBebida = new javax.swing.JTextField();
        jPanel26 = new javax.swing.JPanel();
        lblImagenBebida = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTNCrear.setText("Crear objeto");
        BTNCrear.addActionListener(this::BTNCrearActionPerformed);

        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(this::BTNBuscarActionPerformed);

        BTNActualizar.setText("Actualizar datos");
        BTNActualizar.addActionListener(this::BTNActualizarActionPerformed);

        BTNBorrar.setText("Borrar datos");
        BTNBorrar.addActionListener(this::BTNBorrarActionPerformed);

        BTNDestruir.setText("Destruir Objeto");
        BTNDestruir.addActionListener(this::BTNDestruirActionPerformed);

        BTNMostrar.setText("Mostrar Datos");
        BTNMostrar.addActionListener(this::BTNMostrarActionPerformed);

        jLabel7.setText("Piña Becerra Victor Osvaldo");

        jTabbedPane1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel30.setText("RFC:");

        jLabel31.setText("Nombres:");

        jLabel32.setText("Apellidos: ");

        jLabel33.setText("Telefono:");

        jLabel34.setText("Direccion:");

        jLabel35.setText("DATOS");
        jLabel35.setToolTipText("");

        jLabel36.setText("Ruta de Imagen:");

        jLabel37.setText("Mesas que Atiende");

        jLabel38.setText("Turno");

        btnExaminarMesero.setText("...");
        btnExaminarMesero.addActionListener(this::btnExaminarMeseroActionPerformed);

        txtImagenRutaMesero.setEditable(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRfcMesero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreMesero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidoMesero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTelefonoMesero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDireccionMesero, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtImagenRutaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExaminarMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMesasMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtTurnoMesero))))
                .addGap(18, 18, 18))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel35)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtRfcMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtNombreMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtApellidoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txtTelefonoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtDireccionMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(btnExaminarMesero)
                    .addComponent(txtImagenRutaMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtMesasMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtTurnoMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        lblImagenMesero.setMaximumSize(new java.awt.Dimension(70, 70));
        lblImagenMesero.setMinimumSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenMesero, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(lblImagenMesero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(543, 543, 543))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Mesero", jPanel3);

        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel39.setText("RFC:");

        jLabel40.setText("Nombres:");

        jLabel41.setText("Apellidos: ");

        jLabel42.setText("Telefono:");

        jLabel43.setText("Direccion:");

        jLabel44.setText("DATOS");
        jLabel44.setToolTipText("");

        jLabel45.setText("Ruta de Imagen:");

        jLabel46.setText("Numero de Caja:");

        jLabel47.setText("Venta de Caja:");

        txtRfcCajero.setMinimumSize(new java.awt.Dimension(72, 26));

        txtNombreCajero.setMinimumSize(new java.awt.Dimension(72, 26));

        btnExaminarCajero.setText("...");
        btnExaminarCajero.addActionListener(this::btnExaminarCajeroActionPerformed);

        txtImagenRutaCajero.setEditable(false);
        txtImagenRutaCajero.addActionListener(this::txtImagenRutaCajeroActionPerformed);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccionCajero)
                                    .addComponent(txtTelefonoCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txtApellidoCajero)
                                    .addComponent(txtNombreCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRfcCajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNumCajaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(txtImagenRutaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExaminarCajero)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtVentaCajaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel44)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(txtRfcCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtNombreCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(txtApellidoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(txtTelefonoCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtDireccionCajero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(btnExaminarCajero)
                    .addComponent(txtImagenRutaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtNumCajaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtVentaCajaCajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCajero, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Cajero", jPanel4);

        jPanel5.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel48.setText("RFC:");

        jLabel49.setText("Nombres:");

        jLabel50.setText("Apellidos: ");

        jLabel51.setText("Telefono:");

        jLabel52.setText("Direccion:");

        jLabel53.setText("DATOS");
        jLabel53.setToolTipText("");

        jLabel54.setText("Ruta de Imagen:");

        jLabel55.setText("Zona de Limpieza:");

        jLabel56.setText("Herramienta que usa:");

        btnExaminarIntendente.setText("...");
        btnExaminarIntendente.addActionListener(this::btnExaminarIntendenteActionPerformed);

        txtImagenRutaIntendente.setEditable(false);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHerramientaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelefonoIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreIntendente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoIntendente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addGap(139, 139, 139)
                                .addComponent(txtRfcIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(110, 110, 110)
                                .addComponent(txtDireccionIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(txtImagenRutaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExaminarIntendente)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtZonaLimpiezaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9))
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtRfcIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtNombreIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtApellidoIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtTelefonoIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExaminarIntendente)
                            .addComponent(txtImagenRutaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel52)
                            .addComponent(txtDireccionIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtZonaLimpiezaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtHerramientaIntendente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel23.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenIntendente, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenIntendente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Intendente", jPanel5);

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setText("RFC:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos: ");

        jLabel4.setText("Telefono:");

        jLabel5.setText("Direccion:");

        jLabel8.setText("DATOS");
        jLabel8.setToolTipText("");

        jLabel6.setText("Ruta de Imagen:");

        jLabel9.setText("Zona en Cocina:");

        jLabel10.setText("Rango:");

        txtRfcCocinero.setMinimumSize(new java.awt.Dimension(73, 26));

        txtNombreCocinero.setMinimumSize(new java.awt.Dimension(73, 26));

        txtApellidoCocinero.setMinimumSize(new java.awt.Dimension(73, 26));

        btnExaminarCocinero.setText("...");
        btnExaminarCocinero.addActionListener(this::btnExaminarCocineroActionPerformed);

        txtTelefonoCocinero.setMinimumSize(new java.awt.Dimension(73, 26));

        txtImagenRutaCocinero.setEditable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRangoCocinero)
                                    .addComponent(txtZonaCocinaCocinero)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtApellidoCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelefonoCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDireccionCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(txtNombreCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtRfcCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(txtImagenRutaCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnExaminarCocinero)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel4)))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRfcCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombreCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefonoCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccionCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnExaminarCocinero)
                    .addComponent(txtImagenRutaCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtZonaCocinaCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtRangoCocinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCocinero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cocinero", jPanel2);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel14.setText("RFC:");

        jLabel15.setText("Nombres:");

        jLabel16.setText("Apellidos: ");

        jLabel17.setText("Telefono:");

        jLabel18.setText("Direccion:");

        jLabel19.setText("DATOS");
        jLabel19.setToolTipText("");

        jLabel20.setText("Ruta de Imagen:");

        jLabel21.setText("Metodo Pago");

        jLabel22.setText("Mesa");

        txtRfcCliente.setMinimumSize(new java.awt.Dimension(73, 26));

        txtNombreCliente.setMinimumSize(new java.awt.Dimension(73, 26));

        txtApellidoCliente.setMinimumSize(new java.awt.Dimension(73, 26));

        btnExaminarCliente.setText("...");
        btnExaminarCliente.addActionListener(this::btnExaminarClienteActionPerformed);

        txtTelefonoCliente.setMinimumSize(new java.awt.Dimension(73, 26));

        txtImagenRutaCliente.setEditable(false);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))))
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMesaCliente)
                                            .addComponent(txtMetodoPagoCliente)))
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGap(84, 84, 84)
                                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtRfcCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel12Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(txtImagenRutaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnExaminarCliente)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel17)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtRfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtApellidoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtTelefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(btnExaminarCliente)
                    .addComponent(txtImagenRutaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtMetodoPagoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtMesaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cliente", jPanel1);

        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel57.setText("Nombre del Producto:");

        jLabel58.setText("Precio:");

        jLabel62.setText("DATOS");
        jLabel62.setToolTipText("");

        jLabel63.setText("Ruta de Imagen:");

        jLabel64.setText("Cantidad de Azucar:");

        jLabel65.setText("Gluten Free");

        btnExaminarPostre.setText("...");
        btnExaminarPostre.addActionListener(this::btnExaminarPostreActionPerformed);

        cbGlutenPostre.setText("Gluten");
        cbGlutenPostre.addActionListener(this::cbGlutenPostreActionPerformed);

        jLabel11.setText("Id del Postre");

        txtRutaImagenPostre.setEditable(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel62))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel63))
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPrecioPostre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                            .addComponent(txtCantAzucarPostre)
                                            .addGroup(jPanel18Layout.createSequentialGroup()
                                                .addComponent(cbGlutenPostre)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRutaImagenPostre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExaminarPostre))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdPostre)
                                    .addComponent(txtNombrePostre, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel62)
                .addGap(6, 6, 6)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtIdPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(txtNombrePostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtPrecioPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(btnExaminarPostre)
                    .addComponent(txtRutaImagenPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtCantAzucarPostre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(cbGlutenPostre))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenPostre, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenPostre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Postre", jPanel8);

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel59.setText("Nombre del Producto:");

        jLabel60.setText("Precio:");

        jLabel66.setText("DATOS");
        jLabel66.setToolTipText("");

        jLabel67.setText("Ruta de Imagen:");

        jLabel68.setText("Peso:");

        jLabel69.setText("Calorias:");

        btnExaminarPlatillo.setText("...");
        btnExaminarPlatillo.addActionListener(this::btnExaminarPlatilloActionPerformed);

        jLabel12.setText("Id del Platillo");

        txtRutaImagenPlatillo.setEditable(false);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel66))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69))
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCaloriasPlatillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtPesoPlatillo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPrecioPlatillo)))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRutaImagenPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnExaminarPlatillo))))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel12))
                                .addGap(77, 77, 77)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdPlatillo)
                                    .addComponent(txtNombrePlatillo, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel66)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIdPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtNombrePlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtPrecioPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(btnExaminarPlatillo)
                    .addComponent(txtRutaImagenPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtPesoPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtCaloriasPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenPlatillo, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenPlatillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Platillo", jPanel7);

        jPanel6.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel61.setText("Nombre del Producto:");

        jLabel70.setText("Precio:");

        jLabel71.setText("DATOS");
        jLabel71.setToolTipText("");

        jLabel72.setText("Ruta de Imagen:");

        jLabel73.setText("Mililitros:");

        jLabel74.setText("Es Alcoholica:");

        btnExaminarBebida.setText("...");
        btnExaminarBebida.addActionListener(this::btnExaminarBebidaActionPerformed);

        cbAlcoholBebida.setText("Alcohol");

        jLabel13.setText("Id de la Bebida");

        txtRutaImagenBebida.setEditable(false);

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel71)
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel61)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbAlcoholBebida, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtMlBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(txtPrecioBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(txtNombreBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                        .addComponent(txtIdBebida, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(txtRutaImagenBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExaminarBebida)
                        .addContainerGap())))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel71)
                .addGap(26, 26, 26)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtIdBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(jLabel61))
                    .addComponent(txtNombreBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel70)
                            .addComponent(txtPrecioBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jLabel72)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnExaminarBebida)
                            .addComponent(txtRutaImagenBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMlBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbAlcoholBebida, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(78, 78, 78))
        );

        lblImagenBebida.setMaximumSize(new java.awt.Dimension(70, 70));
        lblImagenBebida.setMinimumSize(new java.awt.Dimension(70, 70));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagenBebida, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagenBebida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );

        jTabbedPane1.addTab("Bebida", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(BTNCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BTNActualizar)
                .addGap(33, 33, 33)
                .addComponent(BTNBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(BTNDestruir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(BTNMostrar)
                .addGap(68, 68, 68)
                .addComponent(BTNBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNCrear)
                    .addComponent(BTNActualizar)
                    .addComponent(BTNBuscar)
                    .addComponent(BTNDestruir)
                    .addComponent(BTNBorrar)
                    .addComponent(BTNMostrar))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCrearActionPerformed
        
        int pestana = jTabbedPane1.getSelectedIndex();
        switch (pestana){
            case 0: 
                if (meseroActual == null){
                    String rfc = txtRfcMesero.getText().trim();
                    String nombres = txtNombreMesero.getText().trim();
                    String apellidos = txtApellidoMesero.getText().trim();
                    String telefono = txtTelefonoMesero.getText().trim();
                    String direccion = txtDireccionMesero.getText().trim();
                    String rutaImagen = txtImagenRutaMesero.getText().trim();
                    
                    String mesas = txtMesasMesero.getText().trim();
                    String turno = txtTurnoMesero.getText().trim();
                    
                    if( rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty()|| mesas.isEmpty() || turno.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    
                    meseroActual = new Mesero(rfc, nombres, apellidos, telefono, direccion, rutaImagen,mesas ,turno);
                    lblImagenMesero.setIcon(new javax.swing.ImageIcon(meseroActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Mesero creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un mesero creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;
                
            case 1: 
                if (cajeroActual == null){
                    String rfc = txtRfcCajero.getText().trim();
                    String nombres = txtNombreCajero.getText().trim();
                    String apellidos = txtApellidoCajero.getText().trim();
                    String telefono = txtTelefonoCajero.getText().trim();
                    String direccion = txtDireccionCajero.getText().trim();
                    String rutaImagen = txtImagenRutaCajero.getText().trim();
                    
                    String numeroCaja = txtNumCajaCajero.getText().trim();
                    String ventaCaja = txtVentaCajaCajero.getText().trim();
                    
                    if( rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty()|| numeroCaja.isEmpty() || ventaCaja.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    
                    cajeroActual = new Cajero(rfc, nombres, apellidos, telefono, direccion, rutaImagen, numeroCaja ,ventaCaja);
                    lblImagenCajero.setIcon(new javax.swing.ImageIcon(cajeroActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Cajero creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un cajero creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;
            case 2: 
                if (intendenteActual == null){
                    String rfc = txtRfcIntendente.getText().trim();
                    String nombres = txtNombreIntendente.getText().trim();
                    String apellidos = txtApellidoIntendente.getText().trim();
                    String telefono = txtTelefonoIntendente.getText().trim();
                    String direccion = txtDireccionIntendente.getText().trim();
                    String rutaImagen = txtImagenRutaIntendente.getText().trim();
                    
                    String zonaLimpieza = txtZonaLimpiezaIntendente.getText().trim();
                    String herramienta = txtHerramientaIntendente.getText().trim();
                    
                    if( rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty()|| zonaLimpieza.isEmpty() || herramienta.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    
                    intendenteActual = new Intendente(rfc, nombres, apellidos, telefono, direccion, rutaImagen, zonaLimpieza ,herramienta);
                    lblImagenIntendente.setIcon(new javax.swing.ImageIcon(intendenteActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Intendente creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Intendente creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;    
            case 3: 
                if (cocineroActual == null){
                    String rfc = txtRfcCocinero.getText().trim();
                    String nombres = txtNombreCocinero.getText().trim();
                    String apellidos = txtApellidoCocinero.getText().trim();
                    String telefono = txtTelefonoCocinero.getText().trim();
                    String direccion = txtDireccionCocinero.getText().trim();
                    String rutaImagen = txtImagenRutaCocinero.getText().trim();
                    
                    String zonaCocina = txtZonaCocinaCocinero.getText().trim();
                    String rango = txtRangoCocinero.getText().trim();
                    
                    if( rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty()|| zonaCocina.isEmpty() || rango.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    
                    cocineroActual = new Cocinero(rfc, nombres, apellidos, telefono, direccion, rutaImagen, zonaCocina ,rango);
                    mostrarImagenEscalada(lblImagenCocinero, cocineroActual.getRutaImagen());
                    JOptionPane.showMessageDialog(this, "Objeto Cocinero creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Cocinero creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;  
            case 4: 
                if (clienteActual == null){
                    String rfc = txtRfcCliente.getText().trim();
                    String nombres = txtNombreCliente.getText().trim();
                    String apellidos = txtApellidoCliente.getText().trim();
                    String telefono = txtTelefonoCliente.getText().trim();
                    String direccion = txtDireccionCliente.getText().trim();
                    String rutaImagen = txtImagenRutaCliente.getText().trim();
                    
                    String metodoPago = txtMetodoPagoCliente.getText().trim();
                    String mesa = txtMesaCliente.getText().trim();
                    
                    if( rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty()|| metodoPago.isEmpty() || mesa.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    
                    clienteActual = new Cliente(rfc, nombres, apellidos, telefono, direccion, rutaImagen, metodoPago ,mesa);
                    lblImagenCliente.setIcon(new javax.swing.ImageIcon(clienteActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Cliente creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Cliente creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;  
            case 5: 
                if (postreActual == null){
                    String idProducto = txtIdPostre.getText().trim();
                    String nombreProducto = txtNombrePostre.getText().trim();
                    String txtPrecio = txtPrecioPostre.getText().trim();
                    String rutaImagen = txtRutaImagenPostre.getText().trim();
                    
                    String txtCantAzucar =  txtCantAzucarPostre.getText().trim();
                    boolean glutenFree = cbGlutenPostre.isSelected();
                    
                    if(idProducto.isEmpty() ||  nombreProducto.isEmpty() || txtPrecio.isEmpty() || rutaImagen.isEmpty() || txtCantAzucar.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    double precio = Double.parseDouble(txtPrecio);
                    int cantAzucar = Integer.parseInt(txtCantAzucar);
                    
                    postreActual = new Postre(idProducto, nombreProducto, precio, rutaImagen,cantAzucar,glutenFree);
                    lblImagenPostre.setIcon(new javax.swing.ImageIcon(postreActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Postre creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Postre creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;      
            case 6: 
                if (platilloActual == null){
                    String idProducto = txtIdPlatillo.getText().trim();
                    String nombreProducto = txtNombrePlatillo.getText().trim();
                    String txtPrecio = txtPrecioPlatillo.getText().trim();
                    String rutaImagen = txtRutaImagenPlatillo.getText().trim();
                    
                    String txtPeso =  txtPesoPlatillo.getText().trim();
                    String txtCalorias = txtCaloriasPlatillo.getText().trim();
                    
                    if(idProducto.isEmpty() ||  nombreProducto.isEmpty() || txtPrecio.isEmpty() || rutaImagen.isEmpty() || txtPeso.isEmpty() || txtCalorias.isEmpty()){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    double precio = Double.parseDouble(txtPrecio);
                    double peso = Double.parseDouble(txtPeso);
                    int calorias = Integer.parseInt(txtCalorias);
                    
                    platilloActual = new Platillo(idProducto, nombreProducto, precio, rutaImagen,peso,calorias);
                    lblImagenPlatillo.setIcon(new javax.swing.ImageIcon(platilloActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Platillo creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Platillo creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;  
            case 7: 
                if (bebidaActual == null){
                    String idProducto = txtIdBebida.getText().trim();
                    String nombreProducto = txtNombreBebida.getText().trim();
                    String txtPrecio = txtPrecioBebida.getText().trim();
                    String rutaImagen = txtRutaImagenBebida.getText().trim();
                    
                    String txtMl =  txtMlBebida.getText().trim();
                    boolean esAlcoholica = cbAlcoholBebida.isSelected();
                   
                    
                    if(idProducto.isEmpty() ||  nombreProducto.isEmpty() || txtPrecio.isEmpty() || rutaImagen.isEmpty() || txtMl.isEmpty() ){
                        JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                        return ;
                    }
                    double precio = Double.parseDouble(txtPrecio);
                    int ml = Integer.parseInt(txtMl);
                    
                    bebidaActual = new Bebida(idProducto, nombreProducto, precio, rutaImagen,ml,esAlcoholica);
                    lblImagenBebida.setIcon(new javax.swing.ImageIcon(bebidaActual.getRutaImagen()));
                    JOptionPane.showMessageDialog(this, "Objeto Bebida creado con Exito.");
                    
                } else {
                JOptionPane.showMessageDialog(this, "Ya existe un Bebida creado, borralo para crear otro.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                }
                break;              
        }
    }//GEN-LAST:event_BTNCrearActionPerformed

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
       int pestana = jTabbedPane1.getSelectedIndex();
       
       switch(pestana){
           case 0:
               if (meseroActual != null){
                    String rfcBuscado = JOptionPane.showInputDialog(this, "Ingresa el RFC para buscar", "Buscar RFC de Mesero", JOptionPane.QUESTION_MESSAGE);
                   
                   if (rfcBuscado != null && !rfcBuscado.trim().isEmpty()){
                       if(meseroActual.getRfc().equalsIgnoreCase(rfcBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "RFC encontrado: " + meseroActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el RFC: " + rfcBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Mesero creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;
            case 1:
               if (cajeroActual != null){
                    String rfcBuscado = JOptionPane.showInputDialog(this, "Ingresa el RFC para buscar", "Buscar RFC de Cajero", JOptionPane.QUESTION_MESSAGE);
                   
                   if (rfcBuscado != null && !rfcBuscado.trim().isEmpty()){
                       if(cajeroActual.getRfc().equalsIgnoreCase(rfcBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "RFC encontrado: " + cajeroActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el RFC: " + rfcBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Cajero creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 2:
               if (intendenteActual != null){
                    String rfcBuscado = JOptionPane.showInputDialog(this, "Ingresa el RFC para buscar", "Buscar RFC de Intendente", JOptionPane.QUESTION_MESSAGE);
                   
                   if (rfcBuscado != null && !rfcBuscado.trim().isEmpty()){
                       if(intendenteActual.getRfc().equalsIgnoreCase(rfcBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "RFC encontrado: " + intendenteActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el RFC: " + rfcBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Intendente creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 3:
               if (cocineroActual != null){
                    String rfcBuscado = JOptionPane.showInputDialog(this, "Ingresa el RFC para buscar", "Buscar RFC de Cocinero", JOptionPane.QUESTION_MESSAGE);
                   
                   if (rfcBuscado != null && !rfcBuscado.trim().isEmpty()){
                       if(cocineroActual.getRfc().equalsIgnoreCase(rfcBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "RFC encontrado: " + cocineroActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el RFC: " + rfcBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Cocinero creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 4:
               if (clienteActual != null){
                    String rfcBuscado = JOptionPane.showInputDialog(this, "Ingresa el RFC para buscar", "Buscar RFC de Cliente", JOptionPane.QUESTION_MESSAGE);
                   
                   if (rfcBuscado != null && !rfcBuscado.trim().isEmpty()){
                       if(clienteActual.getRfc().equalsIgnoreCase(rfcBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "RFC encontrado: " + clienteActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el RFC: " + rfcBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Cliente creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 5:
               if (postreActual != null){
                    String idBuscado = JOptionPane.showInputDialog(this, "Ingresa el ID para buscar", "Buscar ID del Postre", JOptionPane.QUESTION_MESSAGE);
                   
                   if (idBuscado != null && idBuscado.trim().isEmpty()){
                       if(postreActual.getIdProducto().equalsIgnoreCase(idBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "ID encontrado: " + postreActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el ID: " + idBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Postre creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 6:
               if (platilloActual != null){
                    String idBuscado = JOptionPane.showInputDialog(this, "Ingresa el ID para buscar", "Buscar ID del Platillo", JOptionPane.QUESTION_MESSAGE);
                   
                   if (idBuscado != null && idBuscado.trim().isEmpty()){
                       if(platilloActual.getIdProducto().equalsIgnoreCase(idBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "ID encontrado: " + platilloActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el ID: " + idBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay un Platillo creado aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            case 7:
               if (bebidaActual != null){
                    String idBuscado = JOptionPane.showInputDialog(this, "Ingresa el ID para buscar", "Buscar ID del Bebida", JOptionPane.QUESTION_MESSAGE);
                   
                   if (idBuscado != null && idBuscado.trim().isEmpty()){
                       if(bebidaActual.getIdProducto().equalsIgnoreCase(idBuscado.trim())){
                       JOptionPane.showMessageDialog(this, "ID encontrado: " + bebidaActual.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
                       }else {
                       JOptionPane.showMessageDialog(this, "No se encontro el ID: " + idBuscado, "No encontrado", JOptionPane.WARNING_MESSAGE);
                       }    
                    }    
               } else {
                   JOptionPane.showMessageDialog(this, "No hay una Bebida creada aun", "Error", JOptionPane.WARNING_MESSAGE);
               }
               break;   
            
       }
       
       
       
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNActualizarActionPerformed
    int pestana = jTabbedPane1.getSelectedIndex();
    
    switch (pestana){
        case 0:
            if(meseroActual != null){
                String rfc = txtRfcMesero.getText().trim();
                String nombres = txtNombreMesero.getText().trim();
                String apellidos = txtApellidoMesero.getText().trim();
                String telefono = txtTelefonoMesero.getText().trim();
                String direccion = txtDireccionMesero.getText().trim();
                String rutaImagen = txtImagenRutaMesero.getText().trim();
                String mesas = txtMesasMesero.getText().trim();
                String turno = txtTurnoMesero.getText().trim();
                
                if(rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                    telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty() || 
                    mesas.isEmpty() || turno.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                meseroActual.setRfc(rfc);
                meseroActual.setNombres(nombres);
                meseroActual.setApellidos(apellidos);
                meseroActual.setTelefono(telefono);
                meseroActual.setDireccion(direccion);
                meseroActual.setRutaImagen(rutaImagen);
                meseroActual.setMesas(mesas);
                meseroActual.setTurno(turno);
                
                txtRfcMesero.setText("");
                txtNombreMesero.setText("");
                txtApellidoMesero.setText("");
                txtTelefonoMesero.setText("");
                txtDireccionMesero.setText("");
                txtImagenRutaMesero.setText("");
                txtMesasMesero.setText("");
                txtTurnoMesero.setText("");
                lblImagenMesero.setIcon(null);
                
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Mesero creado para actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
        case 1:
            if(cajeroActual != null){
                String rfc = txtRfcCajero.getText().trim();
                String nombres = txtNombreCajero.getText().trim();
                String apellidos = txtApellidoCajero.getText().trim();
                String telefono = txtTelefonoCajero.getText().trim();
                String direccion = txtDireccionCajero.getText().trim();
                String rutaImagen = txtImagenRutaCajero.getText().trim();
                String numeroCaja = txtNumCajaCajero.getText().trim();
                String ventaCaja = txtVentaCajaCajero.getText().trim();
                
                if(rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                    telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty() || 
                    numeroCaja.isEmpty() || ventaCaja.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                cajeroActual.setRfc(rfc);
                cajeroActual.setNombres(nombres);
                cajeroActual.setApellidos(apellidos);
                cajeroActual.setTelefono(telefono);
                cajeroActual.setDireccion(direccion);
                cajeroActual.setRutaImagen(rutaImagen);
                cajeroActual.setNumeroCaja(numeroCaja);
                cajeroActual.setVentaCaja(ventaCaja);
                
                txtRfcCajero.setText("");
                txtNombreCajero.setText("");
                txtApellidoCajero.setText("");
                txtTelefonoCajero.setText("");
                txtDireccionCajero.setText("");
                txtImagenRutaCajero.setText("");
                txtNumCajaCajero.setText("");
                txtVentaCajaCajero.setText("");
                lblImagenCajero.setIcon(null);
                
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Cajero creado para actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
        case 2:
            if(intendenteActual != null){
                String rfc = txtRfcIntendente.getText().trim();
                String nombres = txtNombreIntendente.getText().trim();
                String apellidos = txtApellidoIntendente.getText().trim();
                String telefono = txtTelefonoIntendente.getText().trim();
                String direccion = txtDireccionIntendente.getText().trim();
                String rutaImagen = txtImagenRutaIntendente.getText().trim();
                String zonaLimpieza = txtZonaLimpiezaIntendente.getText().trim();
                String herramienta = txtHerramientaIntendente.getText().trim();
                
                if(rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                    telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty() || 
                    zonaLimpieza.isEmpty() || herramienta.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                intendenteActual.setRfc(rfc);
                intendenteActual.setNombres(nombres);
                intendenteActual.setApellidos(apellidos);
                intendenteActual.setTelefono(telefono);
                intendenteActual.setDireccion(direccion);
                intendenteActual.setRutaImagen(rutaImagen);
                intendenteActual.setZonaLimpieza(zonaLimpieza);
                intendenteActual.setHerramienta(herramienta);
                
                txtRfcIntendente.setText("");
                txtNombreIntendente.setText("");
                txtApellidoIntendente.setText("");
                txtTelefonoIntendente.setText("");
                txtDireccionIntendente.setText("");
                txtImagenRutaIntendente.setText("");
                txtZonaLimpiezaIntendente.setText("");
                txtHerramientaIntendente.setText("");
                lblImagenCajero.setIcon(null);
                
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Intendente creado para actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
        case 3:
            if(cocineroActual != null){
                String rfc = txtRfcCocinero.getText().trim();
                String nombres = txtNombreCocinero.getText().trim();
                String apellidos = txtApellidoCocinero.getText().trim();
                String telefono = txtTelefonoCocinero.getText().trim();
                String direccion = txtDireccionCocinero.getText().trim();
                String rutaImagen = txtImagenRutaCocinero.getText().trim();
                String zonaCocina = txtZonaCocinaCocinero.getText().trim();
                String rango = txtRangoCocinero.getText().trim();
                
                if(rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                    telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty() || 
                    zonaCocina.isEmpty() || rango.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                cocineroActual.setRfc(rfc);
                cocineroActual.setNombres(nombres);
                cocineroActual.setApellidos(apellidos);
                cocineroActual.setTelefono(telefono);
                cocineroActual.setDireccion(direccion);
                cocineroActual.setRutaImagen(rutaImagen);
                cocineroActual.setZonaCocina(zonaCocina);
                cocineroActual.setRango(rango);
                
                txtRfcCocinero.setText("");
                txtNombreCocinero.setText("");
                txtApellidoCocinero.setText("");
                txtTelefonoCocinero.setText("");
                txtDireccionCocinero.setText("");
                txtImagenRutaCocinero.setText("");
                txtZonaCocinaCocinero.setText("");
                txtRangoCocinero.setText("");
                lblImagenCocinero.setIcon(null);
                
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Cocinero creado para actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } break;    
        case 4:
            if(clienteActual != null){
                String rfc = txtRfcCliente.getText().trim();
                String nombres = txtNombreCliente.getText().trim();
                String apellidos = txtApellidoCliente.getText().trim();
                String telefono = txtTelefonoCliente.getText().trim();
                String direccion = txtDireccionCliente.getText().trim();
                String rutaImagen = txtImagenRutaCliente.getText().trim();
                String metodoPago = txtMetodoPagoCliente.getText().trim();
                String mesa = txtMesaCliente.getText().trim();
                
                if(rfc.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                    telefono.isEmpty() || direccion.isEmpty() || rutaImagen.isEmpty() || 
                    metodoPago.isEmpty() || mesa.isEmpty()){
                    JOptionPane.showMessageDialog(this, "Hay campos vacios", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                clienteActual.setRfc(rfc);
                clienteActual.setNombres(nombres);
                clienteActual.setApellidos(apellidos);
                clienteActual.setTelefono(telefono);
                clienteActual.setDireccion(direccion);
                clienteActual.setRutaImagen(rutaImagen);
                clienteActual.setMetodoPago(metodoPago);
                clienteActual.setMetodoPago(metodoPago);
                
                txtRfcCliente.setText("");
                txtNombreCliente.setText("");
                txtApellidoCliente.setText("");
                txtTelefonoCliente.setText("");
                txtDireccionCliente.setText("");
                txtImagenRutaCliente.setText("");
                txtMetodoPagoCliente.setText("");
                txtMesaCliente.setText("");
                lblImagenCliente.setIcon(null);
                
                JOptionPane.showMessageDialog(this, "Datos actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Cliente creado para actualizar", "Error", JOptionPane.WARNING_MESSAGE);
            } break;    
        case 5:
            if(postreActual != null){
                String id = txtIdPostre.getText().trim();
                String nombre = txtNombrePostre.getText().trim();
                String precioStr = txtPrecioPostre.getText().trim();
                String rutaImagen = txtRutaImagenPostre.getText().trim();
                String azucarStr = txtCantAzucarPostre.getText().trim();
                boolean esGlutenFree = cbGlutenPostre.isSelected();
                
                if (id.isEmpty() || nombre.isEmpty() || precioStr.isEmpty() || 
                    rutaImagen.isEmpty() || azucarStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try{
                    int azucar = Integer.parseInt(azucarStr);
                    double precio = Double.parseDouble(precioStr);
                    
                    postreActual.setIdProducto(id);
                    postreActual.setNombreProducto(nombre);
                    postreActual.setPrecio(precio);
                    postreActual.setRutaImagen(rutaImagen);
                    postreActual.setCantAzucar(azucar);
                    postreActual.setGlutenFree(esGlutenFree);
                    
                    txtIdPostre.setText("");
                    txtNombrePostre.setText("");
                    txtPrecioPostre.setText("");
                    txtRutaImagenPostre.setText("");
                    txtCantAzucarPostre.setText("");
                    cbGlutenPostre.setSelected(false);
                    lblImagenPostre.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Los datos fueron actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                
                
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "En azucar y precio deben ser datos numericos validos", "Error", JOptionPane.WARNING_MESSAGE);
                }
                
            
            
            } else {
            JOptionPane.showMessageDialog(this, "No existe Postre aun", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
        case 6:
            if(platilloActual != null){
                String id = txtIdPlatillo.getText().trim();
                String nombre = txtNombrePlatillo.getText().trim();
                String precioStr = txtPrecioPlatillo.getText().trim();
                String rutaImagen = txtRutaImagenPlatillo.getText().trim();
                String pesoStr = txtPesoPlatillo.getText().trim();
                String caloriasStr = txtCaloriasPlatillo.getText().trim();
                
                if (id.isEmpty() || nombre.isEmpty() || precioStr.isEmpty() || 
                    rutaImagen.isEmpty() || pesoStr.isEmpty() || caloriasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try{
                    double peso = Double.parseDouble(pesoStr);
                    double precio = Double.parseDouble(precioStr);
                    int calorias = Integer.parseInt(caloriasStr);
                    
                    platilloActual.setIdProducto(id);
                    platilloActual.setNombreProducto(nombre);
                    platilloActual.setPrecio(precio);
                    platilloActual.setRutaImagen(rutaImagen);
                    platilloActual.setPeso(peso);
                    platilloActual.setCalorias(calorias);
                    
                    txtIdPlatillo.setText("");
                    txtNombrePlatillo.setText("");
                    txtPrecioPlatillo.setText("");
                    txtRutaImagenPlatillo.setText("");
                    txtPesoPlatillo.setText("");
                    txtCaloriasPlatillo.setText("");
                    lblImagenPlatillo.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Los datos fueron actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                
                
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "En peso, calorias y precio deben ser datos numericos validos", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
            JOptionPane.showMessageDialog(this, "No existe un Platillo aun", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
        case 7:
            if(bebidaActual != null){
                String id = txtIdBebida.getText().trim();
                String nombre = txtNombreBebida.getText().trim();
                String precioStr = txtPrecioBebida.getText().trim();
                String rutaImagen = txtRutaImagenBebida.getText().trim();
                String mlStr = txtMlBebida.getText().trim();
                boolean esAlcoholica = cbAlcoholBebida.isSelected();
                
                if (id.isEmpty() || nombre.isEmpty() || precioStr.isEmpty() || 
                    rutaImagen.isEmpty() || mlStr.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Hay campos vacios.", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try{
                    double precio = Double.parseDouble(precioStr);
                    int ml = Integer.parseInt(mlStr);
                    
                    bebidaActual.setIdProducto(id);
                    bebidaActual.setNombreProducto(nombre);
                    bebidaActual.setPrecio(precio);
                    bebidaActual.setRutaImagen(rutaImagen);
                    bebidaActual.setMl(ml);
                    bebidaActual.setEsAlcoholica(esAlcoholica);
                    
                    txtIdBebida.setText("");
                    txtNombreBebida.setText("");
                    txtPrecioBebida.setText("");
                    txtRutaImagenBebida.setText("");
                    txtMlBebida.setText("");
                    cbAlcoholBebida.setSelected(false);
                    lblImagenBebida.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Los datos fueron actualizados", "Exito", JOptionPane.INFORMATION_MESSAGE);
                
                
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(this, "En Mililitros y precio deben ser datos numericos validos", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
            JOptionPane.showMessageDialog(this, "No existe una Bebida aun", "Error", JOptionPane.WARNING_MESSAGE);
            } break;
            
  
    }
            
            
    }//GEN-LAST:event_BTNActualizarActionPerformed

    private void BTNBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBorrarActionPerformed
    int pestana = jTabbedPane1.getSelectedIndex();
    
    switch (pestana) {
        case 0:
            if (meseroActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    meseroActual.setRfc("");
                    meseroActual.setNombres("");
                    meseroActual.setApellidos("");
                    meseroActual.setTelefono("");
                    meseroActual.setDireccion("");
                    meseroActual.setRutaImagen("");
                    
                    meseroActual.setMesas("");
                    meseroActual.setTurno("");
                    
                    txtRfcMesero.setText("");
                    txtNombreMesero.setText("");
                    txtApellidoMesero.setText("");
                    txtTelefonoMesero.setText("");
                    txtDireccionMesero.setText("");
                    txtImagenRutaMesero.setText("");
                    txtMesasMesero.setText("");
                    txtTurnoMesero.setText("");
                    lblImagenMesero.setIcon(null);
                    JOptionPane.showMessageDialog(this, "Datos de Mesero borrados", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    }
                    } else {
                    JOptionPane.showMessageDialog(this, "No existe un Mesero para borrar sus datos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                } 
            break;
        case 1:
            if (cajeroActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    cajeroActual.setRfc("");
                    cajeroActual.setNombres("");
                    cajeroActual.setApellidos("");
                    cajeroActual.setTelefono("");
                    cajeroActual.setDireccion("");
                    cajeroActual.setRutaImagen("");
                    
                    cajeroActual.setNumeroCaja("");
                    cajeroActual.setVentaCaja("");
                    
                    txtRfcCajero.setText("");
                    txtNombreCajero.setText("");
                    txtApellidoCajero.setText("");
                    txtTelefonoCajero.setText("");
                    txtDireccionCajero.setText("");
                    txtImagenRutaCajero.setText("");
                    txtNumCajaCajero.setText("");
                    txtVentaCajaCajero.setText("");
                    lblImagenCajero.setIcon(null);
                    JOptionPane.showMessageDialog(this, "Datos de Cajero borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    } else {
                    JOptionPane.showMessageDialog(this, "No existe un Cajero para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
        case 2:
            if (intendenteActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    intendenteActual.setRfc("");
                    intendenteActual.setNombres("");
                    intendenteActual.setApellidos("");
                    intendenteActual.setTelefono("");
                    intendenteActual.setDireccion("");
                    intendenteActual.setRutaImagen("");
                    
                    intendenteActual.setZonaLimpieza("");
                    intendenteActual.setHerramienta("");
                    
                    txtRfcIntendente.setText("");
                    txtNombreIntendente.setText("");
                    txtApellidoIntendente.setText("");
                    txtTelefonoIntendente.setText("");
                    txtDireccionIntendente.setText("");
                    txtImagenRutaIntendente.setText("");
                    txtZonaLimpiezaIntendente.setText("");
                    txtHerramientaIntendente.setText("");
                    lblImagenIntendente.setIcon(null);
                    JOptionPane.showMessageDialog(this, "Datos de Intendente borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            }   else {
                    JOptionPane.showMessageDialog(this, "No existe un Intendente para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                }
            break;  
        case 3:
            if (cocineroActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    cocineroActual.setRfc("");
                    cocineroActual.setNombres("");
                    cocineroActual.setApellidos("");
                    cocineroActual.setTelefono("");
                    cocineroActual.setDireccion("");
                    cocineroActual.setRutaImagen("");
                    
                    cocineroActual.setZonaCocina("");
                    cocineroActual.setRango("");
                    
                    txtRfcCocinero.setText("");
                    txtNombreCocinero.setText("");
                    txtApellidoCocinero.setText("");
                    txtTelefonoCocinero.setText("");
                    txtDireccionCocinero.setText("");
                    txtImagenRutaCocinero.setText("");
                    txtZonaCocinaCocinero.setText("");
                    
                    txtRangoCocinero.setText("");
                    lblImagenCocinero.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Datos de Cocinero borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            } else {
                    JOptionPane.showMessageDialog(this, "No existe un Cocinero para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                }    
            break;    
        case 4:
            if (clienteActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    clienteActual.setRfc("");
                    clienteActual.setNombres("");
                    clienteActual.setApellidos("");
                    clienteActual.setTelefono("");
                    clienteActual.setDireccion("");
                    clienteActual.setRutaImagen("");
                    
                    clienteActual.setMetodoPago("");
                    clienteActual.setMesa("");
                    
                    txtRfcCliente.setText("");
                    txtNombreCliente.setText("");
                    txtApellidoCliente.setText("");
                    txtTelefonoCliente.setText("");
                    txtDireccionCliente.setText("");
                    txtImagenRutaCliente.setText("");
                    txtMetodoPagoCliente.setText("");
                    
                    txtMesaCliente.setText("");
                    lblImagenCliente.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Datos de Cliente borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            } else {
                    JOptionPane.showMessageDialog(this, "No existe un Cliente para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                }    
            break;    
        case 5:
            if (postreActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    postreActual.setIdProducto("");
                    postreActual.setNombreProducto("");
                    postreActual.setPrecio(0.0);
                    postreActual.setRutaImagen("");
                    
                    postreActual.setCantAzucar(0);
                    postreActual.setGlutenFree(false);
                    
                    txtIdPostre.setText("");
                    txtNombrePostre.setText("");
                    txtPrecioPostre.setText("");
                    txtRutaImagenPostre.setText("");
                    
                    txtCantAzucarPostre.setText("");
                    cbGlutenPostre.setSelected(false);
                    lblImagenPostre.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Datos de Postre borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            } else {
                    JOptionPane.showMessageDialog(this, "No existe un Postre para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                }
            break;   
        case 6:
            if (platilloActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    platilloActual.setIdProducto("");
                    platilloActual.setNombreProducto("");
                    platilloActual.setPrecio(0.0);
                    platilloActual.setRutaImagen("");
                    
                    platilloActual.setPeso(0.0);
                    platilloActual.setCalorias(0);
                    
                    txtIdPlatillo.setText("");
                    txtNombrePlatillo.setText("");
                    txtPrecioPlatillo.setText("");
                    txtRutaImagenPlatillo.setText("");
                    
                    txtPesoPlatillo.setText("");
                    txtCaloriasPlatillo.setText("");
                    lblImagenPlatillo.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Datos de Platillo borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            } else {
                    JOptionPane.showMessageDialog(this, "No existe un Platillo para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                }
            break ;                
        case 7:
            if (bebidaActual != null){
                int respuesta = JOptionPane.showConfirmDialog(this, "¿Quieres borrar los datos?", "Advertencia", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                    bebidaActual.setIdProducto("");
                    bebidaActual.setNombreProducto("");
                    bebidaActual.setPrecio(0.0);
                    bebidaActual.setRutaImagen("");
                    
                    bebidaActual.setMl(0);
                    bebidaActual.setEsAlcoholica(false);
                    
                    txtIdBebida.setText("");
                    txtNombreBebida.setText("");
                    txtPrecioBebida.setText("");
                    txtRutaImagenBebida.setText("");
                    
                    txtMlBebida.setText("");
                    cbAlcoholBebida.setSelected(false);
                    lblImagenBebida.setIcon(null);
                    
                    JOptionPane.showMessageDialog(this, "Datos de Bebida borrados.", "Borrado exitoso.", JOptionPane.INFORMATION_MESSAGE);
                    } 
            }   else {
                    JOptionPane.showMessageDialog(this, "No existe un Bebida para borrar sus datos.", "Advertencia.", JOptionPane.INFORMATION_MESSAGE);
                } 
            break;                
    }
    }//GEN-LAST:event_BTNBorrarActionPerformed

    private void BTNDestruirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNDestruirActionPerformed
    int pestana = jTabbedPane1.getSelectedIndex();

    switch (pestana) {
        case 0: 
            if (meseroActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Mesero?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               
               if (respuesta == JOptionPane.YES_OPTION){
                meseroActual = null;

                
                txtRfcMesero.setText("");
                txtNombreMesero.setText("");
                txtApellidoMesero.setText("");
                txtTelefonoMesero.setText("");
                txtDireccionMesero.setText("");
                txtImagenRutaMesero.setText("");
                txtMesasMesero.setText("");
                txtTurnoMesero.setText("");

                lblImagenMesero.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Mesero destruido.", "Mesero Eliminado", JOptionPane.INFORMATION_MESSAGE);
               }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Mesero creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 1: 
            if (cajeroActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Cajero?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                cajeroActual = null;

                
                txtRfcCajero.setText("");
                txtNombreCajero.setText("");
                txtApellidoCajero.setText("");
                txtTelefonoCajero.setText("");
                txtDireccionCajero.setText("");
                txtImagenRutaCajero.setText("");
                txtNumCajaCajero.setText("");
                txtVentaCajaCajero.setText("");

                lblImagenCajero.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Cajero destruido.", "Cajero Eliminado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Cajero creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;    
            case 2: 
            if (intendenteActual != null) {
                int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Intendente?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (respuesta == JOptionPane.YES_OPTION){
                intendenteActual = null;

                
                txtRfcIntendente.setText("");
                txtNombreIntendente.setText("");
                txtApellidoIntendente.setText("");
                txtTelefonoIntendente.setText("");
                txtDireccionIntendente.setText("");
                txtImagenRutaIntendente.setText("");
                txtZonaLimpiezaIntendente.setText("");
                txtHerramientaIntendente.setText("");

                lblImagenIntendente.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Intendente destruido.", "Intendente Eliminado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Intendente creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;   
        case 3: 
            if (cocineroActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Cocinero?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               if (respuesta == JOptionPane.YES_OPTION){
                cocineroActual = null;

                
                txtRfcCocinero.setText("");
                txtNombreCocinero.setText("");
                txtApellidoCocinero.setText("");
                txtTelefonoCocinero.setText("");
                txtDireccionCocinero.setText("");
                txtImagenRutaCocinero.setText("");
                txtZonaCocinaCocinero.setText("");
                txtRangoCocinero.setText("");

                lblImagenCocinero.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Cocinero destruido.", "Cocinero Eliminado", JOptionPane.INFORMATION_MESSAGE);
               }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Cocinero creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 4: 
            if (clienteActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Cliente?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               if (respuesta == JOptionPane.YES_OPTION){
                clienteActual = null;

                
                txtRfcCliente.setText("");
                txtNombreCliente.setText("");
                txtApellidoCliente.setText("");
                txtTelefonoCliente.setText("");
                txtDireccionCliente.setText("");
                txtImagenRutaCliente.setText("");
                txtMetodoPagoCliente.setText("");
                txtMesaCliente.setText("");

                lblImagenCliente.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Cliente destruido.", "Cliente Eliminado", JOptionPane.INFORMATION_MESSAGE);
               }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Cliente creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;
            case 5: 
            if (postreActual != null) {
                int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Postre?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                 if (respuesta == JOptionPane.YES_OPTION){
               
                postreActual = null;

                
                txtIdPostre.setText("");
                txtNombrePostre.setText("");
                txtPrecioPostre.setText("");
                txtRutaImagenPostre.setText("");
                txtCantAzucarPostre.setText("");
                cbGlutenPostre.setSelected(false);

                lblImagenPostre.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Postre destruido.", "Postre Eliminado", JOptionPane.INFORMATION_MESSAGE);
                 }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Postre creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;    
        case 6: 
            if (platilloActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Platillo?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               if (respuesta == JOptionPane.YES_OPTION){
                platilloActual = null;

                
                txtIdPlatillo.setText("");
                txtNombrePlatillo.setText("");
                txtPrecioPlatillo.setText("");
                txtRutaImagenPlatillo.setText("");
                txtPesoPlatillo.setText("");
                txtCaloriasPlatillo.setText("");

                lblImagenPostre.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Platillo destruido.", "Platillo Eliminado", JOptionPane.INFORMATION_MESSAGE);
               }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Platillo creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;      
        case 7: 
            if (bebidaActual != null) {
               int respuesta = JOptionPane.showConfirmDialog(this,"¿Estás seguro de destruir el objeto Bebida?", "Destruir", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
               if (respuesta == JOptionPane.YES_OPTION){
                bebidaActual = null;

                
                txtIdBebida.setText("");
                txtNombreBebida.setText("");
                txtPrecioBebida.setText("");
                txtRutaImagenBebida.setText("");
                txtMlBebida.setText("");
                cbAlcoholBebida.setSelected(false);
                

                lblImagenBebida.setIcon(null);

                
                JOptionPane.showMessageDialog(this, "Objeto Bebida destruido.", "Bebida Eliminado", JOptionPane.INFORMATION_MESSAGE);
               }
            } else {
                JOptionPane.showMessageDialog(this, "No hay ningún Bebida creado para destruir.", "Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            break;          
        }
    }//GEN-LAST:event_BTNDestruirActionPerformed

    private void btnExaminarMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarMeseroActionPerformed
        
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtImagenRutaMesero.setText(archivoSeleccionado.getAbsolutePath());
    }

    }//GEN-LAST:event_btnExaminarMeseroActionPerformed

    private void btnExaminarCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarCajeroActionPerformed
     javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtImagenRutaCajero.setText(archivoSeleccionado.getAbsolutePath());
    }  
    }//GEN-LAST:event_btnExaminarCajeroActionPerformed

    private void btnExaminarIntendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarIntendenteActionPerformed
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtImagenRutaIntendente.setText(archivoSeleccionado.getAbsolutePath());
    }
    }//GEN-LAST:event_btnExaminarIntendenteActionPerformed

    private void btnExaminarPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarPostreActionPerformed
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtRutaImagenPostre.setText(archivoSeleccionado.getAbsolutePath());
    }
    }//GEN-LAST:event_btnExaminarPostreActionPerformed

    private void btnExaminarPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarPlatilloActionPerformed
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtRutaImagenPlatillo.setText(archivoSeleccionado.getAbsolutePath());
    }
    }//GEN-LAST:event_btnExaminarPlatilloActionPerformed

    private void btnExaminarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarBebidaActionPerformed
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    
  
    javax.swing.filechooser.FileNameExtensionFilter filtro = 
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filtro);
    
    
    int resultado = fileChooser.showOpenDialog(this);
    
    
    if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
        java.io.File archivoSeleccionado = fileChooser.getSelectedFile();
        
        
        txtRutaImagenBebida.setText(archivoSeleccionado.getAbsolutePath());
    }
    }//GEN-LAST:event_btnExaminarBebidaActionPerformed

    private void cbGlutenPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGlutenPostreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGlutenPostreActionPerformed

    private void BTNMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNMostrarActionPerformed
    int pestana = jTabbedPane1.getSelectedIndex();
    
    switch (pestana){
        
        case 0:
            if(meseroActual != null){
                JOptionPane.showMessageDialog(this, meseroActual.toString(), "Informacion del Mesero", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Mesero aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 1:  
            if(cajeroActual != null){
                JOptionPane.showMessageDialog(this, cajeroActual.toString(), "Informacion del Cajero", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Cajero aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 2:
            if(intendenteActual != null){
                JOptionPane.showMessageDialog(this, intendenteActual.toString(), "Informacion del Intendente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Intedente aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 3:
            if(cocineroActual != null){
                JOptionPane.showMessageDialog(this, cocineroActual.toString(), "Informacion del Cocinero", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Cocinero aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 4:
            if(clienteActual != null){
                JOptionPane.showMessageDialog(this, clienteActual.toString(), "Informacion del Cliente", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Cliente aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 5:
            if(postreActual != null){
                JOptionPane.showMessageDialog(this, postreActual.toString(), "Informacion del Postre", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Postre aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 6:
        if(platilloActual != null){
                JOptionPane.showMessageDialog(this, platilloActual.toString(), "Informacion del Platillo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Platillo aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
        case 7:
            if(bebidaActual != null){
                JOptionPane.showMessageDialog(this, bebidaActual.toString(), "Informacion del Bebida", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No existe un Bebida aun", "No hay informacion para mostrar", JOptionPane.WARNING_MESSAGE);
            }
            break;
    }
    }//GEN-LAST:event_BTNMostrarActionPerformed

    private void txtImagenRutaCajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImagenRutaCajeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImagenRutaCajeroActionPerformed

    private void btnExaminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarClienteActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();

        javax.swing.filechooser.FileNameExtensionFilter filtro =
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filtro);

        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File archivoSeleccionado = fileChooser.getSelectedFile();

            txtImagenRutaCliente.setText(archivoSeleccionado.getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminarClienteActionPerformed

    private void btnExaminarCocineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExaminarCocineroActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();

        javax.swing.filechooser.FileNameExtensionFilter filtro =
        new javax.swing.filechooser.FileNameExtensionFilter("Archivos de Imagen (*.jpg, *.png, *.jpeg)", "jpg", "png", "jpeg");
        fileChooser.setFileFilter(filtro);

        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File archivoSeleccionado = fileChooser.getSelectedFile();

            txtImagenRutaCocinero.setText(archivoSeleccionado.getAbsolutePath());
        }
    }//GEN-LAST:event_btnExaminarCocineroActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GUIPersona().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNActualizar;
    private javax.swing.JButton BTNBorrar;
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCrear;
    private javax.swing.JButton BTNDestruir;
    private javax.swing.JButton BTNMostrar;
    private javax.swing.JButton btnExaminarBebida;
    private javax.swing.JButton btnExaminarCajero;
    private javax.swing.JButton btnExaminarCliente;
    private javax.swing.JButton btnExaminarCocinero;
    private javax.swing.JButton btnExaminarIntendente;
    private javax.swing.JButton btnExaminarMesero;
    private javax.swing.JButton btnExaminarPlatillo;
    private javax.swing.JButton btnExaminarPostre;
    private javax.swing.JCheckBox cbAlcoholBebida;
    private javax.swing.JCheckBox cbGlutenPostre;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblImagenBebida;
    private javax.swing.JLabel lblImagenCajero;
    private javax.swing.JLabel lblImagenCliente;
    private javax.swing.JLabel lblImagenCocinero;
    private javax.swing.JLabel lblImagenIntendente;
    private javax.swing.JLabel lblImagenMesero;
    private javax.swing.JLabel lblImagenPlatillo;
    private javax.swing.JLabel lblImagenPostre;
    private javax.swing.JTextField txtApellidoCajero;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtApellidoCocinero;
    private javax.swing.JTextField txtApellidoIntendente;
    private javax.swing.JTextField txtApellidoMesero;
    private javax.swing.JTextField txtCaloriasPlatillo;
    private javax.swing.JTextField txtCantAzucarPostre;
    private javax.swing.JTextField txtDireccionCajero;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtDireccionCocinero;
    private javax.swing.JTextField txtDireccionIntendente;
    private javax.swing.JTextField txtDireccionMesero;
    private javax.swing.JTextField txtHerramientaIntendente;
    private javax.swing.JTextField txtIdBebida;
    private javax.swing.JTextField txtIdPlatillo;
    private javax.swing.JTextField txtIdPostre;
    private javax.swing.JTextField txtImagenRutaCajero;
    private javax.swing.JTextField txtImagenRutaCliente;
    private javax.swing.JTextField txtImagenRutaCocinero;
    private javax.swing.JTextField txtImagenRutaIntendente;
    private javax.swing.JTextField txtImagenRutaMesero;
    private javax.swing.JTextField txtMesaCliente;
    private javax.swing.JTextField txtMesasMesero;
    private javax.swing.JTextField txtMetodoPagoCliente;
    private javax.swing.JTextField txtMlBebida;
    private javax.swing.JTextField txtNombreBebida;
    private javax.swing.JTextField txtNombreCajero;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreCocinero;
    private javax.swing.JTextField txtNombreIntendente;
    private javax.swing.JTextField txtNombreMesero;
    private javax.swing.JTextField txtNombrePlatillo;
    private javax.swing.JTextField txtNombrePostre;
    private javax.swing.JTextField txtNumCajaCajero;
    private javax.swing.JTextField txtPesoPlatillo;
    private javax.swing.JTextField txtPrecioBebida;
    private javax.swing.JTextField txtPrecioPlatillo;
    private javax.swing.JTextField txtPrecioPostre;
    private javax.swing.JTextField txtRangoCocinero;
    private javax.swing.JTextField txtRfcCajero;
    private javax.swing.JTextField txtRfcCliente;
    private javax.swing.JTextField txtRfcCocinero;
    private javax.swing.JTextField txtRfcIntendente;
    private javax.swing.JTextField txtRfcMesero;
    private javax.swing.JTextField txtRutaImagenBebida;
    private javax.swing.JTextField txtRutaImagenPlatillo;
    private javax.swing.JTextField txtRutaImagenPostre;
    private javax.swing.JTextField txtTelefonoCajero;
    private javax.swing.JTextField txtTelefonoCliente;
    private javax.swing.JTextField txtTelefonoCocinero;
    private javax.swing.JTextField txtTelefonoIntendente;
    private javax.swing.JTextField txtTelefonoMesero;
    private javax.swing.JTextField txtTurnoMesero;
    private javax.swing.JTextField txtVentaCajaCajero;
    private javax.swing.JTextField txtZonaCocinaCocinero;
    private javax.swing.JTextField txtZonaLimpiezaIntendente;
    // End of variables declaration//GEN-END:variables
  private void mostrarImagenEscalada(javax.swing.JLabel lbl, String ruta) {
    if (ruta == null || ruta.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "La ruta de la imagen está vacía.");
        return;
    }

    java.io.File archivo = new java.io.File(ruta);
    if (!archivo.exists()) {
        JOptionPane.showMessageDialog(this, "No se encontró el archivo en: " + archivo.getAbsolutePath(), "Error de Ruta", JOptionPane.ERROR_MESSAGE);
        return;
    }

    javax.swing.ImageIcon originalIcon = new javax.swing.ImageIcon(ruta);
    
    
    int ancho = lbl.getWidth() > 0 ? lbl.getWidth() : 150;
    int alto = lbl.getHeight() > 0 ? lbl.getHeight() : 150;

    java.awt.Image imgEscalada = originalIcon.getImage().getScaledInstance(
        ancho, 
        alto, 
        java.awt.Image.SCALE_SMOOTH
    );

    lbl.setText(""); 
    lbl.setIcon(new javax.swing.ImageIcon(imgEscalada));
    lbl.revalidate();
    lbl.repaint();
}



}
