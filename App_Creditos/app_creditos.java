import javax.swing.JOptionPane;

public class app_creditos {
    static cls_creditos[] creditos = new cls_creditos[6];
    static int cantidadcreditosregistrados = 0;

    public static void main(String[] args) {
        fnt_asignarValores();
        fnt_menu(true);
    }

    private static void fnt_asignarValores() {
        for (int i = 0; i < 6; i++) {
            creditos[i] = null;
        }
    }

    private static void fnt_menu(boolean m) {
        while (m == true) {
            String opcionStr = JOptionPane.showInputDialog(null,
                    "1. Agregar credito \n2. Consultar creditos aprobados \n3. Salir");
            if (opcionStr.equals("1")) {
                if (cantidadcreditosregistrados <= 5) {
                    fnt_agregar(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pueden agregar más de 6 creditos");
                }

            }
            if (opcionStr.equals("2")) {
                fnt_consultar( true);
       
            }
            if (opcionStr.equals("3")) {
                m = false;
            }

        }
    }

    private static void fnt_agregar(boolean m) {
    while(m)
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posición donde quieres guardar el credito"));
        if(posicion>=0&&posicion<=5)
        {
            if(creditos[posicion] == null)
            {
                fnt_validarcredito(posicion);
                m=false;
                
            }
            else
        {
            JOptionPane.showMessageDialog(null, "Ya existe un credito registrado en esta posición");
        }

           
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese una posición valida (0-5)");
        }
       
    }
    
    }
    private static void fnt_validarcredito(int posicion)
    {
        String idStr = JOptionPane.showInputDialog(null, "Ingrese la id del cliente");
        String nombreStr = JOptionPane.showInputDialog(null, "Ingrese el nombre del cliente");
        float salarioFlt = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el salario del cliente"));
        float montoFlt = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el monto del credito"));
        int plazoInt = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el plazo del credito"));
        String estadoStr;
        float capacidad = salarioFlt * 60 / 100;
        float cantidadaplazos = montoFlt / plazoInt;

        if(capacidad<cantidadaplazos)
        {
            JOptionPane.showMessageDialog(null, "Credito rechazado, no fue registrado.");
            estadoStr = "F";
        }else{
            estadoStr = "A";
            JOptionPane.showMessageDialog(null, "Credito aprobado, fue registrado con éxito");
            creditos[posicion] = new cls_creditos(idStr, nombreStr, salarioFlt, montoFlt, plazoInt,estadoStr,cantidadaplazos);
            cantidadcreditosregistrados++;
        }
        
    }
    private static void fnt_consultar(boolean m) {
       
        //String idStr = JOptionPane.showInputDialog(null, "Ingrese el id del cliente");
        for (int i = 0; i < 6; i++) {
           /// if (idStr.equals(creditos[i].getIdStr())) {
            if(creditos[i]!=null)
            {
                JOptionPane.showMessageDialog(null,"Posición: "+i+ "\nId: " + creditos[i].getIdStr() +
                "\nNombre: " + creditos[i].getNombreStr() + "\nSalario: " + creditos[i].getSalarioFlt()
                + "\nMonto: " + creditos[i].getMontoFlt() +
                "\nPlazo: " + creditos[i].getPlazoInt() + "\nEstado: " + creditos[i].getEstadoStr()
                + "\nCuota: " + creditos[i].getCuotaStr());
            }
               

           // }
        }
    
    }
}
