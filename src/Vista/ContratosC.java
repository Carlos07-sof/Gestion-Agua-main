package Vista;

import Entity.Cliente;
import Entity.Contrato;
import Servicio.ClienteServicio;
import Servicio.ContratoServicio;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class ContratosC extends javax.swing.JDialog {

    int cerrar = 0;
    int aceptar = 0;

    public ContratosC(int folio, String ubicacion) {
        initComponents();
        Cerrar.setVisible(false);
        Folio.setVisible(false);
        this.setLocationRelativeTo(null);
        if (ubicacion.equals("contrato")) {
            nombre.setVisible(false);
            Nombre.setVisible(false);
            ClientesC(folio);
        } else {
            ContratosC(folio);
        }
    }

    public ContratosC(String ubicacion, int folio) {
        initComponents();
        Cerrar.setText("Aceptar");
        Cerrar.setEnabled(false);
        aceptar = 1;
        this.setLocationRelativeTo(null);
        if (ubicacion.equals("Contrato")) {
            ContratosC(folio);
        }
        Mostrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                JTable table = (JTable) evt.getSource();
                Point point = evt.getPoint();
                int row = Mostrar.rowAtPoint(point);

                if (evt.getClickCount() == 1) {
                    try {
                        Folio.setText(Mostrar.getValueAt(Mostrar.getSelectedRow(), 0).toString());
                        Vali();
                    } catch (Exception e) {

                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mostrar = new javax.swing.JTable();
        Folio = new javax.swing.JTextField();
        Cerrar = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Mostrar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 637, 120));
        jPanel1.add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 60, -1));

        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        Cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CerrarKeyTyped(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 230, 20));

        nombre.setText("Nombre:");
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        Error.setBackground(new java.awt.Color(255, 255, 255));
        Error.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Error.setForeground(new java.awt.Color(0, 0, 0));
        Error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Error, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Cliente cl = new Cliente();
    
    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        cerrar = 1;
        if (Cerrar.getText().equals("Aceptar")) {
            Interfaz2.eventos.post(Folio.getText());
            this.dispose();
        } else {
            this.dispose();
        }
    }//GEN-LAST:event_CerrarActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus

    }//GEN-LAST:event_formWindowLostFocus

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        if (Cerrar.getText().equals("Aceptar")) {
            if (cerrar == 0) {
                this.setVisible(true);
            }
        }

    }//GEN-LAST:event_formWindowDeactivated

    private void CerrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CerrarKeyTyped

    }//GEN-LAST:event_CerrarKeyTyped

    private void ContratosC(int folio) {
        ContratoServicio cts = new ContratoServicio();
        List<Contrato> lista = cts.ContratosC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][7];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolioContrato().toString();
                list[i][1] = lista.get(i).getMunicipio();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getNumeroMzn().toString();
                list[i][4] = lista.get(i).getNumeroLt().toString();
                list[i][5] = lista.get(i).getDeuda().toString();
                list[i][6] = lista.get(i).getStatus();
                Nombre.setText(lista.get(i).getNombre());
            }
            Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio", "Municipio", "Residencia", "Manzana", "Lote", "Deuda", "Status"
                    }));
        } else {
            Mostrar.setVisible(false);
            jScrollPane1.setVisible(false);
            Error.setText("No existen contratos");
        }

    }

    private void ClientesC(int folio) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.ClientesC(folio);
        int tam = lista.size();
        if (tam > 0) {
            String list[][] = new String[tam][6];
            for (int i = 0; i < tam; i++) {
                list[i][0] = lista.get(i).getFolio().toString();
                list[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
                list[i][2] = lista.get(i).getResidencia();
                list[i][3] = lista.get(i).getFecha_nac().toString();
                list[i][4] = String.valueOf(lista.get(i).getNumeroMzn());
                list[i][5] = String.valueOf(lista.get(i).getNumeroLt());
            }
            Mostrar.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Folio", "Nombre", "Residencia", "Fecha de nacimiento", "Manzana", "Lote"
                    }));
            if (Mostrar.getColumnModel().getColumnCount() > 0) {
                Mostrar.getColumnModel().getColumn(0).setPreferredWidth(10);
                Mostrar.getColumnModel().getColumn(1).setPreferredWidth(100);
                Mostrar.getColumnModel().getColumn(2).setPreferredWidth(50);
                Mostrar.getColumnModel().getColumn(3).setPreferredWidth(85);
                Mostrar.getColumnModel().getColumn(4).setPreferredWidth(20);
                Mostrar.getColumnModel().getColumn(5).setPreferredWidth(20);
            }
        }
    }

    private void Vali() {
        int idcell = Mostrar.getSelectedRow();
        if (idcell <= -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar el usuario a modificar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            Cerrar.setEnabled(true);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JLabel Error;
    private javax.swing.JTextField Folio;
    private javax.swing.JTable Mostrar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

}
