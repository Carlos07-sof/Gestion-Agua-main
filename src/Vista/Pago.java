package Vista;

import Entity.Cat_descuento;
import Entity.Cat_pago;
import Entity.Cliente;
import Entity.LecturaPago;
import Entity.Logeo;
import Entity.ticket_generado;
import Entity.pie_pagina;
import Servicio.AbonoService;
import Servicio.CatalogosServicio;
import Servicio.ClienteServicio;
import Servicio.DescuentoServicio;
import Servicio.InformativoServicio;
import Servicio.LecturaPagoServicio;
import Servicio.TicketServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.greenrobot.eventbus.Subscribe;

public class Pago extends javax.swing.JPanel {

    String opcion;
    String porcentaje;
    String consumo;
    String referencias;
    int id_desc = 0;
    int id_tipo = 0;
    Double Pagado = 0.0;
    Double Recibido = 0.0;
    DefaultListModel model = new DefaultListModel();

    public Pago() {
        initComponents();
        referencia.setVisible(false);
        Referencia.setVisible(false);
        Cargando.setVisible(false);
        Generando.setVisible(false);
        new Thread() {
            public void run() {
                Descuentos();
                Tipo_pago();
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dato = new javax.swing.JTextField();
        Pago = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Domicilio = new javax.swing.JTextField();
        N_cte = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        T_pago = new javax.swing.JComboBox<>();
        Importe = new javax.swing.JTextField();
        Busqueda = new javax.swing.JComboBox<>();
        Pagar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Contrato = new javax.swing.JTextField();
        contrato = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();
        Mes_pagar = new javax.swing.JTextField();
        Mes_adeudo = new javax.swing.JLabel();
        D_pago = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        Generando = new javax.swing.JLabel();
        Mes_adeudo1 = new javax.swing.JLabel();
        referencia = new javax.swing.JTextField();
        Referencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Adeudos_mes = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Adeudo_deuda = new javax.swing.JList<>();
        Cambio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        recibido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de pago");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1030, 10));

        Nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre.setText("Nombre:");
        add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad a pagar:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, 20));

        Dato.setBackground(new java.awt.Color(255, 255, 255));
        Dato.setForeground(new java.awt.Color(0, 0, 0));
        Dato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DatoFocusLost(evt);
            }
        });
        Dato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DatoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                DatoMouseReleased(evt);
            }
        });
        Dato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatoActionPerformed(evt);
            }
        });
        Dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DatoKeyTyped(evt);
            }
        });
        add(Dato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 40));

        Pago.setEditable(false);
        Pago.setBackground(new java.awt.Color(255, 255, 255));
        Pago.setForeground(new java.awt.Color(0, 0, 0));
        Pago.setText(" Cantidad a pagar");
        Pago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PagoFocusLost(evt);
            }
        });
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagoMousePressed(evt);
            }
        });
        Pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PagoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PagoKeyTyped(evt);
            }
        });
        add(Pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 180, 40));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Celular:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        Celular.setEditable(false);
        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 230, 40));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Deuda total:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 100, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Domicilio:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, -1));

        Domicilio.setEditable(false);
        Domicilio.setBackground(new java.awt.Color(255, 255, 255));
        Domicilio.setForeground(new java.awt.Color(0, 0, 0));
        add(Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 430, 40));

        N_cte.setEditable(false);
        N_cte.setBackground(new java.awt.Color(255, 255, 255));
        N_cte.setForeground(new java.awt.Color(0, 0, 0));
        N_cte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_cteActionPerformed(evt);
            }
        });
        add(N_cte, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 430, 40));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo de pago:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, -1, -1));

        T_pago.setBackground(new java.awt.Color(255, 255, 255));
        T_pago.setForeground(new java.awt.Color(0, 0, 0));
        T_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        T_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_pagoActionPerformed(evt);
            }
        });
        add(T_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 190, 40));

        Importe.setEditable(false);
        Importe.setBackground(new java.awt.Color(255, 255, 255));
        Importe.setForeground(new java.awt.Color(0, 0, 0));
        Importe.setText(" Importe acumulado");
        Importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImporteActionPerformed(evt);
            }
        });
        add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 190, 40));

        Busqueda.setBackground(new java.awt.Color(255, 255, 255));
        Busqueda.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Folio contrato", "Folio cliente", "Telefono/celular" }));
        Busqueda.setToolTipText("Busqueda por distintos datos");
        Busqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BusquedaMousePressed(evt);
            }
        });
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 160, 40));

        Pagar.setBackground(new java.awt.Color(18, 90, 173));
        Pagar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Pagar.setForeground(new java.awt.Color(255, 255, 255));
        Pagar.setText("Realizar pago");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });
        add(Pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 410, -1, 40));

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                BuscarFocusLost(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 110, 40));

        Contrato.setEditable(false);
        Contrato.setBackground(new java.awt.Color(255, 255, 255));
        Contrato.setForeground(new java.awt.Color(0, 0, 0));
        Contrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContratoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ContratoMouseReleased(evt);
            }
        });
        Contrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContratoActionPerformed(evt);
            }
        });
        add(Contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 190, 40));

        contrato.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        contrato.setForeground(new java.awt.Color(0, 0, 0));
        contrato.setText("Folio del Contrato");
        add(contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, -1, -1));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, 60, 60));

        Mes_pagar.setEditable(false);
        Mes_pagar.setBackground(new java.awt.Color(255, 255, 255));
        Mes_pagar.setForeground(new java.awt.Color(0, 0, 0));
        Mes_pagar.setText(" Mes atrasado");
        add(Mes_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 190, 40));

        Mes_adeudo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Mes_adeudo.setForeground(new java.awt.Color(0, 0, 0));
        Mes_adeudo.setText("Mes a pagar:");
        add(Mes_adeudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 90, 20));

        D_pago.setBackground(new java.awt.Color(255, 255, 255));
        D_pago.setForeground(new java.awt.Color(0, 0, 0));
        D_pago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        D_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_pagoActionPerformed(evt);
            }
        });
        add(D_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 230, 40));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Descuento:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 120, -1));

        Generando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Generando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Generando, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 400, 60, 60));

        Mes_adeudo1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Mes_adeudo1.setForeground(new java.awt.Color(0, 0, 0));
        Mes_adeudo1.setText("Meses con cargo:");
        add(Mes_adeudo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, 20));

        referencia.setBackground(new java.awt.Color(255, 255, 255));
        referencia.setForeground(new java.awt.Color(0, 0, 0));
        add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 230, 40));

        Referencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Referencia.setForeground(new java.awt.Color(0, 0, 0));
        Referencia.setText("Folio de ticket:");
        add(Referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 90, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Dato a buscar:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        Adeudos_mes.setBackground(new java.awt.Color(255, 255, 255));
        Adeudos_mes.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(Adeudos_mes);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 110, 100));

        Adeudo_deuda.setBackground(new java.awt.Color(255, 255, 255));
        Adeudo_deuda.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(Adeudo_deuda);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 80, 100));

        Cambio.setEditable(false);
        Cambio.setBackground(new java.awt.Color(255, 255, 255));
        Cambio.setForeground(new java.awt.Color(0, 0, 0));
        Cambio.setText("$0");
        add(Cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 80, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cambio:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, 20));

        recibido.setEditable(false);
        recibido.setBackground(new java.awt.Color(255, 255, 255));
        recibido.setForeground(new java.awt.Color(0, 0, 0));
        recibido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recibidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recibidoKeyTyped(evt);
            }
        });
        add(recibido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 130, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad recibida:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void N_cteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_cteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_cteActionPerformed

    private void DatoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoMouseReleased

    private void DatoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatoMousePressed

    }//GEN-LAST:event_DatoMousePressed

    private void PagoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMousePressed

    }//GEN-LAST:event_PagoMousePressed

    private void DatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatoActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BusquedaActionPerformed

    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        contrato_id = Integer.parseInt(Dato.getText());
        Pagado = Double.parseDouble(Pago.getText());
        Recibido = Double.parseDouble(recibido.getText());
        if (D_pago.getSelectedIndex() == 0) {
            porcentaje = "0";
        } else {
            for (String[] Desc : Descuentos) {
                if (Desc[1].equals(D_pago.getSelectedItem())) {
                    id_desc = Integer.parseInt(Desc[0]);
                    porcentaje = Desc[1];
                }
            }
        }
        if (Pago.getText().equals(" Cantidad a pagar") || Pago.getText().isEmpty()) {
            MensajeError("Campo vacio: Pago", Pago);
        } else {
            if (T_pago.getSelectedItem().equals("Seleccione una opción")) {
                MensajeError("Campo vacio: Tipo de Pago", T_pago);
            } else {
                for (String[] Tipo : Tipo_pago) {
                    if (Tipo[1].equals(T_pago.getSelectedItem())) {
                        id_tipo = Integer.parseInt(Tipo[0]);
                    }
                }
                new Thread() {
                    public void run() {
                        Dato.setEditable(false);
                        Busqueda.setEnabled(false);
                        Buscar.setEnabled(false);
                        Pago.setEditable(false);
                        Pagar.setEnabled(false);
                        D_pago.setEnabled(false);
                        T_pago.setEnabled(false);
                        Generando.setVisible(true);
                        InsertarPago();
                    }
                }.start();
            }
        }
    }//GEN-LAST:event_PagarActionPerformed

    private void BusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BusquedaMousePressed

    }//GEN-LAST:event_BusquedaMousePressed
    int contrato_id = 0;
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        if (!N_cte.getText().isEmpty()) {
            N_cte.setText("");
            Contrato.setText("");
            Celular.setText("");
            Domicilio.setText("");
            Importe.setText(" Importe a pagar");
            Mes_pagar.setText("");
            Pago.setText(" Cantidad a pagar");
            T_pago.setSelectedIndex(0);
            D_pago.setSelectedIndex(0);
            model.clear();
            Adeudo_deuda.setModel(model);
            Adeudos_mes.setModel(model);
        }

        if (Busqueda.getSelectedItem().equals("Folio contrato")) {
            contrato.setVisible(true);
            contrato.setText("Folio cliente");
        }
        if (Busqueda.getSelectedItem().equals("Folio cliente")) {
            contrato.setVisible(true);
            contrato.setText("Folio cliente");
        }
        if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
            contrato.setVisible(true);
            contrato.setText("Folio cliente:");
        }
        if (Busqueda.getSelectedItem().equals("Selecciona una opción") || Dato.getText().isEmpty()) {
            MensajeError("Debe ingresar y elegir el tipo de dato para la busqueda", Dato);
        } else {
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ContratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMousePressed

    private void ContratoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContratoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoMouseReleased

    private void ContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContratoActionPerformed

    private void DatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_DatoKeyTyped

    private void DatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusGained

    }//GEN-LAST:event_DatoFocusGained

    private void DatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DatoFocusLost

    }//GEN-LAST:event_DatoFocusLost

    private void PagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusGained
        if (Pago.getText().equals(" Cantidad a pagar")) {
            Pago.setText("");
        }
    }//GEN-LAST:event_PagoFocusGained

    private void PagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PagoFocusLost
        if (Pago.getText().isEmpty()) {
            Pago.setText(" Cantidad a pagar");
        }
    }//GEN-LAST:event_PagoFocusLost

    private void BuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BuscarFocusLost

    }//GEN-LAST:event_BuscarFocusLost

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
        Pago.requestFocus();
    }//GEN-LAST:event_BuscarKeyReleased

    private void ImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImporteActionPerformed

    private void D_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_pagoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_D_pagoActionPerformed

    private void T_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_pagoActionPerformed
        if (T_pago.getSelectedItem().equals("Ventanilla")) {
            Referencia.setVisible(true);
            referencia.setVisible(true);
        } else {
            Referencia.setVisible(false);
            referencia.setVisible(false);
            referencias = "No aplica";
        }


    }//GEN-LAST:event_T_pagoActionPerformed

    private void PagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_PagoKeyTyped

    private void PagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagoKeyReleased
        Cambio_p();
    }//GEN-LAST:event_PagoKeyReleased

    private void recibidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recibidoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_recibidoKeyTyped

    private void recibidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recibidoKeyReleased
        Cambio_p();
    }//GEN-LAST:event_recibidoKeyReleased
    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
            pie_pagina();
            //Encabezado();
        }

        @Override
        public void run() {
            Cargando.setVisible(true);

            if (Busqueda.getSelectedItem().equals("Folio contrato")) {
                contrato(Dato.getText());
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Folio cliente")) {
                cte();
                Cargando.setVisible(false);
            }
            if (Busqueda.getSelectedItem().equals("Telefono/celular")) {
                num();
                Cargando.setVisible(false);
            }

        }
    }
    

    private void MensajeError(String campo_e, Component campo) {
        JOptionPane.showMessageDialog(null, campo_e, " AVISO", JOptionPane.INFORMATION_MESSAGE);
        campo.requestFocus();
    }

    private void Cambio_p() {
        if (!Pago.getText().isEmpty() && !Pago.getText().equals(" Cantidad a pagar") && !recibido.getText().isEmpty()) {
            double pagado_c = Double.parseDouble(recibido.getText().trim());
            double pago = Double.parseDouble(Pago.getText().trim());
            if (pago < pagado_c) {
                double cambio = pagado_c - pago;
                Cambio.setText("$" + String.valueOf(cambio));
            } else {
                Cambio.setText("$0");
            }
        } else {
            Cambio.setText("$0");
        }
    }

    private void Limpiar() {
        recibido.setText("");
        Dato.setText("");
        N_cte.setText("");
        Contrato.setText("");
        Celular.setText("");
        Domicilio.setText("");
        Importe.setText(" Importe a pagar");
        Pago.setText(" Cantidad a pagar");
        model.clear();
        Adeudo_deuda.setModel(model);
        Adeudos_mes.setModel(model);
        MensajeError("No se encontro ningun registro", Dato);
    }

    private void Meses_deber(int id) {
        LecturaPagoServicio lp = new LecturaPagoServicio();
        List<LecturaPago> lista = lp.Meses_deuda(id);
        int tam = lista.size();

        String AdeuM[] = new String[tam];
        String AdeuD[] = new String[tam];
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                AdeuM[i] = lista.get(i).getMes() + ":";
                AdeuD[i] = lista.get(i).getAdeudo().toString();
            }
            Adeudos_mes.setListData(AdeuM);
            Adeudo_deuda.setListData(AdeuD);
            Adeudo_deuda.setSelectedIndex(0);
        } else {
            Mes_pagar.setText("No hay deudas");
        }
    }
    String nombre_e;
    String savc;
    String muni, estado,rfc;
    /*private void Encabezado() {
        InformativoServicio info = new InformativoServicio();
        List<Encabezado> listas = info.MostrarEncabezado();
        int tam = listas.size();
        for (int i = 0; i < tam; i++) {
            nombre_e = listas.get(i).getNombre_empresa();
            savc =  listas.get(i).getS_a_c_v();
            muni =  listas.get(i).getMunicipio();
            estado =  listas.get(i).getEstado();
            rfc =  listas.get(i).getRfc();  
        }
    }*/
    String pie_pag;
    private void pie_pagina() {
        InformativoServicio info = new InformativoServicio();
        List<pie_pagina> listas = info.MostrarPie_Pagina();
        int tam = listas.size();
        for (int i = 0; i < tam; i++) {
            pie_pag = listas.get(i).getPie_pagina();
        }
    }

    String Lectura_pago;
    String Fecha_pago;
    String mes;

    private void Mes(int id) {
        LecturaPagoServicio lp = new LecturaPagoServicio();
        List<LecturaPago> lista = lp.Mes_deuda(id);
        int tam = lista.size();

        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                mes = lista.get(i).getMes();
                Mes_pagar.setText(lista.get(i).getMes() + ": $" + lista.get(i).getAdeudo());
                Lectura_pago = lista.get(i).getIdLectPago().toString();
                Fecha_pago = lista.get(i).getFechaHora().toString();
            }
            Meses_deber(id);
        } else {
            Mes_pagar.setText("No hay deuda");
        }
    }

    private void contrato(String num) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_contrato(Integer.parseInt(num));
        int tam = lista.size();
        if (tam > 0) {
            Mes(Integer.parseInt(Dato.getText()));
            for (int i = 0; i < tam; i++) {
                Contrato.setText(lista.get(i).getFolio().toString());
                N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                Celular.setText(lista.get(i).getCelular());
                Domicilio.setText(lista.get(i).getMunicipio() + ", " + lista.get(i).getResidencia() + ", m: " + String.valueOf(lista.get(i).getNumeroMzn()) + ", l: " + String.valueOf(lista.get(i).getNumeroLt()));
                Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                consumo = lista.get(i).getConsumo();
                if (Importe.getText().equals("0.0")) {
                    Pagar.setEnabled(false);
                } else {
                    Pagar.setEnabled(true);
                    Pago.setEditable(true);
                    recibido.setEditable(true);
                }
            }
            Cargando.setVisible(false);
        } else {
            Limpiar();
        }
    }

    private void cte() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_cte(Integer.parseInt(Dato.getText()));
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);

            } else {
                for (int i = 0; i < tam; i++) {
                    Dato.setText(String.valueOf(lista.get(i).getFolio_c()));
                    Contrato.setText(lista.get(i).getFolio().toString());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Domicilio.setText(lista.get(i).getMunicipio() + ", " + lista.get(i).getResidencia() + ", m: " + String.valueOf(lista.get(i).getNumeroMzn()) + ", l: " + String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
            }
        } else {
            Limpiar();
        }

    }

    private void num() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_num(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Dato.setText(String.valueOf(lista.get(i).getFolioc()));
                    Busqueda.setSelectedIndex(1);
                    Contrato.setText(String.valueOf(lista.get(i).getFolio()));
                    Celular.setText(lista.get(i).getCelular());
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Domicilio.setText(lista.get(i).getMunicipio() + ", " + lista.get(i).getResidencia() + ", m: " + String.valueOf(lista.get(i).getNumeroMzn()) + ", l: " + String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
            }
        } else {
            numt();
        }

    }

    private void numt() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.PagoCl_numT(Dato.getText());
        int tam = lista.size();
        if (tam > 0) {
            if (tam > 1) {
                int fol = 0;
                for (int i = 0; i < tam; i++) {
                    fol = lista.get(i).getFolio();
                }
                ContratosC cc = new ContratosC("Contrato", fol);
                cc.setVisible(true);
            } else {
                for (int i = 0; i < tam; i++) {
                    Dato.setText(String.valueOf(lista.get(i).getFolioc()));
                    Busqueda.setSelectedIndex(1);
                    Contrato.setText(String.valueOf(lista.get(i).getFolio()));
                    N_cte.setText(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
                    Celular.setText(lista.get(i).getCelular());
                    Domicilio.setText(lista.get(i).getMunicipio() + ", " + lista.get(i).getResidencia() + ", m: " + String.valueOf(lista.get(i).getNumeroMzn()) + ", l: " + String.valueOf(lista.get(i).getNumeroLt()));
                    Importe.setText(String.valueOf(lista.get(i).getDeuda()));
                    if (Importe.getText().equals("0.0")) {
                        Pagar.setEnabled(false);
                    } else {
                        Pagar.setEnabled(true);
                        Pago.setEditable(true);
                        recibido.setEditable(true);
                    }
                }
            }
        } else {
            Limpiar();
        }

    }

    String[][] Tipo_pago;

    private void Tipo_pago() {
        CatalogosServicio cs = new CatalogosServicio();
        List<Cat_pago> lista = cs.Tipo_pago();
        int tam = lista.size();
        Tipo_pago = new String[tam][2];
        T_pago.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            Tipo_pago[i][0] = lista.get(i).getId_pago().toString();
            Tipo_pago[i][1] = lista.get(i).getTipo_pago();
            T_pago.addItem(lista.get(i).getTipo_pago());
        }
    }

    String[][] Descuentos;

    private void Descuentos() {
        DescuentoServicio ds = new DescuentoServicio();
        List<Cat_descuento> lista = ds.ObtenerDescuentos();
        int tam = lista.size();
        Descuentos = new String[tam][2];
        D_pago.addItem("Seleccione una opción");
        for (int i = 0; i < tam; i++) {
            Descuentos[i][0] = lista.get(i).getId_desc().toString();
            Descuentos[i][1] = lista.get(i).getPorcentaje().toString();
            D_pago.addItem(lista.get(i).getPorcentaje().toString());
        }
    }
    int consec_abono;

    private void InsertarPago() {
        if (T_pago.getSelectedItem().equals("Ventanilla")) {
            referencias = referencia.getText();
        }
        AbonoService as = new AbonoService();
        consec_abono = as.Abonar(Pagado, Integer.parseInt(Lectura_pago), id_tipo, id_desc, referencias, Recibido);
        if (consec_abono == -1) {
            MensajeError("No se pudo registrar el pago", Pago);
            Generando.setVisible(false);
            Pagar.setEnabled(true);
            Dato.setEditable(true);
            Busqueda.setEnabled(true);
            Buscar.setEnabled(true);
            Pago.setEditable(true);
            D_pago.setEnabled(true);
            T_pago.setEnabled(true);
        } else {
            MensajeError("Pago exitoso", Dato);
            InsertarTicket();

            Contrato.setText("");
            N_cte.setText("");
            Celular.setText("");
            Domicilio.setText("");
            Importe.setText(" Deuda total");
            Mes_pagar.setText(" Mes atrasado");
            model.clear();
            Adeudo_deuda.setModel(model);
            Adeudos_mes.setModel(model);
            Pago.setText(" Cantidad a pagar");
            recibido.setEditable(false);
            Cambio.setText("$0");
            Pagar.setEnabled(false);
            recibido.setText("");
            Pago.setEditable(false);
            D_pago.setSelectedIndex(0);
            T_pago.setSelectedIndex(0);
        }
    }
    int ticket = 0;

    private void InsertarTicket() {
        TicketServicio ts = new TicketServicio();
        System.out.println(Lectura_pago + " " + consec_abono);
        ticket = ts.InsertTicket(Integer.parseInt(Lectura_pago), consec_abono);
        ticket_generado tg = new ticket_generado();
        tg.setNombre_empresa(nombre_e+", ");
        tg.setS_a_c_v(savc);
        tg.setMunicipio(muni);
        tg.setEstado(estado);
        tg.setRfc(rfc);
        System.out.println(ticket);
        if (ticket == -1) {
            JOptionPane.showMessageDialog(null, "Ticket no registrado", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            Generar_ticket gt = new Generar_ticket("null");
            gt.setSize(1022, 510);
            gt.setLocation(0, 0);
            content.removeAll();
            content.add(gt, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    double bHight = 0.0;

    public PageFormat getPageFormat(PrinterJob pj) {

        PageFormat pf = pj.defaultPage();
        Paper paper = pf.getPaper();

        double bodyHeight = bHight;
        double headerHeight = 20.0;
        double footerHeight = 20.0;
        double width = cm_to_pp(22);
        double height = cm_to_pp(headerHeight + bodyHeight + footerHeight);
        paper.setSize(width, height);
        paper.setImageableArea(0, 15, width, height - cm_to_pp(1));

        pf.setOrientation(PageFormat.PORTRAIT);
        pf.setPaper(paper);

        return pf;
    }

    protected static double cm_to_pp(double cm) {
        return toPPI(cm * 0.393600787);
    }

    protected static double toPPI(double inch) {
        return inch * 72d;
    }
    float pag;
    float imp;
    int desc;
    String RFC = "MCA771223GFA";
    Logeo lo = new Logeo();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public class BillPrintable implements Printable {

        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

            int result = NO_SUCH_PAGE;
            pag = Float.parseFloat(Pago.getText());
            imp = Float.parseFloat(Importe.getText());
            float total = imp - pag;

            if (pageIndex == 0) {
                Graphics2D g2d = (Graphics2D) graphics;
                double width = pageFormat.getImageableWidth();
                g2d.translate((int) pageFormat.getImageableX(), (int) pageFormat.getImageableY());
                try {
                    int y = 30;
                    int yShift = 12;
                    int headerRectHeight = 15;
                    g2d.setFont(new Font("Monospaced", Font.PLAIN, 9));
                    g2d.drawString("--------------------------------------------------" + "      " + "--------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString("GESTION DE SERVICIO PUBLICO DE AGUA, S.A DE C.V." + "        " + "GESTION DE SERVICIO PUBLICO DE AGUA, S.A DE C.V.", 12, y);
                    y += yShift;
                    g2d.drawString("    CACAHOATAN, CHIAPAS     " + " R.F.C.: " + RFC + "        " + "    CACAHOATAN, CHIAPAS     " + " R.F.C.: " + RFC, 12, y);
                    y += yShift;
                    g2d.drawString("--------------------------------------------------" + "      " + "---------------------------------------------------", 12, y);
                    y += yShift;
                    g2d.drawString(" OPERADOR " + "             " + " Fecha: " + dtf.format(LocalDateTime.now()) + " " + "     " + " OPERADOR " + "             " + " Fecha: " + dtf.format(LocalDateTime.now()), 12, y);
                    y += yShift;
                    g2d.drawString(" " + lo.getUsuario() + " " + " Folio de ticket: " + ticket + "                   " + "   " + lo.getUsuario() + " " + " Folio de ticket: " + ticket, 12, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------" + "     " + "---------------------------------------------------", 12, y);
                    y += headerRectHeight;
                    g2d.drawString("               DATOS DEL CLIENTE                    " + "     " + "               DATOS DEL CLIENTE                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Nombre: " + N_cte.getText() + "   " + "   " + "                    " + " Nombre: " + N_cte.getText() + "   " + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Folio del contrato: " + contrato_id + " Folio de cliente: " + Contrato.getText() + "              " + " Folio del contrato:  " + contrato_id + " Folio de cliente: " + Contrato.getText(), 10, y);
                    y += yShift;
                    g2d.drawString(" Domicilio: " + Domicilio.getText() + "   " + "              " + " Domicilio: " + Domicilio.getText() + "   ", 10, y);
                    y += yShift;
                    g2d.drawString("---------------------------------------------------" + "     " + "---------------------------------------------------", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("               DETALLES DEL PAGO                    " + "     " + "               DETALLES DEL PAGO                    ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Mes del pago:     " + mes + "   " + "                            " + "Mes del pago:     " + mes + "   ", 10, y);
                    y += yShift;
                    g2d.drawString(" Tipo de consumo:  " + consumo + " " + "                             " + " Tipo de consumo:  " + consumo + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Cargo generado:    $" + Importe.getText() + "         " + T_pago.getSelectedItem().toString() + "             " + " Cargo generado:    $" + Importe.getText() + "         " + T_pago.getSelectedItem().toString(), 10, y);
                    y += yShift;
                    g2d.drawString(" Descuento:         %" + porcentaje + " " + "                                 " + " Descuento:         %" + porcentaje + " ", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Monto del pago:    $" + Pago.getText() + "" + "                                  " + " Monto del pago:    $" + Pago.getText() + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString(" Total:             $" + total + "" + "                              " + " Total:             $" + total + "", 10, y);
                    y += headerRectHeight;
                    g2d.drawString("***************************************************" + "     " + "***************************************************", 10, y);
                    y += yShift;
                    g2d.drawString("           ¡Gracias vuelva pronto!          " + "     " + "                  ¡Gracias vuelva pronto!          ", 10, y);
                    y += yShift;
                    g2d.drawString("***************************************************" + "     " + "***************************************************", 10, y);
                    y += headerRectHeight;

                } catch (Exception e) {
                }
                result = PAGE_EXISTS;
            }
            return result;
        }
    }

    @Subscribe
    public void Transporte(String v) {
        Dato.setText(v);
        Busqueda.setSelectedItem("Folio contrato");

        new Hilos().show();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Adeudo_deuda;
    private javax.swing.JList<String> Adeudos_mes;
    private javax.swing.JButton Buscar;
    private javax.swing.JComboBox<String> Busqueda;
    private javax.swing.JTextField Cambio;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Celular;
    private javax.swing.JTextField Contrato;
    private javax.swing.JComboBox<String> D_pago;
    private javax.swing.JTextField Dato;
    private javax.swing.JTextField Domicilio;
    private javax.swing.JLabel Generando;
    private javax.swing.JTextField Importe;
    private javax.swing.JLabel Mes_adeudo;
    private javax.swing.JLabel Mes_adeudo1;
    private javax.swing.JTextField Mes_pagar;
    private javax.swing.JTextField N_cte;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Pagar;
    private javax.swing.JTextField Pago;
    private javax.swing.JLabel Referencia;
    private javax.swing.JComboBox<String> T_pago;
    private javax.swing.JLabel contrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField recibido;
    private javax.swing.JTextField referencia;
    // End of variables declaration//GEN-END:variables
}
