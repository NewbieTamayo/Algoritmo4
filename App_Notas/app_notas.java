import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_notas {
    static LinkedList<cls_estudiantes> estudiantes = new LinkedList<cls_estudiantes>();
    static LinkedList<cls_notas> notas = new LinkedList<cls_notas>();
    static int posicionInt;
    static boolean swBln;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_actualizar_moduloestudiantes(boolean m3){
      
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id del estudiante a actualizar"));

    boolean encontrado = false;
    cls_estudiantes estudiante = null;

    // Recorre la lista enlazada para encontrar el estudiante con la ID indicada
    for (cls_estudiantes est : estudiantes) {
        if (est.getIdInt() == id) {
            encontrado = true;
            estudiante = est;
            break;
        }
    }

    if (encontrado) {
        while (m3 == true) {
        // Solicita los nuevos datos del estudiante
       int opcion2=Integer.parseInt( JOptionPane.showInputDialog("¿Que desea actualizar del estudiante con iD "+id+ "?"+
                            "\n 1. Nombre " +
                            "\n 2. Contacto " +
                            "\n 3. Correo "  +
                            "\n 4. Programa "  +
                            "\n 5. Semestre " +
                            "\n 6. Salir"));
        switch (opcion2) {
            case 1:
                String nombre = JOptionPane.showInputDialog(null, "Nuevo nombre:");
                estudiante.setNombreStr(nombre);
                // Muestra el mensaje de éxito
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                break;
            case 2:
                String contacto = JOptionPane.showInputDialog(null, "Nuevo contacto:");
                estudiante.setContactoStr(contacto);
                // Muestra el mensaje de éxito
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                break;
            case 3:
                String correo = JOptionPane.showInputDialog(null, "Nuevo correo:");
                estudiante.setCorreoStr(correo);
                // Muestra el mensaje de éxito
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                break;
            case 4:
                String programa = JOptionPane.showInputDialog(null, "Nuevo programa:");
                estudiante.setProgramaStr(programa);
                // Muestra el mensaje de éxito
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                break;
            case 5:
                String semestre = JOptionPane.showInputDialog(null, "Nuevo semestre:");
                estudiante.setSemestreStr(semestre);
                // Muestra el mensaje de éxito
                JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                break;

            case 6:
                m3=false;
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN VALIDA");
                break;
        }
            

        }
    } else {
        // Muestra un mensaje si la ID no se encontró
        JOptionPane.showMessageDialog(null, "No se encontró un estudiante con la ID: " + id);
    }

    }
    private static void fnt_registrar_moduloestudiantes() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id"));
        String nombre = JOptionPane.showInputDialog(null, "Nombre");
        String contacto = JOptionPane.showInputDialog(null, "Contacto");
        String correo = JOptionPane.showInputDialog(null, "Correo");
        String programa = JOptionPane.showInputDialog(null, "Programa");
        String semestre = JOptionPane.showInputDialog(null, "Semestre");
        estudiantes.add(new cls_estudiantes(id, nombre, contacto, correo, programa, semestre));
        JOptionPane.showMessageDialog(null, "SE REGISTRO EXITOSAMENTE");
    }

    private static void fnt_consultar_moduloestudiantes() {
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Id"));
        swBln = false;
        posicionInt = 0;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdInt() == id) {
                swBln = true;
                posicionInt = i;
                break;
            }
        }

        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL ESTUDIANTE");
        } else {
            JOptionPane.showMessageDialog(null, "NOMBRE: " + estudiantes.get(posicionInt).getNombreStr() +
                    "\nCONTACTO: " + estudiantes.get(posicionInt).getContactoStr() + "\nCORREO: "
                    + estudiantes.get(posicionInt).getCorreoStr() +
                    "\nPROGRAMA: " + estudiantes.get(posicionInt).getProgramaStr() + "\nSEMESTRE: "
                    + estudiantes.get(posicionInt).getSemestreStr());
        }

    }

    private static void fnt_registrar_modulonotas() {
        String fecha = JOptionPane.showInputDialog(null, "Fecha");
        float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 1"));
        float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 2"));
        float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Nota 3"));
        String id_estudiante = JOptionPane.showInputDialog(null, "ID estudiante");
        String asignatura = JOptionPane.showInputDialog(null, "Asignatura");
        notas.add(new cls_notas(fecha, nota1, nota2, nota3, id_estudiante, asignatura));
        JOptionPane.showMessageDialog(null, "NOTA REGISTRADA CON ÉXITO");
    }

    private static void fnt_reportes_modulonotas() {
        String id = JOptionPane.showInputDialog(null, "id");
        swBln = false;
        for (int p = 0; p < estudiantes.size(); p++) {
            if (notas.get(p).getId_estudianteStr().equals(id)) {
                swBln = true;
                break;
            }
        }
        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON REGISTROS");
        } else {
            for (int i = 0; i < notas.size(); i++) {
                if (notas.get(i).getId_estudianteStr().equals(id)) {
                    JOptionPane.showMessageDialog(null, "FECHA REGISTRO: " + notas.get(i).getFechaStr() +
                            "\nASIGNATURA: " + notas.get(i).getAsignaturaStr() +
                            "\nNOTA 1: " + notas.get(i).getNota1Flt() +
                            "\nNOTA 2: " + notas.get(i).getNota2Flt() +
                            "\nNOTA 3: " + notas.get(i).getNota3Flt() +
                            "\nDEFINITIVA: " + notas.get(i).getDefinitivaFlt() +
                            "\nID ESTUDIANTE: " + notas.get(i).getId_estudianteStr());
                }

            }
        }
    }

    private static void fnt_modulonotas(boolean m2) {
        while (m2 == true) {
            String op2 = JOptionPane.showInputDialog(null,
                    "MÓDULO NOTAS\n1. REGISTRAR\n2. REPORTE\n3. SALIR");
            switch (op2) {
                case "1":
                    fnt_registrar_modulonotas();
                    break;
                case "2":
                    fnt_reportes_modulonotas();
                    break;

                case "3":
                    m2 = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN VALIDA");
                    break;
            }
        }
    }

    private static void fnt_moduloestudiantes(boolean m1) {
        while (m1 == true) {
            String op1 = JOptionPane.showInputDialog(null,
                    "MÓDULO ESTUDIANTES\n1. REGISTRAR\n2. CONSULTAR\n3. ACTUALIZAR\n4. SALIR");
            switch (op1) {
                case "1":
                    fnt_registrar_moduloestudiantes();
                    break;
                case "2":
                    fnt_consultar_moduloestudiantes();
                    break;

                case "3":
                    fnt_actualizar_moduloestudiantes(true);
                    break;

                case "4":
                    m1 = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN VALIDA");
                    break;
            }
        }
    }

    private static void fnt_menu(boolean men) {
        while (men == true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES\n1. MÓDULO ESTUDIANTES\n2. MÓDULO NOTAS\n3. SALIR");
            switch (opcion) {
                case "1":
                    fnt_moduloestudiantes(true);
                    break;
                case "2":
                    fnt_modulonotas(true);
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN VALIDA");
                    break;
            }
        }
    }
}
