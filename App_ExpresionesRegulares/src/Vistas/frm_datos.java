package Vistas;

import Controladores.cls_datos;
import java.awt.Color;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Mario Tamayo Tamayo
 */
public class frm_datos extends javax.swing.JFrame {
    LinkedList<cls_datos> List_datosLst = new LinkedList<>();
    boolean var_swBln;
    boolean var_swMsgconsulta;
    int var_posInt;
    public frm_datos() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_consultar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_primer_nombre = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_segundo_nombre = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_primer_apellido = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_segundo_apellido = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_contacto = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txt_ciudad_origen = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_perfil = new javax.swing.JTextArea();
        txt_profesion = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_tecnologias = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 69, 113));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario: Hoja de vida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(132, 145, 179));

        btn_registrar.setBackground(new java.awt.Color(203, 215, 178));
        btn_registrar.setText("Registrar");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_nuevo.setBackground(new java.awt.Color(203, 215, 178));
        btn_nuevo.setText("Nuevo");
        btn_nuevo.setFocusable(false);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_consultar.setBackground(new java.awt.Color(203, 215, 178));
        btn_consultar.setText("Consultar");
        btn_consultar.setFocusable(false);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });

        btn_actualizar.setBackground(new java.awt.Color(203, 215, 178));
        btn_actualizar.setText("Actualizar");
        btn_actualizar.setFocusable(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(btn_nuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_consultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_actualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_nuevo)
                    .addComponent(btn_consultar)
                    .addComponent(btn_actualizar))
                .addContainerGap())
        );

        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(15, 69, 113), 5, true));

        jPanel3.setBackground(new java.awt.Color(15, 69, 113));
        jPanel3.setAlignmentY(0.0F);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Identificación *");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        txt_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_identificacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_identificacion.setAlignmentY(0.0F);
        txt_identificacion.setNextFocusableComponent(txt_primer_nombre);

        jPanel4.setBackground(new java.awt.Color(15, 69, 113));
        jPanel4.setAlignmentY(0.0F);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Primer Nombre *");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        txt_primer_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_primer_nombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_primer_nombre.setAlignmentY(0.0F);
        txt_primer_nombre.setNextFocusableComponent(txt_segundo_nombre);
        txt_primer_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primer_nombreKeyTyped(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(15, 69, 113));
        jPanel5.setAlignmentY(0.0F);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Segundo Nombre");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        txt_segundo_nombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_segundo_nombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_segundo_nombre.setAlignmentY(0.0F);
        txt_segundo_nombre.setNextFocusableComponent(txt_primer_apellido);
        txt_segundo_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundo_nombreKeyTyped(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(15, 69, 113));
        jPanel6.setAlignmentY(0.0F);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer Apellido *");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        txt_primer_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_primer_apellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_primer_apellido.setAlignmentY(0.0F);
        txt_primer_apellido.setNextFocusableComponent(txt_segundo_apellido);
        txt_primer_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_primer_apellidoKeyTyped(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(15, 69, 113));
        jPanel7.setAlignmentY(0.0F);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segundo Apellido");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        txt_segundo_apellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_segundo_apellido.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_segundo_apellido.setAlignmentY(0.0F);
        txt_segundo_apellido.setNextFocusableComponent(txt_edad);
        txt_segundo_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_segundo_apellidoKeyTyped(evt);
            }
        });

        txt_edad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_edad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_edad.setAlignmentY(0.0F);
        txt_edad.setNextFocusableComponent(txt_correo);

        jPanel10.setBackground(new java.awt.Color(15, 69, 113));
        jPanel10.setAlignmentY(0.0F);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edad *");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );

        jPanel11.setBackground(new java.awt.Color(15, 69, 113));
        jPanel11.setAlignmentY(0.0F);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo electrónico *");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9)
        );

        txt_correo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_correo.setAlignmentY(0.0F);
        txt_correo.setNextFocusableComponent(txt_contacto);
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });

        txt_contacto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_contacto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_contacto.setAlignmentY(0.0F);
        txt_contacto.setNextFocusableComponent(txt_fecha);

        jPanel12.setBackground(new java.awt.Color(15, 69, 113));
        jPanel12.setAlignmentY(0.0F);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contacto *");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10)
        );

        jPanel13.setBackground(new java.awt.Color(15, 69, 113));
        jPanel13.setAlignmentY(0.0F);

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Fecha de nacimiento dd/mm/aa *");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11)
        );

        txt_fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_fecha.setAlignmentY(0.0F);
        txt_fecha.setNextFocusableComponent(txt_ciudad_origen);

        jPanel14.setBackground(new java.awt.Color(15, 69, 113));
        jPanel14.setAlignmentY(0.0F);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ciudad de origen *");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12)
        );

        txt_ciudad_origen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_ciudad_origen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_ciudad_origen.setAlignmentY(0.0F);
        txt_ciudad_origen.setNextFocusableComponent(txt_profesion);
        txt_ciudad_origen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ciudad_origenKeyTyped(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(15, 69, 113));
        jPanel15.setAlignmentY(0.0F);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Perfil profesional *");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );

        txt_perfil.setColumns(20);
        txt_perfil.setLineWrap(true);
        txt_perfil.setRows(5);
        txt_perfil.setNextFocusableComponent(txt_profesion);
        txt_perfil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_perfilKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt_perfil);

        txt_profesion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_profesion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_profesion.setAlignmentY(0.0F);
        txt_profesion.setNextFocusableComponent(txt_identificacion);
        txt_profesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_profesionKeyTyped(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(15, 69, 113));
        jPanel16.setAlignmentY(0.0F);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Profesión *");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
        );

        jPanel17.setBackground(new java.awt.Color(15, 69, 113));
        jPanel17.setAlignmentY(0.0F);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tecnologías que domina *");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
        );

        txt_tecnologias.setColumns(20);
        txt_tecnologias.setLineWrap(true);
        txt_tecnologias.setRows(5);
        txt_tecnologias.setNextFocusableComponent(txt_identificacion);
        txt_tecnologias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tecnologiasKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txt_tecnologias);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_identificacion)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_primer_nombre)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_segundo_nombre)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edad)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_correo)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_contacto)
                            .addComponent(txt_fecha)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_ciudad_origen)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                            .addComponent(txt_profesion)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_ciudad_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txt_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txt_primer_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_segundo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        func_limpiar();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        var_swMsgconsulta=true;
        fnt_consultar(txt_identificacion.getText());
     
        
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
     
         if(func_validarcampos(txt_identificacion.getText(),
                txt_primer_nombre.getText(),
            txt_primer_apellido.getText(),
            txt_edad.getText(),
            txt_correo.getText(),
            txt_contacto.getText(),
            txt_fecha.getText(),
            txt_ciudad_origen.getText(),
            txt_perfil.getText(),
            txt_profesion.getText(),
            txt_tecnologias.getText()))
        {
         
        fnt_guardar(txt_identificacion.getText(),txt_primer_nombre.getText(),
            txt_segundo_nombre.getText(),
            txt_primer_apellido.getText(),
            txt_segundo_apellido.getText(),
            txt_edad.getText(),
            txt_correo.getText(),
            txt_contacto.getText(),
            txt_fecha.getText(),
            txt_ciudad_origen.getText(),
            txt_perfil.getText(),
            txt_profesion.getText(),
            txt_tecnologias.getText());
        }
         else
        {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar los campos obligatorios.");
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if(func_validarcampos(txt_identificacion.getText(),
                txt_primer_nombre.getText(),
            txt_primer_apellido.getText(),
            txt_edad.getText(),
            txt_correo.getText(),
            txt_contacto.getText(),
            txt_fecha.getText(),
            txt_ciudad_origen.getText(),
            txt_perfil.getText(),
            txt_profesion.getText(),
            txt_tecnologias.getText()))
        {
            fnt_actualizar(
            txt_primer_nombre.getText(),
            txt_segundo_nombre.getText(),
            txt_primer_apellido.getText(),
            txt_segundo_apellido.getText(),
            txt_edad.getText(),
            txt_correo.getText(),
            txt_contacto.getText(),
            txt_fecha.getText(),
            txt_ciudad_origen.getText(),
            txt_perfil.getText(),
            txt_profesion.getText(),
            txt_tecnologias.getText());
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Asegurese de llenar los campos obligatorios.");
        }
       
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void txt_primer_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primer_nombreKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_primer_nombreKeyTyped

    private void txt_segundo_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundo_nombreKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_segundo_nombreKeyTyped

    private void txt_primer_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_primer_apellidoKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_primer_apellidoKeyTyped

    private void txt_segundo_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_segundo_apellidoKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_segundo_apellidoKeyTyped

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_correoKeyTyped

    private void txt_ciudad_origenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ciudad_origenKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_ciudad_origenKeyTyped

    private void txt_perfilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_perfilKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_perfilKeyTyped

    private void txt_profesionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_profesionKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_profesionKeyTyped

    private void txt_tecnologiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tecnologiasKeyTyped
        char caracter = evt.getKeyChar();
        if(Character.isLowerCase(caracter)){
        evt.setKeyChar(Character.toUpperCase(caracter));}
    }//GEN-LAST:event_txt_tecnologiasKeyTyped
    
    
    
    
    
    
    private boolean func_validarcampos( 
        String var_identificacionStr,
        String var_pnombreStr,
        String var_papellidoStr,
        String var_edadStr,
        String var_correoelectronicoStr,
        String var_contacotStr,
        String var_fechanacimientoStr,
        String var_ciudadorigenStr,
        String var_perfilprofesionalStr,
        String var_profesionStr,
        String var_tecnologiasStr)
    {
        boolean resultado;
        resultado = fnt_id(var_identificacionStr)&&
                fnt_pnombre(var_pnombreStr)&&
                fnt_papellido(var_papellidoStr)&&
                fnt_correoelectronico(var_correoelectronicoStr)&&
                fnt_contacto(var_contacotStr)&&
                fnt_fechanacimiento(var_fechanacimientoStr)&&
                fnt_ciudadorigen(var_ciudadorigenStr)&&
                fnt_perfilprofesional(var_perfilprofesionalStr)&&
                fnt_profesion(var_profesionStr)&&
                fnt_tecnologias(var_tecnologiasStr)&&
                fnt_edad(var_edadStr);
        
        if(fnt_id(var_identificacionStr))
        {
            txt_identificacion.setBackground(Color.WHITE); 
            txt_identificacion.setForeground(Color.BLACK);
        }
        else
        {
            txt_identificacion.setBackground(Color.RED); 
            txt_identificacion.setForeground(Color.WHITE);
        }
        if(fnt_pnombre(var_pnombreStr))
        {
            txt_primer_nombre.setBackground(Color.WHITE); 
            txt_primer_nombre.setForeground(Color.BLACK);
        }
        else
        {
            txt_primer_nombre.setBackground(Color.RED); 
            txt_primer_nombre.setForeground(Color.WHITE);
        }
        if(fnt_papellido(var_papellidoStr))
        {
            txt_primer_apellido.setBackground(Color.WHITE); 
            txt_primer_apellido.setForeground(Color.BLACK);
        }
        else
        {
            txt_primer_apellido.setBackground(Color.RED); 
            txt_primer_apellido.setForeground(Color.WHITE);
        }
        if(fnt_correoelectronico(var_correoelectronicoStr))
        {
            txt_correo.setBackground(Color.WHITE); 
            txt_correo.setForeground(Color.BLACK);
        }
        else
        {
            txt_correo.setBackground(Color.RED); 
            txt_correo.setForeground(Color.WHITE);
        }
        if(fnt_contacto(var_contacotStr))
        {
            txt_contacto.setBackground(Color.WHITE); 
            txt_contacto.setForeground(Color.BLACK);
        }
        else
        {
            txt_contacto.setBackground(Color.RED); 
            txt_contacto.setForeground(Color.WHITE);
        }
        if(fnt_fechanacimiento(var_fechanacimientoStr))
        {
            txt_fecha.setBackground(Color.WHITE); 
            txt_fecha.setForeground(Color.BLACK);
        }
        else
        {
            txt_fecha.setBackground(Color.RED); 
            txt_fecha.setForeground(Color.WHITE);
        }
        if(fnt_ciudadorigen(var_ciudadorigenStr))
        {
            txt_ciudad_origen.setBackground(Color.WHITE); 
            txt_ciudad_origen.setForeground(Color.BLACK);
        }
        else
        {
            txt_ciudad_origen.setBackground(Color.RED); 
            txt_ciudad_origen.setForeground(Color.WHITE);
        }
        if(fnt_perfilprofesional(var_perfilprofesionalStr))
        {
            txt_perfil.setBackground(Color.WHITE); 
            txt_perfil.setForeground(Color.BLACK);
        }
        else
        {
            txt_perfil.setBackground(Color.RED); 
            txt_perfil.setForeground(Color.WHITE);
        }
        if(fnt_profesion(var_profesionStr))
        {
            txt_profesion.setBackground(Color.WHITE); 
            txt_profesion.setForeground(Color.BLACK);
        }
        else
        {
            txt_profesion.setBackground(Color.RED); 
            txt_profesion.setForeground(Color.WHITE);
        }
        if(fnt_tecnologias(var_tecnologiasStr))
        {
            txt_tecnologias.setBackground(Color.WHITE); 
            txt_tecnologias.setForeground(Color.BLACK);
        }
        else
        {
            txt_tecnologias.setBackground(Color.RED); 
            txt_tecnologias.setForeground(Color.WHITE);
        }
        if(fnt_edad(var_edadStr))
        {
            txt_edad.setBackground(Color.WHITE); 
            txt_edad.setForeground(Color.BLACK);
        }
        else
        {
            txt_edad.setBackground(Color.RED); 
            txt_edad.setForeground(Color.WHITE);
        }
        return resultado;
    }
    private void fnt_actualizar( 
        String var_pnombreStr,
        String var_snombreStr,
        String var_papellidoStr,
        String var_sapellidoStr,
        String var_edadStr,
        String var_correoelectronicoStr,
        String var_contacotStr,
        String var_fechanacimientoStr,
        String var_ciudadorigenStr,
        String var_perfilprofesionalStr,
        String var_profesionStr,
        String var_tecnologiasStr){
        var_swMsgconsulta=false;
        fnt_consultar(txt_identificacion.getText());
        if(var_swBln == true)
        {
        List_datosLst.get(var_posInt).setPnombreStr(var_pnombreStr);
        List_datosLst.get(var_posInt).setSnombreStr(var_snombreStr);
        List_datosLst.get(var_posInt).setPapellidoStr(var_papellidoStr);
        List_datosLst.get(var_posInt).setSapellidoStr(var_sapellidoStr);
        List_datosLst.get(var_posInt).setEdadStr(var_edadStr);
        List_datosLst.get(var_posInt).setCorreoelectronicoStr(var_correoelectronicoStr);
        List_datosLst.get(var_posInt).setContacotStr(var_contacotStr);
        List_datosLst.get(var_posInt).setFechanacimientoStr(var_fechanacimientoStr);
        List_datosLst.get(var_posInt).setCiudadorigenStr(var_ciudadorigenStr);
        List_datosLst.get(var_posInt).setPerfilprofesionalStr(var_perfilprofesionalStr);
        List_datosLst.get(var_posInt).setProfesionStr(var_profesionStr);
        List_datosLst.get(var_posInt).setTecnologiasStr(var_tecnologiasStr);
        
        JOptionPane.showMessageDialog(null, "El usuario "+txt_primer_nombre.getText()+" fue actualizado con éxito");
      }else
        {
             JOptionPane.showMessageDialog(null,"Error, El usuario con la identificación "+txt_identificacion.getText()+" no existe");
        }
    }
    private void fnt_guardar(
        String idStr,
        String pnombreStr,
        String snombreStr,
        String papellidoStr,
        String sapellidoStr,
        String edadStr,
        String correoelectronicoStr,
        String contacotStr,
        String fechanacimientoStr,
        String ciudadorigenStr,
        String perfilprofesionalStr,
        String profesionStr,
        String tecnologiasStr){
        var_swMsgconsulta=false;
        fnt_consultar(txt_identificacion.getText());
        if(var_swBln == false)
        {
            List_datosLst.add(new cls_datos(idStr, pnombreStr, snombreStr, papellidoStr, 
                sapellidoStr, edadStr, correoelectronicoStr, contacotStr, 
                fechanacimientoStr, ciudadorigenStr, perfilprofesionalStr, 
                profesionStr, tecnologiasStr));
            JOptionPane.showMessageDialog(null,"El usuario "+txt_primer_nombre.getText()+" fue registrado con éxito");
   
        }else{
              JOptionPane.showMessageDialog(null,"Error, El usuario con la identificación "+txt_identificacion.getText()+" ya existe");  
        }
  
    }
    private void fnt_consultar(String id)
    {
       var_swBln = false;
       var_posInt = 0;
        for (int i = 0; i < List_datosLst.size();i++)
        {
            if(id.equals(List_datosLst.get(i).getIdStr()))
            {
                var_posInt = i;
                var_swBln = true;
                break;
            }
        }
        if(var_swBln == false && var_swMsgconsulta==true)
        {
            JOptionPane.showMessageDialog(null,"No se encontraron registros con la identificación "+txt_identificacion.getText());
            txt_identificacion.setBackground(Color.RED);
            txt_identificacion.setForeground(Color.WHITE);
            func_limpiar2();
        }
        if(var_swBln == true && var_swMsgconsulta==true)
        {
            txt_identificacion.setBackground(Color.GREEN);
            txt_identificacion.setForeground(Color.BLACK);
            JOptionPane.showMessageDialog(null,"Persona encontrada con éxito "); 
            txt_primer_nombre.setText(List_datosLst.get(var_posInt).getPnombreStr());
            txt_segundo_nombre.setText(List_datosLst.get(var_posInt).getSnombreStr());
            txt_primer_apellido.setText(List_datosLst.get(var_posInt).getPapellidoStr());
            txt_segundo_apellido.setText(List_datosLst.get(var_posInt).getSapellidoStr());
            txt_edad.setText(List_datosLst.get(var_posInt).getEdadStr());
            txt_correo.setText(List_datosLst.get(var_posInt).getCorreoelectronicoStr());
            txt_contacto.setText(List_datosLst.get(var_posInt).getContacotStr());
            txt_fecha.setText(List_datosLst.get(var_posInt).getFechanacimientoStr());
            txt_ciudad_origen.setText(List_datosLst.get(var_posInt).getCiudadorigenStr());
            txt_perfil.setText(List_datosLst.get(var_posInt).getPerfilprofesionalStr());
            txt_profesion.setText(List_datosLst.get(var_posInt).getProfesionStr());
            txt_tecnologias.setText(List_datosLst.get(var_posInt).getTecnologiasStr());
        }
    }    
    private void func_limpiar()
    {
        txt_identificacion.setText("");
        txt_identificacion.setBackground(Color.WHITE); 
        txt_identificacion.setForeground(Color.BLACK);
        
        txt_primer_nombre.setText("");
        txt_primer_nombre.setBackground(Color.WHITE);
        txt_primer_nombre.setForeground(Color.BLACK);
        
        txt_segundo_nombre.setText("");
        txt_segundo_nombre.setBackground(Color.WHITE);
        txt_segundo_nombre.setForeground(Color.BLACK);
               
        txt_primer_apellido.setText("");
        txt_primer_apellido.setBackground(Color.WHITE);
        txt_primer_apellido.setForeground(Color.BLACK);
        
        txt_segundo_apellido.setText("");
        txt_segundo_apellido.setBackground(Color.WHITE);
        txt_segundo_apellido.setForeground(Color.BLACK);
        
        txt_edad.setText("");
        txt_edad.setBackground(Color.WHITE);
        txt_edad.setForeground(Color.BLACK);
        
        txt_correo.setText("");
        txt_correo.setBackground(Color.WHITE);
        txt_correo.setForeground(Color.BLACK);
        
        txt_contacto.setText("");
        txt_contacto.setBackground(Color.WHITE);
        txt_contacto.setForeground(Color.BLACK);
        
        txt_fecha.setText("");
        txt_fecha.setBackground(Color.WHITE);
        txt_fecha.setForeground(Color.BLACK);
        
        txt_ciudad_origen.setText("");
        txt_ciudad_origen.setBackground(Color.WHITE);
        txt_ciudad_origen.setForeground(Color.BLACK);
        
        txt_perfil.setText("");
        txt_perfil.setBackground(Color.WHITE);
        txt_perfil.setForeground(Color.BLACK);
        
        txt_profesion.setText("");
        txt_profesion.setBackground(Color.WHITE);
        txt_profesion.setForeground(Color.BLACK);
        
        txt_tecnologias.setText("");
        txt_tecnologias.setBackground(Color.WHITE);
        txt_tecnologias.setForeground(Color.BLACK);
    }
    
    private void func_limpiar2()
    {
     
        txt_primer_nombre.setText("");
        txt_primer_nombre.setBackground(Color.WHITE);
        txt_primer_nombre.setForeground(Color.BLACK);
        
        txt_segundo_nombre.setText("");
        txt_segundo_nombre.setBackground(Color.WHITE);
        txt_segundo_nombre.setForeground(Color.BLACK);
               
        txt_primer_apellido.setText("");
        txt_primer_apellido.setBackground(Color.WHITE);
        txt_primer_apellido.setForeground(Color.BLACK);
        
        txt_segundo_apellido.setText("");
        txt_segundo_apellido.setBackground(Color.WHITE);
        txt_segundo_apellido.setForeground(Color.BLACK);
        
        txt_edad.setText("");
        txt_edad.setBackground(Color.WHITE);
        txt_edad.setForeground(Color.BLACK);
        
        txt_correo.setText("");
        txt_correo.setBackground(Color.WHITE);
        txt_correo.setForeground(Color.BLACK);
        
        txt_contacto.setText("");
        txt_contacto.setBackground(Color.WHITE);
        txt_contacto.setForeground(Color.BLACK);
        
        txt_fecha.setText("");
        txt_fecha.setBackground(Color.WHITE);
        txt_fecha.setForeground(Color.BLACK);
        
        txt_ciudad_origen.setText("");
        txt_ciudad_origen.setBackground(Color.WHITE);
        txt_ciudad_origen.setForeground(Color.BLACK);
        
        txt_perfil.setText("");
        txt_perfil.setBackground(Color.WHITE);
        txt_perfil.setForeground(Color.BLACK);
        
        txt_profesion.setText("");
        txt_profesion.setBackground(Color.WHITE);
        txt_profesion.setForeground(Color.BLACK);
        
        txt_tecnologias.setText("");
        txt_tecnologias.setBackground(Color.WHITE);
        txt_tecnologias.setForeground(Color.BLACK);
    }
 private static boolean fnt_id(String numero) {
        return numero.matches("[0-9]{10}");
    }

    private static boolean fnt_pnombre(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            return false;
        }
        return nombre.matches("^([A-Z]{1})+$");
    }

    private static boolean fnt_snombre(String snombre) {

        return snombre.matches("^([A-Z]{1})+$");
    }

    private static boolean fnt_papellido(String apellido) {

        if (apellido == null || apellido.isEmpty()) {
            return false;
        }
        return apellido.matches("^([A-Z]{1})+$");
    }

    private static boolean fnt_sapellido(String sapellido) {

        return sapellido.matches("^([A-Z]{1})+$");
    }

    private static boolean fnt_edad(String edad) {
        if (edad == null || edad.isEmpty()) {
            return false;
        } else {
            return edad.matches("[0-9]{1,3}");
        }
    }

    private static boolean fnt_contacto(String contacto) {
        if (contacto == null || contacto.isEmpty()) {
            return false;
        } else {
            return contacto.matches("[0-9]{10}");
        }

    }

    private static boolean fnt_ciudadorigen(String ciudadorigen) {

        if (ciudadorigen == null || ciudadorigen.isEmpty()) {
            return false;
        } else {
            return ciudadorigen.matches("^([A-Z\\u00C0-\\u017F]{1}+[ ]?)+$");
        }

    }

    private static boolean fnt_profesion(String profesion) {

        if (profesion == null || profesion.isEmpty()) {
            return false;
        } else {
            return profesion.matches("^([A-Z]{1}+[ ]?)+$");
        }

    }

    private static boolean fnt_perfilprofesional(String perfilprofesional) {

        if (perfilprofesional == null || perfilprofesional.isEmpty()) {
            return false;
        } else {
            return perfilprofesional.matches("^([A-Z,.\\s]+)$");
        }

    }

    private static boolean fnt_tecnologias(String tecnologias) {

        if (tecnologias == null || tecnologias.isEmpty()) {
            return false;
        } else {
            return tecnologias.matches("^([A-Z,.\\s]+)$");
        }

    }

    private static boolean fnt_fechanacimiento(String fechanacimiento) {

        if (fechanacimiento == null || fechanacimiento.isEmpty()) {
            return false;
        } else {
            return fechanacimiento.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]([012][0-9])\\d{2}$");
        }

    }

    private static boolean fnt_correoelectronico(String correoelectronico) {

        if (correoelectronico == null || correoelectronico.isEmpty()) {
            return false;
        } else {
            return correoelectronico.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        }

    }
    public static void main(String args[]) {  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_ciudad_origen;
    private javax.swing.JTextField txt_contacto;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextArea txt_perfil;
    private javax.swing.JTextField txt_primer_apellido;
    private javax.swing.JTextField txt_primer_nombre;
    private javax.swing.JTextField txt_profesion;
    private javax.swing.JTextField txt_segundo_apellido;
    private javax.swing.JTextField txt_segundo_nombre;
    private javax.swing.JTextArea txt_tecnologias;
    // End of variables declaration//GEN-END:variables
}
