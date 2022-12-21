package Vista;

import Entity.Cat_Consumo;
import Entity.Cat_descuento;
import Entity.Cat_periodo;
import Entity.Contrato;
import Entity.DetTipoconsumoTarifa;
import Entity.LecturaPago;
import Servicio.CatalogosServicio;
import Servicio.ContratoServicio;
import Servicio.DescuentoServicio;
import Servicio.LecturaPagoServicio;
import Servicio.TarifaServicio;
import java.awt.Color;
import java.time.LocalDate;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Administrador extends javax.swing.JPanel {

    boolean c;
    boolean validator = false;
    boolean Precio_fijo = false;
    String nombresIndex[] = {"Lecturas", "Catalogó consumo", "Catalogó tarifa", "Catalogó periodo", "Descuentos"};

    public Administrador() {
        initComponents();
        Importe.setVisible(false);
        Cargando.setVisible(true);
        //new MostrarLecturas().show();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ScrollPanel = new javax.swing.JScrollPane();
        lectura = new javax.swing.JTable();
        Guardar_Lectura = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Inicial = new javax.swing.JTextField();
        LFinal = new javax.swing.JTextField();
        Consumo = new javax.swing.JTextField();
        Dato = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        id_mes = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        Informacion = new javax.swing.JTextArea();
        fijo = new javax.swing.JCheckBox();
        Importe = new javax.swing.JTextField();
        Cargando = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ScrollPanel1 = new javax.swing.JScrollPane();
        Consumos = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        Tipo_Consumo = new javax.swing.JTextField();
        Guardar_Consumo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Id_tipo = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        ScrollPanel2 = new javax.swing.JScrollPane();
        Tarifas = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        Consec = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Tarifa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        id_consumo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        ScrollPanel4 = new javax.swing.JScrollPane();
        Periodos = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Tipo_p = new javax.swing.JTextField();
        Mes_p = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ScrollPanel3 = new javax.swing.JScrollPane();
        Descuentos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Principal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PrincipalStateChanged(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel.setForeground(new java.awt.Color(0, 0, 0));

        lectura.setBackground(new java.awt.Color(255, 255, 255));
        lectura.setForeground(new java.awt.Color(0, 0, 0));
        lectura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPanel.setViewportView(lectura);

        jPanel1.add(ScrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 1000, 270));

        Guardar_Lectura.setBackground(new java.awt.Color(18, 90, 173));
        Guardar_Lectura.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Guardar_Lectura.setForeground(new java.awt.Color(255, 255, 255));
        Guardar_Lectura.setText("Guardar");
        Guardar_Lectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_LecturaActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar_Lectura, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 100, 30));

        jLabel5.setText("Folio a buscar:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 150, -1));

        jLabel1.setText("Lectura final");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 100, -1));

        jLabel2.setText("Consumo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 80, -1));

        jLabel3.setText("Lectura Inicial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, -1));

        jLabel4.setText("Mes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, 80, -1));

        Inicial.setEditable(false);
        Inicial.setText("Lectura inicial");
        Inicial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                InicialFocusGained(evt);
            }
        });
        Inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                InicialKeyReleased(evt);
            }
        });
        jPanel1.add(Inicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 100, 30));

        LFinal.setText("Lectura final");
        LFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LFinalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LFinalFocusLost(evt);
            }
        });
        LFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LFinalKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LFinalKeyTyped(evt);
            }
        });
        jPanel1.add(LFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 100, 30));

        Consumo.setEditable(false);
        Consumo.setText("Consumo");
        jPanel1.add(Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 80, 30));

        Dato.setText("Ingresa el folio del contrato");
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DatoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });
        jPanel1.add(Dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 180, 30));

        jButton4.setBackground(new java.awt.Color(18, 90, 173));
        jButton4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 100, 30));

        id_mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_mesActionPerformed(evt);
            }
        });
        jPanel1.add(id_mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 80, 30));

        Informacion.setColumns(20);
        Informacion.setLineWrap(true);
        Informacion.setRows(5);
        Informacion.setWrapStyleWord(true);
        jScrollPane5.setViewportView(Informacion);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 180, 140));

        fijo.setText("Costo fijo");
        fijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijoActionPerformed(evt);
            }
        });
        jPanel1.add(fijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 90, 30));
        jPanel1.add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 80, 30));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        jPanel1.add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 990, 260));

        Principal.addTab("Lecturas", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel1.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel1.setForeground(new java.awt.Color(0, 0, 0));

        Consumos.setBackground(new java.awt.Color(255, 255, 255));
        Consumos.setForeground(new java.awt.Color(0, 0, 0));
        Consumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPanel1.setViewportView(Consumos);

        jPanel2.add(ScrollPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 410, 270));

        jToolBar1.setRollover(true);
        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 20, 280));

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("Tipo de consumo:");

        Tipo_Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_ConsumoActionPerformed(evt);
            }
        });

        Guardar_Consumo.setText("Guardar");
        Guardar_Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Guardar_ConsumoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Tipo_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Guardar_Consumo)
                .addGap(57, 57, 57))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Tipo_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Guardar_Consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 200, 150));

        jLabel13.setText("Añadir Tipo de consumo:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 6, 200, 30));

        jLabel6.setText("Actualizar tipo de consumo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 20));

        Id_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Id_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(Id_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 336, 76, -1));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 76, 30));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 170, -1));

        Principal.addTab("Catalogó consumo", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel2.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel2.setForeground(new java.awt.Color(0, 0, 0));

        Tarifas.setBackground(new java.awt.Color(255, 255, 255));
        Tarifas.setForeground(new java.awt.Color(0, 0, 0));
        Tarifas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPanel2.setViewportView(Tarifas);

        jPanel3.add(ScrollPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 560, 270));

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Consec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        jLabel7.setText("Numero:");

        jLabel8.setText("Tipo de consumo:");

        jLabel9.setText("Tarifa:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Consec, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_consumo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Tarifa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(157, 157, 157))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tarifa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Consec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 410, 140));

        jLabel14.setText("Añadir Tarifa:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 26, -1, 30));

        Principal.addTab("Catalogó tarifa", jPanel3);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel4.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel4.setForeground(new java.awt.Color(0, 0, 0));

        Periodos.setBackground(new java.awt.Color(255, 255, 255));
        Periodos.setForeground(new java.awt.Color(0, 0, 0));
        Periodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPanel4.setViewportView(Periodos);

        jPanel5.add(ScrollPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 410, 270));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Tipo periodo:");

        jLabel11.setText("Mes:");

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(Tipo_p)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mes_p, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(66, 66, 66))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tipo_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 210, 170));

        jLabel15.setText("Añadir Tipo de periodo:");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 26, -1, 30));

        Principal.addTab("Catalogó periodo", jPanel5);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ScrollPanel3.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPanel3.setForeground(new java.awt.Color(0, 0, 0));

        Descuentos.setBackground(new java.awt.Color(255, 255, 255));
        Descuentos.setForeground(new java.awt.Color(0, 0, 0));
        Descuentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ScrollPanel3.setViewportView(Descuentos);

        jPanel4.add(ScrollPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 1000, 270));

        Principal.addTab("Descuentos", jPanel4);

        add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void Guardar_LecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_LecturaActionPerformed
        if (c) {
            if (validator) {
                new Thread() {
                    public void run() {
                        InsertarLecturaPago();
                    }
                }.start();
            } else {
                int x = 0;
                boolean xy = false;
                int y = lectura.getRowCount();
                for (int i = 0; i < y; i++) {
                    int folio = Integer.parseInt(lectura.getValueAt(i, 0).toString());
                    if (folio == Integer.parseInt(Dato.getText())) {
                        x = i;
                        xy = true;
                    }
                }
                if (xy) {
                    if (lectura.getValueAt(x, 7).equals("Limite excedido")) {
                        new Thread() {
                            @Override
                            public void run() {
                                InsertarLecturaPago();
                            }
                        }.start();
                    } else {
                        JOptionPane.showMessageDialog(null, "Todavia no se requiere una nueva lectura\n para este contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }

        if (validator) {
            if (fijo.isSelected()) {
                InsertarLecturaPagoFijo(Float.valueOf(Importe.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));
            }
        } else {
            int x = 0;
            boolean xy = false;
            int y = lectura.getRowCount();
            for (int i = 0; i < y; i++) {
                int folio = Integer.parseInt(lectura.getValueAt(i, 0).toString());
                if (folio == Integer.parseInt(Dato.getText())) {
                    x = i;
                    xy = true;
                }
            }
            if (xy) {
                if (lectura.getValueAt(x, 7).equals("Limite excedido")) {
                    new Thread() {
                        @Override
                        public void run() {
                            InsertarLecturaPagoFijo(Float.valueOf(Importe.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));
                        }
                    }.start();
                } else {
                    JOptionPane.showMessageDialog(null, "Todavia no se requiere una nueva lectura\n para este contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_Guardar_LecturaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BuscarLecturas(Integer.parseInt(Dato.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void id_mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_mesActionPerformed

    private void LFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LFinalKeyReleased
        String lfinal = LFinal.getText();
        String linicial = Inicial.getText();

        double x1 = Double.parseDouble(lfinal);
        double x2 = Double.parseDouble(linicial);

        if (x2 < x1) {
            double resultado = x1 - x2;
            Consumo.setForeground(Color.black);
            Consumo.setText(String.valueOf(resultado));
            c = true;
        } else {
            Consumo.setForeground(Color.red);
            double resultado = x1 - x2;
            Consumo.setText(String.valueOf(resultado));

            c = false;
        }

    }//GEN-LAST:event_LFinalKeyReleased

    private void InicialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_InicialFocusGained

    }//GEN-LAST:event_InicialFocusGained

    private void LFinalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFinalFocusGained
        if (LFinal.getText().equals("Lectura final")) {
            LFinal.setText("");
        }
    }//GEN-LAST:event_LFinalFocusGained

    private void DatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyReleased
        if (evt.getKeyCode() == 10) {

            if (Dato.getText().isEmpty() || Dato.getText().equals("  Ingresa el folio del contrato")) {
                JOptionPane.showMessageDialog(null, "Los campos no estan llenos", "Aviso", JOptionPane.INFORMATION_MESSAGE);

            } else {
                new Thread() {
                    public void run() {
                        BuscarLecturas(Integer.parseInt(Dato.getText()));
                    }
                }.start();
            }
        }
    }//GEN-LAST:event_DatoKeyReleased

    private void InicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InicialKeyReleased

    }//GEN-LAST:event_InicialKeyReleased

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained
        if (Dato.getText().equals("Ingresa el folio del contrato")) {
            Dato.setText("");
        }
    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost
        if (Dato.getText().isEmpty()) {
            Dato.setText("Ingresa el folio del contrato");
        }
    }//GEN-LAST:event_DatoFocusLost

    private void LFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LFinalFocusLost
        if (LFinal.getText().isEmpty()) {
            LFinal.setText("Lectura final");
        }
    }//GEN-LAST:event_LFinalFocusLost

    private void LFinalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LFinalKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LFinalKeyTyped

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void fijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fijoActionPerformed
        if (fijo.isSelected()) {
            Inicial.setEnabled(false);
            LFinal.setEnabled(false);
            Consumo.setEnabled(false);
            Importe.setVisible(true);
            Precio_fijo = true;
        } else {
            Inicial.setEnabled(true);
            LFinal.setEnabled(true);
            Consumo.setEnabled(true);
            Importe.setVisible(false);
            Precio_fijo = false;
        }

    }//GEN-LAST:event_fijoActionPerformed

    private void PrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PrincipalStateChanged
        int indice = Principal.getSelectedIndex();

        switch (nombresIndex[indice]) {
            case "Lecturas":
                new MostrarLecturas().show();
                break;
            case "Catalogó consumo":
                new Thread() {
                    @Override
                    public void run() {
                        CargarConsumo();
                    }
                }.start();
                break;
            case "Catalogó tarifa":
                new Thread() {
                    @Override
                    public void run() {
                        CargarTarifas();
                    }
                }.start();
                break;
            case "Catalogó periodo":
                new Thread() {
                    @Override
                    public void run() {
                        CargarPeriodos();
                    }
                }.start();
                break;
            case "Descuentos":
                new Thread() {
                    @Override
                    public void run() {
                        CargarDescuentos();
                    }
                }.start();
                break;
        }
    }//GEN-LAST:event_PrincipalStateChanged

    private void Id_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Id_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Id_tipoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        CatalogosServicio cs = new CatalogosServicio();
        if (!Id_tipo.getText().isEmpty()) {
            for (int i = 0; i < Consumos.getRowCount(); i++) {
                if (!Consumos.getValueAt(i, 1).toString().toLowerCase().equals(Id_tipo.getText())
                        && !Consumos.getValueAt(i, 1).toString().equals(Id_tipo.getText())) {
                    if (cs.Insertar_Consumo(Id_tipo.getText())) {
                        JOptionPane.showMessageDialog(null, "Tipo de consumo registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                        new Thread() {
                            @Override
                            public void run() {
                                CargarConsumo();
                            }
                        }.start();
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "No se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tipo de consumo ya registrado", "Error", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar el campo", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CatalogosServicio cs = new CatalogosServicio();
        if (!Tipo_p.getText().isEmpty() && !Mes_p.getText().isEmpty()) {
            boolean status = cs.Insertar_Periodo(Tipo_p.getText(), Integer.parseInt(Mes_p.getText()));
            if (status) {
                JOptionPane.showMessageDialog(null, "Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No pudo ser registrado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TarifaServicio ts = new TarifaServicio();
        int id_cons = 0;
        for (int i = 0; i < ConsumoS.length; i++) {
            if (id_consumo.getSelectedItem().equals(ConsumoS[i])) {
                id_cons = Integer.parseInt(ConsumoS[i]);
            }
        }

        if (id_consumo.getSelectedIndex() >= 0 && !Tarifa.getText().isEmpty()) {
            boolean status = ts.Insertar_Tarifa(Integer.parseInt(Consec.getSelectedItem().toString()),
                    id_cons, Double.parseDouble(Tarifa.getText()));
            if (status) {
                JOptionPane.showMessageDialog(null, "Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No pudo ser registrado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Tipo_ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tipo_ConsumoActionPerformed

    private void Guardar_ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Guardar_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Guardar_ConsumoActionPerformed
    public class MostrarLecturas implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            ScrollPanel.setVisible(false);
            lectura.setVisible(false);
            Cargando.setVisible(true);
            Principal.setVisible(false);
            MostrarLecturas();
            Principal.setVisible(true);
            deber();
            fecha();
            Cargando.setVisible(false);
            ScrollPanel.setVisible(true);
            lectura.setVisible(true);
        }
    }

    private void InsertarLecturaPagoFijo(float lecturapago, int folio, int mes) {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        lecturapago = lps.InsertarLecturapagoFijo(lecturapago, folio, mes, true);

        if (lecturapago == -1) {
            JOptionPane.showMessageDialog(null, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            MostrarLecturas();
            deber();
        }
    }

    int lecturapago;

    private void InsertarLecturaPago() {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        lecturapago = lps.InsertarLecturapago(Double.valueOf(Inicial.getText()),
                Double.valueOf(LFinal.getText()), Double.valueOf(Consumo.getText()), Integer.parseInt(Dato.getText()), Integer.parseInt(id_mes.getText()));

        if (lecturapago == -1) {
            JOptionPane.showMessageDialog(null, "Lectura no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Lectura se registro", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            MostrarLecturas();
            deber();
        }
    }

    private void deber() {
        int fila = lectura.getRowCount();
        int i;
        String onemon = "(mon|mons)";
        for (i = 0; i < fila; i++) {
            Pattern patrono = Pattern.compile(onemon);

            if (patrono.matcher(lectura.getValueAt(i, 6).toString()).find()) {

                StringTokenizer st = new StringTokenizer(lectura.getValueAt(i, 6).toString());
                StringTokenizer sx = new StringTokenizer(lectura.getValueAt(i, 5).toString());

                int p = Integer.parseInt(sx.nextToken());
                int x = Integer.parseInt(st.nextToken());

                if (x == p | x >= p) {

                    lectura.setValueAt("Limite excedido", i, 7);

                }

            } else {
                lectura.setValueAt("ok", i, 7);
            }
        }
    }

    private void BuscarLecturas(int folio) {
        LecturaPagoServicio ds = new LecturaPagoServicio();
        List<LecturaPago> lista = ds.BuscarLectura(folio);
        int tam = lista.size();
        int inicial = 0;
        if (tam == 0) {
            if (Existencia(folio)) {
                int dialogButton = JOptionPane.showConfirmDialog(this, "El contrato no cuenta con una lectura\n ¿Desea añadir una nueva lectura?", "", JOptionPane.YES_NO_OPTION);

                if (JOptionPane.YES_OPTION == dialogButton) {
                    Inicial.setText(String.valueOf(inicial));
                    validator = true;
                } else {
                    validator = false;
                }
            }
        } else {
            LFinal.setText("");
            for (int i = 0; i < tam; i++) {
                Dato.setText(lista.get(i).getFolio_contrato().toString());
                Informacion.setText(" Lectura Inicial: " + lista.get(i).getLecturaIni().toString() + "\n"
                        + " Lecutra Fin: " + lista.get(i).getLecturaFin().toString() + "\n"
                        + " Consumo: " + lista.get(i).getConsumo().toString());
                Inicial.setText(lista.get(i).getLecturaFin().toString());
            }
        }
    }

    private boolean Existencia(int folio) {
        boolean existe = false;
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.SearchContrato_c(folio);
        int tam = lista.size();
        System.out.println(folio);
        System.out.println(tam);
        if (tam == 0) {
            JOptionPane.showMessageDialog(this, "Contrato no registrado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            existe = true;
        }
        return existe;
    }

    private void fecha() {
        id_mes.setText(String.valueOf(LocalDate.now().getMonthValue()));
        id_mes.setEditable(false);
    }

    private void MostrarLecturas() {
        LecturaPagoServicio lps = new LecturaPagoServicio();
        List<LecturaPago> lista = lps.MostrarLecturas();
        int tam = lista.size();

        String list[][] = new String[tam][7];

        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolio_contrato().toString();
            list[i][1] = lista.get(i).getConsumo().toString();
            list[i][2] = lista.get(i).getFolio_cliente().toString() + " " + lista.get(i).getNombre_cliente();
            list[i][3] = lista.get(i).getIdLectPago().toString();
            list[i][4] = lista.get(i).getFechaHora().toString();
            list[i][5] = lista.get(i).getMes() + " " + lista.get(i).getTipo_periodo();
            if (lista.get(i).getTiempo_transcurrido().equals("00:00:00")) {
                list[i][6] = "0";
            } else {
                list[i][6] = lista.get(i).getTiempo_transcurrido();
            }
        }
        String head[] = {"Folio contrato", "Consumo", "Cliente", "Id lectura", "Fecha lectura", "Periodo", "Tiempo transcurrido", "estado"};
        Integer TamañoColumna[] = {5, 5, 150, 5, 30, 30, 35, 5};
        Jtable(lectura, list, head, 8, TamañoColumna);
    }

    ////////////////////////////////////////////////////////////////////////
    //Tarifa
    private void CargarTarifas() {
        CargarConsumo();
        TarifaServicio ts = new TarifaServicio();
        List<DetTipoconsumoTarifa> lista = ts.Mostrar_Tarifas();
        int tam = lista.size();
        String list[][] = new String[tam][3];
        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getConsec());
            list[i][1] = lista.get(i).getTipo_consumo();
            list[i][2] = String.valueOf(lista.get(i).getTarifa());
        }
        String head[] = {"N°", "Tipo de Consumo", "Tarifa"};
        Integer TamaloColumna[] = {10, 50, 30};
        Jtable(Tarifas, list, head, 3, TamaloColumna);
    }

    ////////////////////////////////////////////////////////////////////////
    String ConsumoS[];

    //Consumo
    private void CargarConsumo() {
        CatalogosServicio ts = new CatalogosServicio();
        List<Cat_Consumo> lista = ts.GetConsumo();
        int tam = lista.size();
        String list[][] = new String[tam][2];
        ConsumoS = new String[2];
        id_consumo.removeAllItems();
        id_consumo.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            ConsumoS[0] = String.valueOf(lista.get(i).getId_consumo());
            ConsumoS[1] = lista.get(i).getTipo_consumo();
            id_consumo.addItem(lista.get(i).getTipo_consumo());
            list[i][0] = String.valueOf(lista.get(i).getId_consumo());
            list[i][1] = lista.get(i).getTipo_consumo();
        }
        String head[] = {"N°", "Tipo de Consumo"};
        Integer TamañoColumna[] = {10, 50};
        Jtable(Consumos, list, head, 2, TamañoColumna);
    }

    ////////////////////////////////////////////////////////////////////////
    //Periodo
    private void CargarPeriodos() {
        CatalogosServicio ts = new CatalogosServicio();
        List<Cat_periodo> lista = ts.GetPeriodo();
        int tam = lista.size();
        String list[][] = new String[tam][2];

        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getId_periodo());
            list[i][1] = lista.get(i).getTipo_periodo();
        }
        String head[] = {"N°", "Tipo de Periodo"};
        Integer TamañoColumna[] = {10, 50};
        Jtable(Periodos, list, head, 2, TamañoColumna);
    }

    ////////////////////////////////////////////////////////////////////////
    //Descuentos
    private void CargarDescuentos() {
        DescuentoServicio ts = new DescuentoServicio();
        List<Cat_descuento> lista = ts.ObtenerDescuentos();
        int tam = lista.size();
        String list[][] = new String[tam][5];

        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getId_desc());
            list[i][1] = lista.get(i).getDescripcion();
            list[i][2] = lista.get(i).getFecha_inc().toString();
            list[i][3] = lista.get(i).getFecha_fin().toString();
            list[i][4] = lista.get(i).getPorcentaje().toString();
        }
        String head[] = {"N°", "Descripción", "Fecha de inicio", "Fecha de finalización", "Porcentaje"};
        Integer TamañoColumna[] = {10, 100, 50, 50, 10};
        Jtable(Descuentos, list, head, 5, TamañoColumna);
    }

    ////////////////////////////////////////////////////////////////////////
    private void Jtable(JTable x, String list[][], String Head[], int columnas, Integer tamañoC[]) {
        if (list.length > 0) {
            x.setModel(new javax.swing.table.DefaultTableModel(list, Head));
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) x.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            for (int i = 0; i < columnas; i++) {
                x.getColumnModel().getColumn(i).setPreferredWidth(tamañoC[i]);
                x.getColumnModel().getColumn(i).setCellRenderer(tcr);
            }
        } else {
            x.setModel(new javax.swing.table.DefaultTableModel(list, Head));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JComboBox<String> Consec;
    private javax.swing.JTextField Consumo;
    private javax.swing.JTable Consumos;
    private javax.swing.JTextField Dato;
    private javax.swing.JTable Descuentos;
    private javax.swing.JButton Guardar_Consumo;
    private javax.swing.JButton Guardar_Lectura;
    private javax.swing.JTextField Id_tipo;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextArea Informacion;
    private javax.swing.JTextField Inicial;
    private javax.swing.JTextField LFinal;
    private javax.swing.JTextField Mes_p;
    private javax.swing.JTable Periodos;
    private javax.swing.JTabbedPane Principal;
    private javax.swing.JScrollPane ScrollPanel;
    private javax.swing.JScrollPane ScrollPanel1;
    private javax.swing.JScrollPane ScrollPanel2;
    private javax.swing.JScrollPane ScrollPanel3;
    private javax.swing.JScrollPane ScrollPanel4;
    private javax.swing.JTextField Tarifa;
    private javax.swing.JTable Tarifas;
    private javax.swing.JTextField Tipo_Consumo;
    private javax.swing.JTextField Tipo_p;
    private javax.swing.JCheckBox fijo;
    private javax.swing.JComboBox<String> id_consumo;
    private javax.swing.JTextField id_mes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable lectura;
    // End of variables declaration//GEN-END:variables
}
