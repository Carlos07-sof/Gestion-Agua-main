package Vista;

import Entity.Contrato_generado;
import Entity.ErrorsAndSuccesses;
import java.time.LocalDate;
import java.awt.*;
import java.awt.print.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Generar_contrato extends javax.swing.JPanel implements Printable {

    String ubicacion;
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public Generar_contrato(String ubicacion) {
        initComponents();
        es.setUbicacion(ubicacion);
        Contrato_generado cg = new Contrato_generado();
        LocalDate now = LocalDate.now();
        System.out.println("");
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/logogspa.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(415,145, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);

        Logo.setIcon(iconoEscalado);
        //Logo.setIcon(new ImageIcon("C:/Users/adolf/Pictures/Saved Pictures/logogspa.png"));

        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
        Fecha.setText(dia + " de " + meses[month - 1] + " de " + year);
        nombre.setText(cg.getNombre_cliente());
        direccion.setText(cg.getDireccion());
        manzana.setText(cg.getManzana());
        lote.setText(cg.getLote());
        folio_contrato.setText(cg.getFolio_contrato().toString());
        folio_cte.setText(cg.getFolio_cliente().toString());
        informativo.setText("<html><center>"+cg.getInformativo());
        creacion.setText(cg.getCreacion_contrato().toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Imprime = new javax.swing.JButton();
        Imprimir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        folio_contrato = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        folio_cte = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        lote = new javax.swing.JLabel();
        manzana = new javax.swing.JLabel();
        informativo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        creacion = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Imprime.setBackground(new java.awt.Color(18, 90, 173));
        Imprime.setForeground(new java.awt.Color(255, 255, 255));
        Imprime.setText("Imprimir");
        Imprime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimeActionPerformed(evt);
            }
        });
        add(Imprime, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 450, 90, 30));

        Imprimir.setBackground(new java.awt.Color(255, 255, 255));
        Imprimir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Servicio de agua potable");
        Imprimir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 80));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha:");
        Imprimir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Fecha.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Fecha.setForeground(new java.awt.Color(0, 0, 0));
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("X");
        Fecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 290, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre del cliente:");
        Imprimir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 160, 20));
        Imprimir.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 80, 10));

        folio_contrato.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        folio_contrato.setForeground(new java.awt.Color(0, 0, 0));
        folio_contrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folio_contrato.setText("X");
        Imprimir.add(folio_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 80, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Con folio de cliente: ");
        Imprimir.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, 20));

        nombre.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("X");
        nombre.setToolTipText("");
        nombre.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 470, 20));
        Imprimir.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 510, 10));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Manzana:");
        Imprimir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 80, 20));
        Imprimir.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 70, 10));

        folio_cte.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        folio_cte.setForeground(new java.awt.Color(0, 0, 0));
        folio_cte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        folio_cte.setText("X");
        folio_cte.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(folio_cte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 70, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("y folio de contrato:");
        Imprimir.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 150, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("y lote:");
        Imprimir.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 50, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Con direccion:");
        Imprimir.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 120, 20));
        Imprimir.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 470, 10));
        Imprimir.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 70, 10));
        Imprimir.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 70, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-water-100.png"))); // NOI18N
        Imprimir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, 110, 100));

        direccion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        direccion.setForeground(new java.awt.Color(0, 0, 0));
        direccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        direccion.setText("X");
        direccion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 510, 20));

        lote.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lote.setText("X");
        lote.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 70, 20));

        manzana.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        manzana.setForeground(new java.awt.Color(0, 0, 0));
        manzana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manzana.setText("X");
        manzana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Imprimir.add(manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 70, 20));

        informativo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        informativo.setForeground(new java.awt.Color(0, 0, 0));
        informativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imprimir.add(informativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 880, 30));
        Imprimir.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 410, 140));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha de creación:");
        Imprimir.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        creacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        creacion.setForeground(new java.awt.Color(0, 0, 0));
        Imprimir.add(creacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 150, 20));

        add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void ImprimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimeActionPerformed
        new Thread() {
            public void run() {
                imprimir();
            }
        }.start();

    }//GEN-LAST:event_ImprimeActionPerformed
    public void imprimir() {
        try {
            PrinterJob g = PrinterJob.getPrinterJob();
            g.setPrintable(this);
            boolean gl = g.printDialog();
            if (gl) {
                g.print();
            }
            JOptionPane.showMessageDialog(this, "Exito", "Impresion", JOptionPane.INFORMATION_MESSAGE);

        } catch (HeadlessException | PrinterException e) {
            JOptionPane.showMessageDialog(this, "Error al imprimir", "Impresion", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void fecha_contrato(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton Imprime;
    private javax.swing.JPanel Imprimir;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel creacion;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel folio_contrato;
    private javax.swing.JLabel folio_cte;
    private javax.swing.JLabel informativo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lote;
    private javax.swing.JLabel manzana;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagefor, int Index) throws PrinterException {
        if (Index > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D ar = (Graphics2D) graf;
        ar.translate(pagefor.getImageableX() * 50, pagefor.getImageableY() * 50);
        ar.scale(0.6, 0.6);
        Imprimir.printAll(graf);
        return PAGE_EXISTS;

    }
}
