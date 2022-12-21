package Vista;

import Entity.Cliente;
import Entity.Clientes_existentes;
import Entity.ErrorsAndSuccesses;
import Servicio.ClienteServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JPanel {

    String opcion;
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();
    public Clientes() {
        initComponents();
        es.setUbicacion("cliente");
        Cargando.setVisible(false);
        espera.setVisible(false);
        esperacontrato.setVisible(false);
        esperabusqueda.setVisible(false);
        new Iniciar().show();
        Mostrar.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();
                Point point = evt.getPoint();
                int row = Mostrar.rowAtPoint(point);

                if (evt.getClickCount() == 1) {
                    try {
                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {
                        usrnm.setText("Ingrese el folio de cliente a buscar");
                    }
                }
                if (evt.getClickCount() == 2) {
                    try {

                        usrnm.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        opcion = "Contratos cliente";
                        new Hilos().show();
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

        Title = new javax.swing.JLabel();
        usrnm = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Buscar = new javax.swing.JButton();
        NewC = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Delete = new javax.swing.JButton();
        Cargando = new javax.swing.JLabel();
        esperabusqueda = new javax.swing.JLabel();
        espera = new javax.swing.JLabel();
        esperacontrato = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setText("Clientes");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, -1));

        usrnm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usrnm.setForeground(new java.awt.Color(102, 102, 102));
        usrnm.setText("Ingrese el folio de cliente a buscar");
        usrnm.setBorder(null);
        usrnm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usrnmMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usrnmMouseReleased(evt);
            }
        });
        add(usrnm, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 610, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 153, 255));
        jSeparator2.setPreferredSize(new java.awt.Dimension(250, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 610, 10));

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
        add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 80, 30));

        NewC.setBackground(new java.awt.Color(18, 90, 173));
        NewC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NewC.setForeground(new java.awt.Color(255, 255, 255));
        NewC.setText("Nuevo contrato");
        NewC.setToolTipText("crear un contrato con un cliente ya existente");
        NewC.setBorder(null);
        NewC.setEnabled(false);
        NewC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewCActionPerformed(evt);
            }
        });
        add(NewC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 140, 30));

        Registro.setBackground(new java.awt.Color(18, 90, 173));
        Registro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("Registro de cliente");
        Registro.setToolTipText("crear un nuevo cliente");
        Registro.setBorder(null);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 160, 30));

        Edit.setBackground(new java.awt.Color(18, 90, 173));
        Edit.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setText("Editar");
        Edit.setToolTipText("Editar a un cliente seleccionado");
        Edit.setBorder(null);
        Edit.setEnabled(false);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 80, 30));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre", "Fecha de nacimiento", "Telefono", "Status", "RFC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Mostrar.getTableHeader().setReorderingAllowed(false);
        Mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Mostrar);
        if (Mostrar.getColumnModel().getColumnCount() > 0) {
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 340));

        Delete.setBackground(new java.awt.Color(18, 90, 173));
        Delete.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Dar de baja");
        Delete.setToolTipText("Dar de baja a el cliente elejido");
        Delete.setBorder(null);
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, 110, 30));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1030, 340));

        esperabusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(esperabusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 50, 50));

        espera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(espera, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 430, 50, 50));

        esperacontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(esperacontrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMousePressed
        if (usrnm.getText().equals("") || usrnm.getText() == null || usrnm.getText().equals(" ")) {
            usrnm.setText("Ingrese el folio de cliente a buscar");
        }
    }//GEN-LAST:event_MostrarMousePressed

    private void usrnmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMousePressed
        if (usrnm.getText().equals("Ingrese el folio de cliente a buscar")) {
            usrnm.setText("");
        }
    }//GEN-LAST:event_usrnmMousePressed

    private void usrnmMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usrnmMouseReleased

    }//GEN-LAST:event_usrnmMouseReleased

    private void MostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarMouseEntered

    }//GEN-LAST:event_MostrarMouseEntered

    private void NewCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewCActionPerformed
        opcion = "Contrato registro";
        new Hilos().show();
    }//GEN-LAST:event_NewCActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        opcion = "Registro cliente";
        new Hilos().show();
    }//GEN-LAST:event_RegistroActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        opcion = "Editar cliente";
        new Hilos().show();
    }//GEN-LAST:event_EditActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        if (usrnm.getText().equals("Ingrese el folio de contrato a buscar") || usrnm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vacio", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            opcion = "Buscar cliente";
            new Hilos().show();
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        opcion = "Baja cliente";
        new Hilos().show();
    }//GEN-LAST:event_DeleteActionPerformed
    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a modificar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Edit.setEnabled(true);
            Delete.setEnabled(true);
            NewC.setEnabled(true);
        }
    }

    public class Iniciar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {

            Mostrar.setVisible(false);
            jScrollPane2.setVisible(false);
            Cargando.setVisible(true);
            Mostrar();
            Cargando.setVisible(true);

            Mostrar.setVisible(true);
            jScrollPane2.setVisible(true);

        }
    }

    public class Hilos implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            if (opcion.equals("Registro cliente")) {
                Registrar();
            }
            if (opcion.equals("Contratos cliente")) {
                ContratosC();
            }
            if (opcion.equals("Contrato registro")) {
                esperacontrato.setVisible(true);
                NewContrato();
            }
            if (opcion.equals("Buscar cliente")) {
                esperabusqueda.setVisible(true);
                Buscar();
                esperabusqueda.setVisible(false);
            }
            if (opcion.equals("Editar cliente")) {
                espera.setVisible(true);
                Editar();
            }
            if (opcion.equals("Baja cliente")) {
                espera.setVisible(true);
                Baja();
                DefaultTableModel modelo = (DefaultTableModel) Mostrar.getModel();
                modelo.removeRow(Mostrar.getSelectedRow());
                espera.setVisible(false);
            }
        }
    }

    private void Baja() {
        ClienteServicio cs = new ClienteServicio();
        cs.EliminarClientes(Integer.parseInt(usrnm.getText()));
    }

    private void Editar() {
        InsertCl p1 = new InsertCl(Integer.parseInt(usrnm.getText()), "editar cliente");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void NewContrato() {
        Contrato_regis p1 = new Contrato_regis(Integer.parseInt(usrnm.getText()), "cliente contrato");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void ContratosC() {
        ContratosC ct = new ContratosC(Integer.parseInt(usrnm.getText()), "cliente");
        ct.setVisible(true);
    }

    private void Registrar() {
        InsertCl p1 = new InsertCl("insert cliente");
        p1.setSize(1030, 479);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void Buscar() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> list = cs.SearchClientes(Integer.parseInt(usrnm.getText()));
        int tam = list.size();
        String lista[][] = new String[tam][7];
        if (tam == 0) {
            JOptionPane.showMessageDialog(this, "No se encontro registro alguno", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (int i = 0; i < tam; i++) {
                lista[i][0] = list.get(i).getFolio().toString();
                lista[i][1] = list.get(i).getNombre() + " " + list.get(i).getApellido_p() + " " + list.get(i).getApellido_m();
                lista[i][2] = list.get(i).getFecha_nac().toString();
                lista[i][3] = list.get(i).getCelular();
                lista[i][4] = list.get(i).getEmail();
                lista[i][5] = list.get(i).getStatus();
                lista[i][6] = list.get(i).getRfc();
            }
            Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                    lista,
                    new String[]{
                        "Folio", "Nombre", "Fecha de nacimiento", "Celular", "Correo", "RFC", "Status"
                    }) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                    java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });
            if (Mostrar.getColumnModel().getColumnCount() > 0) {
                Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
                Mostrar.getColumnModel().getColumn(1).setPreferredWidth(200);
                Mostrar.getColumnModel().getColumn(6).setPreferredWidth(10);
            }
        }
    }
    String[] Clientes;
    String[] Numeros;
    String[] RFC;
    String[] CURPS;
    private void Mostrar() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.MostrarClientes();
        int tam = lista.size();
        String list[][] = new String[tam][7];
        Clientes = new String[tam];
        Numeros = new String[tam];
        RFC = new String[tam];
        CURPS = new String[tam];
        for (int i = 0; i < tam; i++) {
            Clientes[i] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            Numeros[i] = list[i][3] = lista.get(i).getCelular();
            RFC[i] = lista.get(i).getRfc();
            CURPS[i] = lista.get(i).getCurp();
            list[i][0] = lista.get(i).getFolio().toString();
            list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            list[i][2] = lista.get(i).getFecha_nac().toString();
            list[i][3] = lista.get(i).getCelular();
            list[i][4] = lista.get(i).getEmail();
            list[i][5] = lista.get(i).getRfc();
            list[i][6] = lista.get(i).getStatus();
        }
        Clientes_existentes cex = new Clientes_existentes(Clientes, Numeros, RFC, CURPS);
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "Folio", "Nombre", "Fecha de nacimiento", "Celular", "Correo", "RFC", "Status"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class
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
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(200);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JTable Mostrar;
    private javax.swing.JButton NewC;
    private javax.swing.JButton Registro;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel espera;
    private javax.swing.JLabel esperabusqueda;
    private javax.swing.JLabel esperacontrato;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField usrnm;
    // End of variables declaration//GEN-END:variables

    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }
}
