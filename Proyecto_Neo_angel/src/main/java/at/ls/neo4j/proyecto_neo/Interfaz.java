package at.ls.neo4j.proyecto_neo;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import static org.neo4j.driver.Values.parameters;
//import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Interfaz extends javax.swing.JFrame {

    ArrayList<Desarrollador> desarrolladores = new ArrayList();
    private int devcodeGlobal = 0;

    Driver driver = GraphDatabase.driver("bolt://localhost:7687",
            AuthTokens.basic("neo4j", "1234"));

    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        bugStatsQA.setUndecorated(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuAdmin = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuDev = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        menuDevProyectos = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuDevBugs = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton35 = new javax.swing.JButton();
        estadisticasBugs = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        crudProyecto = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable14 = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        crudDev = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton25 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jTextField7 = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jTextField8 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        assignBugToDev = new javax.swing.JDialog();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        menuQA = new javax.swing.JDialog();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable15 = new javax.swing.JTable();
        jButton33 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        QAtodosLosBugs = new javax.swing.JDialog();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        aniadirDevs = new javax.swing.JDialog();
        jComboBox7 = new javax.swing.JComboBox<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton18 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        eliminarDevProjecto = new javax.swing.JDialog();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable12 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        creacionUsuarios = new javax.swing.JDialog();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel43 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton32 = new javax.swing.JButton();
        comentariosBug = new javax.swing.JDialog();
        jTextField12 = new javax.swing.JTextField();
        jButton36 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        calendario = new javax.swing.JDialog();
        jButton39 = new javax.swing.JButton();
        bugStatsQA = new javax.swing.JDialog();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jButton11 = new javax.swing.JButton();
        jTextField17 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        creacionDev = new javax.swing.JDialog();
        jLabel55 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jButton40 = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable16 = new javax.swing.JTable();
        jLabel57 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jButton41 = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable17 = new javax.swing.JTable();
        jButton42 = new javax.swing.JButton();
        mandarCorreo = new javax.swing.JDialog();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton44 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jComboBox9 = new javax.swing.JComboBox<>();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField13 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Administrador del Desarrollo de Software");

        jButton7.setText("CRUD Proyectos de Software ");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("CRUD Equipo de Desarrolladores");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Estadísticas de los bugs");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Asignar bugs a Devs");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton31.setText("Creación de usuarios");
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton31MouseClicked(evt);
            }
        });
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 51, 51));
        jLabel50.setText("jLabel49");
        jLabel50.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuAdminLayout = new javax.swing.GroupLayout(menuAdmin.getContentPane());
        menuAdmin.getContentPane().setLayout(menuAdminLayout);
        menuAdminLayout.setHorizontalGroup(
            menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuAdminLayout.createSequentialGroup()
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuAdminLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5))
                            .addGroup(menuAdminLayout.createSequentialGroup()
                                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7))
                                .addGap(35, 35, 35)
                                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                        .addGap(19, 19, 19))
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))))
        );
        menuAdminLayout.setVerticalGroup(
            menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuAdminLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(menuAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(menuAdminLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Desarrollador de Software");

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Ir a bugs asignados");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Escoja el desarrollador");

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Ir a proyectos de software asignados");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton34.setText("Calendario");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 51, 51));
        jLabel49.setText("jLabel49");
        jLabel49.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton4.setText("CERRAR SESION");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuDevLayout = new javax.swing.GroupLayout(menuDev.getContentPane());
        menuDev.getContentPane().setLayout(menuDevLayout);
        menuDevLayout.setHorizontalGroup(
            menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDevLayout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuDevLayout.createSequentialGroup()
                        .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuDevLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDevLayout.createSequentialGroup()
                                .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuDevLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(menuDevLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(75, 75, 75))
        );
        menuDevLayout.setVerticalGroup(
            menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDevLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49)
                    .addComponent(jButton4))
                .addGap(40, 40, 40)
                .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34))
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(menuDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Proyectos Asignados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Fecha de Inicio", "Fecha de finalización"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout menuDevProyectosLayout = new javax.swing.GroupLayout(menuDevProyectos.getContentPane());
        menuDevProyectos.getContentPane().setLayout(menuDevProyectosLayout);
        menuDevProyectosLayout.setHorizontalGroup(
            menuDevProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDevProyectosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(menuDevProyectosLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuDevProyectosLayout.setVerticalGroup(
            menuDevProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDevProyectosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Bugs Asignados");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Escoja un bug");

        jLabel10.setText("Descripción del bug");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel11.setText("Fecha de incio de reparación");

        jButton13.setText("Finalizar Bug");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        jButton14.setText("Guardar");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Proyecto", "Código del bug"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jButton35.setText("Comentarios");
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton35MouseClicked(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuDevBugsLayout = new javax.swing.GroupLayout(menuDevBugs.getContentPane());
        menuDevBugs.getContentPane().setLayout(menuDevBugsLayout);
        menuDevBugsLayout.setHorizontalGroup(
            menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDevBugsLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuDevBugsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addGroup(menuDevBugsLayout.createSequentialGroup()
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        menuDevBugsLayout.setVerticalGroup(
            menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuDevBugsLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(menuDevBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Estadísticas Bugs");

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout estadisticasBugsLayout = new javax.swing.GroupLayout(estadisticasBugs.getContentPane());
        estadisticasBugs.getContentPane().setLayout(estadisticasBugsLayout);
        estadisticasBugsLayout.setHorizontalGroup(
            estadisticasBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estadisticasBugsLayout.createSequentialGroup()
                .addGroup(estadisticasBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(estadisticasBugsLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6))
                    .addGroup(estadisticasBugsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        estadisticasBugsLayout.setVerticalGroup(
            estadisticasBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estadisticasBugsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel30.setText("Nombre del proyecto");

        jLabel31.setText("Fecha de inicio");

        jLabel32.setText("Fecha finalización");

        jComboBox6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox6ItemStateChanged(evt);
            }
        });

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTable11);

        jLabel33.setText("Desarrolladores");

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton15.setText("CREAR");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel34.setText("Info del Dev");

        jTextPane1.setEditable(false);
        jScrollPane14.setViewportView(jTextPane1);

        jToggleButton1.setText("Tecnologias");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel32))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel31)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel34)
                                        .addGap(244, 244, 244)
                                        .addComponent(jToggleButton1)))))
                        .addGap(316, 316, 316)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel34)
                            .addComponent(jToggleButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addGap(47, 47, 47)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Insertar", jPanel1);

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Fecha inicio", "Fecha final", "Desarrolladores", "Bugs", "Bugs finalizados"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(jTable13);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        jTable14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre"
            }
        ));
        jTable14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable14MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(jTable14);

        jLabel35.setText("Escoja proyecto a modificar");

        jLabel36.setText("Nombre");

        jLabel37.setText("Fecha inicio");

        jLabel38.setText("Fecha finalización");

        jButton16.setText("MODIFICAR");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton12.setText("AÑADIR DEVS");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton17.setText("ELIMINAR DEVS");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel35)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(99, 99, 99)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel37))
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("CRUD Proyectos de Software");

        javax.swing.GroupLayout crudProyectoLayout = new javax.swing.GroupLayout(crudProyecto.getContentPane());
        crudProyecto.getContentPane().setLayout(crudProyectoLayout);
        crudProyectoLayout.setHorizontalGroup(
            crudProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudProyectoLayout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(crudProyectoLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        crudProyectoLayout.setVerticalGroup(
            crudProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudProyectoLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });
        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });

        jLabel23.setText("Nombre del empleado");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel24.setText("Lenguajes de programación que maneja");

        jButton23.setText("Agregar");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lenguajes de programación"
            }
        ));
        jScrollPane9.setViewportView(jTable6);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel26.setText("Tecnologías que domina");

        jButton24.setText("Agregar");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tecnologías"
            }
        ));
        jScrollPane10.setViewportView(jTable7);

        jButton25.setText("AGREGAR");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23))
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton24)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23)))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jTabbedPane2.addTab("Insertar", jPanel5);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Lenguajes de Programación", "Tecnologías"
            }
        ));
        jScrollPane11.setViewportView(jTable8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Listar", jPanel6);

        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });

        jLabel25.setText("Código de desarrollador");

        jLabel27.setText("Nombre");

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lenguajes de programación"
            }
        ));
        jScrollPane12.setViewportView(jTable9);

        jButton26.setText("Modificar lenguaje");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tecnologías"
            }
        ));
        jScrollPane13.setViewportView(jTable10);

        jButton27.setText("Modificar tecnología");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText("MODIFICAR");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addComponent(jButton26)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel27)
                        .addComponent(jTextField8))
                    .addComponent(jButton27))
                .addGap(76, 76, 76))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jButton28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton26)
                    .addComponent(jButton27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Modificar", jPanel7);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("CRUD Desarrolladores");

        jButton38.setText("Tecnologias");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crudDevLayout = new javax.swing.GroupLayout(crudDev.getContentPane());
        crudDev.getContentPane().setLayout(crudDevLayout);
        crudDevLayout.setHorizontalGroup(
            crudDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudDevLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel14)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudDevLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton38)
                .addGap(166, 166, 166))
            .addGroup(crudDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(crudDevLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        crudDevLayout.setVerticalGroup(
            crudDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudDevLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(jButton38)
                .addGap(208, 208, 208))
            .addGroup(crudDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crudDevLayout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(jTabbedPane2)
                    .addContainerGap()))
        );

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Asignar Bugs a los Desarrolladores");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Códidgo Proyecto", "Nombre Proyecto"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jLabel15.setText("Escoja proyecto");

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jLabel16.setText("Descripción de bug");

        jLabel17.setText("(Seleccione bug del proyecto)");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Desarrollador", "Nombre Desarrollador"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        jLabel18.setText("Seleccione desarrollador del proyecto");

        jButton19.setText("Asignar bug a este desarrollador");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });

        jLabel12.setText("(ID del bug)");

        javax.swing.GroupLayout assignBugToDevLayout = new javax.swing.GroupLayout(assignBugToDev.getContentPane());
        assignBugToDev.getContentPane().setLayout(assignBugToDevLayout);
        assignBugToDevLayout.setHorizontalGroup(
            assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignBugToDevLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(270, 270, 270))
            .addGroup(assignBugToDevLayout.createSequentialGroup()
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignBugToDevLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignBugToDevLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(assignBugToDevLayout.createSequentialGroup()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton19)
                    .addComponent(jLabel18)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        assignBugToDevLayout.setVerticalGroup(
            assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignBugToDevLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(assignBugToDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12)
                    .addComponent(jButton19))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jLabel28.setText("jLabel28");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Bugs");

        jLabel20.setText("Ingrese la descripción");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jLabel21.setText("Nivel de urgencia");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jButton20.setText("Ver todos los Bugs reportados");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("Reportar");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton21MouseEntered(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton30.setText("Cerrar Sesion");
        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton30MouseClicked(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jTable15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código Proyecto", "Nombre Proyecto"
            }
        ));
        jScrollPane20.setViewportView(jTable15);

        jButton33.setText("Crear Reporte");
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton33MouseClicked(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 51, 51));
        jLabel51.setText("jLabel49");
        jLabel51.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton5.setText("Estadísticas de bugs de proyectos");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuQALayout = new javax.swing.GroupLayout(menuQA.getContentPane());
        menuQA.getContentPane().setLayout(menuQALayout);
        menuQALayout.setHorizontalGroup(
            menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuQALayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jButton30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel51)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuQALayout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuQALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel19)
                        .addGap(355, 355, 355))
                    .addGroup(menuQALayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(menuQALayout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel21)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(menuQALayout.createSequentialGroup()
                                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menuQALayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuQALayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        menuQALayout.setVerticalGroup(
            menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuQALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton30)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuQALayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addGroup(menuQALayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(menuQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56))))
        );

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Código proyecto software", "Descripción", "Nivel de urgencia", "Estado", "Fecha inicio reparación", "Fecha finalizado"
            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable5);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setText("Todos los bugs reportados");

        javax.swing.GroupLayout QAtodosLosBugsLayout = new javax.swing.GroupLayout(QAtodosLosBugs.getContentPane());
        QAtodosLosBugs.getContentPane().setLayout(QAtodosLosBugsLayout);
        QAtodosLosBugsLayout.setHorizontalGroup(
            QAtodosLosBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QAtodosLosBugsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(362, 362, 362))
            .addGroup(QAtodosLosBugsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1056, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        QAtodosLosBugsLayout.setVerticalGroup(
            QAtodosLosBugsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QAtodosLosBugsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });
        jComboBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox7MouseClicked(evt);
            }
        });
        jComboBox7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jComboBox7ComponentMoved(evt);
            }
        });

        jTextPane2.setEditable(false);
        jScrollPane16.setViewportView(jTextPane2);

        jButton18.setText("Agregar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel29.setText("Seleccione Dev");

        jLabel39.setText("Info del dev");

        javax.swing.GroupLayout aniadirDevsLayout = new javax.swing.GroupLayout(aniadirDevs.getContentPane());
        aniadirDevs.getContentPane().setLayout(aniadirDevsLayout);
        aniadirDevsLayout.setHorizontalGroup(
            aniadirDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aniadirDevsLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addGroup(aniadirDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aniadirDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel39)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        aniadirDevsLayout.setVerticalGroup(
            aniadirDevsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aniadirDevsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton18)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTable12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Lenguajes", "Tecnologias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(jTable12);

        jButton22.setText("Eliminar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eliminarDevProjectoLayout = new javax.swing.GroupLayout(eliminarDevProjecto.getContentPane());
        eliminarDevProjecto.getContentPane().setLayout(eliminarDevProjectoLayout);
        eliminarDevProjectoLayout.setHorizontalGroup(
            eliminarDevProjectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarDevProjectoLayout.createSequentialGroup()
                .addGroup(eliminarDevProjectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(eliminarDevProjectoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(eliminarDevProjectoLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        eliminarDevProjectoLayout.setVerticalGroup(
            eliminarDevProjectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarDevProjectoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel40.setText("Creación de usuarios");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Login");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel42.setText("Contraseña");

        jPasswordField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Rol");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Desarrollador", "QA" }));

        jButton32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton32.setText("Crear Usuario");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout creacionUsuariosLayout = new javax.swing.GroupLayout(creacionUsuarios.getContentPane());
        creacionUsuarios.getContentPane().setLayout(creacionUsuariosLayout);
        creacionUsuariosLayout.setHorizontalGroup(
            creacionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacionUsuariosLayout.createSequentialGroup()
                .addGap(0, 166, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(165, 165, 165))
            .addGroup(creacionUsuariosLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(creacionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jComboBox8, 0, 317, Short.MAX_VALUE)
                    .addComponent(jLabel43)
                    .addComponent(jPasswordField1)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        creacionUsuariosLayout.setVerticalGroup(
            creacionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionUsuariosLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel40)
                .addGap(30, 30, 30)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTextField12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jButton36.setText("X");

        jTextPane3.setEditable(false);
        jScrollPane21.setViewportView(jTextPane3);

        jLabel44.setText("Usuario Actual:");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setText("jLabel45");

        javax.swing.GroupLayout comentariosBugLayout = new javax.swing.GroupLayout(comentariosBug.getContentPane());
        comentariosBug.getContentPane().setLayout(comentariosBugLayout);
        comentariosBugLayout.setHorizontalGroup(
            comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comentariosBugLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comentariosBugLayout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane21)
                        .addGroup(comentariosBugLayout.createSequentialGroup()
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        comentariosBugLayout.setVerticalGroup(
            comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comentariosBugLayout.createSequentialGroup()
                .addGroup(comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(comentariosBugLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addGap(28, 28, 28))
                    .addGroup(comentariosBugLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)))
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(comentariosBugLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        jButton39.setText("volver");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout calendarioLayout = new javax.swing.GroupLayout(calendario.getContentPane());
        calendario.getContentPane().setLayout(calendarioLayout);
        calendarioLayout.setHorizontalGroup(
            calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton39)
                .addContainerGap(314, Short.MAX_VALUE))
        );
        calendarioLayout.setVerticalGroup(
            calendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendarioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton39)
                .addContainerGap(264, Short.MAX_VALUE))
        );

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setText("Escoja el proyecto");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel53.setText("Estadísticas de bugs de proyectos");

        jComboBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox10ItemStateChanged(evt);
            }
        });

        jButton11.setText("Mostrar estadísticas");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jTextField17.setEditable(false);

        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        jButton29.setText("Volver");
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton29MouseClicked(evt);
            }
        });

        jLabel54.setText("(ID del proyecto)");

        javax.swing.GroupLayout bugStatsQALayout = new javax.swing.GroupLayout(bugStatsQA.getContentPane());
        bugStatsQA.getContentPane().setLayout(bugStatsQALayout);
        bugStatsQALayout.setHorizontalGroup(
            bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bugStatsQALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(208, 208, 208))
            .addGroup(bugStatsQALayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bugStatsQALayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addGap(48, 48, 48))
        );
        bugStatsQALayout.setVerticalGroup(
            bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bugStatsQALayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jButton29))
                .addGap(18, 18, 18)
                .addGroup(bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bugStatsQALayout.createSequentialGroup()
                        .addGroup(bugStatsQALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bugStatsQALayout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)))
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel55.setText("Nombre del empleado");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel56.setText("Lenguajes de programación que maneja");

        jButton40.setText("Agregar");
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton40MouseClicked(evt);
            }
        });
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jTable16.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lenguajes de programación"
            }
        ));
        jScrollPane22.setViewportView(jTable16);

        jLabel57.setText("Tecnologías que domina");

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jButton41.setText("Agregar");
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton41MouseClicked(evt);
            }
        });
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jTable17.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tecnologías"
            }
        ));
        jScrollPane23.setViewportView(jTable17);

        jButton42.setText("AGREGAR");
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton42MouseClicked(evt);
            }
        });
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout creacionDevLayout = new javax.swing.GroupLayout(creacionDev.getContentPane());
        creacionDev.getContentPane().setLayout(creacionDevLayout);
        creacionDevLayout.setHorizontalGroup(
            creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(creacionDevLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionDevLayout.createSequentialGroup()
                        .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField18)
                            .addGroup(creacionDevLayout.createSequentialGroup()
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40))
                            .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(creacionDevLayout.createSequentialGroup()
                        .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(creacionDevLayout.createSequentialGroup()
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton41)))
                            .addGroup(creacionDevLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        creacionDevLayout.setVerticalGroup(
            creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, creacionDevLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(creacionDevLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton40)))
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(creacionDevLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(creacionDevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton41))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(creacionDevLayout.createSequentialGroup()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel58.setText("Enviar correo al desarrollador");

        jLabel59.setText("Asunto");

        jLabel60.setText("Destinatario");

        jTextField22.setEditable(false);

        jLabel61.setText("Mensaje");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane24.setViewportView(jTextArea4);

        jButton44.setText("Enviar");
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mandarCorreoLayout = new javax.swing.GroupLayout(mandarCorreo.getContentPane());
        mandarCorreo.getContentPane().setLayout(mandarCorreoLayout);
        mandarCorreoLayout.setHorizontalGroup(
            mandarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mandarCorreoLayout.createSequentialGroup()
                .addGroup(mandarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mandarCorreoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(mandarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61)
                            .addComponent(jLabel60)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59)))
                    .addGroup(mandarCorreoLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mandarCorreoLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel58)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        mandarCorreoLayout.setVerticalGroup(
            mandarCorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mandarCorreoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel58)
                .addGap(18, 18, 18)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton37.setForeground(new java.awt.Color(102, 204, 255));
        jButton37.setText("INICIAR SESION");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Desarrollador", "QA" }));

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jTextField13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Login");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("Contraseña");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("Rol");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("BIENVENIDOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel48)
                            .addComponent(jPasswordField2)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        crudProyecto.pack();
        crudProyecto.setLocationRelativeTo(this);
        crudProyecto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        crudDev.pack();
        crudDev.setLocationRelativeTo(this);
        crudDev.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        estadisticasBugs.pack();
        estadisticasBugs.setLocationRelativeTo(this);
        estadisticasBugs.setVisible(true);
        this.setVisible(false);
        estadisticasDeLosBugs();
    }//GEN-LAST:event_jButton9MouseClicked

    public void estadisticasDeLosBugs() {
        DefaultPieDataset datos = new DefaultPieDataset();
        //Obtener los datos por medio de los 3 queries
        try ( Session session = driver.session()) {

            jPanel4.removeAll();
            jPanel4.revalidate();

            ArrayList<Integer> cantidad = new ArrayList();
            //Bugs nuevos
            Result result = session.run("match (b:Bug) where b.estado='nuevo' return count(b)");
            result.list().forEach(r -> cantidad.add(r.get(0).asInt()));

            //Bugs asignados
            result = session.run("match (b:Bug) where b.estado='asignado' return count(b)");
            result.list().forEach(r -> cantidad.add(r.get(0).asInt()));

            //Bugs finalizados
            result = session.run("match (b:Bug) where b.estado='finalizado' return count(b)");
            result.list().forEach(r -> cantidad.add(r.get(0).asInt()));

            datos.setValue("Bugs Nuevos", cantidad.get(0));
            datos.setValue("Bugs Asignados", cantidad.get(1));
            datos.setValue("Bugs Finalizados", cantidad.get(2));

            JFreeChart grafico_circular = ChartFactory.createPieChart(
                    "Estado Actual de los Bugs",
                    datos,
                    true,
                    true,
                    false
            );

            ChartPanel panel = new ChartPanel(grafico_circular);
            panel.setMouseWheelEnabled(true);
            panel.setPreferredSize(new Dimension(544, 408));

            jPanel4.setLayout(new BorderLayout());
            jPanel4.add(panel, BorderLayout.NORTH);

            pack();
            repaint();
        }
    }

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        assignBugToDev.pack();
        assignBugToDev.setLocationRelativeTo(this);
        assignBugToDev.setVisible(true);
        this.setVisible(false);
        cargarProyectosEnAssignBugToDev();
    }//GEN-LAST:event_jButton10MouseClicked

    public void cargarProyectosEnAssignBugToDev() {
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        try ( Session session = driver.session()) {

            Result result = session.run("match (p:Proyecto)-[:TIENE_UN]->(:Bug) return distinct p.codigo, p.nombre order by p.codigo");
            result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString()}));

        }
        jTable3.setModel(model);
    }

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        menuDevProyectos.pack();
        menuDevProyectos.setLocationRelativeTo(this);
        menuDevProyectos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        menuDevBugs.pack();
        menuDevBugs.setLocationRelativeTo(this);
        menuDevBugs.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Desarrollador de = new Desarrollador();
        for (Desarrollador d : desarrolladores) {
            if (d.getCodigo() == Integer.parseInt(jComboBox6.getSelectedItem().toString())) {
                de = d;
            }
        }
        DefaultTableModel model = (DefaultTableModel) jTable11.getModel();
        devsSeleccionados.add(de);
        model.addRow(new Object[]{de.getCodigo(), de.getNombre()});
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTable6.getModel();
        String[] lenguaje = {jTextField4.getText()};
        modelo.addRow(lenguaje);
        jTable6.setModel(modelo);
        jTextField4.setText("");
    }//GEN-LAST:event_jButton23MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        DefaultTableModel modelo = (DefaultTableModel) jTable7.getModel();
        String[] tecnologia = {jTextField6.getText()};
        modelo.addRow(tecnologia);
        jTable7.setModel(modelo);
        jTextField6.setText("");
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseClicked
        String lenguajes = new String();
        String tecnologias = new String();

        //recorrer lenguajes de la tabla
        for (int i = 0; i < jTable6.getRowCount(); i++) {
            lenguajes += ((String) jTable6.getValueAt(i, 0)) + ";";
        }

        //recorrer tecnologias
        for (int i = 0; i < jTable7.getRowCount(); i++) {
            tecnologias += ((String) jTable7.getValueAt(i, 0)) + ";";
        }

        try ( Session session = driver.session()) {

            ArrayList<Integer> codigo = new ArrayList();

            Result result = session.run("Match (d:Dev) return count(d)");

            result.list().forEach(r -> codigo.add(r.get(0).asInt()));

            System.out.println("Codigo: " + codigo.size());

            result = session.run("CREATE (d:Dev{ nombre:$nombre,codigo:$codigo, lenguajes:$lenguajes, tecnologias:$tecnologias})",
                    parameters("nombre", jTextField3.getText(), "codigo", codigo.get(0) + 1, "lenguajes", lenguajes,
                            "tecnologias", tecnologias));

            desarrolladores.add(new Desarrollador(codigo.get(0) + 1, jTextField3.getText(), lenguajes, tecnologias));

            jTextField3.setText("");
            String[] l = {"Lenguajes de programación"};
            DefaultTableModel modelo = new DefaultTableModel(null, l);
            jTable6.setModel(modelo);

            String[] t = {"Tecnologías"};
            DefaultTableModel modelo2 = new DefaultTableModel(null, t);
            jTable7.setModel(modelo2);

            JOptionPane.showMessageDialog(null, "Se guardó el desarrollador");
        }
    }//GEN-LAST:event_jButton25MouseClicked

    public void cargarDevs() {
        try ( Session session = driver.session()) {
            desarrolladores.clear();
            Result result = session.run("Match (d:Dev) return d.codigo, d.nombre, d.lenguajes, d.tecnologias");
            result.list().forEach(r -> desarrolladores.add(new Desarrollador(
                    r.get(0).asInt(),
                    r.get(1).asString(),
                    r.get(2).asString(),
                    r.get(3).asString())));
        }

        DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
        model.setRowCount(0);
        for (Desarrollador d : desarrolladores) {

            model.addRow(new Object[]{d.getCodigo(), d.getNombre(), d.getLenguajes().toString(), d.getTecnologias().toString()});
        }
    }


    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        if (jTabbedPane2.getSelectedIndex() == 1) {
            DefaultTableModel model = (DefaultTableModel) jTable8.getModel();
            model.setRowCount(0);

            cargarDevs();
        } else if (jTabbedPane2.getSelectedIndex() == 2) {
            cargarDevs();
            jComboBox5.removeAllItems();
            for (int i = 0; i < desarrolladores.size(); i++) {
                jComboBox5.addItem(Integer.toString(desarrolladores.get(i).getCodigo()));
            }

        }

    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        /*if (!desarrolladores.isEmpty()) {
            String[] titulos = {"Código", "Nombre", "Lenguajes de Programación", "Tecnologías"};
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            jTable8.setModel(modelo);
            modelo = (DefaultTableModel) jTable8.getModel();
            for (int i = 0; i < desarrolladores.size(); i++) {
                String[] dev = {String.valueOf(desarrolladores.get(i).getCodigo()), desarrolladores.get(i).getNombre(),
                    String.join(",", desarrolladores.get(i).getLenguajes()), String.join(",", desarrolladores.get(i).getTecnologias())};
                modelo.addRow(dev);
            }
            jTable8.setModel(modelo);
        }*/

    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try ( Session session = driver.session()) {
            cargarDevs();
            devsSeleccionados.clear();
            jComboBox6.removeAllItems();
            for (int i = 0; i < desarrolladores.size(); i++) {
                jComboBox6.addItem(String.valueOf(desarrolladores.get(i).getCodigo()));
            }

            System.out.println("Se cargaron la cantidad de devs: " + desarrolladores.size());

        } finally {

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        driver.close();
    }//GEN-LAST:event_formWindowClosed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged

        Desarrollador de = new Desarrollador();
        for (Desarrollador d : desarrolladores) {
            if (d.getCodigo() == Integer.valueOf((String) evt.getItem())) {
                de = d;
            }
        }

        jTextField5.setText(de.getNombre());
        DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
        model.setRowCount(0);
        for (int i = 0; i < de.getLenguajes().size(); i++) {
            model.addRow(new Object[]{de.getLenguajes().get(i)});
        }

        DefaultTableModel model1 = (DefaultTableModel) jTable10.getModel();
        model1.setRowCount(0);
        for (int i = 0; i < de.getTecnologias().size(); i++) {
            model1.addRow(new Object[]{de.getTecnologias().get(i)});
        }


    }//GEN-LAST:event_jComboBox5ItemStateChanged

    //Modificar una lenguaje
    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
        if (jTable9.getSelectedRow() != -1) {
            model.setValueAt(jTextField7.getText(), jTable9.getSelectedRow(), 0);
            jTextField7.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Tiene que seleccionar el el lenguaje a modificar!");
        }


    }//GEN-LAST:event_jButton26ActionPerformed

    //modificar dev
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try ( Session session = driver.session()) {
            desarrolladores.clear();

            String lenguajes = "", tecnologias = "";
            //Pasar toda la tabla de lenguajes/tecnologias a un String
            for (int i = 0; i < jTable9.getRowCount(); i++) {
                lenguajes += jTable9.getValueAt(i, 0) + ";";
            }

            for (int i = 0; i < jTable10.getRowCount(); i++) {
                tecnologias += jTable10.getValueAt(i, 0) + ";";
            }

            Result result = session.run("Match (d:Dev {codigo:$codigo}) set d.lenguajes=$lenguajes, d.nombre=$nombre, d.tecnologias=$tecnologias return d",
                    parameters("codigo", Integer.parseInt(jComboBox5.getSelectedItem().toString()), "lenguajes", lenguajes, "nombre", jTextField5.getText(),
                            "tecnologias", tecnologias));

            result.list().forEach(r -> System.out.println("El nuevo nodo es: " + r.get(0).asNode().values()));

            cargarDevs();

            jTextField5.setText("");
            DefaultTableModel model = (DefaultTableModel) jTable9.getModel();
            model.setRowCount(0);

            model = (DefaultTableModel) jTable10.getModel();
            model.setRowCount(0);

            JOptionPane.showMessageDialog(crudDev, "Se modifico el DEV correctamente");
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    //Modificar un lenguaje
    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable10.getModel();
        if (jTable10.getSelectedRow() != 1) {
            model.setValueAt(jTextField8.getText(), jTable10.getSelectedRow(), 0);
            jTextField8.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Tiene que seleccionar la tecnologia a modificar!");
        }
    }//GEN-LAST:event_jButton27ActionPerformed
    private int codigoDeBug() {
        //Hacer query que retorne el top desc de los códigos de los bugs que hay en la base de datos, y sumarle 1.
        int codigoBug = 0;
        try ( Session session = driver.session()) {
            ArrayList<Integer> x = new ArrayList();

            Result result = session.run("Match (b:Bug) return count(b)");

            result.list().forEach(r -> x.add(r.get(0).asInt()));

            codigoBug = x.get(0) + 1;
        }
        return codigoBug;
    }

    public void cargarTodosLosBugsReportadosAlaTabla() {
        try ( Session session = driver.session()) {
            String[] titulos = {"Código", "Código proyecto software", "Descripción", "Nivel de urgencia", "Estado",
                "Fecha inicio reparación", "Fecha finalizado"};
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);

            Result result = session.run("Match (b:Bug) return b.codigo, b.codigoproyecto, b.descripcion, b.nivelUrgencia,"
                    + "b.estado, b.fechaInicio, b.fechaFinalizado");
            result.list().forEach(r -> modelo.addRow(new Object[]{r.get(0).asInt(), r.get(1).asInt(),
                r.get(2).asString(), r.get(3).asInt(), r.get(4).asString(), r.get(5).asString(),
                r.get(6).asString()}));

            jTable5.setModel(modelo);

        }
    }

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        QAtodosLosBugs.pack();
        QAtodosLosBugs.setLocationRelativeTo(this);
        QAtodosLosBugs.setVisible(true);
        this.setVisible(false);
        cargarTodosLosBugsReportadosAlaTabla();
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        try ( Session session = driver.session()) {

            String descripcion = jTextArea3.getText(), estado = "nuevo", fi = "", ff = "";
            int codigo = codigoDeBug();
            int codigoproyecto = (int) jTable15.getValueAt(jTable15.getSelectedRow(), 0);
            int nivelurgencia = Integer.parseInt(jComboBox4.getSelectedItem().toString());

            Result result = session.run("CREATE (b:Bug{codigo:$codigo, descripcion:$descripcion, codigoproyecto:$codigoproyecto,"
                    + "nivelUrgencia:$nivelUrgencia, estado:$estado, fechaInicio:$fechaInicio, fechaFinalizado:$fechaFinalizado})",
                    parameters("codigo", codigo, "descripcion", descripcion, "codigoproyecto", codigoproyecto,
                            "nivelUrgencia", nivelurgencia, "estado", estado, "fechaInicio", fi, "fechaFinalizado", ff));

            System.out.println(result.consume().counters().nodesCreated());

            //Ahora, crear la relacion entre el bug insertado y el proyecto seleccionado
            result = session.run("MATCH (p:Proyecto{codigo:$codigo}),(b:Bug{codigo:$codigo1})"
                    + "CREATE (p)-[:TIENE_UN]->(b)",
                    parameters("codigo", codigoproyecto, "codigo1", codigo));
            System.out.println(result.consume().counters().relationshipsCreated());

            //Crear la relación entre el usuario QA que está logeado actualmente y el bug que acaba de reportar
            result = session.run("MATCH (u:Usuario{login:$login}),(b:Bug{codigo:$codigo})"
                    + "CREATE (u)-[:REPORTA]->(b)",
                    parameters("login", jLabel51.getText(), "codigo", codigo));
            System.out.println(result.consume().counters().relationshipsCreated());

            jTextArea3.setText("");
            jComboBox4.setSelectedIndex(0);
            jTable15.clearSelection();

            JOptionPane.showMessageDialog(null, "Se reportó el bug");
        }
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MouseClicked
        menuQA.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_jButton30MouseClicked

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        cargarTodosLosBugsReportadosAlaTabla();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jComboBox6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox6ItemStateChanged
        if (jComboBox6.getSelectedItem() != null) {
            jTextPane1.setText("");

            Desarrollador de = new Desarrollador();
            for (Desarrollador d : desarrolladores) {
                if (d.getCodigo() == Integer.parseInt(jComboBox6.getSelectedItem().toString())) {
                    de = d;
                }
            }
            String textFieldxd = "Nombre: " + de.getNombre() + "\n"
                    + "Codigo: " + de.getCodigo() + "\n"
                    + "Lenguajes : " + de.getLenguajestoString() + "\n"
                    + "Tecnologias: " + de.getTecnologiastoString();

            jTextPane1.setText(textFieldxd);
        }

    }//GEN-LAST:event_jComboBox6ItemStateChanged

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try ( Session session = driver.session()) {
            ArrayList<Integer> codigo = new ArrayList();

            Result result = session.run("Match (d:Proyecto) return count(d)");

            result.list().forEach(r -> codigo.add(r.get(0).asInt()));

            result = session.run("CREATE (p:Proyecto{nombre:$nombre, codigo:$codigo,  fecha_inicio:$fecha_inicio, fecha_final:$fecha_final})",
                    parameters("nombre", jTextField9.getText(), "codigo", codigo.get(0) + 1,
                            "fecha_inicio", jTextField10.getText(), "fecha_final", jTextField11.getText()));

            for (Desarrollador d : devsSeleccionados) {
                result = session.run("MATCH (p1:Proyecto{codigo:$codigo}),(d1:Dev{codigo:$codigo1})"
                        + "CREATE (p1)-[:POSEE]->(d1)",
                        parameters("codigo", codigo.get(0) + 1, "codigo1", d.getCodigo()));
                System.out.println(result.consume().counters().relationshipsCreated());
            }

            JOptionPane.showMessageDialog(crudProyecto, "Se inserto correctamente");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (jTabbedPane1.getSelectedIndex() == 1) {
            DefaultTableModel model = (DefaultTableModel) jTable13.getModel();
            model.setRowCount(0);
            try ( Session session = driver.session()) {

                ArrayList<Integer> codigosProyecto = new ArrayList();
                Result result = session.run("match (p:Proyecto) return p.codigo order by p.codigo");
                result.list().forEach(r -> codigosProyecto.add(r.get(0).asInt()));

                for (int i = 0; i < codigosProyecto.size(); i++) {

                    int codigoActual = codigosProyecto.get(i);
                    ArrayList<String> nombresDevs = new ArrayList();
                    result = session.run("match (p:Proyecto{codigo:$codigo })-[:POSEE]->(d:Dev) return d.nombre", parameters("codigo", codigosProyecto.get(i)));
                    result.list().forEach(r -> nombresDevs.add(r.get(0).asString()));

                    ArrayList<Integer> bugs = new ArrayList();
                    result = session.run("match (p:Proyecto{codigo:$codigo})-[:TIENE_UN]->(b:Bug) return b.codigo", parameters("codigo", codigosProyecto.get(i)));
                    result.list().forEach(r -> bugs.add(r.get(0).asInt()));

                    ArrayList<Integer> bugsFinalizados = new ArrayList();
                    result = session.run("match (p:Proyecto{codigo:$codigo})-[:TIENE_UN]->(b:Bug) where not b.fechaFinalizado = \"\" return b.codigo", parameters("codigo", codigosProyecto.get(i)));
                    result.list().forEach(r -> bugsFinalizados.add(r.get(0).asInt()));

                    result = session.run("match (p:Proyecto{codigo:$codigo1}) return p.nombre, p.fecha_inicio, p.fecha_final", parameters("codigo1", codigosProyecto.get(i)));
                    result.list().forEach(r -> model.addRow(new Object[]{codigoActual, r.get(0).asString(), r.get(1).asString(), r.get(2).asString(), nombresDevs, bugs, bugsFinalizados}));

                }
            }
            jTable13.setModel(model);
        } else if (jTabbedPane1.getSelectedIndex() == 2) {

            DefaultTableModel model = (DefaultTableModel) jTable14.getModel();
            model.setRowCount(0);
            try ( Session session = driver.session()) {
                Result result = session.run("match (p:Proyecto) return  p.codigo, p.nombre order by p.codigo");
                result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString()}));
            }
            jTable14.setModel(model);

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jButton21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseEntered

    private void jTable14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable14MouseClicked
        int codigo = (Integer) (jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0));
        try ( Session session = driver.session()) {
            proyectos.clear();
            Result result = session.run("match (p:Proyecto{codigo:" + codigo + "}) return p.nombre, p.fecha_inicio, p.fecha_final ");
            result.list().forEach(r -> proyectos.add(new Proyecto(r.get(0).asString(), r.get(1).asString(), r.get(2).asString())));

            for (int i = 0; i < proyectos.size(); i++) {
                jTextField14.setText(proyectos.get(i).getNombre());
                jTextField15.setText(proyectos.get(i).getFecha_inicio());
                jTextField16.setText(proyectos.get(i).getFecha_final());
            }
        }
    }//GEN-LAST:event_jTable14MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try ( Session session = driver.session()) {

            Result result = session.run("match (p:Proyecto)-[:POSEE]->(d:Dev{codigo:$codigo1}) return  p.codigo, p.nombre, p.fecha_inicio, p.fecha_final order by p.codigo",
                    parameters("codigo1", Integer.parseInt((String) jComboBox2.getSelectedItem())));
            result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString(), r.get(2).asString(), r.get(3).asString()}));

        }
        jTable1.setModel(model);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        try ( Session session = driver.session()) {

            Result result = session.run("match (d:Dev{codigo:$codigo})-[:REPARA]->(b:Bug) return b.codigoproyecto, b.codigo",
                    parameters("codigo", Integer.parseInt((String) jComboBox2.getSelectedItem())));
            result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asInt()}));

            devcodeGlobal = Integer.parseInt(jComboBox2.getSelectedItem().toString());

        }
        jTable2.setModel(model);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int codigoBug = Integer.parseInt(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1).toString());
        jTextArea1.setText("");
        try ( Session session = driver.session()) {
            /*Result result = session.run("match (d:Dev{codigo:$codigo})-[:REPARA]->(b:Bug) return b.descripcion",
                                        parameters("codigo", codigoBug));
            result.list().forEach(r -> jTextArea1.setText(String.valueOf(r.get(0).asString())));*/
            Result result = session.run("match (b:Bug) where b.codigo=" + codigoBug + " return b.descripcion");
            result.list().forEach(r -> jTextArea1.setText(r.get(0).asString()));

        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (jTable3.getSelectedRow() >= 0) {
            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
            model.setRowCount(0);
            jTextArea2.setText("");
            try ( Session session = driver.session()) {

                Result result = session.run("match (p:Proyecto)-[:POSEE]-(d:Dev) where p.codigo=" + jTable3.getValueAt(jTable3.getSelectedRow(), 0)
                        + " return d.codigo,d.nombre order by d.codigo");
                result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString()}));
                jTable4.setModel(model);

                jComboBox3.removeAllItems();
                result = session.run("match (p:Proyecto)-[:TIENE_UN]-(b:Bug) where p.codigo=" + jTable3.getValueAt(jTable3.getSelectedRow(), 0)
                        + " AND b.estado<>'finalizado' return b.codigo order by b.codigo");
                result.list().forEach(r -> jComboBox3.addItem(String.valueOf(r.get(0).asInt())));

            }

        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        if (jTable3.getSelectedRow() >= 0 && jComboBox3.getSelectedIndex() >= 0 && jTable4.getSelectedRow() >= 0) {

            try ( Session session = driver.session()) {

                int codigodebug = Integer.parseInt(jComboBox3.getSelectedItem().toString());
                int codigodev = (int) jTable4.getValueAt(jTable4.getSelectedRow(), 0);

                //Validar que el bug no esté asignado a ningún dev
                Result result = session.run("MATCH (b:Bug) where b.codigo=" + codigodebug + " return b.estado");
                ArrayList<String> estado = new ArrayList();
                result.list().forEach(r -> estado.add(r.get(0).asString()));

                if (estado.get(0).equals("asignado")) {
                    JOptionPane.showMessageDialog(null, "Ese bug ya está asignado a un desarrollador");
                } else {
                    result = session.run("MATCH (d:Dev{codigo:$codigo}),(b:Bug{codigo:$codigo1})"
                            + "CREATE (d)-[:REPARA]->(b)",
                            parameters("codigo", codigodev, "codigo1", codigodebug));
                    System.out.println(result.consume().counters().relationshipsCreated());

                    //actualizar el estado del bug
                    result = session.run("MATCH (b:Bug) where b.codigo=" + codigodebug + " set b.estado='asignado'");
                    //System.out.println(result.consume().counters().systemUpdates());

                    JOptionPane.showMessageDialog(null, "Se asignó bug al desarrollador");
                    setearCorreoDestino();
                    jTable3.clearSelection();
                    jComboBox3.removeAllItems();
                    jTextArea2.setText("");
                    DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
                    model.setRowCount(0);
                    jTable4.setModel(model);
                }
                //fin validación
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error al asignar bug al desarrollador, debe seleccionar todos los elementos");
        }
        
    }//GEN-LAST:event_jButton19MouseClicked
    
    public void setearCorreoDestino(){
        try ( Session session = driver.session()) {
            Result result = session.run("match (u:Usuario)-[:INFO]-(d:Dev) where d.codigo="
                    +(int) jTable4.getValueAt(jTable4.getSelectedRow(), 0)+" return u.login");
            ArrayList<String> x = new ArrayList();
            result.list().forEach(r -> x.add(r.get(0).asString()));
            EnviarCorreo ec = new EnviarCorreo(x.get(0));
            
            ec.setVisible(true);
            
        }
    }
    
    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked

    }//GEN-LAST:event_jComboBox3MouseClicked

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        if (jComboBox3.getSelectedItem() != null) {
            jTextArea2.setText("");
            try ( Session session = driver.session()) {

                Result result = session.run("match (b:Bug) where b.codigo=" + jComboBox3.getSelectedItem() + " return b.descripcion");
                result.list().forEach(r -> jTextArea2.setText(r.get(0).asString()));

            }
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        try ( Session session = driver.session()) {
            Result result = session.run("match (d:Dev{codigo:$codigo})-[:REPARA]->(b:Bug{codigo:$codigo1}) set b.fechaInicio= $fechainicio return b.descripcion",
                    parameters("codigo", Integer.parseInt((String) jComboBox2.getSelectedItem()),
                            "codigo1", Integer.parseInt(jTable2.getModel().getValueAt(jTable2.getSelectedRow(), 1).toString()),
                            "fechainicio", jTextField1.getText()));

            jTextField1.setText("");
            JOptionPane.showMessageDialog(menuDevBugs, "Fecha de inicio modificada");
            jTable2.clearSelection();
            jTextArea1.setText("");
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        int coidgo = (Integer) jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0);
        try ( Session session = driver.session()) {
            Result result = session.run("match (p:Proyecto{codigo:" + coidgo + "}) set p.nombre=\"" + jTextField14.getText() + "\", p.fecha_inicio=\"" + jTextField15.getText() + "\", p.fecha_final=\"" + jTextField16.getText() + "\" return p");
            jTextField14.setText("");
            jTextField15.setText("");
            jTextField16.setText("");
            jTable14.clearSelection();
            JOptionPane.showMessageDialog(crudProyecto, "Proyecto Modificado");
        }

        DefaultTableModel model = (DefaultTableModel) jTable14.getModel();
        model.setRowCount(0);
        try ( Session session = driver.session()) {
            Result result = session.run("match (p:Proyecto) return  p.codigo, p.nombre order by p.codigo");
            result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString()}));
        }
        jTable14.setModel(model);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        //3 Queries
        //1) Romper la relación
        //2) Setear la fecha de finalizado como la fecha de hoy
        //3) Setear estado del bug a 'finalizado'

        if (jTable2.getSelectedRow() >= 0) {
            try ( Session session = driver.session()) {
                int codigoBug = Integer.parseInt(jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString());

                //Verificar que el bug tenga fecha de inicio si quiere ser finalizado
                ArrayList<String> fechainicio = new ArrayList();
                Result result = session.run("match (b:Bug) where b.codigo=" + codigoBug + " return b.fechaInicio");
                result.list().forEach(r -> fechainicio.add(r.get(0).asString()));
                if (fechainicio.get(0).equals("")) {
                    JOptionPane.showMessageDialog(null, "Ese bug aun no tiene fecha de inicio");
                } else {

                    //Romper la relación
                    result = session.run("match (d:Dev {codigo:" + devcodeGlobal + "})-[r:REPARA]-(b:Bug {codigo:" + codigoBug + "}) delete r");

                    //Setear estado a finalizado
                    result = session.run("match (b:Bug {codigo:" + codigoBug + "}) set b.estado='finalizado'");

                    //Setear fecha
                    Date myDate = new Date();
                    String t = new SimpleDateFormat("dd-MM-yyyy").format(myDate);
                    result = session.run("match (b:Bug {codigo:" + codigoBug + "}) set b.fechaFinalizado='" + t + "'");

                    jTextField1.setText("");
                    JOptionPane.showMessageDialog(menuDevBugs, "Fecha de finalización establecida. Bug reparado");
                    DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
                    modelo.removeRow(jTable2.getSelectedRow());
                    jTable2.setModel(modelo);

                    jTable2.clearSelection();
                    jTextArea1.setText("");
                }

            }
        }

    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        eliminarDevProjecto.pack();
        eliminarDevProjecto.setLocationRelativeTo(this);
        eliminarDevProjecto.setVisible(true);
        crudProyecto.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) jTable12.getModel();
        model.setRowCount(0);

        try ( Session session = driver.session()) {
            Result result = session.run("match (p:Proyecto{codigo:" + Integer.parseInt(jTable14.getValueAt(jTable14.getSelectedRow(), 0).toString()) + "})-[:POSEE]->(d:Dev) where not (d)-[:REPARA]->(:Bug{codigoproyecto:" + (Integer) (jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0)) + "}) return d.codigo, d.nombre, d.lenguajes, d.tecnologias order by d.codigo");

            result.list().forEach(r -> model.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString(), r.get(2).asString(), r.get(3).asString()}));

        }


    }//GEN-LAST:event_jButton17ActionPerformed

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
        devss.clear();
        if (jComboBox7.getSelectedItem() != null) {
            try ( Session session = driver.session()) {
                Result result = session.run("match (d:Dev{codigo:" + Integer.parseInt((String) jComboBox7.getSelectedItem()) + "}) return d.codigo, d.nombre, d.lenguajes, d.tecnologias");
                result.list().forEach(r -> devss.add(new Desarrollador(r.get(0).asInt(), r.get(1).asString(), r.get(2).asString(), r.get(3).asString())));
            }

            for (Desarrollador d : devss) {
                if (d.getCodigo() == Integer.parseInt((String) jComboBox7.getSelectedItem())) {
                    jTextPane2.setText("Codigo: " + d.getCodigo() + "\n"
                            + "Nombre: " + d.getNombre() + "\n"
                            + "Tecnologias: " + d.getTecnologiastoString() + "\n"
                            + "Lenguajes: " + d.getLenguajestoString());
                }
            }
        }

    }//GEN-LAST:event_jComboBox7ItemStateChanged

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try ( Session session = driver.session()) {

            Result result = session.run("MATCH (p1:Proyecto{codigo:" + (Integer) (jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0)) + "}),(d1:Dev{codigo:" + Integer.parseInt((String) jComboBox7.getSelectedItem()) + "})"
                    + "CREATE (p1)-[:POSEE]->(d1)");
            System.out.println(result.consume().counters().relationshipsCreated());

            jComboBox7.removeItemAt(jComboBox7.getSelectedIndex());

            jTextPane2.setText("");
            JOptionPane.showMessageDialog(aniadirDevs, "Se añadio el dev al proyecto");
        }


    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        aniadirDevs.pack();
        aniadirDevs.setLocationRelativeTo(this);
        aniadirDevs.setVisible(true);
        crudProyecto.setVisible(false);
        jComboBox7.removeAll();
        jComboBox7.removeAllItems();
        try ( Session session = driver.session()) {
            int codigo = (Integer) (jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0));
            Result result = session.run("MATCH (d:Dev)" + "WHERE NONE(n in [" + codigo + "] WHERE (d)<-[:POSEE]-(:Proyecto {codigo:n})) return d.codigo, d.nombre, d.lenguajes, d.tecnologias");
            result.list().forEach(r -> jComboBox7.addItem(String.valueOf(r.get(0).asInt())));

        }


    }//GEN-LAST:event_jButton12ActionPerformed

    private void jComboBox7ComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jComboBox7ComponentMoved

    }//GEN-LAST:event_jComboBox7ComponentMoved

    private void jComboBox7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox7MouseClicked
        if (jComboBox7.getItemCount() == 1) {
            devss.clear();
            if (jComboBox7.getSelectedItem() != null) {
                try ( Session session = driver.session()) {
                    Result result = session.run("match (d:Dev{codigo:" + Integer.parseInt((String) jComboBox7.getSelectedItem()) + "}) return d.codigo, d.nombre, d.lenguajes, d.tecnologias");
                    result.list().forEach(r -> devss.add(new Desarrollador(r.get(0).asInt(), r.get(1).asString(), r.get(2).asString(), r.get(3).asString())));
                }

                for (Desarrollador d : devss) {
                    if (d.getCodigo() == Integer.parseInt((String) jComboBox7.getSelectedItem())) {
                        jTextPane2.setText("Codigo: " + d.getCodigo() + "\n"
                                + "Nombre: " + d.getNombre() + "\n"
                                + "Tecnologias: " + d.getTecnologiastoString() + "\n"
                                + "Lenguajes: " + d.getLenguajestoString());
                    }
                }
            }
        }
    }//GEN-LAST:event_jComboBox7MouseClicked

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if (jTable12.getSelectedRow() != -1) {
            try ( Session session = driver.session()) {
                Result result = session.run("match (p:Proyecto{codigo:" + (Integer) (jTable14.getModel().getValueAt(jTable14.getSelectedRow(), 0))
                        + "})-[r:POSEE]->(d:Dev{codigo:" + (Integer) jTable12.getModel().getValueAt(jTable12.getSelectedRow(), 0) + ""
                        + ""
                        + "}) delete r");

                ((DefaultTableModel) jTable12.getModel()).removeRow(jTable12.getSelectedRow());
                JOptionPane.showMessageDialog(eliminarDevProjecto, "El desarrollador seleccionado ya no esta relacionado con el projecto");

            }
        } else {
            JOptionPane.showMessageDialog(eliminarDevProjecto, "Tiene que seleccionar un dev para borrar la relacion");
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31MouseClicked

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        creacionUsuarios.pack();
        creacionUsuarios.setLocationRelativeTo(this);
        creacionUsuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35MouseClicked

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        if (jTable5.getSelectedRow() != -1) {
            comentariosBug.pack();
            comentariosBug.setLocationRelativeTo(this);
            comentariosBug.setVisible(true);
            QAtodosLosBugs.setVisible(false);
            jTextField12.setEnabled(false);
            jButton36.setEnabled(false);
        }
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        if (jTable2.getSelectedRow() != 1) {
            comentariosBug.pack();
            comentariosBug.setLocationRelativeTo(this);
            comentariosBug.setVisible(true);
            menuDevBugs.setVisible(false);
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(crudProyecto);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(crudDev);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        calendario.pack();
        calendario.setLocationRelativeTo(this);
        calendario.setVisible(true);
        menuDev.setVisible(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        menuDev.pack();
        menuDev.setLocationRelativeTo(this);
        menuDev.setVisible(true);
        calendario.setVisible(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            cargarDevs();
            try ( Session session = driver.session()) {

                md.update(jPasswordField1.getText().getBytes());
                byte[] digest = md.digest();
                StringBuffer sb = new StringBuffer();
                for (byte b : digest) {
                    sb.append(String.format("%02x", b & 0xff));
                }

                Result result = session.run("CREATE (u:Usuario{login:$login, password:$password,  rol:$rol})",
                        parameters("login", jTextField2.getText(), "password", sb.toString(), "rol", jComboBox8.getItemAt(jComboBox8.getSelectedIndex())));
                if (jComboBox8.getItemAt(jComboBox8.getSelectedIndex()).equals("Desarrollador")) {
                    creacionDev.pack();
                    creacionDev.setLocationRelativeTo(this);
                    creacionDev.setVisible(true);
                    creacionDev.setModal(true);

                } else {
                    JOptionPane.showMessageDialog(creacionUsuarios, "Se creo que el usuario perfectamente");
                    jTextField2.setText("");
                    jPasswordField1.setText("");
                }

            }
        } catch (NoSuchAlgorithmException ex) {

        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        //Proceso de obtener la contraseña de la db
        ArrayList<Usuario> users = new ArrayList();
        try ( Session session = driver.session()) {
            //Encryptar la contraseña dada
            Result result = session.run("match (u:Usuario) return u.login, u.password, u.rol");
            result.list().forEach(r -> users.add(new Usuario(r.get(0).asString(), r.get(1).asString(), r.get(2).asString())));

            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(jPasswordField2.getText().getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }

            boolean login = false;

            //Encontrar al usuario
            for (Usuario u : users) {
                if (u.getLogin().equals(jTextField13.getText()) && u.getPass().equals(sb.toString())
                        && u.getRol().equals(jComboBox9.getItemAt(jComboBox9.getSelectedIndex()))) {
                    jTextField13.setText("");
                    jPasswordField2.setText("");

                    JOptionPane.showMessageDialog(this, "Login Correctamente!");
                    login = true;
                    //Abrir el rol indicado 
                    if (jComboBox9.getItemAt(jComboBox9.getSelectedIndex()).equals("Administrador")) {
                        jLabel50.setText(u.getLogin());
                        menuAdmin.pack();
                        menuAdmin.setLocationRelativeTo(this);
                        menuAdmin.setVisible(true);
                        this.setVisible(false);
                    } else if (jComboBox9.getItemAt(jComboBox9.getSelectedIndex()).equals("Desarrollador")) {
                        jLabel49.setText(u.getLogin());
                        menuDev.pack();
                        menuDev.setLocationRelativeTo(this);
                        menuDev.setVisible(true);
                        this.setVisible(false);
                    } else if (jComboBox9.getItemAt(jComboBox9.getSelectedIndex()).equals("QA")) {

                        jLabel51.setText(u.getLogin());
                        cargarTablaProyectosQA();
                        menuQA.pack();
                        menuQA.setLocationRelativeTo(this);
                        menuQA.setVisible(true);
                        this.setVisible(false);
                    }

                }
            }

            if (login == false) {
                JOptionPane.showMessageDialog(this, "Login fallido");
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton37ActionPerformed

    private void cargarTablaProyectosQA() {
        //Llenar tabla de proyecto que aparece en el menu QA, que tiene código de proyecto y nombre de proyecto
        try ( Session session = driver.session()) {
            String[] titulos = {"Código Proyecto", "Nombre Proyecto"};
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);

            Result result = session.run("Match (p:Proyecto) return p.codigo, p.nombre order by p.codigo");
            result.list().forEach(r -> modelo.addRow(new Object[]{r.get(0).asInt(), r.get(1).asString()}));

            jTable15.setModel(modelo);

        }
    }

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        //Cerrar sesion de QA
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        menuQA.setVisible(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Cerrar sesion de Admin
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        menuAdmin.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Cerrar sesion de Dev
        this.pack();
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        menuDev.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseClicked
        ArrayList<Bug> bugs = new ArrayList();

        //r.get(0).asInt(), r.get(1).asString()
        try ( Session session = driver.session()) {
            Result result = session.run("match (u:Usuario)-[:REPORTA]-(b:Bug) "
                    + "where u.login='" + jLabel51.getText() + "' "
                    + "return b.codigo, b.codigoproyecto, b.descripcion, b.estado, "
                    + "b.fechaInicio, b.fechaFinalizado, b.nivelUrgencia");
            result.list().forEach(r -> bugs.add(new Bug(r.get(0).asInt(), r.get(2).asString(), r.get(1).asInt(),
                    r.get(6).asInt(), r.get(3).asString(), r.get(4).asString(), r.get(5).asString())));

        }

        File file = new File("ReporteBugs(" + jLabel51.getText() + ").pdf");
        try ( PdfWriter pdfWriter = new PdfWriter(file)) {
            PdfDocument pdfDocument = new PdfDocument(pdfWriter);
            Document document = new Document(pdfDocument);

            document.add(new Paragraph("BUGS REPORTADOS POR EL QA: " + jLabel51.getText()));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));

            float columnWidth1[] = {130f, 130f, 200f, 100f, 150f, 150f, 130f};
            Table table = new Table(columnWidth1);

            table.addCell(new Cell().add(new Paragraph("Código de Bug")));
            table.addCell(new Cell().add(new Paragraph("Código de Proyecto")));
            table.addCell(new Cell().add(new Paragraph("Descripción")));
            table.addCell(new Cell().add(new Paragraph("Estado")));
            table.addCell(new Cell().add(new Paragraph("Fecha de Inicio")));
            table.addCell(new Cell().add(new Paragraph("Fecha de Finalización")));
            table.addCell(new Cell().add(new Paragraph("Nivel de Urgencia")));

            for (int i = 0; i < bugs.size(); i++) {
                table.addCell(new Cell().add(new Paragraph(String.valueOf(bugs.get(i).getCodigo()))));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(bugs.get(i).getCodigoProyecto()))));
                table.addCell(new Cell().add(new Paragraph(bugs.get(i).getDescripcion())));
                table.addCell(new Cell().add(new Paragraph(bugs.get(i).getEstado())));
                table.addCell(new Cell().add(new Paragraph(bugs.get(i).getFechaInicio())));
                table.addCell(new Cell().add(new Paragraph(bugs.get(i).getFechaFinalizado())));
                table.addCell(new Cell().add(new Paragraph(String.valueOf(bugs.get(i).getNivelUrgencia()))));
            }

            document.add(table);

            document.close();
            pdfDocument.close();
            JOptionPane.showMessageDialog(null, "Se generó el reporte de bugs del QA");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton33MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        menuQA.setVisible(false);

        bugStatsQA.pack();
        bugStatsQA.setLocationRelativeTo(this);
        bugStatsQA.setResizable(false);
        bugStatsQA.setVisible(true);

        jComboBox10.removeAllItems();
        jPanel8.removeAll();
        jPanel8.revalidate();
        Panel p = new Panel();
        p.setPreferredSize(new Dimension(508, 343));
        jPanel8.add(p);

        try ( Session session = driver.session()) {
            Result result = session.run("match (p:Proyecto) return p.codigo order by p.codigo");
            result.list().forEach(r -> jComboBox10.addItem(String.valueOf(r.get(0).asInt())));
            jComboBox10.setSelectedIndex(-1);
            jTextField17.setText("");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseClicked

        menuQA.pack();
        menuQA.setLocationRelativeTo(this);
        menuQA.setVisible(true);
        bugStatsQA.setVisible(false);
    }//GEN-LAST:event_jButton29MouseClicked

    private void jComboBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox10ItemStateChanged
        if (jComboBox10.getSelectedIndex() >= 0) {

            try ( Session session = driver.session()) {
                Result result = session.run("match (p:Proyecto) where p.codigo=" + jComboBox10.getSelectedItem() + " return p.nombre");
                result.list().forEach(r -> jTextField17.setText(r.get(0).asString()));
            }
        }
    }//GEN-LAST:event_jComboBox10ItemStateChanged

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if (jComboBox10.getSelectedIndex() >= 0 && !jTextField17.getText().equals("")) {
            DefaultPieDataset datos = new DefaultPieDataset();

            try ( Session session = driver.session()) {

                jPanel8.removeAll();
                jPanel8.revalidate();

                ArrayList<Integer> cantidad = new ArrayList();
                //Bugs en desarollo
                Result result = session.run("match (p:Proyecto)-[:TIENE_UN]-(b:Bug) where p.codigo=" + jComboBox10.getSelectedItem()
                        + " AND b.estado='en desarrollo' return count(b)");
                result.list().forEach(r -> cantidad.add(r.get(0).asInt()));

                //Bugs finalizados
                result = session.run("match (p:Proyecto)-[:TIENE_UN]-(b:Bug) where p.codigo=" + jComboBox10.getSelectedItem()
                        + " AND b.estado='finalizado' return count(b)");
                result.list().forEach(r -> cantidad.add(r.get(0).asInt()));

                datos.setValue("Bugs en Desarrollo", cantidad.get(0));
                datos.setValue("Bugs Finalizados", cantidad.get(1));

                JFreeChart grafico_circular = ChartFactory.createPieChart(
                        "Estado Actual de los Bugs",
                        datos,
                        true,
                        true,
                        false
                );

                ChartPanel panel = new ChartPanel(grafico_circular);
                panel.setMouseWheelEnabled(true);
                panel.setPreferredSize(new Dimension(508, 343));

                jPanel8.setLayout(new BorderLayout());
                jPanel8.add(panel, BorderLayout.NORTH);

                pack();
                repaint();
            }
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jButton40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton40MouseClicked

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41MouseClicked

    private void jButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42MouseClicked

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        JOptionPane.showMessageDialog(this, devs.size());
        String lenguajes = new String();
        String tecnologias = new String();

        //recorrer lenguajes de la tabla
        for (int i = 0; i < jTable16.getRowCount(); i++) {
            lenguajes += ((String) jTable16.getValueAt(i, 0)) + ";";
        }

        //recorrer tecnologias
        for (int i = 0; i < jTable17.getRowCount(); i++) {
            tecnologias += ((String) jTable17.getValueAt(i, 0)) + ";";
        }

        try ( Session session = driver.session()) {

            ArrayList<Integer> codigo = new ArrayList();

            Result result = session.run("Match (d:Dev) return count(d)");

            result.list().forEach(r -> codigo.add(r.get(0).asInt()));

            System.out.println("Codigo: " + codigo.size());

            result = session.run("CREATE (d:Dev{ nombre:$nombre,codigo:$codigo, lenguajes:$lenguajes, tecnologias:$tecnologias})",
                    parameters("nombre", jTextField18.getText(), "codigo", codigo.get(0) + 1, "lenguajes", lenguajes,
                            "tecnologias", tecnologias));

            desarrolladores.add(new Desarrollador(codigo.get(0) + 1, jTextField18.getText(), lenguajes, tecnologias));

            jTextField18.setText("");
            String[] l = {"Lenguajes de programación"};
            DefaultTableModel modelo = new DefaultTableModel(null, l);
            jTable16.setModel(modelo);

            String[] t = {"Tecnologías"};
            DefaultTableModel modelo2 = new DefaultTableModel(null, t);
            jTable17.setModel(modelo2);

           
        }
        try ( Session session = driver.session()) {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            md.update(jPasswordField1.getText().getBytes());
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }

            ArrayList<Integer> codigo = new ArrayList();

            Result result = session.run("Match (d:Dev) return count(d)");

            result.list().forEach(r -> codigo.add(r.get(0).asInt()));

            
            
             result = session.run("MATCH (u:Usuario{login:'" + jTextField2.getText() + "',password:'" + sb.toString() + "',rol:'" + jComboBox8.getItemAt(jComboBox8.getSelectedIndex()) + "'}),(d1:Dev{codigo:" + (codigo.get(0)) + "})"
                    + "CREATE (u)-[:INFO]->(d1)");
             JOptionPane.showMessageDialog(null, "Se guardó el desarrollador");
            creacionDev.setVisible(false);
            JOptionPane.showMessageDialog(creacionUsuarios, "Se creo que el usuario perfectamente");
            jTextField2.setText("");
            jPasswordField1.setText("");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable16.getModel();
        String[] lenguaje = {jTextField19.getText()};
        modelo.addRow(lenguaje);
        jTable16.setModel(modelo);
        jTextField19.setText("");
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable17.getModel();
        String[] tecnologia = {jTextField20.getText()};
        modelo.addRow(tecnologia);
        jTable17.setModel(modelo);
        jTextField20.setText("");
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseClicked
        /*Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");
        
        Session sesion = Session.getDefaultInstance(propiedad);
        
        String correoEnvia="";
        String contra="";
        String destinatario = jTextField22.getText();
        String asunto = jTextField21.getText();
        String mensaje = jTextArea4.getText();
        
        MimeMessage mail = new MimeMessage(sesion);
        
        try {
            mail.setFrom(new InternetAddress (correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(mensaje);
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia,contra);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
            JOptionPane.showMessageDialog(null, "Correo enviado");
            
        } catch (MessagingException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
    }//GEN-LAST:event_jButton44MouseClicked

    ArrayList<Desarrollador> devsSeleccionados = new ArrayList();

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
    ArrayList<Desarrollador> devss = new ArrayList();
    ArrayList<Proyecto> proyectos = new ArrayList();
    ArrayList<Desarrollador> devs = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog QAtodosLosBugs;
    private javax.swing.JDialog aniadirDevs;
    private javax.swing.JDialog assignBugToDev;
    private javax.swing.JDialog bugStatsQA;
    private javax.swing.JDialog calendario;
    private javax.swing.JDialog comentariosBug;
    private javax.swing.JDialog creacionDev;
    private javax.swing.JDialog creacionUsuarios;
    private javax.swing.JDialog crudDev;
    private javax.swing.JDialog crudProyecto;
    private javax.swing.JDialog eliminarDevProjecto;
    private javax.swing.JDialog estadisticasBugs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable12;
    private javax.swing.JTable jTable13;
    private javax.swing.JTable jTable14;
    private javax.swing.JTable jTable15;
    private javax.swing.JTable jTable16;
    private javax.swing.JTable jTable17;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JDialog mandarCorreo;
    private javax.swing.JDialog menuAdmin;
    private javax.swing.JDialog menuDev;
    private javax.swing.JDialog menuDevBugs;
    private javax.swing.JDialog menuDevProyectos;
    private javax.swing.JDialog menuQA;
    // End of variables declaration//GEN-END:variables
}
