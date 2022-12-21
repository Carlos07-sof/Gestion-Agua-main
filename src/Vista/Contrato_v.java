package Vista;

import Entity.Contrato;
import Entity.Contrato_generado;
import Entity.ErrorsAndSuccesses;
import Entity.Informativo;
import Servicio.ContratoServicio;
import Servicio.InformativoServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.greenrobot.eventbus.Subscribe;

public class Contrato_v extends javax.swing.JPanel {

    String opcion;
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public Contrato_v() {
        initComponents();
        es.setUbicacion("contrato");
        espera.setVisible(false);
        esperabusqueda.setVisible(false);
        esperareimprimir.setVisible(false);
        new MostrarC().show();
        Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();
                Point point = evt.getPoint();
                int row = Mostrar.rowAtPoint(point);

                if (evt.getClickCount() == 1) {
                    try {
                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {
                        usrnm.setText("Ingrese el folio de contrato a buscar");
                    }
                }
                if (evt.getClickCount() == 2) {
                    try {

                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        ContratosC ct = new ContratosC(Integer.parseInt(usrnm.getText()), "contrato");
                        ct.setVisible(true);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Sin contrato", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Title = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cargando = new javax.swing.JLabel();
        espera = new javax.swing.JLabel();
        esperabusqueda = new javax.swing.JLabel();
        Reimprimir = new javax.swing.JButton();
        esperareimprimir = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio Contrato", "municipio", "colonia", "calle", "avenida", "referencia", "mzn", "lt", "id_consumo", "id_periodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Mostrar.getTableHeader().setReorderingAllowed(false);
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Mostrar);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 340));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Contratos");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el folio de contrato a buscar");
        usrnm.setBorder(null);
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        add(usrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 620, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 620, 10));

        Buscar.setBackground(new java.awt.Color(18, 90, 173));
        Buscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setText("Buscar");
        Buscar.setBorder(null);
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 80, 30));

        Nuevo.setBackground(new java.awt.Color(18, 90, 173));
        Nuevo.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.setBorder(null);
        Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NuevoMouseExited(evt);
            }
        });
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 80, 30));

        Edit.setBackground(new java.awt.Color(18, 90, 173));
        Edit.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Editar");
        Edit.setBorder(null);
        Edit.setEnabled(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 80, 30));

        Delete.setBackground(new java.awt.Color(18, 90, 173));
        Delete.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Dar de baja");
        Delete.setBorder(null);
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 80, 30));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 340));

        espera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        espera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(espera, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 440, 70, 50));

        esperabusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperabusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(esperabusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, 50));

        Reimprimir.setBackground(new java.awt.Color(18, 90, 173));
        Reimprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Reimprimir.setForeground(new java.awt.Color(255, 255, 255));
        Reimprimir.setText("Reimprimir contrato");
        Reimprimir.setBorder(null);
        Reimprimir.setEnabled(false);
        Reimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReimprimirActionPerformed(evt);
            }
        });
        add(Reimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 150, 30));

        esperareimprimir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        esperareimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(esperareimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 70, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" ")) {
            usrnm.setText("Ingrese el folio de contrato a buscar");
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased

    }//GEN-LAST:event_usrnmMouseReleased

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar") || usrnm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vacio", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = "Buscar contrato";
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Cliente_new_or_exist cn = new Cliente_new_or_exist();
        cn.setVisible(true);
    }//GEN-LAST:event_NuevoActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        opcion = "Editar contrato";
        new Hilos().show();
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        opcion = "Baja contrato";
        new Hilos().show();
    }//GEN-LAST:event_DeleteActionPerformed

    private void ReimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReimprimirActionPerformed
        opcion = "Reimprimir contrato";
        new Hilos().show();

    }//GEN-LAST:event_ReimprimirActionPerformed

    private void NuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseEntered
        setColor(Nuevo);
    }//GEN-LAST:event_NuevoMouseEntered

    private void NuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevoMouseExited
        resetColor(Nuevo);
    }//GEN-LAST:event_NuevoMouseExited

    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            if (opcion.equals("Editar contrato")) {
                espera.setVisible(true);
                Editar();
            }
            if (opcion.equals("Registrar cliente")) {
                espera.setVisible(true);
                Registrar();
            }
            if (opcion.equals("Registrar contrato")) {
                espera.setVisible(true);
                NewContrato();
            }
            if (opcion.equals("Baja contrato")) {
                espera.setVisible(true);
                Baja();
                DefaultTableModel modelo = (DefaultTableModel) Mostrar.getModel();
                modelo.removeRow(Mostrar.getSelectedRow());
                espera.setVisible(false);
            }
            if (opcion.equals("Buscar contrato")) {
                esperabusqueda.setVisible(true);
                Buscar();
                esperabusqueda.setVisible(false);
            }
            if (opcion.equals("Reimprimir contrato")) {
                esperareimprimir.setVisible(true);
                Generar_contrato();
                esperareimprimir.setVisible(false);

            }
        }

    }

    public class MostrarC implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            Mostrar.setVisible(false);
            jScrollPane2.setVisible(false);
            Cargando.setVisible(true);
            GetContratos();
            Informativo();
            Cargando.setVisible(false);
            Mostrar.setVisible(true);
            jScrollPane2.setVisible(true);
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

    private void Generar_contrato() {
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.Generarcontrato(Integer.parseInt(usrnm.getText()));
        int tam = lista.size();
        Contrato_generado cg = new Contrato_generado();
        if (tam > 0) {
            for (int i = 0; i < tam; i++) {
                cg.setFolio_contrato(lista.get(i).getFolioContrato());
                cg.setFolio_cliente(lista.get(i).getFolio_cte());
                cg.setNombre_cliente(lista.get(i).getNombre());
                cg.setCreacion_contrato(lista.get(i).getCreacion_contrato());
                cg.setDireccion(lista.get(i).getMunicipio() + ", " + lista.get(i).getResidencia() + ", " + lista.get(i).getNombreCalle());
                cg.setManzana(lista.get(i).getNumeroMzn().toString());
                cg.setLote(lista.get(i).getNumeroLt().toString());
                cg.setInformativo(informativos);
            }
            Generar_contrato gc = new Generar_contrato("null");
            gc.setSize(1030, 479);
            gc.setLocation(0, 0);

            content.removeAll();
            content.add(gc, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        } else {
            JOptionPane.showMessageDialog(null, "Hubo un error en la ejecucion", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Buscar() {
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.SearchContrato(Integer.parseInt(usrnm.getText()));
        int tam = lista.size();
        String list[][] = new String[tam][7];
        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolioContrato().toString();
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getMunicipio() + "/ " + lista.get(i).getResidencia() + "/ " + lista.get(i).getNombreCalle() + "/ " + lista.get(i).getCalleReferencia() + "/ " + lista.get(i).getNumeroMzn() + "/ " + lista.get(i).getNumeroLt();
            list[i][3] = lista.get(i).getTipo_consumo();
            list[i][4] = lista.get(i).getTipo_periodo();
            list[i][5] = lista.get(i).getDeuda().toString();
            list[i][6] = lista.get(i).getStatus();
        }
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(300);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(80);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(20);
        }
    }

    private void Registrar() {
        InsertCl p1 = new InsertCl("contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void NewContrato() {
        Contrato_regis p1 = new Contrato_regis(Integer.parseInt(usrnm.getText()), "contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void Baja() {
        ContratoServicio cs = new ContratoServicio();
        cs.DardeBaja(Integer.parseInt(usrnm.getText()));
    }

    private void Editar() {
        Contrato_regis p1 = new Contrato_regis(true, Integer.parseInt(usrnm.getText()), "editar contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void GetContratos() {
        ContratoServicio cs = new ContratoServicio();
        List<Contrato> lista = cs.MostrarContratos();
        int tam = lista.size();
        String list[][] = new String[tam][7];

        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolioContrato().toString();
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getMunicipio() + "/ " + lista.get(i).getResidencia() + "/ " + lista.get(i).getNombreCalle() + "/ " + lista.get(i).getCalleReferencia() + "/ " + lista.get(i).getNumeroMzn() + "/ " + lista.get(i).getNumeroLt();
            list[i][3] = lista.get(i).getTipo_consumo();
            list[i][4] = lista.get(i).getTipo_periodo();
            list[i][5] = lista.get(i).getDeuda().toString();
            list[i][6] = lista.get(i).getStatus();
        }
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Folio", "Nombre", "Direccion", "Consumo", "Periodo", "Deuda", "Status"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(2).setPreferredWidth(300);
            Mostrar.getColumnModel().getColumn(3).setPreferredWidth(80);
            Mostrar.getColumnModel().getColumn(4).setPreferredWidth(50);
            Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(20);
        }
    }

    void setColor(JButton boton) {
        boton.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JButton boton) {
        boton.setBackground(new Color(18, 90, 173));
    }

    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {

        } else {
            Edit.setEnabled(true);
            Delete.setEnabled(true);
            Reimprimir.setEnabled(true);
        }
    }

    @Subscribe
    public void Transporte(String numero) {
        if (numero.equals("0")) {
            opcion = "Registrar cliente";
            new Hilos().show();
        } else {
            usrnm.setText(numero);
            opcion = "Registrar contrato";
            new Hilos().show();
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTable Mostrar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JButton Reimprimir;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel espera;
    private javax.swing.JLabel esperabusqueda;
    private javax.swing.JLabel esperareimprimir;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables
}
