package Vista;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Consumo extends javax.swing.JPanel {

    java.sql.Statement st;
    ResultSet rs;
    String tabla_cat;

    public Consumo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cat = new javax.swing.JComboBox<>();
        Reporte = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nuevo = new javax.swing.JPanel();
        nuevo_registro = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        Edit = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        Eliminar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Catalogos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cat.setBackground(new java.awt.Color(255, 255, 255));
        Cat.setForeground(new java.awt.Color(0, 0, 0));
        Cat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opcion", "Catalogo consumo", "Catalogo periodo", "Catalogo tarifa", "Catalogo descuento", "Catalogo tipo pago" }));
        Cat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CatKeyPressed(evt);
            }
        });
        add(Cat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 30));

        Reporte.setBackground(new java.awt.Color(18, 90, 173));
        Reporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mostrar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        Reporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 30));

        add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 100, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Catalogos");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 760, 20));

        nuevo.setBackground(new java.awt.Color(18, 90, 173));
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevoMousePressed(evt);
            }
        });
        nuevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nuevo_registro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nuevo_registro.setForeground(new java.awt.Color(255, 255, 255));
        nuevo_registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevo_registro.setText("Nuevo");
        nuevo_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nuevo_registroMousePressed(evt);
            }
        });
        nuevo.add(nuevo_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        add(nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 80, -1));

        edit.setBackground(new java.awt.Color(18, 90, 173));
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editMousePressed(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Edit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Edit.setForeground(new java.awt.Color(255, 255, 255));
        Edit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Edit.setText("Editar");
        edit.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 80, -1));

        delete.setBackground(new java.awt.Color(18, 90, 173));
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteMousePressed(evt);
            }
        });
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Eliminar.setText("Borrar");
        Eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EliminarMousePressed(evt);
            }
        });
        delete.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, -1));

        add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 80, -1));

        Catalogos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        Catalogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Catalogos.getTableHeader().setReorderingAllowed(false);
        Catalogos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CatalogosMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(Catalogos);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 760, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void nuevo_registroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo_registroMousePressed
        /*Editar_Cat p1 = new Editar_Cat(tabla_cat);
        
        p1.setSize(760, 450);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();*/
        
    }//GEN-LAST:event_nuevo_registroMousePressed

    private void nuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseEntered

    private void nuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoMouseExited

    private void nuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevoMousePressed

    }//GEN-LAST:event_nuevoMousePressed

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseExited

    private void editMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMousePressed

    }//GEN-LAST:event_editMousePressed

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered

    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited

    }//GEN-LAST:event_deleteMouseExited

    private void deleteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMousePressed

    }//GEN-LAST:event_deleteMousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        if (Cat.getSelectedItem().equals("Selecciona una opcion")) {
            JOptionPane.showMessageDialog(null, "Dato no ingresado", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Consultar(Cat.getSelectedItem().toString());
        }
    }//GEN-LAST:event_jLabel6MousePressed

    private void CatalogosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatalogosMousePressed

    }//GEN-LAST:event_CatalogosMousePressed

    private void EliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarMousePressed
/*        try {
            int idcell = Catalogos.getSelectedRow();
            if (idcell <= -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el registro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                Connection conexion = enlace.conectar();
                st = conexion.createStatement();
                String sqlCl = "select * from " + tabla_cat + "";
                System.out.println(sqlCl);
                ResultSet counter = st.executeQuery(sqlCl);
                int count = 0;
                while (counter.next()) {
                    count++;
                }

                String list[][] = new String[count][6];
                int i = 0;
                rs = st.executeQuery("SELECT * FROM " + tabla_cat + "");

                if (tabla_cat.equals("cat_descuento")) {
                    while (rs.next()) {
                        list[i][0] = rs.getString("id_desc");
                        list[i][1] = rs.getString("fecha_inc");
                        list[i][2] = rs.getString("fecha_fin");
                        list[i][3] = rs.getString("descripcion");
                        list[i][4] = rs.getString("porcentaje");
                        i++;
                    }
                }
                if (tabla_cat.equals("cat_tarifa")) {
                    while (rs.next()) {
                        list[i][0] = rs.getString("id_tar");
                        list[i][1] = rs.getString("precio");
                        list[i][2] = rs.getString("iva");
                        i++;
                    }
                }
                if (tabla_cat.equals("cat_consumo")) {
                    while (rs.next()) {
                        list[i][0] = rs.getString("id_consumo");
                        list[i][1] = rs.getString("tipo_consumo");
                        i++;
                    }
                }
                if (tabla_cat.equals("cat_pago")) {
                    while (rs.next()) {
                        list[i][0] = rs.getString("id_tipo_pago");
                        list[i][1] = rs.getString("tipo_pago");
                        i++;
                    }
                }
                if (tabla_cat.equals("cat_periodo")) {
                    while (rs.next()) {
                        list[i][0] = rs.getString("id_periodo");
                        list[i][1] = rs.getString("tipo_periodo");
                        i++;
                    }
                }
                int id = Integer.parseInt(list[idcell][0]);
                if (id <= 0) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Seleccione el registro a borrar. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String folio = String.valueOf(id);
                    Eliminar(tabla_cat, folio);
                    Consultar(tabla_cat);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Consumo.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_EliminarMousePressed

    private void CatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CatKeyPressed

    }//GEN-LAST:event_CatKeyPressed
/*
    private void Consultar(String tabla) {
        try {
            int j = 0;
            if (tabla.equals("Catalogo consumo")) {
                j = 2;
                tabla_cat = "cat_consumo";
            }
            if (tabla.equals("Catalogo periodo")) {
                j = 1;
                tabla_cat = "cat_periodo";
            }
            if (tabla.equals("Catalogo descuento")) {
                j = 5;
                tabla_cat = "cat_descuento";
            }
            if (tabla.equals("Catalogo tarifa")) {
                j = 3;
                tabla_cat = "cat_tarifa";
            }
            if (tabla.equals("Catalogo tipo pago")) {
                j = 4;
                tabla_cat = "cat_pago";
            }
            Connection conexion = enlace.conectar();
            st = conexion.createStatement();
            String sqlCl = "select * from " + tabla_cat + " ";
            ResultSet counter = st.executeQuery(sqlCl);
            int count = 0;
            while (counter.next()) {
                count++;
            }

            String list[][] = new String[count][6];

            int i = 0;
            rs = st.executeQuery("select * from " + tabla_cat + " ");

            if (j == 5) {
                while (rs.next()) {
                    list[i][0] = rs.getString("id_desc");
                    list[i][1] = rs.getString("fecha_inc");
                    list[i][2] = rs.getString("fecha_fin");
                    list[i][3] = rs.getString("descripcion");
                    list[i][4] = rs.getString("porcentaje");
                    i++;
                }
            }

            if (j == 4) {
                while (rs.next()) {
                    list[i][0] = rs.getString("id_tipo_pago");
                    list[i][1] = rs.getString("tipo_pago");
                    i++;
                }
            }

            if (j == 3) {
                while (rs.next()) {
                    list[i][0] = rs.getString("id_tar");
                    list[i][1] = rs.getString("precio");
                    list[i][2] = rs.getString("iva");
                    i++;
                }
            }
            if (j == 2) {
                while (rs.next()) {
                    list[i][0] = rs.getString("id_consumo");
                    list[i][1] = rs.getString("tipo_consumo");
                    i++;
                }
            }
            if (j == 1) {
                while (rs.next()) {
                    list[i][0] = rs.getString("id_periodo");
                    list[i][1] = rs.getString("tipo_periodo");
                    i++;
                }
            }

            System.out.println("pasando informacion");
            if (j == 5) {
                Catalogos.setModel(new javax.swing.table.DefaultTableModel(
                        list,
                        new String[]{
                            "id", "Inicio", "Fin", "Descripcion", "Porcentaje"
                        }));
            }
            if (j == 4) {
                Catalogos.setModel(new javax.swing.table.DefaultTableModel(
                        list,
                        new String[]{
                            "id", "Tipo de pago"
                        }));
            }
            if (j == 3) {
                Catalogos.setModel(new javax.swing.table.DefaultTableModel(
                        list,
                        new String[]{
                            "id", "precio", "iva"
                        }));
            }
            if (j == 2) {
                Catalogos.setModel(new javax.swing.table.DefaultTableModel(
                        list,
                        new String[]{
                            "id", "Tipo de consumo"
                        }));
            }
            if (j == 1) {
                Catalogos.setModel(new javax.swing.table.DefaultTableModel(
                        list,
                        new String[]{
                            "id", "Tipo de periodo"
                        }));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: la consulta no se realizo\n" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Eliminar(String tabla, String folio) {
        try {
            Connection conexion = enlace.conectar();
            if (tabla_cat.equals("cat_descuento")) {
                st = conexion.createStatement();
                String sqlCl = "delete from " + tabla + " where id_desc = '" + folio + "'";
                st.executeUpdate(sqlCl);
                st.close();
                conexion.close();
            }
            if (tabla_cat.equals("cat_tarifa")) {
                st = conexion.createStatement();
                String sqlCl = "delete from " + tabla + " where id_tar = '" + folio + "'";
                st.executeUpdate(sqlCl);
                st.close();
                conexion.close();
            }
            if (tabla_cat.equals("cat_consumo")) {
                st = conexion.createStatement();
                String sqlCl = "delete from " + tabla + " where id_consumo = '" + folio + "'";
                st.executeUpdate(sqlCl);
                st.close();
                conexion.close();
            }
            if (tabla_cat.equals("cat_periodo")) {
                st = conexion.createStatement();
                String sqlCl = "delete from " + tabla + " where id_periodo = '" + folio + "'";
                st.executeUpdate(sqlCl);
                st.close();
                conexion.close();
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "¡No se pudo eliminar el registro! \n" + e, "Error", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void editar(){
        
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cat;
    private javax.swing.JTable Catalogos;
    private javax.swing.JLabel Edit;
    private javax.swing.JLabel Eliminar;
    private javax.swing.JPanel Reporte;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel nuevo;
    private javax.swing.JLabel nuevo_registro;
    // End of variables declaration//GEN-END:variables
}
