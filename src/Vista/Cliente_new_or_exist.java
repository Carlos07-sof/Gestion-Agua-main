package Vista;

import Entity.Cliente;
import Servicio.ClienteServicio;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Cliente_new_or_exist extends javax.swing.JDialog {

    public Cliente_new_or_exist() {
        initComponents();
        Cargando.setVisible(false);
        Elegir.setEnabled(false);
        this.setLocationRelativeTo(null);
        new Thread() {
            @Override
            public void run() {
                Scroll.setVisible(false);
                Mostrar.setVisible(false);
                Cargando.setVisible(true);
                Clientes();
                Cargando.setVisible(false);
                Scroll.setVisible(true);
                Mostrar.setVisible(true);
            }
        }.start();
        Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();

                if (evt.getClickCount() == 1) {
                    try {
                        Folio.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {
                        evt.consume();
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Folio = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Elegir = new javax.swing.JButton();
        Scroll = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Cargando = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 20));

        Title.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 0, 0));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Seleccione un cliente");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 40));

        Elegir.setBackground(new java.awt.Color(18, 90, 173));
        Elegir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Elegir.setForeground(new java.awt.Color(255, 255, 255));
        Elegir.setText("Elegir");
        Elegir.setBorder(null);
        Elegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElegirActionPerformed(evt);
            }
        });
        jPanel1.add(Elegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 120, 40));

        Scroll.setBackground(new java.awt.Color(255, 255, 255));
        Scroll.setForeground(new java.awt.Color(255, 255, 255));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Scroll.setViewportView(Mostrar);

        jPanel1.add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 910, 260));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        jPanel1.add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 910, 260));

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Cancelar");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 120, 40));

        Crear.setBackground(new java.awt.Color(18, 90, 173));
        Crear.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Crear.setForeground(new java.awt.Color(255, 255, 255));
        Crear.setText("Nuevo cliente");
        Crear.setBorder(null);
        Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearActionPerformed(evt);
            }
        });
        jPanel1.add(Crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void ElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElegirActionPerformed
        Interfaz2.eventos.post(Folio.getText());
        this.dispose();
    }//GEN-LAST:event_ElegirActionPerformed

    private void CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearActionPerformed
        String numero = "0";
        Interfaz2.eventos.post(numero);
        this.dispose();
    }//GEN-LAST:event_CrearActionPerformed
    private void Clientes() {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.MostrarClientes();
        int tam = lista.size();
        String list[][] = new String[tam][7];

        for (int i = 0; i < tam; i++) {
            list[i][0] = lista.get(i).getFolio().toString();
            list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            list[i][2] = lista.get(i).getFecha_nac().toString();
            list[i][3] = lista.get(i).getCelular();
            list[i][4] = lista.get(i).getEmail();
            list[i][5] = lista.get(i).getRfc();
            list[i][6] = lista.get(i).getStatus();
        }
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
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                ((DefaultTableCellRenderer) Mostrar.getTableHeader().getDefaultRenderer())
                        .setHorizontalAlignment(SwingConstants.CENTER);
            Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
            Mostrar.getColumnModel().getColumn(1).setPreferredWidth(200);
            Mostrar.getColumnModel().getColumn(6).setPreferredWidth(10);
        }
    }
    
    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a modificar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Elegir.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Elegir;
    private javax.swing.JLabel Folio;
    private javax.swing.JTable Mostrar;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
