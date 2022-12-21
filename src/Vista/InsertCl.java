package Vista;

import Entity.Cliente;
import Entity.Clientes_existentes;
import Entity.Contrato_generado;
import Entity.ErrorsAndSuccesses;
import Servicio.ClienteServicio;
import static Vista.Interfaz2.content;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import javax.swing.JTextField;

public class InsertCl extends javax.swing.JPanel {

    String ubicacion;
    int folio;
    int folio_cte;
    String rfco = "";
    String telefonoo = "";
    String emailo = "";
    String Curpo = "";

    ErrorsAndSuccesses es = new ErrorsAndSuccesses();

    public InsertCl(String ventana) {
        initComponents();
        Cargando.setVisible(false);
        Folio.setVisible(false);
        Foliot.setVisible(false);
        this.ubicacion = ventana;
        es.setUbicacion(ventana);
    }

    public InsertCl(int folio, String ubicacion) {
        initComponents();
        Cargando.setVisible(false);
        this.ubicacion = ubicacion;
        this.folio = folio;
        es.setUbicacion(ubicacion);
        Obtener(folio);
        Cliente_Datos.setText("Modificar datos de cliente");
        Next_or_save.setText("Guardar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargando = new javax.swing.JLabel();
        Celular = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        apm = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        rfc = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Separador = new javax.swing.JSeparator();
        ap_p = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        RFC = new javax.swing.JTextField();
        app = new javax.swing.JLabel();
        ap_m = new javax.swing.JTextField();
        tel = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        Foliot = new javax.swing.JLabel();
        Cliente_Domicilio = new javax.swing.JLabel();
        Cliente_Datos = new javax.swing.JLabel();
        Año = new javax.swing.JTextField();
        Mes = new javax.swing.JTextField();
        Dia = new javax.swing.JTextField();
        guion2 = new javax.swing.JLabel();
        guion = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        celular = new javax.swing.JLabel();
        curp = new javax.swing.JLabel();
        Next_or_save = new javax.swing.JButton();
        Curp = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        Separador2 = new javax.swing.JSeparator();
        Municipio = new javax.swing.JTextField();
        municipio = new javax.swing.JLabel();
        Residencia = new javax.swing.JTextField();
        Nombre_calle = new javax.swing.JTextField();
        Referencia = new javax.swing.JTextField();
        residencia = new javax.swing.JLabel();
        nombre_calle = new javax.swing.JLabel();
        referencia = new javax.swing.JLabel();
        Manzana = new javax.swing.JTextField();
        Lote = new javax.swing.JTextField();
        manzana = new javax.swing.JLabel();
        lote = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-spinner-para-iphone.gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 500));

        Celular.setBackground(new java.awt.Color(255, 255, 255));
        Celular.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Celular.setForeground(new java.awt.Color(0, 0, 0));
        Celular.setText(" Numero de celular");
        Celular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CelularFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CelularFocusLost(evt);
            }
        });
        Celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CelularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CelularMousePressed(evt);
            }
        });
        Celular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CelularKeyTyped(evt);
            }
        });
        add(Celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 180, 40));

        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("* Nombre:");
        add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        apm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apm.setForeground(new java.awt.Color(0, 0, 0));
        apm.setText("* Apellido materno: ");
        add(apm, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, 20));

        fecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(0, 0, 0));
        fecha.setText("* Fecha de nacimiento:");
        add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, -1, 20));

        rfc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        rfc.setForeground(new java.awt.Color(0, 0, 0));
        rfc.setText("RFC: ");
        add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText(" Nombre");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 40));
        add(Separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1030, 10));

        ap_p.setBackground(new java.awt.Color(255, 255, 255));
        ap_p.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_p.setForeground(new java.awt.Color(0, 0, 0));
        ap_p.setText(" Apellido paterno");
        ap_p.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ap_pFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ap_pFocusLost(evt);
            }
        });
        ap_p.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_pMousePressed(evt);
            }
        });
        ap_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap_pActionPerformed(evt);
            }
        });
        ap_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_pKeyTyped(evt);
            }
        });
        add(ap_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, 40));

        Telefono.setBackground(new java.awt.Color(255, 255, 255));
        Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Telefono.setText(" Numero de telefono");
        Telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TelefonoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefonoFocusLost(evt);
            }
        });
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TelefonoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TelefonoMousePressed(evt);
            }
        });
        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });
        add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, 40));

        RFC.setBackground(new java.awt.Color(255, 255, 255));
        RFC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        RFC.setForeground(new java.awt.Color(0, 0, 0));
        RFC.setText(" RFC");
        RFC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RFCFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                RFCFocusLost(evt);
            }
        });
        RFC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RFCMousePressed(evt);
            }
        });
        RFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RFCKeyTyped(evt);
            }
        });
        add(RFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 40));

        app.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        app.setForeground(new java.awt.Color(0, 0, 0));
        app.setText("* Apellido paterno: ");
        add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, 20));

        ap_m.setBackground(new java.awt.Color(255, 255, 255));
        ap_m.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ap_m.setForeground(new java.awt.Color(0, 0, 0));
        ap_m.setText(" Apellido materno");
        ap_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ap_mFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ap_mFocusLost(evt);
            }
        });
        ap_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap_mMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ap_mMouseReleased(evt);
            }
        });
        ap_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ap_mKeyTyped(evt);
            }
        });
        add(ap_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 180, 40));

        tel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tel.setForeground(new java.awt.Color(0, 0, 0));
        tel.setText(" Telefono: ");
        add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 20));

        Folio.setEditable(false);
        Folio.setBackground(new java.awt.Color(255, 255, 255));
        Folio.setForeground(new java.awt.Color(0, 0, 0));
        Folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FolioMousePressed(evt);
            }
        });
        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 80, 20));

        Foliot.setForeground(new java.awt.Color(0, 0, 0));
        Foliot.setText("Folio del cliente");
        add(Foliot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 20));

        Cliente_Domicilio.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Domicilio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Domicilio.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Domicilio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Domicilio.setText("Cliente-Domicilio");
        add(Cliente_Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1030, 20));

        Cliente_Datos.setBackground(new java.awt.Color(255, 255, 255));
        Cliente_Datos.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        Cliente_Datos.setForeground(new java.awt.Color(0, 0, 0));
        Cliente_Datos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cliente_Datos.setText("Cliente-Datos personales");
        add(Cliente_Datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

        Año.setBackground(new java.awt.Color(255, 255, 255));
        Año.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Año.setForeground(new java.awt.Color(0, 0, 0));
        Año.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Año.setText("Año");
        Año.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AñoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AñoFocusLost(evt);
            }
        });
        Año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AñoMousePressed(evt);
            }
        });
        Año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AñoKeyTyped(evt);
            }
        });
        add(Año, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 40, 40));

        Mes.setBackground(new java.awt.Color(255, 255, 255));
        Mes.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Mes.setForeground(new java.awt.Color(0, 0, 0));
        Mes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mes.setText("Mes");
        Mes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                MesFocusLost(evt);
            }
        });
        Mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MesMousePressed(evt);
            }
        });
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });
        Mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MesKeyTyped(evt);
            }
        });
        add(Mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 40, 40));

        Dia.setBackground(new java.awt.Color(255, 255, 255));
        Dia.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Dia.setForeground(new java.awt.Color(0, 0, 0));
        Dia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Dia.setText("Dia");
        Dia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DiaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DiaFocusLost(evt);
            }
        });
        Dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DiaMousePressed(evt);
            }
        });
        Dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DiaKeyTyped(evt);
            }
        });
        add(Dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 40, 40));

        guion2.setBackground(new java.awt.Color(255, 255, 255));
        guion2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guion2.setForeground(new java.awt.Color(0, 0, 0));
        guion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guion2.setText("-");
        add(guion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, 20, 40));

        guion.setBackground(new java.awt.Color(255, 255, 255));
        guion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        guion.setForeground(new java.awt.Color(0, 0, 0));
        guion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guion.setText("-");
        add(guion, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 20, 40));

        Email.setBackground(new java.awt.Color(255, 255, 255));
        Email.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 0, 0));
        Email.setText(" Email");
        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EmailMousePressed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 200, 40));

        email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email: ");
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, -1, 20));

        celular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        celular.setForeground(new java.awt.Color(0, 0, 0));
        celular.setText("* Celular: ");
        add(celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, 20));

        curp.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        curp.setForeground(new java.awt.Color(0, 0, 0));
        curp.setText("* Curp: ");
        add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, -1, 20));

        Next_or_save.setBackground(new java.awt.Color(18, 90, 173));
        Next_or_save.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Next_or_save.setForeground(new java.awt.Color(255, 255, 255));
        Next_or_save.setText("Siguente");
        Next_or_save.setBorder(null);
        Next_or_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Next_or_saveActionPerformed(evt);
            }
        });
        add(Next_or_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 40));

        Curp.setBackground(new java.awt.Color(255, 255, 255));
        Curp.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Curp.setForeground(new java.awt.Color(0, 0, 0));
        Curp.setText(" Curp");
        Curp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CurpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CurpFocusLost(evt);
            }
        });
        Curp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CurpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CurpMousePressed(evt);
            }
        });
        Curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CurpKeyTyped(evt);
            }
        });
        add(Curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 170, 40));

        Cancelar.setBackground(new java.awt.Color(18, 90, 173));
        Cancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Cancelar.setForeground(new java.awt.Color(255, 255, 255));
        Cancelar.setText("Volver");
        Cancelar.setBorder(null);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 100, 40));
        add(Separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1030, 10));

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
        add(Municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 140, 40));

        municipio.setBackground(new java.awt.Color(0, 0, 0));
        municipio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        municipio.setForeground(new java.awt.Color(0, 0, 0));
        municipio.setText("Municipio:");
        add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, 20));

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
        Residencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResidenciaActionPerformed(evt);
            }
        });
        Residencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ResidenciaKeyTyped(evt);
            }
        });
        add(Residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 180, 40));

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
        add(Nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 180, 40));

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
        Referencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ReferenciaKeyTyped(evt);
            }
        });
        add(Referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 150, 40));

        residencia.setBackground(new java.awt.Color(0, 0, 0));
        residencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        residencia.setForeground(new java.awt.Color(0, 0, 0));
        residencia.setText("Residencia:");
        add(residencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 120, 20));

        nombre_calle.setBackground(new java.awt.Color(0, 0, 0));
        nombre_calle.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre_calle.setForeground(new java.awt.Color(0, 0, 0));
        nombre_calle.setText("Nombre calle:");
        add(nombre_calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 253, 100, -1));

        referencia.setBackground(new java.awt.Color(0, 0, 0));
        referencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        referencia.setForeground(new java.awt.Color(0, 0, 0));
        referencia.setText("Calle de referencia:");
        add(referencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 250, 120, 20));

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
        add(Manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 90, 40));

        Lote.setBackground(new java.awt.Color(255, 255, 255));
        Lote.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lote.setForeground(new java.awt.Color(0, 0, 0));
        Lote.setText(" Num. Lt");
        Lote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoteFocusLost(evt);
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
        add(Lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 100, 40));

        manzana.setBackground(new java.awt.Color(0, 0, 0));
        manzana.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        manzana.setForeground(new java.awt.Color(0, 0, 0));
        manzana.setText("Manzana: ");
        add(manzana, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 70, 20));

        lote.setBackground(new java.awt.Color(0, 0, 0));
        lote.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lote.setForeground(new java.awt.Color(0, 0, 0));
        lote.setText("Lote/Numero Exterior:");
        add(lote, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 150, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed

    }//GEN-LAST:event_nameMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

    }//GEN-LAST:event_nameActionPerformed

    private void ap_pMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_pMousePressed

    }//GEN-LAST:event_ap_pMousePressed

    private void ap_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap_pActionPerformed

    }//GEN-LAST:event_ap_pActionPerformed

    private void TelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseExited

    }//GEN-LAST:event_TelefonoMouseExited

    private void TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMousePressed

    }//GEN-LAST:event_TelefonoMousePressed

    private void RFCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RFCMousePressed

    }//GEN-LAST:event_RFCMousePressed

    private void ap_mMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMousePressed

    }//GEN-LAST:event_ap_mMousePressed

    private void ap_mMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap_mMouseReleased

    }//GEN-LAST:event_ap_mMouseReleased

    private void AñoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñoMousePressed

    }//GEN-LAST:event_AñoMousePressed

    private void MesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MesMousePressed

    }//GEN-LAST:event_MesMousePressed

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed

    }//GEN-LAST:event_MesActionPerformed

    private void DiaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiaMousePressed

    }//GEN-LAST:event_DiaMousePressed

    private void FolioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FolioMousePressed

    }//GEN-LAST:event_FolioMousePressed

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed

    }//GEN-LAST:event_FolioActionPerformed

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void AñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AñoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Año.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_AñoKeyTyped

    private void MesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MesKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Mes.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_MesKeyTyped

    private void DiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DiaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Dia.getText().trim().length() == 2) {
            evt.consume();
        }
    }//GEN-LAST:event_DiaKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        entrada(evt);
    }//GEN-LAST:event_nameKeyTyped

    private void ap_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_pKeyTyped
        entrada(evt);
    }//GEN-LAST:event_ap_pKeyTyped

    private void ap_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ap_mKeyTyped
        entrada(evt);
    }//GEN-LAST:event_ap_mKeyTyped

    private void EmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseExited

    }//GEN-LAST:event_EmailMouseExited

    private void EmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMousePressed

    }//GEN-LAST:event_EmailMousePressed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped

    }//GEN-LAST:event_EmailKeyTyped

    private void CelularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_CelularMouseExited

    private void CelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CelularMousePressed

    }//GEN-LAST:event_CelularMousePressed

    private void CelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CelularKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Celular.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_CelularKeyTyped

    private void CurpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMouseExited

    }//GEN-LAST:event_CurpMouseExited

    private void CurpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CurpMousePressed

    }//GEN-LAST:event_CurpMousePressed

    private void CurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CurpKeyTyped
        if (Curp.getText().trim().length() == 18) {
            evt.consume();
        }
    }//GEN-LAST:event_CurpKeyTyped

    private void Next_or_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Next_or_saveActionPerformed
        Clientes_existentes cex = new Clientes_existentes();

        boolean ValNombre = ValidarEntradas(name.getText(), " Nombre");
        if (ValNombre == false) {
            MensajeError("Campo vacio: Nombre", name);
        } else {
            boolean ValApp = ValidarEntradas(ap_p.getText(), " Apellido paterno");
            if (ValApp == false) {
                MensajeError("Campo vacio: Apellido parterno", ap_p);
            } else {
                boolean ValApm = ValidarEntradas(ap_m.getText(), " Apellido paterno");
                if (ValApm == false) {
                    MensajeError("Campo vacio: Apellido materno", ap_m);
                } else {
                    for (String nombre_completo : cex.getNombre_completo()) {
                        if (nombre_completo.toLowerCase().equals(name.getText().toLowerCase().trim() + " " + ap_p.getText().toLowerCase().trim() + " " + ap_m.getText().toLowerCase().trim())) {
                            MensajeError("Error: Nombre ya existente", name);
                            return;
                        } else {
                            boolean ValAñ = ValidarEntradas(Año.getText(), "Año");
                            if (ValAñ == false) {
                                MensajeError("Campo vacio: Año", Año);
                            } else {
                                if (Año.getText().trim().length() < 4) {
                                    MensajeError("Año invalido", Año);
                                } else {
                                    boolean ValM = ValidarEntradas(Mes.getText(), "Mes");
                                    if (ValM == false) {
                                        MensajeError("Campo vacio: Mes", Mes);
                                    } else {
                                        if (Mes.getText().trim().length() < 2) {
                                            MensajeError("Mes invalido", Mes);
                                        } else {
                                            boolean ValD = ValidarEntradas(Dia.getText(), "Dia");
                                            if (ValD == false) {
                                                MensajeError("Campo vacio: Dia", Dia);
                                            } else {
                                                if (Dia.getText().trim().length() < 2) {
                                                    MensajeError("Dia invalido", Dia);
                                                } else {
                                                    boolean ValC = ValidarEntradas(Curp.getText(), " Curp");
                                                    if (ValC == false) {
                                                        MensajeError("Campo vacio: Curp", Curp);
                                                    } else {
                                                        for (String curp1 : cex.getCurp()) {
                                                            if (curp1.toLowerCase().equals(Curp.getText().toLowerCase().trim())) {
                                                                MensajeError("Error: Curp ya existente", Curp);
                                                                return;
                                                            } else {
                                                                boolean vCURP = validarCURP(Curp.getText());
                                                                if (vCURP == false) {
                                                                    MensajeError("Curp invalida", Curp);
                                                                } else {
                                                                    boolean Valrfc = ValidarEntradas(RFC.getText(), " RFC");
                                                                    if (Valrfc == false) {
                                                                        rfco = "Sin RFC";
                                                                    } else {
                                                                        boolean vRFC = validarRfc(RFC.getText());
                                                                        if (vRFC == false) {
                                                                            MensajeError("RFC invalido", RFC);
                                                                            return;
                                                                        } else {
                                                                            for (String rfc1 : cex.getRfc()) {
                                                                                if (rfc1.toLowerCase().equals(RFC.getText().toLowerCase().trim())) {
                                                                                    MensajeError("Error: RFC ya existente", RFC);
                                                                                    return;
                                                                                } else {
                                                                                    rfco = RFC.getText();
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    boolean Valt = ValidarEntradas(Telefono.getText(), " Numero de telefono");
                                                                    if (Valt == false) {
                                                                        telefonoo = "Sin numero";
                                                                    } else {
                                                                        telefonoo = Telefono.getText();
                                                                    }
                                                                    boolean ValCel = ValidarEntradas(Celular.getText(), " Numero de celular");
                                                                    if (ValCel == false) {
                                                                        MensajeError("Campo vacio: Celular", Celular);
                                                                        return;
                                                                    } else {
                                                                        if (Celular.getText().trim().length() < 10) {
                                                                            MensajeError("Numero de celular invalido", Celular);
                                                                            return;
                                                                        } else {
                                                                            for (String numero_contacto : cex.getNumero_contacto()) {
                                                                                if (numero_contacto.equals(Celular.getText().trim())) {
                                                                                    MensajeError("Error: Numero de celular ya existente", Celular);
                                                                                    return;
                                                                                } else {
                                                                                    boolean ValEm = ValidarEntradas(Email.getText(), " Email");
                                                                                    if (ValEm == false) {
                                                                                        emailo = "Sin email";
                                                                                    } else {
                                                                                        boolean vEmail = validarEmail(Email.getText());
                                                                                        if (vEmail == false) {
                                                                                            MensajeError("Email invalido", Email);
                                                                                            return;
                                                                                        } else {
                                                                                            emailo = Email.getText();
                                                                                        }
                                                                                    }///////////
                                                                                    boolean ValMu = ValidarEntradas(Municipio.getText(), " Municipio");
                                                                                    if (ValMu == false) {
                                                                                        MensajeError("Campo vacio: Municipio", Municipio);
                                                                                        return;
                                                                                    } else {
                                                                                        boolean ValRe = ValidarEntradas(Residencia.getText(), " Col/barrio/fracc");
                                                                                        if (ValRe == false) {
                                                                                            MensajeError("Campo vacio: Residencia", Residencia);
                                                                                            return;
                                                                                        } else {
                                                                                            boolean ValNC = ValidarEntradas(Nombre_calle.getText(), " Calle");
                                                                                            if (ValNC == false) {
                                                                                                MensajeError("Campo vacio: Nombre de calle", Nombre_calle);
                                                                                                return;
                                                                                            } else {
                                                                                                boolean ValRef = ValidarEntradas(Referencia.getText(), " Calle de referencia");
                                                                                                if (ValRef == false) {
                                                                                                    MensajeError("Campo vacio: Calle de referencia", Referencia);
                                                                                                    return;
                                                                                                } else {
                                                                                                    boolean ValMa = ValidarEntradas(Manzana.getText(), " Num. Manz");
                                                                                                    if (ValMa == false) {
                                                                                                        MensajeError("Campo vacio: Numero de Manzana", Manzana);
                                                                                                        return;
                                                                                                    } else {
                                                                                                        boolean ValLt = ValidarEntradas(Lote.getText(), " Num. Lt");
                                                                                                        if (ValLt == false) {
                                                                                                            MensajeError("Campo vacio: Numero de Lote", Lote);
                                                                                                            return;
                                                                                                        } else {
                                                                                                            new MostrarC().show();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }///////////////////////////
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }////////////////////
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }///////////////
                }
            }
        }

    }//GEN-LAST:event_Next_or_saveActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Confirmacion();
    }//GEN-LAST:event_CancelarActionPerformed

    private void MunicipioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MunicipioMousePressed

    }//GEN-LAST:event_MunicipioMousePressed

    private void MunicipioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MunicipioKeyTyped
        entrada(evt);
    }//GEN-LAST:event_MunicipioKeyTyped

    private void ResidenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResidenciaMousePressed

    }//GEN-LAST:event_ResidenciaMousePressed

    private void ResidenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ResidenciaKeyTyped

    }//GEN-LAST:event_ResidenciaKeyTyped

    private void Nombre_calleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_calleMousePressed

    }//GEN-LAST:event_Nombre_calleMousePressed

    private void Nombre_calleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_calleKeyTyped

    }//GEN-LAST:event_Nombre_calleKeyTyped

    private void ReferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReferenciaMousePressed

    }//GEN-LAST:event_ReferenciaMousePressed

    private void ManzanaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManzanaMousePressed

    }//GEN-LAST:event_ManzanaMousePressed

    private void ManzanaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ManzanaKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_ManzanaKeyTyped

    private void LoteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoteMousePressed

    }//GEN-LAST:event_LoteMousePressed

    private void LoteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoteKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_LoteKeyTyped

    private void RFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFCKeyTyped
        if (RFC.getText().trim().length() == 13) {
            evt.consume();
        }
    }//GEN-LAST:event_RFCKeyTyped

    private void ReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReferenciaKeyTyped

    }//GEN-LAST:event_ReferenciaKeyTyped

    private void ResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResidenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResidenciaActionPerformed

    private void ManzanaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusLost
        if (Manzana.getText().isEmpty()) {
            Manzana.setText(" Num. Manz");
        }
    }//GEN-LAST:event_ManzanaFocusLost

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        if (name.getText().isEmpty()) {
            name.setText(" Nombre");
        }
    }//GEN-LAST:event_nameFocusLost

    private void ap_pFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_pFocusLost
        if (ap_p.getText().isEmpty()) {
            ap_p.setText(" Apellido paterno");
        }
    }//GEN-LAST:event_ap_pFocusLost

    private void ap_mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_mFocusLost
        if (ap_m.getText().isEmpty()) {
            ap_m.setText(" Apellido materno");
        }
    }//GEN-LAST:event_ap_mFocusLost

    private void AñoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AñoFocusLost
        if (Año.getText().isEmpty()) {
            Año.setText("Año");
        }
    }//GEN-LAST:event_AñoFocusLost

    private void MesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFocusLost
        if (Mes.getText().isEmpty()) {
            Mes.setText("Mes");
        }
    }//GEN-LAST:event_MesFocusLost

    private void DiaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DiaFocusLost
        if (Dia.getText().isEmpty()) {
            Dia.setText("Dia");
        }
    }//GEN-LAST:event_DiaFocusLost

    private void CurpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CurpFocusLost
        if (Curp.getText().isEmpty()) {
            Curp.setText(" Curp");
        }
    }//GEN-LAST:event_CurpFocusLost

    private void RFCFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RFCFocusLost
        if (RFC.getText().isEmpty()) {
            RFC.setText(" RFC");
        }
    }//GEN-LAST:event_RFCFocusLost

    private void TelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusLost
        if (Telefono.getText().isEmpty()) {
            Telefono.setText(" Numero de telefono");
        }
    }//GEN-LAST:event_TelefonoFocusLost

    private void CelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CelularFocusLost
        if (Celular.getText().isEmpty()) {
            Celular.setText(" Numero de celular");
        }
    }//GEN-LAST:event_CelularFocusLost

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        if (Email.getText().isEmpty()) {
            Email.setText(" Email");
        }
    }//GEN-LAST:event_EmailFocusLost

    private void MunicipioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusLost
        if (Municipio.getText().isEmpty()) {
            Municipio.setText(" Municipio");
        }
    }//GEN-LAST:event_MunicipioFocusLost

    private void ResidenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusLost
        if (Residencia.getText().isEmpty()) {
            Residencia.setText(" Col/barrio/fracc");
        }
    }//GEN-LAST:event_ResidenciaFocusLost

    private void Nombre_calleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusLost
        if (Nombre_calle.getText().isEmpty()) {
            Nombre_calle.setText(" Calle");
        }
    }//GEN-LAST:event_Nombre_calleFocusLost

    private void ReferenciaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusLost
        if (Referencia.getText().isEmpty()) {
            Referencia.setText(" Calle de referencia");
        }
    }//GEN-LAST:event_ReferenciaFocusLost

    private void LoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusLost
        if (Lote.getText().isEmpty()) {
            Lote.setText(" Num. Lt");
        }
    }//GEN-LAST:event_LoteFocusLost

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        if (name.getText().equals(" Nombre")) {
            name.setText("");
        }
    }//GEN-LAST:event_nameFocusGained

    private void ap_pFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_pFocusGained
        if (ap_p.getText().equals(" Apellido paterno")) {
            ap_p.setText("");
        }
    }//GEN-LAST:event_ap_pFocusGained

    private void ap_mFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ap_mFocusGained
        if (ap_m.getText().equals(" Apellido materno")) {
            ap_m.setText("");
        }
    }//GEN-LAST:event_ap_mFocusGained

    private void AñoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AñoFocusGained
        if (Año.getText().equals("Año")) {
            Año.setText("");
        }
    }//GEN-LAST:event_AñoFocusGained

    private void MesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MesFocusGained
        if (Mes.getText().equals("Mes")) {
            Mes.setText("");
        }
    }//GEN-LAST:event_MesFocusGained

    private void DiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DiaFocusGained
        if (Dia.getText().equals("Dia")) {
            Dia.setText("");
        }
    }//GEN-LAST:event_DiaFocusGained

    private void CurpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CurpFocusGained
        if (Curp.getText().equals(" Curp")) {
            Curp.setText("");
        }
    }//GEN-LAST:event_CurpFocusGained

    private void RFCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_RFCFocusGained
        if (RFC.getText().equals(" RFC")) {
            RFC.setText("");
        }
    }//GEN-LAST:event_RFCFocusGained

    private void TelefonoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefonoFocusGained
        if (Telefono.getText().equals(" Numero de telefono")) {
            Telefono.setText("");
        }
    }//GEN-LAST:event_TelefonoFocusGained

    private void CelularFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CelularFocusGained
        if (Celular.getText().equals(" Numero de celular")) {
            Celular.setText("");
        }
    }//GEN-LAST:event_CelularFocusGained

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        if (Email.getText().equals(" Email")) {
            Email.setText("");
        }
    }//GEN-LAST:event_EmailFocusGained

    private void MunicipioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_MunicipioFocusGained
        if (Municipio.getText().equals(" Municipio")) {
            Municipio.setText("");
        }
    }//GEN-LAST:event_MunicipioFocusGained

    private void ResidenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ResidenciaFocusGained
        if (Residencia.getText().equals(" Col/barrio/fracc")) {
            Residencia.setText("");
        }
    }//GEN-LAST:event_ResidenciaFocusGained

    private void Nombre_calleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Nombre_calleFocusGained
        if (Nombre_calle.getText().equals(" Calle")) {
            Nombre_calle.setText("");
        }
    }//GEN-LAST:event_Nombre_calleFocusGained

    private void ReferenciaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ReferenciaFocusGained
        if (Referencia.getText().equals(" Calle de referencia")) {
            Referencia.setText("");
        }
    }//GEN-LAST:event_ReferenciaFocusGained

    private void ManzanaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ManzanaFocusGained
        if (Manzana.getText().equals(" Num. Manz")) {
            Manzana.setText("");
        }
    }//GEN-LAST:event_ManzanaFocusGained

    private void LoteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoteFocusGained
        if (Lote.getText().equals(" Num. Lt")) {
            Lote.setText("");
        }
    }//GEN-LAST:event_LoteFocusGained

    private void MensajeError(String campo_e, JTextField campo) {
        JOptionPane.showMessageDialog(null, campo_e, " AVISO", JOptionPane.INFORMATION_MESSAGE);
        campo.requestFocus();
    }

    private boolean ValidarEntradas(String var, String comp) {
        return !(var.equals(comp) || var.isEmpty());
    }

    private boolean validarEmail(String email) {
        String regex
                = "([a-z0-9]+(\\.?[a-z0-9])*)+@(([a-z]+)\\.([a-z]+))+";
        email = email.toLowerCase().trim();
        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(email).matches()) {
            if (Email.getText().equals("Sin email")) {
                return true;
            } else {
                return false;
            }
        } else {
            emailo = email;
            return true;
        }
    }

    public boolean validarRfc(String rfc) {
        rfc = rfc.toUpperCase().trim();
        rfco = rfc;
        return rfc.toUpperCase().matches("[A-Z]{4}[0-9]{6}[A-Z0-9]{3}");
    }

    private boolean validarCURP(String curp) {
        String regex
                = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}"
                + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])"
                + "[HM]{1}"
                + "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)"
                + "[B-DF-HJ-NP-TV-Z]{3}"
                + "[0-9A-Z]{1}[0-9]{1}$";
        curp = curp.toUpperCase().trim();
        Pattern patron = Pattern.compile(regex);
        if (!patron.matcher(curp).matches()) {
            return false;
        } else {
            Curpo = curp;
            return true;
        }
    }

    public class MostrarC implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        public void run() {
            Cargando.setVisible(true);
            if (ubicacion.equals("editar cliente")) {
                Actualizar();
                if (es.getResultact() == 1) {
                    regresar();
                } else {
                    Cargando.setVisible(false);
                }
            } else {
                Mostrar();
                Cargando.setVisible(false);
            }

        }
    }

    private void Confirmacion() {
        if (ubicacion.equals("editar cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los cambios?", "Actualizacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                new Regresar().show();
            } else {

            }
        }
        if (ubicacion.equals("insert cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                new Regresar().show();
            } else {

            }
        }
        if(ubicacion.equals("contrato")){
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                new Regresar().show();
            } else {

            }
        }
       
    }

    public class Regresar implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            regresar();
        }
    }

    private void Actualizar() {
        String fech = Año.getText() + "-" + Mes.getText() + "-" + Dia.getText();
        Date fec = Date.valueOf(fech);
        ClienteServicio cs = new ClienteServicio();
        es.setResultact(cs.ActualizarCliente(folio, name.getText(), ap_p.getText(), ap_m.getText(),
                fec, telefonoo, Celular.getText(), emailo, Curpo, rfco, Municipio.getText(),
                Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), Integer.parseInt(Manzana.getText()),
                Integer.parseInt(Lote.getText())));
        Curpo = "";
    }

    private void Mostrar() {
        String fech = Año.getText() + "-" + Mes.getText() + "-" + Dia.getText();
        Date fec = Date.valueOf(fech);
        ClienteServicio cs = new ClienteServicio();
        String status = "activo";
        folio_cte = cs.InsertarCliente(name.getText(), ap_p.getText(), ap_m.getText(),
                fec, telefonoo, Celular.getText(), emailo, Curpo, rfco, Municipio.getText(),
                Residencia.getText(), Nombre_calle.getText(), Referencia.getText(), Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()), status);
        if (folio_cte == -1) {
            JOptionPane.showMessageDialog(this, "Algo salio mal al insertar", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("else");
            Contrato_generado cg = new Contrato_generado();
            cg.setNombre_cliente(name.getText() + " " + ap_p.getText() + "" + ap_m.getText());
            Cliente c = new Cliente(folio_cte, Municipio.getText(),
                    Residencia.getText(), Nombre_calle.getText(), Referencia.getText(),
                    Integer.parseInt(Manzana.getText()), Integer.parseInt(Lote.getText()));
            Contrato_regis p1 = new Contrato_regis(c, ubicacion);
            p1.setSize(1030, 500);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    private void regresar() {
        if (ubicacion.equals("contrato")) {
            Contrato_v p1 = new Contrato_v();
            p1.setSize(1030, 479);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
        if (ubicacion.equals("insert cliente") || ubicacion.equals("editar cliente")) {
            Clientes p1 = new Clientes();
            p1.setSize(1030, 479);
            p1.setLocation(0, 0);

            content.removeAll();
            content.add(p1, BorderLayout.CENTER);
            content.revalidate();
            content.repaint();
        }
    }

    private void Obtener(int folio) {
        ClienteServicio cs = new ClienteServicio();
        List<Cliente> lista = cs.SearchClientes(folio);
        int tam = lista.size();
        for (int i = 0; i < tam; i++) {
            Folio.setText(lista.get(i).getFolio().toString());
            name.setText(lista.get(i).getNombre());
            ap_p.setText(lista.get(i).getApellido_p());
            ap_m.setText(lista.get(i).getApellido_m());
            Date fech = lista.get(i).getFecha_nac();
            LocalDate nac = fech.toLocalDate();
            int Year = nac.getYear();
            DecimalFormat dmFormat = new DecimalFormat("00");
            String mes = dmFormat.format(Double.valueOf(nac.getMonthValue()));
            String dia = dmFormat.format(Double.valueOf(nac.getDayOfMonth()));
            Año.setText(String.valueOf(Year));
            Mes.setText(String.valueOf(mes));
            Dia.setText(String.valueOf(dia));
            RFC.setText(lista.get(i).getRfc());
            Telefono.setText(lista.get(i).getTelefono());
            Celular.setText(lista.get(i).getCelular());
            Email.setText(lista.get(i).getEmail());
            Curp.setText(lista.get(i).getCurp());
            Municipio.setText(lista.get(i).getMunicipio());
            Residencia.setText(lista.get(i).getResidencia());
            Nombre_calle.setText(lista.get(i).getNombreCalle());
            Referencia.setText(lista.get(i).getCalleReferencia());
            Manzana.setText(String.valueOf(lista.get(i).getNumeroMzn()));
            Lote.setText(String.valueOf(lista.get(i).getNumeroLt()));
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Año;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextField Celular;
    private javax.swing.JLabel Cliente_Datos;
    private javax.swing.JLabel Cliente_Domicilio;
    private javax.swing.JTextField Curp;
    private javax.swing.JTextField Dia;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Folio;
    private javax.swing.JLabel Foliot;
    private javax.swing.JTextField Lote;
    private javax.swing.JTextField Manzana;
    private javax.swing.JTextField Mes;
    private javax.swing.JTextField Municipio;
    private javax.swing.JButton Next_or_save;
    private javax.swing.JTextField Nombre_calle;
    private javax.swing.JTextField RFC;
    private javax.swing.JTextField Referencia;
    private javax.swing.JTextField Residencia;
    private javax.swing.JSeparator Separador;
    private javax.swing.JSeparator Separador2;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField ap_m;
    private javax.swing.JTextField ap_p;
    private javax.swing.JLabel apm;
    private javax.swing.JLabel app;
    private javax.swing.JLabel celular;
    private javax.swing.JLabel curp;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel guion;
    private javax.swing.JLabel guion2;
    private javax.swing.JLabel lote;
    private javax.swing.JLabel manzana;
    private javax.swing.JLabel municipio;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre_calle;
    private javax.swing.JLabel referencia;
    private javax.swing.JLabel residencia;
    private javax.swing.JLabel rfc;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables
}
