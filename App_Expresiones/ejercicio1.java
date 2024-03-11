import javax.swing.JOptionPane;

public class ejercicio1 {
    static operaciones obj_operacion;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    private static void fnt_menu(boolean men) {
        
        while (men == true) {
            int o = Integer.parseInt( JOptionPane.showInputDialog(null, "1.Suma\n2.Resta\n3.Multiplicar\n4.Dividir\n5.Salir"));
            if(o==5)
            {
                men=false;
                JOptionPane.showMessageDialog(null, "¡Hasta luego!");
            }
            else{
                int a =Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese el número A (1-9)"));
                int b =Integer.parseInt( JOptionPane.showInputDialog(null,"Ingrese el número B (1-9)"));
                obj_operacion = new operaciones(a, b, o);
                if((a>=1&&a<=9)&&(b>=1&&b<=9))
                {
                    JOptionPane.showMessageDialog(null, "El resultado es: " + obj_operacion.getResultado());
                }
                
            }
     
        }
            
 }
    
}