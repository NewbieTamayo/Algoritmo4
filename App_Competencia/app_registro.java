import java.util.LinkedList;

import javax.swing.JOptionPane;

public class app_registro {
    static LinkedList <cls_registro> clasificacionA = new LinkedList<>();
    static LinkedList <cls_registro> clasificacionB = new LinkedList<>();
    static LinkedList <cls_registro> clasificacionC = new LinkedList<>();
    static cls_registro  obj_registro; //objeto de instancia
    public static void main(String[] args) {
      String nombre= JOptionPane.showInputDialog("Nombre");
      String equipo=JOptionPane.showInputDialog("Equipo");
      String nacionalidad=JOptionPane.showInputDialog("Nacionalidad");
      int puntos = Integer.parseInt(JOptionPane.showInputDialog("Puntos"));
      obj_registro = new cls_registro(nombre,equipo,puntos,nacionalidad);
      if(obj_registro.getResultado()==true){
        if(obj_registro.getPuntos()>=10 && obj_registro.getPuntos()<70)
        {
          clasificacionC.add(obj_registro);
          JOptionPane.showMessageDialog(null, "Clasificación C");
        }
        if(obj_registro.getPuntos()>=70 && obj_registro.getPuntos()<90)
        {
          clasificacionB.add(obj_registro);
          JOptionPane.showMessageDialog(null, "Clasificación B");
        }
        if(obj_registro.getPuntos()>=90 && obj_registro.getPuntos()<100)
        {
          clasificacionA.add(obj_registro);
          JOptionPane.showMessageDialog(null, "Clasificación A");
        }
      }
      else{
        JOptionPane.showMessageDialog(null,"Descaliicado");
      }
    }
}
