package Vista;

import Entity.ErrorsAndSuccesses;
import Entity.Logeo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.greenrobot.eventbus.EventBus;

public class Interfaz2 extends javax.swing.JFrame {

    int Xmouse, Ymouse;
    Principal p1 = new Principal();
    ErrorsAndSuccesses es = new ErrorsAndSuccesses();
    public static EventBus eventos = new EventBus();
    public static EventBus contratos = new EventBus();
    Logeo p0 = new Logeo();
    int cerrar;
    String ventana;

    public Interfaz2() {
        initComponents();

        this.setLocationRelativeTo(null);
        LocalDate now = LocalDate.now();
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/logogspa.png"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(260, 110, Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        Logo.setIcon(iconoEscalado);
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciemrbre"};
        fecha.setText("Hoy es " + dia + " de " + meses[month - 1] + " de " + year);

        p1.setSize(1030, 500);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

        if (p0.getUsuario().equals("administrador") || p0.getUsuario().equals("postgres")) {
            Admin.setVisible(true);
        } else {
            Admin.setVisible(false);
        }
        new Thread() {
            public void run() {
                int x = 1000;
                int y = Ayuntamiento.getLocation().y;

                while (true) {
                    x--;
                    if (x < -300) {
                        x = 1000;
                    }
                    Ayuntamiento.setLocation(x, y);
                    try {
                        sleep(9);
                    } catch (Exception e) {
                    }
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_prin = new javax.swing.JPanel();
        Princ = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        btn_service = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_contrato = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Login_exit = new javax.swing.JPanel();
        Admin_l1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Aboutus = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        About = new javax.swing.JLabel();
        espacio = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();
        Admin_l = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        Ayuntamiento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setMinimumSize(new java.awt.Dimension(270, 420));
        Menu.setPreferredSize(new java.awt.Dimension(270, 431));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logo.setForeground(new java.awt.Color(255, 255, 255));
        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 110));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 20));

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setMinimumSize(new java.awt.Dimension(109, 40));
        btn_prin.setPreferredSize(new java.awt.Dimension(109, 40));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Princ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Princ.setForeground(new java.awt.Color(255, 255, 255));
        Princ.setText("Principal");
        btn_prin.add(Princ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home-outline.png"))); // NOI18N
        btn_prin.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 260, 50));

        btn_service.setBackground(new java.awt.Color(18, 90, 173));
        btn_service.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_serviceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_serviceMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_serviceMousePressed(evt);
            }
        });
        btn_service.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Servicios");
        btn_service.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-servicio-30.png"))); // NOI18N
        btn_service.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(btn_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 50));

        btn_contrato.setBackground(new java.awt.Color(18, 90, 173));
        btn_contrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_contratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_contratoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_contratoMousePressed(evt);
            }
        });
        btn_contrato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book-open-page-variant.png"))); // NOI18N
        btn_contrato.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contrato");
        btn_contrato.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        Menu.add(btn_contrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 50));

        btn_clientes.setBackground(new java.awt.Color(18, 90, 173));
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_clientesMousePressed(evt);
            }
        });
        btn_clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/account-multiple.png"))); // NOI18N
        btn_clientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");
        btn_clientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 30));

        Menu.add(btn_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 260, 50));

        Login_exit.setBackground(new java.awt.Color(18, 90, 173));
        Login_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Login_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Login_exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Login_exitMousePressed(evt);
            }
        });
        Login_exit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_l1.setBackground(new java.awt.Color(255, 255, 255));
        Admin_l1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_l1.setForeground(new java.awt.Color(255, 255, 255));
        Admin_l1.setText("Cerrar session");
        Login_exit.add(Admin_l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-salida-30.png"))); // NOI18N
        Login_exit.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        Menu.add(Login_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 260, 50));

        Aboutus.setBackground(new java.awt.Color(18, 90, 173));
        Aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Aboutus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AboutusMousePressed(evt);
            }
        });
        Aboutus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-información-30.png"))); // NOI18N
        Aboutus.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        About.setBackground(new java.awt.Color(255, 255, 255));
        About.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        About.setForeground(new java.awt.Color(255, 255, 255));
        About.setText("About Us");
        Aboutus.add(About, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));

        Menu.add(Aboutus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 260, 50));

        espacio.setBackground(new java.awt.Color(18, 90, 173));
        espacio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                espacioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                espacioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                espacioMousePressed(evt);
            }
        });
        espacio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin.setBackground(new java.awt.Color(18, 90, 173));
        Admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AdminMousePressed(evt);
            }
        });
        Admin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Admin_l.setBackground(new java.awt.Color(255, 255, 255));
        Admin_l.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Admin_l.setForeground(new java.awt.Color(255, 255, 255));
        Admin_l.setText("Administrador");
        Admin.add(Admin_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 110, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-administrador-del-sistema-macho-32 (1).png"))); // NOI18N
        Admin.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        espacio.add(Admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 50));

        Menu.add(espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 260, 200));

        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Menu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 30));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setOpaque(true);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        Title.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 60, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-menos-30.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        Title.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 60, 30));

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 30));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 1030, 500));

        Header.setBackground(new java.awt.Color(25, 118, 210));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administración/Control/Servicio");
        Header.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("Hoy es Jueves 24 de Marzo de 2022");
        Header.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1030, 40));

        Ayuntamiento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ayuntamiento.setForeground(new java.awt.Color(255, 255, 255));
        Ayuntamiento.setText("H. Ayuntamiento de Cacahoatán");
        Header.add(Ayuntamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 260, 34));

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 1030, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if (btn_prin.getBackground().getRGB() == -15574355) {
            setColor(btn_prin);
        }
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if (btn_service.getBackground().getRGB() != -15574355 || btn_contrato.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 
                || Admin.getBackground().getRGB() != -15574355 || Aboutus.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(btn_prin);
        }
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_service);
        resetColor(btn_contrato);
        resetColor(btn_clientes);
        resetColor(Admin);
        resetColor(Aboutus);
        p1.setSize(1030, 500);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_prinMousePressed

    private void btn_serviceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviceMouseEntered
        if (btn_service.getBackground().getRGB() == -15574355) {
            setColor(btn_service);
        }
    }//GEN-LAST:event_btn_serviceMouseEntered

    private void btn_serviceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviceMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_contrato.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 
                || Admin.getBackground().getRGB() != -15574355 || Aboutus.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(btn_service);
        }
    }//GEN-LAST:event_btn_serviceMouseExited

    private void btn_serviceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviceMousePressed
        ventana = "servicio";
        new MostrarPanel().show();
    }//GEN-LAST:event_btn_serviceMousePressed

    private void btn_contratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_contratoMouseEntered
        if (btn_contrato.getBackground().getRGB() == -15574355) {
            setColor(btn_contrato);
        }
    }//GEN-LAST:event_btn_contratoMouseEntered

    private void btn_contratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_contratoMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_service.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355
                || Admin.getBackground().getRGB() != -15574355 || Aboutus.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(btn_contrato);
        }
    }//GEN-LAST:event_btn_contratoMouseExited

    private void btn_contratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_contratoMousePressed
        ventana = "contratos";
        if (es.getUbicacion().equals("null") || es.getUbicacion().equals("contrato") || es.getUbicacion().equals("cliente")) {
            new MostrarPanel().show();
        } else {
            Confirmacion();
            if (cerrar == 1) {
                new MostrarPanel().show();
            }
        }
    }//GEN-LAST:event_btn_contratoMousePressed

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        if (btn_clientes.getBackground().getRGB() == -15574355) {
            setColor(btn_clientes);
        }
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        if (btn_prin.getBackground().getRGB() != -15574355 || btn_service.getBackground().getRGB() != -15574355
                || btn_contrato.getBackground().getRGB() != -15574355
                || Admin.getBackground().getRGB() != -15574355 || Aboutus.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(btn_clientes);
        }
    }//GEN-LAST:event_btn_clientesMouseExited

    private void btn_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMousePressed
        ventana = "clientes";
        if (es.getUbicacion().equals("null") || es.getUbicacion().equals("contrato") || es.getUbicacion().equals("cliente")) {
            new MostrarPanel().show();
        } else {
            Confirmacion();
            if (cerrar == 1) {
                new MostrarPanel().show();
            }
        }
    }//GEN-LAST:event_btn_clientesMousePressed

    private void AdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseEntered

        if (Admin.getBackground().getRGB() == -15574355) {
            setColor(Admin);
        }
    }//GEN-LAST:event_AdminMouseEntered

    private void AdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMouseExited
        if (btn_service.getBackground().getRGB() != -15574355
                || btn_contrato.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 || Aboutus.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(Admin);
        }
    }//GEN-LAST:event_AdminMouseExited

    private void AdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminMousePressed
        setColor(Admin);
        resetColor(btn_service);
        resetColor(btn_contrato);
        resetColor(btn_clientes);
        resetColor(btn_prin);

        Administrador p1 = new Administrador();
        p1.setSize(1030, 500);
        p1.setLocation(0, 0);

        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_AdminMousePressed

    private void Login_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_exitMouseEntered
        if (Login_exit.getBackground().getRGB() == -15574355) {
            setColor(Login_exit);
        }
    }//GEN-LAST:event_Login_exitMouseEntered

    private void Login_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_exitMouseExited
        if ( btn_service.getBackground().getRGB() != -15574355
                || btn_contrato.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 || Admin.getBackground().getRGB() != -15574355
                || Aboutus.getBackground().getRGB() != -15574355) {
            resetColor(Login_exit);
        }
    }//GEN-LAST:event_Login_exitMouseExited

    private void Login_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_exitMousePressed
        ErrorsAndSuccesses pe = new ErrorsAndSuccesses();
        Login p2 = new Login();
        if (pe.isExitoConexion() == true) {
            pe.setExitoConexion(false);
            Logeo l = new Logeo("", "");
            this.dispose();
            p2.setVisible(true);
        }

    }//GEN-LAST:event_Login_exitMousePressed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
    exit.setBackground(new Color(204, 0, 0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color(255, 255, 255));
        exit.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_exitMouseExited

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
               System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void AboutusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutusMousePressed
        resetColor(btn_prin);
        setColor(Aboutus);
        resetColor(btn_clientes);
        resetColor(btn_service);
        resetColor(Admin);
        resetColor(btn_contrato);

        About pv = new About();
        pv.setSize(1030, 500);
        pv.setLocation(0, 0);

        content.removeAll();
        content.add(pv, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_AboutusMousePressed

    private void AboutusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutusMouseExited
        if ( btn_service.getBackground().getRGB() != -15574355
                || btn_contrato.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
                || btn_clientes.getBackground().getRGB() != -15574355 || Admin.getBackground().getRGB() != -15574355
                || Login_exit.getBackground().getRGB() != -15574355) {
            resetColor(Aboutus);
        }
    }//GEN-LAST:event_AboutusMouseExited

    private void AboutusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutusMouseEntered
        if (Aboutus.getBackground().getRGB() == -15574355) {
            setColor(Aboutus);
        }
    }//GEN-LAST:event_AboutusMouseEntered

    private void espacioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioMouseEntered

    private void espacioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioMouseExited

    private void espacioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_espacioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_espacioMousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked
    void setColor(JPanel panel) {
        panel.setBackground(new Color(21, 101, 192));
    }

    void resetColor(JPanel panel) {
        panel.setBackground(new Color(18, 90, 173));
    }

    public class MostrarPanel implements Runnable {

        public void show() {
            new Thread(this).start();
        }

        @Override
        public void run() {
            if (ventana.equals("servicio")) {
                MostrarService();
            }
            if (ventana.equals("clientes")) {
                MostrarCL();
            }
            if (ventana.equals("contratos")) {
                MostrarContrato();
            }
        }
    }

    private void MostrarContrato() {
        resetColor(btn_prin);
        setColor(btn_contrato);
        resetColor(btn_clientes);
        resetColor(btn_service);
        resetColor(Admin);
        resetColor(Aboutus);

        Contrato_v pv = new Contrato_v();
        pv.setSize(1030, 500);
        pv.setLocation(0, 0);

        eventos.register(pv);
        content.removeAll();
        content.add(pv, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void MostrarService() {
        resetColor(btn_prin);
        setColor(btn_service);
        resetColor(btn_contrato);
        resetColor(btn_clientes);
        resetColor(Admin);
        resetColor(Aboutus);

        Pago pg = new Pago();
        pg.setSize(1030, 500);
        pg.setLocation(0, 0);

        eventos.register(pg);
        content.removeAll();
        content.add(pg, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void MostrarCL() {

        resetColor(btn_prin);
        setColor(btn_clientes);
        resetColor(btn_contrato);
        resetColor(btn_service);
        resetColor(Admin);
        resetColor(Aboutus);

        Clientes pc = new Clientes();
        pc.setSize(1030, 500);
        pc.setLocation(0, 0);

        content.removeAll();
        content.add(pc, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    private void Confirmacion() {
        if (es.getUbicacion().equals("editar cliente")) {
            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los cambios?", "Actualizacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                cerrar = 1;
                es.setUbicacion("null");
            } else {
                cerrar = -1;
            }
        }
        if (es.getUbicacion().equals("insert cliente")) {

            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                cerrar = 1;
                es.setUbicacion("null");
            } else {
                cerrar = -1;
            }
        }

        if (es.getUbicacion().equals("insert contrato")) {

            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                cerrar = 1;
                es.setUbicacion("null");
            } else {
                cerrar = -1;
            }
        }
        if (es.getUbicacion().equals("editar contrato")) {

            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                cerrar = 1;
                es.setUbicacion("null");
            } else {
                cerrar = -1;
            }
        }
        if (es.getUbicacion().equals("cliente contrato")) {

            String[] arreglo = {"Si", "No"};
            int opcionp = JOptionPane.showOptionDialog(null, "¿Desea descartar los datos?", "Creacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
            if (arreglo[opcionp].equals("Si")) {
                cerrar = 1;
                es.setUbicacion("null");
            } else {
                cerrar = -1;
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel About;
    private javax.swing.JPanel Aboutus;
    public static javax.swing.JPanel Admin;
    private javax.swing.JLabel Admin_l;
    private javax.swing.JLabel Admin_l1;
    private javax.swing.JLabel Ayuntamiento;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Login_exit;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel Princ;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel btn_clientes;
    private javax.swing.JPanel btn_contrato;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_service;
    public static javax.swing.JPanel content;
    private javax.swing.JPanel espacio;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
