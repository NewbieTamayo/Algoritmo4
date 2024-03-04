package Vistas;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Controlador.cls_informacionpersonal;
import Controlador.cls_informacionfamiliar;
import Controlador.cls_informacionacademica;
import Controlador.cls_informacionlaboral;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlo
 */
public class frm_registro extends javax.swing.JFrame {

    LinkedList<cls_informacionpersonal> datospersonales = new LinkedList<>();
    LinkedList<cls_informacionfamiliar> datosfamiliares = new LinkedList<>();
    LinkedList<cls_informacionacademica> datosacademicos = new LinkedList<>();
    LinkedList<cls_informacionlaboral> datoslaborales = new LinkedList<>();
    int posicionInt;
    boolean swBln;

    private void fnt_registrarDPersona(String id, String nombre, String apellido, String celular, String correo, String direccion, String fechadenacimiento, String descripcion) {
        posicionInt = 0;
        swBln = false;
        for (int i = 0; i < datospersonales.size(); i++) {
            if (datospersonales.get(i).getIdentificacionStr().equals(id)) {
                swBln = true;
                break;
            }
        }
        if (swBln == false) {
             datospersonales.add(new cls_informacionpersonal(id, nombre, apellido, celular, correo, direccion, fechadenacimiento, descripcion));
        fnt_mostrarestudios();
        fnt_mostrarfamiliares();
        fnt_mostrarlaboral();
        btn_actualizar.setEnabled(true);
        btn_registrar.setEnabled(false);
        txt_identificacion.setEnabled(false);
        btn_registrarEstudios.setEnabled(true);
        btn_registrarFamiliar.setEnabled(true);
        btn_registrarLaboral.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Candidato registrado con éxito");
        txt_nombres.requestFocus();
               
        }
        else
      
        {
           JOptionPane.showMessageDialog(null, "Error, esta identificación ya existe","Registrar", JOptionPane.ERROR_MESSAGE);
        }
        
       
    }
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        fnt_registrarDPersona(txt_identificacion.getText(), txt_nombres.getText(), txt_apellidos.getText(),
                txt_contacto.getText(), txt_correo.getText(), txt_direccion.getText(),
                txt_fechanacimiento.getText(), txt_perfilprofesional.getText());

    }//GEN-LAST:event_btn_registrarActionPerformed
    /**
     * Creates new form frm_registro
     */
    private void btn_nuevoregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoregistroActionPerformed
        fnt_mostrarestudios();
        fnt_mostrarfamiliares();
        fnt_mostrarlaboral();
        btn_registrarEstudios.setEnabled(false);
        btn_registrarFamiliar.setEnabled(false);
        btn_registrarLaboral.setEnabled(false);
        btn_actualizar.setEnabled(false);
        btn_registrar.setEnabled(true);
        txt_identificacion.setEnabled(true);
        txt_identificacion.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_contacto.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_fechanacimiento.setText("");
        txt_perfilprofesional.setText("");

        DefaultTableModel model = (DefaultTableModel) tbl_familiares.getModel();
        model.setRowCount(0);

        DefaultTableModel model2 = (DefaultTableModel) tbl_laborales.getModel();
        model2.setRowCount(0);

        DefaultTableModel model3 = (DefaultTableModel) tbl_academicos.getModel();
        model3.setRowCount(0);


    }//GEN-LAST:event_btn_nuevoregistroActionPerformed

    private void btn_nuevoFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoFamiliarActionPerformed

        txt_nombrefamiliar.setText("");
        txt_celularfamiliar.setText("");
        txt_parentescofamiliar.setText("");
        txt_ocupacionfamiliar.setText("");
        btn_registrarFamiliar.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoFamiliarActionPerformed
    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        fnt_actualizarDPersona();
    }//GEN-LAST:event_btn_actualizarActionPerformed
    private void fnt_actualizarDPersona() {
        datospersonales.get(posicionInt).setIdentificacionStr(txt_identificacion.getText());
        datospersonales.get(posicionInt).setNombreStr(txt_nombres.getText());
        datospersonales.get(posicionInt).setApellidoStr(txt_apellidos.getText());
        datospersonales.get(posicionInt).setCelularStr(txt_contacto.getText());
        datospersonales.get(posicionInt).setCorreoStr(txt_correo.getText());
        datospersonales.get(posicionInt).setDireccionStr(txt_direccion.getText());
        datospersonales.get(posicionInt).setFechanacimientoStr(txt_fechanacimiento.getText());
    }
     private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
         if (txt_identificacion.getText().length() == 0) {
             JOptionPane.showMessageDialog(null, "Error, Digite una identificación","Consultar", JOptionPane.ERROR_MESSAGE);
         } else {
             fnt_consultarDPersona(txt_identificacion.getText());
         }


    }//GEN-LAST:event_btn_consultarActionPerformed
    private void fnt_consultarDPersona(String id) {
        posicionInt = 0;
        swBln = false;
        for (int i = 0; i < datospersonales.size(); i++) {
            if (datospersonales.get(i).getIdentificacionStr().equals(id)) {
                swBln = true;
                posicionInt = i;
                break;
            }
        }
        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "No se encontraros registros", "Consultar", JOptionPane.ERROR_MESSAGE);
            btn_actualizar.setEnabled(false);
            btn_registrar.setEnabled(true);
            txt_identificacion.setEnabled(true);
            txt_identificacion.requestFocus();
        } else {
            txt_nombres.setText(datospersonales.get(posicionInt).getNombreStr());
            txt_apellidos.setText(datospersonales.get(posicionInt).getApellidoStr());
            txt_contacto.setText(datospersonales.get(posicionInt).getCelularStr());
            txt_direccion.setText(datospersonales.get(posicionInt).getDireccionStr());
            txt_correo.setText(datospersonales.get(posicionInt).getCorreoStr());
            txt_fechanacimiento.setText(datospersonales.get(posicionInt).getFechanacimientoStr());
            txt_perfilprofesional.setText(datospersonales.get(posicionInt).getDescripcionperfilStr());
            btn_registrarEstudios.setEnabled(true);
            btn_registrarFamiliar.setEnabled(true);
            btn_registrarLaboral.setEnabled(true);
            btn_actualizar.setEnabled(true);
            btn_registrar.setEnabled(false);
            txt_identificacion.setEnabled(false);
            txt_nombres.requestFocus();
        }
        fnt_mostrarestudios();
        fnt_mostrarfamiliares();
        fnt_mostrarlaboral();
    }

    public frm_registro() {
        initComponents();

        this.setExtendedState(frm_registro.MAXIMIZED_BOTH);
        txt_identificacion.requestFocus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_identificacion = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_contacto = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_perfilprofesional = new javax.swing.JTextArea();
        btn_consultar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_nombrefamiliar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_celularfamiliar = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_parentescofamiliar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_ocupacionfamiliar = new javax.swing.JTextField();
        btn_mostrarFamiliar = new javax.swing.JButton();
        btn_nuevoFamiliar = new javax.swing.JButton();
        btn_registrarFamiliar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_cargo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tiempo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_direccionLaboral = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_funciones = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txt_fechanacimiento = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_nuevoregistro = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_nivel = new javax.swing.JTextField();
        txt_añoG = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_institucion = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_contactoIE = new javax.swing.JTextField();
        btn_mostrarEstudios = new javax.swing.JButton();
        btn_nuevoEstudios = new javax.swing.JButton();
        btn_registrarEstudios = new javax.swing.JButton();
        btn_mostrarLaboral = new javax.swing.JButton();
        btn_nuevoLaboral = new javax.swing.JButton();
        btn_registrarLaboral = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_academicos = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_laborales = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_familiares = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formato de registro de candidatos");
        jLabel1.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(1188, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1620, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setFocusable(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(241, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Datos personales");
        jLabel2.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, -1));

        jLabel3.setText("Identificación:");
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel4.setText("Nombre:");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel5.setText("Celular:");
        jLabel5.setFocusable(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel6.setText("Dirección:");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel7.setText("Correo:");
        jLabel7.setFocusable(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel8.setText("Perfil:");
        jLabel8.setFocusable(false);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        txt_identificacion.setNextFocusableComponent(txt_nombres);
        getContentPane().add(txt_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));

        txt_nombres.setNextFocusableComponent(txt_apellidos);
        getContentPane().add(txt_nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 240, -1));

        txt_contacto.setNextFocusableComponent(txt_direccion);
        getContentPane().add(txt_contacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, -1));

        txt_direccion.setNextFocusableComponent(txt_correo);
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 240, -1));

        txt_correo.setNextFocusableComponent(txt_fechanacimiento);
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 240, -1));

        txt_perfilprofesional.setColumns(20);
        txt_perfilprofesional.setLineWrap(true);
        txt_perfilprofesional.setRows(5);
        jScrollPane1.setViewportView(txt_perfilprofesional);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 240, 70));

        btn_consultar.setText("Consultar");
        btn_consultar.setFocusable(false);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, -1));

        btn_registrar.setText("Registrar");
        btn_registrar.setFocusable(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.setEnabled(false);
        btn_actualizar.setFocusable(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setFocusable(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Datos familiares");
        jLabel9.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(66, 66, 66))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 250, -1));

        jLabel10.setText("Nombre completo:");
        jLabel10.setFocusable(false);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        txt_nombrefamiliar.setNextFocusableComponent(txt_celularfamiliar);
        getContentPane().add(txt_nombrefamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 250, -1));

        jLabel11.setText("Celular:");
        jLabel11.setFocusable(false);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        txt_celularfamiliar.setNextFocusableComponent(txt_parentescofamiliar);
        getContentPane().add(txt_celularfamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 250, -1));

        jLabel12.setText("Parentesco:");
        jLabel12.setFocusable(false);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        txt_parentescofamiliar.setNextFocusableComponent(txt_ocupacionfamiliar);
        getContentPane().add(txt_parentescofamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 250, -1));

        jLabel13.setText("Ocupacion:");
        jLabel13.setFocusable(false);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        txt_ocupacionfamiliar.setNextFocusableComponent(txt_institucion);
        getContentPane().add(txt_ocupacionfamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 250, -1));

        btn_mostrarFamiliar.setText("Mostrar");
        btn_mostrarFamiliar.setFocusable(false);
        btn_mostrarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarFamiliarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        btn_nuevoFamiliar.setText("Nuevo");
        btn_nuevoFamiliar.setFocusable(false);
        btn_nuevoFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoFamiliarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, -1, -1));

        btn_registrarFamiliar.setText("Registrar");
        btn_registrarFamiliar.setEnabled(false);
        btn_registrarFamiliar.setFocusable(false);
        btn_registrarFamiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarFamiliarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrarFamiliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setFocusable(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(241, 38));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Datos laborales");
        jLabel14.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel14)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 70, 250, -1));

        jLabel15.setText("Empresa:");
        jLabel15.setFocusable(false);
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        txt_empresa.setNextFocusableComponent(txt_cargo);
        getContentPane().add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 120, 250, -1));

        jLabel16.setText("Cargo:");
        jLabel16.setFocusable(false);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 160, -1, -1));

        txt_cargo.setNextFocusableComponent(txt_tiempo);
        getContentPane().add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 160, 250, -1));

        jLabel17.setText("Tiempo:");
        jLabel17.setFocusable(false);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, -1, -1));

        txt_tiempo.setNextFocusableComponent(txt_direccionLaboral);
        getContentPane().add(txt_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, 250, -1));

        jLabel18.setText("Direccion:");
        jLabel18.setFocusable(false);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 230, -1, -1));

        txt_direccionLaboral.setNextFocusableComponent(txt_telefono);
        getContentPane().add(txt_direccionLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 230, 250, -1));

        jLabel19.setText("Telefono:");
        jLabel19.setFocusable(false);
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 260, -1, -1));

        txt_telefono.setNextFocusableComponent(txt_email);
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 260, 250, -1));

        jLabel20.setText("Funciones:");
        jLabel20.setFocusable(false);
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 330, -1, -1));

        txt_funciones.setColumns(20);
        txt_funciones.setLineWrap(true);
        txt_funciones.setRows(5);
        jScrollPane2.setViewportView(txt_funciones);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 330, 250, 70));

        jLabel21.setText("Email:");
        jLabel21.setFocusable(false);
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, -1, -1));

        txt_email.setNextFocusableComponent(txt_nombres);
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 290, 250, -1));

        jLabel22.setText("Fecha nacimiento:");
        jLabel22.setFocusable(false);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txt_fechanacimiento.setNextFocusableComponent(txt_nombrefamiliar);
        getContentPane().add(txt_fechanacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 240, -1));

        jLabel23.setText("Apellido:");
        jLabel23.setFocusable(false);
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txt_apellidos.setNextFocusableComponent(txt_contacto);
        getContentPane().add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, 560));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 10, 650));

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setFocusable(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 70, -1, 650));

        btn_nuevoregistro.setText("Nuevo registro");
        btn_nuevoregistro.setFocusable(false);
        btn_nuevoregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoregistroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 240, 30));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setFocusable(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Datos academicos");
        jLabel24.setFocusable(false);

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setFocusable(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Datos academicos");
        jLabel31.setFocusable(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addGap(66, 66, 66))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(66, 66, 66))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 250, -1));

        jLabel25.setText("IE: ");
        jLabel25.setFocusable(false);
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, -1, -1));

        jLabel26.setText("Titulo:");
        jLabel26.setFocusable(false);
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        jLabel27.setText("Año G:");
        jLabel27.setFocusable(false);
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, -1, -1));

        jLabel28.setText("Nivel:");
        jLabel28.setFocusable(false);
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 440, -1, -1));

        txt_nivel.setNextFocusableComponent(txt_contactoIE);
        getContentPane().add(txt_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 250, -1));

        txt_añoG.setNextFocusableComponent(txt_nivel);
        getContentPane().add(txt_añoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 250, -1));

        txt_titulo.setNextFocusableComponent(txt_añoG);
        getContentPane().add(txt_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 250, -1));

        txt_institucion.setNextFocusableComponent(txt_titulo);
        getContentPane().add(txt_institucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 250, -1));

        jLabel29.setText("Contacto:");
        jLabel29.setFocusable(false);
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 470, -1, -1));

        txt_contactoIE.setNextFocusableComponent(txt_empresa);
        getContentPane().add(txt_contactoIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 250, -1));

        btn_mostrarEstudios.setText("Mostrar");
        btn_mostrarEstudios.setFocusable(false);
        btn_mostrarEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrarEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, -1));

        btn_nuevoEstudios.setText("Nuevo");
        btn_nuevoEstudios.setFocusable(false);
        btn_nuevoEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        btn_registrarEstudios.setText("Registrar");
        btn_registrarEstudios.setEnabled(false);
        btn_registrarEstudios.setFocusable(false);
        btn_registrarEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarEstudiosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrarEstudios, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 500, -1, -1));

        btn_mostrarLaboral.setText("Mostrar");
        btn_mostrarLaboral.setFocusable(false);
        btn_mostrarLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarLaboralActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mostrarLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 410, -1, -1));

        btn_nuevoLaboral.setText("Nuevo");
        btn_nuevoLaboral.setFocusable(false);
        btn_nuevoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoLaboralActionPerformed(evt);
            }
        });
        getContentPane().add(btn_nuevoLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 410, -1, -1));

        btn_registrarLaboral.setText("Registrar");
        btn_registrarLaboral.setEnabled(false);
        btn_registrarLaboral.setFocusable(false);
        btn_registrarLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarLaboralActionPerformed(evt);
            }
        });
        getContentPane().add(btn_registrarLaboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 410, -1, -1));

        tbl_academicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Institución ", "Titulo", "Año grado", "Nivel", "Contacto"
            }
        ));
        jScrollPane3.setViewportView(tbl_academicos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 550, 510, 160));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setFocusable(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Datos academicos");
        jLabel32.setFocusable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(jLabel32)
                .addGap(172, 172, 172))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel32))
        );

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 510, 20));

        tbl_laborales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Cargo", "Tiempo", "Dirección", "Telefono", "Email", "Funciones"
            }
        ));
        jScrollPane4.setViewportView(tbl_laborales);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 550, 400, 160));

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));
        jPanel10.setFocusable(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Datos laborales");
        jLabel33.setFocusable(false);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel33)
                .addGap(132, 132, 132))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel33))
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 530, 400, 20));

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));
        jPanel11.setFocusable(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 38));

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Datos familiares");
        jLabel34.setFocusable(false);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(123, 123, 123))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel34))
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 400, 20));

        tbl_familiares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Celular", "Parentesco", "Ocupación"
            }
        ));
        jScrollPane5.setViewportView(tbl_familiares);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 400, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoEstudiosActionPerformed
        txt_institucion.setText("");
        txt_titulo.setText("");
        txt_añoG.setText("");
        txt_nivel.setText("");
        txt_contactoIE.setText("");
        btn_registrarEstudios.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoEstudiosActionPerformed

    private void btn_nuevoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoLaboralActionPerformed
        txt_empresa.setText("");
        txt_cargo.setText("");
        txt_tiempo.setText("");
        txt_direccionLaboral.setText("");
        txt_telefono.setText((""));
        txt_email.setText("");
        txt_funciones.setText("");
        btn_registrarLaboral.setEnabled(true);
    }//GEN-LAST:event_btn_nuevoLaboralActionPerformed

    private void fnt_registrarFamiliar(String id, String nombre, String celular, String parentesco, String ocupacion) {
        datosfamiliares.add(new cls_informacionfamiliar(id, nombre, celular, parentesco, ocupacion));
        JOptionPane.showMessageDialog(null, "Datos familiares registrados con éxito");
        fnt_mostrarfamiliares();
        btn_registrarFamiliar.setEnabled(false);
    }

    private void btn_registrarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarFamiliarActionPerformed
        if (txt_nombrefamiliar.getText().length() == 0 || txt_celularfamiliar.getText().length() == 0 || txt_parentescofamiliar.getText().length() == 0 || txt_ocupacionfamiliar.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados","Registrar familiar", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_registrarFamiliar(txt_identificacion.getText(), txt_nombrefamiliar.getText(), txt_celularfamiliar.getText(), txt_parentescofamiliar.getText(), txt_ocupacionfamiliar.getText());
        }
        txt_nombrefamiliar.requestFocus();
    }//GEN-LAST:event_btn_registrarFamiliarActionPerformed
    private void fnt_registrarEstudios(String id, String nombre, String titulo, String añogrado, String nivel, String contacto) {
        datosacademicos.add(new cls_informacionacademica(id, nombre, titulo, añogrado, nivel, contacto));
        JOptionPane.showMessageDialog(null, "Datos academicos registrados con éxito");
        fnt_mostrarestudios();
        btn_registrarEstudios.setEnabled(false);
    }

    private void btn_registrarEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarEstudiosActionPerformed
        if (txt_institucion.getText().length() == 0 || txt_titulo.getText().length() == 0 || txt_añoG.getText().length() == 0 || txt_nivel.getText().length() == 0 || txt_contacto.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados", "Registrar estudios", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_registrarEstudios(txt_identificacion.getText(), txt_institucion.getText(), txt_titulo.getText(), txt_añoG.getText(), txt_nivel.getText(), txt_contactoIE.getText());
        }
        txt_institucion.requestFocus();
    }//GEN-LAST:event_btn_registrarEstudiosActionPerformed
    private void fnt_registrarLaboral(String id, String empresa, String cargo, String tiempo, String direccion, String telefono, String email, String funciones) {
        datoslaborales.add(new cls_informacionlaboral(id, empresa, cargo, tiempo, direccion, telefono, email, funciones));
        JOptionPane.showMessageDialog(null, "Datos laborales registrados con éxito");
        btn_registrarLaboral.setEnabled(false);
        fnt_mostrarlaboral();
    }

    private void btn_registrarLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarLaboralActionPerformed
        if (txt_empresa.getText().length() == 0 || txt_cargo.getText().length() == 0 || txt_tiempo.getText().length() == 0 || txt_direccionLaboral.getText().length() == 0 || txt_telefono.getText().length() == 0 || txt_email.getText().length() == 0 || txt_funciones.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, todos los campos deben ser diligenciados","Registrar laboral", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_registrarLaboral(txt_identificacion.getText(), txt_empresa.getText(), txt_cargo.getText(), txt_tiempo.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_email.getText(), txt_funciones.getText());
        }
        txt_empresa.requestFocus();
    }//GEN-LAST:event_btn_registrarLaboralActionPerformed

    private void btn_mostrarFamiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarFamiliarActionPerformed
        if (txt_identificacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, Digite una identificación","Mostrar familiar", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_mostrarfamiliares();
        }

    }//GEN-LAST:event_btn_mostrarFamiliarActionPerformed

    private void btn_mostrarEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarEstudiosActionPerformed
        if (txt_identificacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, Digite una identificación","Mostrar estudios", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_mostrarestudios();
        }


    }//GEN-LAST:event_btn_mostrarEstudiosActionPerformed

    private void btn_mostrarLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarLaboralActionPerformed
        if (txt_identificacion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Error, Digite una identificación","Mostrar Laboral", JOptionPane.ERROR_MESSAGE);
        } else {
            fnt_mostrarlaboral();
        }

    }//GEN-LAST:event_btn_mostrarLaboralActionPerformed
    private void fnt_mostrarlaboral() {
        String idreferencia = txt_identificacion.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_laborales.getModel();
        model.setRowCount(0);
        String var_idStr;
        String var_empresaStr;
        String var_cargoStr;
        String var_tiempoStr;
        String var_direccionStr;
        String var_telefonoStr;
        String var_emailStr;
        String var_funcionesStr;

        for (int i = 0; i < datoslaborales.size(); i++) {

            var_idStr = datoslaborales.get(i).getIdentificacionStr();
            if (var_idStr.equals(idreferencia)) {

                var_empresaStr = datoslaborales.get(i).getEmpresaStr();
                var_cargoStr = datoslaborales.get(i).getCargoStr();
                var_tiempoStr = datoslaborales.get(i).getTiempoStr();
                var_direccionStr = datoslaborales.get(i).getDireccionStr();
                var_telefonoStr = datoslaborales.get(i).getTelefonoStr();
                var_emailStr = datoslaborales.get(i).getEmailStr();
                var_funcionesStr = datoslaborales.get(i).getFuncionesStr();
                model.addRow(new Object[]{var_empresaStr, var_cargoStr, var_tiempoStr, var_direccionStr, var_telefonoStr, var_emailStr, var_funcionesStr});
            }
        }

    }

    private void fnt_mostrarestudios() {
        String idreferencia = txt_identificacion.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_academicos.getModel();
        model.setRowCount(0);
        String var_idStr;
        String var_nombreStr;
        String var_tituloStr;
        String var_añogradoStr;
        String var_nivelStr;
        String var_contactoStr;

        for (int i = 0; i < datosacademicos.size(); i++) {

            var_idStr = datosacademicos.get(i).getIdentificacionStr();
            if (var_idStr.equals(idreferencia)) {

                var_nombreStr = datosacademicos.get(i).getNombreinstitucionStr();
                var_tituloStr = datosacademicos.get(i).gettituloStr();
                var_añogradoStr = datosacademicos.get(i).getAñogradoStr();
                var_nivelStr = datosacademicos.get(i).getNivelStr();
                var_contactoStr = datosacademicos.get(i).getContactoStr();

                model.addRow(new Object[]{var_nombreStr, var_tituloStr, var_añogradoStr, var_nivelStr, var_contactoStr});
            }
        }

    }

    private void fnt_mostrarfamiliares() {
        String idreferencia = txt_identificacion.getText();
        DefaultTableModel model = (DefaultTableModel) tbl_familiares.getModel();
        model.setRowCount(0);
        String var_idStr;
        String var_nombreStr;
        String var_celularStr;
        String var_parentescoStr;
        String var_ocupacionStr;

        for (int i = 0; i < datosfamiliares.size(); i++) {

            var_idStr = datosfamiliares.get(i).getIdentificacionStr();
            if (var_idStr.equals(idreferencia)) {

                var_nombreStr = datosfamiliares.get(i).getNombrecompletoStr();
                var_celularStr = datosfamiliares.get(i).getCelularStr();
                var_parentescoStr = datosfamiliares.get(i).getParentescoStr();
                var_ocupacionStr = datosfamiliares.get(i).getOcupacionStr();

                model.addRow(new Object[]{var_nombreStr, var_celularStr, var_parentescoStr, var_ocupacionStr});
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new frm_registro().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_mostrarEstudios;
    private javax.swing.JButton btn_mostrarFamiliar;
    private javax.swing.JButton btn_mostrarLaboral;
    private javax.swing.JButton btn_nuevoEstudios;
    private javax.swing.JButton btn_nuevoFamiliar;
    private javax.swing.JButton btn_nuevoLaboral;
    private javax.swing.JButton btn_nuevoregistro;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrarEstudios;
    private javax.swing.JButton btn_registrarFamiliar;
    private javax.swing.JButton btn_registrarLaboral;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl_academicos;
    private javax.swing.JTable tbl_familiares;
    private javax.swing.JTable tbl_laborales;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_añoG;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_celularfamiliar;
    private javax.swing.JTextField txt_contacto;
    private javax.swing.JTextField txt_contactoIE;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_direccionLaboral;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_fechanacimiento;
    private javax.swing.JTextArea txt_funciones;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_institucion;
    private javax.swing.JTextField txt_nivel;
    private javax.swing.JTextField txt_nombrefamiliar;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_ocupacionfamiliar;
    private javax.swing.JTextField txt_parentescofamiliar;
    private javax.swing.JTextArea txt_perfilprofesional;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_tiempo;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
