package Vista;

import Entity.Cat_Consumo;
import Entity.Cat_periodo;
import Entity.Cliente;
import Entity.Contrato;
import Entity.Contrato_generado;
import Entity.DetTipoconsumoTarifa;
import Entity.ErrorsAndSuccesses;
import Entity.Informativo;
import Servicio.CatalogosServicio;
import Servicio.ClienteServicio;
import Servicio.ContratoServicio;
import Servicio.InformativoServicio;
import Servicio.TarifaServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class Contrato_regis extends javax.swing.JPanel {

    String Muni;
    String Resi;
    String nom_calle;
    String Refe;
    int Manz;
    int Lot;
    int folio;
    int folio_ct;
    String ubicacion;
    int idconsumo = 0;
    int idperiodo;
    String opcion;
    String menu;
    int id;
    boolean edit;
    String observaciones = "sin observaciones";
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public Contrato_regis(Cliente cliente, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        GetConsumo();
        GetPeriodo();
        this.ubicacion = ubicacion;
        this.folio = cliente.getFolio();
        Existencia();
        if (opcion.equals("Si")) {
            Referencia.setText(cliente.getCalleReferencia());
            Municipio.setText(cliente.getMunicipio());
            Residencia.setText(cliente.getResidencia());
            Nombre_calle.setText(cliente.getNombreCalle());
            Lote.setText(String.valueOf(cliente.getNumeroLt()));
            Manzana.setText(String.valueOf(cliente.getNumeroMzn()));
        }
    }

    public Contrato_regis(int folio, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        GetConsumo();
        GetPeriodo();
        this.ubicacion = ubicacion;
        this.folio = folio;
        Folio.setText(String.valueOf(folio));
        nombre(folio);
    }

    public Contrato_regis(boolean edit, int folio, String ubicacion) {
        initComponents();
        Tipo_c.setVisible(false);
        Tipo_p.setVisible(false);
        tarifa.setVisible(false);
        Consumo.setVisible(false);
        Periodo.setVisible(false);
        Tarifa.setVisible(false);
        Cargando.setVisible(false);
        this.ubicacion = ubicacion;
        this.folio_ct = folio;
        this.edit = edit;
        Folio.setText(String.valueOf(folio));
        Obtener(folio);
        Contrato.setText("Modificar datos del contrato");
        Registrar.setText("Guardar");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargando = new javax.swing.JLabel();
        Municipio = new javax.swing.JTextField();
        Consumo = new javax.swing.JComboBox<>();
        Periodo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Tipo_p = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        Nombre_calle = new javax.swing.JTextField();
        Referencia = new javax.swing.JTextField();
        Manzana = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Folio_c = new javax.swing.JLabel();
        Folio = new javax.swing.JLabel();
        Contrato = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rerefencia = new javax.swing.JLabel();
        Tipo_c = new javax.swing.JLabel();
        Tarifa = new javax.swing.JComboBox<>();
        tarifa = new javax.swing.JLabel();
        observacione = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));

        Municipio.setBackground(new java.awt.Color(255, 255, 255));
        Municipio.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Municipio.setForeground(new java.awt.Color(0, 0, 0));
        Municipio.setText(" Municipio");
        Municipio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MunicipioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MunicipioFocusLost(evt);
            }
        });
        Municipio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MunicipioMousePressed(evt);
            }
        });
        Municipio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MunicipioKeyTyped(evt);
            }
        });
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 170, 40));

        Consumo.setBackground(new java.awt.Color(255, 255, 255));
        Consumo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Consumo.setForeground(new java.awt.Color(0, 0, 0));
        Consumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Consumo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consumo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ConsumoItemStateChanged(evt);
            }
        });
        Consumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsumoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConsumoMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ConsumoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConsumoMouseReleased(evt);
            }
        });
        Consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsumoActionPerformed(evt);
            }
        });
        Consumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConsumoKeyTyped(evt);
            }
        });
        add(Consumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 170, 40));

        Periodo.setBackground(new java.awt.Color(255, 255, 255));
        Periodo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        Periodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Periodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PeriodoMousePressed(evt);
            }
        });
        add(Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 200, 40));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Municipio:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 20));

        Tipo_p.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_p.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_p.setText("Periodo a pagar:");
        add(Tipo_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 150, 40));

        Residencia.setBackground(new java.awt.Color(255, 255, 255));
        Residencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Residencia.setForeground(new java.awt.Color(0, 0, 0));
        Residencia.setText(" Col/barrio/fracc");
        Residencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ResidenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ResidenciaFocusLost(evt);
            }
        });
        Residencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResidenciaMousePressed(evt);
            }
        });
        Residencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResidenciaKeyTyped(evt);
            }
        });
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 200, 40));

        Nombre_calle.setBackground(new java.awt.Color(255, 255, 255));
        Nombre_calle.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_calle.setText(" Calle");
        Nombre_calle.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Nombre_calleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Nombre_calleFocusLost(evt);
            }
        });
        Nombre_calle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre_calleMousePressed(evt);
            }
        });
        Nombre_calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_calleKeyTyped(evt);
            }
        });
        add(Nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 140, 40));

        Referencia.setBackground(new java.awt.Color(255, 255, 255));
        Referencia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Referencia.setForeground(new java.awt.Color(0, 0, 0));
        Referencia.setText(" Calle de referencia");
        Referencia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ReferenciaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ReferenciaFocusLost(evt);
            }
        });
        Referencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReferenciaMousePressed(evt);
            }
        });
        Referencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReferenciaActionPerformed(evt);
            }
        });
        add(Referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 150, 40));

        Manzana.setBackground(new java.awt.Color(255, 255, 255));
        Manzana.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Manzana.setForeground(new java.awt.Color(0, 0, 0));
        Manzana.setText(" Num. Manz");
        Manzana.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ManzanaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ManzanaFocusLost(evt);
            }
        });
        Manzana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ManzanaMousePressed(evt);
            }
        });
        Manzana.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ManzanaKeyTyped(evt);
            }
        });
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, 40));

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        Lote.setText(" Num. Lt");
        Lote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoteFocusGained(evt);
            }
        });
        Lote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoteMousePressed(evt);
            }
        });
        Lote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LoteKeyTyped(evt);
            }
        });
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 90, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        Folio_c.setForeground(new java.awt.Color(0, 0, 0));
        Folio_c.setText("Folio del cliente:");
        add(Folio_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));
        add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 60, 30));

        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Contrato.setText("Contrato");
        add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Residencia:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 180, 20));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nombre de la calle:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 140, 20));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Numero de manzana: ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 140, 30));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Lote/Numero Exterior:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 30));

        rerefencia.setBackground(new java.awt.Color(0, 0, 0));
        rerefencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rerefencia.setForeground(new java.awt.Color(0, 0, 0));
        rerefencia.setText("Calle de referencia:");
        add(rerefencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, 140, 20));

        Tipo_c.setBackground(new java.awt.Color(0, 0, 0));
        Tipo_c.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Tipo_c.setForeground(new java.awt.Color(0, 0, 0));
        Tipo_c.setText("Tipo de consumo:");
        add(Tipo_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 120, 40));

        Tarifa.setBackground(new java.awt.Color(255, 255, 255));
        Tarifa.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Tarifa.setForeground(new java.awt.Color(0, 0, 0));
        Tarifa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(Tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 160, 40));

        tarifa.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tarifa.setForeground(new java.awt.Color(0, 0, 0));
        tarifa.setText("Tarifa:");
        add(tarifa, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 110, 40));

        observacione.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        observacione.setForeground(new java.awt.Color(0, 0, 0));
        observacione.setText("Observaciones: (opcional)");
        add(observacione, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, 40));

        Registrar.setBackground(new java.awt.Color(18, 90, 173));
        Registrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.setBorder(null);
        Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 100, 40));

        Regresar.setBackground(new java.awt.Color(18, 90, 173));
        Regresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setText("Volver");
        Regresar.setBorder(null);
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 100, 40));

        Observaciones.setBackground(new java.awt.Color(255, 255, 255));
        Observaciones.setColumns(20);
        Observaciones.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Observaciones.setForeground(new java.awt.Color(0, 0, 0));
        Observaciones.setRows(5);
        jScrollPane1.setViewportView(Observaciones);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 270, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void MunicipioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MunicipioMousePressed

    }//GEN-LAST:event_MunicipioMousePressed

    private void ConsumoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMousePressed


    }//GEN-LAST:event_ConsumoMousePressed

    private void ConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConsumoActionPerformed

    private void PeriodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PeriodoMousePressed


    }//GEN-LAST:event_PeriodoMousePressed

    private void ResidenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResidenciaMousePressed

    }//GEN-LAST:event_ResidenciaMousePressed

    private void Nombre_calleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_calleMousePressed

    }//GEN-LAST:event_Nombre_calleMousePressed

    private void ManzanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManzanaMousePressed

    }//GEN-LAST:event_ManzanaMousePressed

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed

    }//GEN-LAST:event_LoteMousePressed

    private void ReferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReferenciaMousePressed

    }//GEN-LAST:event_ReferenciaMousePressed

    private void MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyTyped
        entrada(evt);
    }//GEN-LAST:event_MunicipioKeyTyped

    private void ResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResidenciaKeyTyped

    }//GEN-LAST:event_ResidenciaKeyTyped

    private void Nombre_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_calleKeyTyped

    }//GEN-LAST:event_Nombre_calleKeyTyped

    private void ManzanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManzanaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ManzanaKeyTyped

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void ConsumoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConsumoKeyTyped

    }//GEN-LAST:event_ConsumoKeyTyped

    private void ConsumoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseReleased

    private void ConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseEntered

    private void ConsumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsumoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_ConsumoMouseClicked

    private void ConsumoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ConsumoItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED && Consumo.getSelectedIndex() > 0) {
            for (String[] Cons : Consumos) {
                if (Cons[1].equals(Consumo.getSelectedItem())) {
                    idconsumo = Integer.parseInt(Cons[0]);
                }
            }
            new Tari().show();
        }
    }//GEN-LAST:event_ConsumoItemStateChanged

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if (Observaciones.getText().isEmpty()) {

        } else {
            observaciones = Observaciones.getText();
        }

        for (String[] Cons : Consumos) {
            if (Cons[1].equals(Consumo.getSelectedItem())) {
                idconsumo = Integer.parseInt(Cons[0]);
            }
        }

        for (String[] Per : Periodos) {
            if (Per[1].equals(Periodo.getSelectedItem())) {
                idperiodo = Integer.parseInt(Per[0]);
            }
        }

        for (String[] Tari : Tarifas) {
            if (Tari[1].equals(Tarifa.getSelectedItem())) {
                id = Integer.parseInt(Tari[0]);
            }
        }

        if (Municipio.getText().equals(" Municipio") || Municipio.getText().isEmpty()) {
            Municipio.requestFocus();
            JOptionPane.showMessageDialog(null, "Campo vacio: Municipio", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (Residencia.getText().equals(" Col/barrio/fracc") || Residencia.getText().isEmpty()) {
                Residencia.requestFocus();
                JOptionPane.showMessageDialog(null, "Campo vacio: Residencia", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (Nombre_calle.getText().equals(" Calle") || Nombre_calle.getText().isEmpty()) {
                    Nombre_calle.requestFocus();
                    JOptionPane.showMessageDialog(null, "Campo vacio: Calle", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (Referencia.getText().equals(" Calle de referencia") || Referencia.getText().isEmpty()) {
                        Referencia.requestFocus();
                        JOptionPane.showMessageDialog(null, "Campo vacio: Calle de referencia", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        if (Manzana.getText().equals(" Num. Manz") || Manzana.getText().isEmpty()) {
                            Manzana.requestFocus();
                            JOptionPane.showMessageDialog(null, "Campo vacio: Manzana", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            if (Lote.getText().equals(" Num. Lt") || Lote.getText().isEmpty()) {
                                Lote.requestFocus();
                                JOptionPane.showMessageDialog(null, "Campo vacio:Lote", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                if (edit == true) {
                                    new Hilos().show();
                                } else {
                                    if (Consumo.getSelectedItem().equals("Selecciona una opción")) {
                                        Consumo.requestFocus();
                                        JOptionPane.showMessageDialog(null, "Campo vacio: Tipo de consumo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                    } else {
                                        if (Periodo.getSelectedItem().equals("Selecciona una opción")) {
                                            Periodo.requestFocus();
                                            JOptionPane.showMessageDialog(null, "Campo vacio: Periodo de pago", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                        } else {
                                            if (Tarifa.getSelectedItem().equals("Selecciona una opción")) {
                                                Tarifa.requestFocus();
                                                JOptionPane.showMessageDialog(null, "Campo vacio: Tarifa", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                            } else {
                                                new Hilos().show();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        if (ubicacion.equals("insert cliente")) {
            JOptionPane.showMessageDialog(this, "El contrato no puede ser cancelado", "Contrato", JOptionPane.INFORMATION_MESSAGE);
        }
        if (ubicacion.equals("editar contrato")||ubicacion.equals("contrato")) {
            Contrato_v p1 = new Contrato_v();
            p1.setSize(1030, 500);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        if (ubicacion.equals("Registrar contrato")) {
            Clientes p1 = new Clientes();
            p1.setSize(1030, 500);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void MunicipioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusGained
        if (Municipio.getText().equals(" Municipio")) {
            Municipio.setText("");
        }
    }//GEN-LAST:event_MunicipioFocusGained

    private void MunicipioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusLost
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
    }//GEN-LAST:event_MunicipioFocusLost

    private void ResidenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusGained
        if (Residencia.getText().equals(" Col/barrio/fracc")) {
            Residencia.setText("");
        }
    }//GEN-LAST:event_ResidenciaFocusGained

    private void ResidenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusLost
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
    }//GEN-LAST:event_ResidenciaFocusLost

    private void Nombre_calleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusGained
        if (Nombre_calle.getText().equals(" Calle")) {
            Nombre_calle.setText("");
        }
    }//GEN-LAST:event_Nombre_calleFocusGained

    private void Nombre_calleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusLost
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Calle");
        }
    }//GEN-LAST:event_Nombre_calleFocusLost

    private void ReferenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusGained
        if (Referencia.getText().equals(" Calle de referencia")) {
            Referencia.setText("");
        }
    }//GEN-LAST:event_ReferenciaFocusGained

    private void ReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReferenciaActionPerformed

    private void ReferenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusLost
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_ReferenciaFocusLost

    private void ManzanaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusGained
        if (Manzana.getText().equals(" Num. Manz")) {
            Manzana.setText("");
        }
    }//GEN-LAST:event_ManzanaFocusGained

    private void ManzanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusLost
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
    }//GEN-LAST:event_ManzanaFocusLost

    private void LoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusGained
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
    }//GEN-LAST:event_LoteFocusGained
    public class Tari implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            GetTarifa(idconsumo);
            System.out.println(idconsumo);
        }
    }

    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
            
        }

        public void run() {
            Informativo();
            Cargando.setVisible(true);
            if (Registrar.getText().equals("Registrar")) {
                InsertarContrato(folio);
            }
            if (Registrar.getText().equals("Guardar")) {
                actualizar();
                Cargando.setVisible(false);
            }
        }
    }
    String informativos;
    
    private void Informativo() {
        InformativoServicio info = new InformativoServicio();
        List<Informativo> listas = info.MostrarInformacion();
        int tam = listas.size();
        //informativos = new String[tam][1];
        for (int i = 0; i < tam; i++) {
            //informativo.setText(in.getInformativo());
            informativos = listas.get(i).getInformativo();
        }
    }
    String[][] Consumos;

    private void GetConsumo() {

        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_Consumo> lista = cs.GetConsumo();
        int tam = lista.size();
        Consumos = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Consumos[i][0] = lista.get(i).getId_consumo().toString();
            Consumos[i][1] = lista.get(i).getTipo_consumo();
            Consumo.addItem(lista.get(i).getTipo_consumo());
        }
    }

    String[][] Periodos;

    private void GetPeriodo() {
        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_periodo> lista = cs.GetPeriodo();
        int tam = lista.size();
        Periodos = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Periodos[i][0] = lista.get(i).getId_periodo().toString();
            Periodos[i][1] = lista.get(i).getTipo_periodo();
            Periodo.addItem(lista.get(i).getTipo_periodo());
        }
    }

    public void InsertarContrato(int folio) {

        ContratoServicio cs = new ContratoServicio();
        String status = "activo";

        Contrato_generado cg = new Contrato_generado();
        cg.setDireccion(Municipio.getText() + ", " + Residencia.getText() + ", " + Nombre_calle.getText());
        cg.setManzana(Manzana.getText());
        cg.setLote(Lote.getText());
        cg.setInformativo(informativos);
        
        es.setResultinsert(cs.InsertarContrato(Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), observaciones, Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()), id, idconsumo, idperiodo, folio, status));
        if (es.getResultinsert() == -1) {
            JOptionPane.showMessageDialog(null, "Hubo un error", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Contrato creado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
            cg = new Contrato_generado(folio, es.getResultinsert());
            Generar_contrato gc = new Generar_contrato("null");
            gc.setSize(1030, 500);
            gc.setLocation(0, 0);
            content.removeAll();
            content.add(gc, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    private void entrada(KeyEvent evt) {
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }

    private void Existencia() {
        if (ubicacion.equals("insert cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea incluir este domicilio en el contrato?", "Contrato", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                opcion = "Si";
            } else {
                opcion = "No";
            }
        }
    }

    String[][] Tarifas;

    private void GetTarifa(int id) {
        TarifaServicio ts = new TarifaServicio();
        List<DetTipoconsumoTarifa> lista = ts.Tarifas(id);
        int tam = lista.size();
        Tarifa.removeAllItems();
        Tarifa.addItem("Selecciona una opción");
        Tarifas = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Tarifas[i][0] = lista.get(i).getConsec().toString();
            Tarifas[i][1] = lista.get(i).getTarifa().toString();
            Tarifa.addItem(lista.get(i).getTarifa().toString());
        }
    }

    private void Obtener(int folio) {
        ContratoServicio cts = new ContratoServicio();
        List<Contrato> lista = cts.SearchContrato_c(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombreCalle());
            Referencia.setText(lista.get(i).getCalleReferencia());
            Manzana.setText(lista.get(i).getNumeroMzn().toString());
            Lote.setText(lista.get(i).getNumeroLt().toString());
            Observaciones.setText(lista.get(i).getObservaciones());
            Folio.setText(lista.get(i).getFolio_cte().toString());
        }
    }

    private void actualizar() {
        ContratoServicio cs = new ContratoServicio();
        es.setResultact(cs.ActualizarContrato(folio_ct, Municipio.getText(), Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), observaciones, Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText())));
        System.out.println(es.getResultact());
        if (es.getResultact() == -1) {
            JOptionPane.showMessageDialog(this, "Error al actualizar el contrato", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Contrato actualizado con exito", "Exito", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void nombre(int folio) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.SearchClientes(folio);
        int tam = lista.size();
        Contrato_generado cg = new Contrato_generado();
        for (int i = 0; i < tam; i++) {
            cg.setNombre_cliente(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JComboBox<String> Consumo;
    private javax.swing.JLabel Contrato;
    private javax.swing.JLabel Folio;
    private javax.swing.JLabel Folio_c;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Municipio;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JComboBox<String> Periodo;
    private javax.swing.JTextField Referencia;
    private javax.swing.JButton Registrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField Residencia;
    private javax.swing.JComboBox<String> Tarifa;
    private javax.swing.JLabel Tipo_c;
    private javax.swing.JLabel Tipo_p;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel observacione;
    private javax.swing.JLabel rerefencia;
    private javax.swing.JLabel tarifa;
    // End of variables declaration//GEN-END:variables
}
