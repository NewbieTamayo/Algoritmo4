import java.time.LocalDateTime;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_ventas {
    static LinkedList<cls_productos> productos = new LinkedList<cls_productos>();
    static LinkedList<cls_ventas> ventas = new LinkedList<cls_ventas>();
    static int posicionInt;
    static boolean swBln;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    public static void fnt_moduloproductos(boolean m1) {
        while (m1 == true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES MODULO PRODUCTOS\n1. Consultar \n2. Agregar\n3. Actualizar\n4.Salir");
            switch (opcion) {
                case "1":
                    fnt_consultarproductos();
                    break;
                case "2":
                    fnt_agregarproductos();
                    break;
                case "3":
                    fnt_actualizarproductos(true);
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

    public static void fnt_consultarproductos() {
        String codigo = JOptionPane.showInputDialog(null, "Codigo ");
        swBln = false;
        posicionInt = 0;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigoStr().equals(codigo)) {
                swBln = true;
                posicionInt = i;
                break;
            }
        }

        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL PRODUCTO");
        } else {
            JOptionPane.showMessageDialog(null, "CÓDIGO: " + productos.get(posicionInt).getCodigoStr() +
                    "\nNOMBRE: " + productos.get(posicionInt).getNombreStr() + "\nEXISTENCIA: "
                    + productos.get(posicionInt).getExistenciasInt() +
                    "\nFECHA DE REGISTRO: " + productos.get(posicionInt).getFecha_regStr() + "\nPRECIO: "
                    + productos.get(posicionInt).getPrecioFlt());
        }
    }

    public static void fnt_agregarproductos() {
        String codigo = JOptionPane.showInputDialog(null, "Código");
        String nombre = JOptionPane.showInputDialog(null, "Nombre");
        int existencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Existencia"));
        String fecharegistro = JOptionPane.showInputDialog(null, "Fecha de registro");
        float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Precio"));
        productos.add(new cls_productos(codigo, nombre, existencia, fecharegistro, precio));
        JOptionPane.showMessageDialog(null, "SE REGISTRO EXITOSAMENTE");
    }

    public static void fnt_actualizarproductos(boolean m3) {
        String codigo = JOptionPane.showInputDialog(null, "Código del producto a actualizar");

        boolean encontrado = false;
        cls_productos producto = null;
        posicionInt = 0;
        swBln = false;

        // Recorre la lista enlazada para encontrar el estudiante con la ID indicada
        for (cls_productos pro : productos) {
            if (pro.getCodigoStr().equals(codigo)) {
                encontrado = true;
                producto = pro;
                break;
            }
        }
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigoStr().equals(codigo)) {
                posicionInt = i;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, "" + posicionInt);
            while (m3 == true) {
                // Solicita los nuevos datos del estudiante
                int opcion2 = Integer.parseInt(
                        JOptionPane.showInputDialog("¿Que desea actualizar del producto con código " + codigo + "?" +
                                "\n 1. Nombre " +
                                "\n 2. Existencia " +
                                "\n 3. Fecha de registro " +
                                "\n 4. Precio " +
                                "\n 5. Salir"));
                switch (opcion2) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog(null,
                                "Nombre actual : " + productos.get(posicionInt).getNombreStr() + "\nNuevo nombre:");
                        producto.setNombreStr(nombre);
                        // Muestra el mensaje de éxito
                        JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                        break;
                    case 2:
                        int existencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Existencia actual : "
                                + productos.get(posicionInt).getExistenciasInt() + "\nNueva existencia:"));
                        producto.setExistenciasInt(existencia);
                        // Muestra el mensaje de éxito
                        JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                        break;
                    case 3:
                        String fecharegistro = JOptionPane.showInputDialog(null, "Fecha de registro actual : "
                                + productos.get(posicionInt).getFecha_regStr() + "\nNueva fecha de registro:");
                        producto.setFecha_regStr(fecharegistro);
                        // Muestra el mensaje de éxito
                        JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                        break;
                    case 4:
                        float precio = Float.parseFloat(JOptionPane.showInputDialog(null,
                                "Precio actual : " + productos.get(posicionInt).getPrecioFlt() + "\nNuevo precio:"));
                        producto.setPrecioFlt(precio);
                        // Muestra el mensaje de éxito
                        JOptionPane.showMessageDialog(null, "SE ACTUALIZO EXITOSAMENTE");
                        break;

                    case 5:
                        m3 = false;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "SELECCIONE UNA OPCIÓN VALIDA");
                        break;
                }

            }
        } else {
            // Muestra un mensaje si la ID no se encontró
            JOptionPane.showMessageDialog(null, "No se encontró un producto con el código : " + codigo);
        }

    }

    public static void fnt_moduloventas(boolean m2) {
        while (m2 == true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES MODULO VENTAS\n1. AGREGAR VENTA \n2. REPORTE\n3.Salir");
            switch (opcion) {
                case "1":
                    fnt_agregarventa();
                    break;
    
                case "2":
                    fnt_reporteventa();
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

    public static void fnt_agregarventa() {
        String codigo = JOptionPane.showInputDialog(null, "Código");
        swBln = false;
        posicionInt = 0;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigoStr().equals(codigo)) {
                swBln = true;
                posicionInt = i;
                break;
            }
        }

        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL CÓDIGO");
        } else {
            if (productos.get(posicionInt).getExistenciasInt() > 0) {

                int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad"));
                if (productos.get(posicionInt).getExistenciasInt() - cantidad >= 0) {
                    LocalDateTime datetime = LocalDateTime.now();
                    String fecha = String.valueOf(datetime);

                    float subtotal = cantidad * productos.get(posicionInt).getPrecioFlt();
                    ventas.add(new cls_ventas(fecha, codigo, cantidad, subtotal));

                    cls_productos producto = null;
                    for (cls_productos pro : productos) {
                        if (pro.getCodigoStr().equals(codigo)) {
                            producto = pro;
                            break;
                        }
                    }
                    producto.setExistenciasInt(productos.get(posicionInt).getExistenciasInt() - cantidad);
                    JOptionPane.showMessageDialog(null, "SE REGISTRO EXITOSAMENTE");
                } else {
                    JOptionPane.showMessageDialog(null, "LA CANTIDAD NO ES VALIDA, ACTUALMENTE EL PRODUCTO TIENE "
                            + productos.get(posicionInt).getExistenciasInt() + " existencias");
                }
            } else {
                JOptionPane.showMessageDialog(null, "EL PRODUCTO CON CÓDIGO " + codigo + " TIENE 0 EXISTENCIAS");
            }
        }

    }

    public static void fnt_reporteventa() {
        String codigo = JOptionPane.showInputDialog(null, "codigo");
        swBln = false;
        for (int p = 0; p < productos.size(); p++) {
            if (ventas.get(p).getCod_productoStr().equals(codigo)) {
                swBln = true;
                break;
            }
        }
        if (swBln == false) {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRARON REGISTROS");
        } else {
            for (int i = 0; i < ventas.size(); i++) {
                if (ventas.get(i).getCod_productoStr().equals(codigo)) {
                    JOptionPane.showMessageDialog(null, "FECHA REGISTRO: " + ventas.get(i).getFechaStr() +
                            "\nCÓDIGO PRODUCTO: " + ventas.get(i).getCod_productoStr() +
                            "\nCANTIDAD: " + ventas.get(i).getCantidadInt() +
                            "\nSUBTOTAL: " + ventas.get(i).getSubtotalFlt() +
                            "\nIVA: " + ventas.get(i).getIvaFlt() +
                            "\nTOTAL: " + ventas.get(i).getTotalFlt());
                }

            }
        }
    }

    private static void fnt_menu(boolean men) {
        while (men == true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "MENU DE OPCIONES\n1. MÓDULO PRODUCTOS\n2. MÓDULO VENTAS\n3. SALIR");
            switch (opcion) {
                case "1":
                    fnt_moduloproductos(true);
                    break;
                case "2":
                    fnt_moduloventas(true);
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
