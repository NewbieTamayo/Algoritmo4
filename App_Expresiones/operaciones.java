import javax.swing.JOptionPane;

public class operaciones {
   private float aFlt;
   private float bFlt;
   private float rFlt;
   private int opInt;

   public operaciones(float a, float b, int o) {

      if (b == 0 && o==4) {
         JOptionPane.showMessageDialog(null, "Operación invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
      } else {

         if (((a >= 0 && a <= 9) && (b >= 0 && b <= 9))) {
            this.aFlt = a;
            this.bFlt = b;
            this.opInt = o;
            switch (opInt) {
               case 1:
                  fnt_suma(a, b);
                  break;
               case 2:
                  fnt_resta(a, b);
                  break;
               case 3:
                  fnt_multiplicacion(a, b);
                  break;
               case 4:
                  fnt_division(a, b);
                  break;
               default:
                  JOptionPane.showMessageDialog(null, "Operación invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
                  break;
            }
         }else{
            JOptionPane.showMessageDialog(null, "Rango invalido (1-9)", "ERROR", JOptionPane.ERROR_MESSAGE);
         }
      }

   }

   private void fnt_suma(float a, float b) {
      this.rFlt = a + b;
   }
   private void fnt_resta(float a, float b) {
      this.rFlt = a - b;
   }
   private void fnt_multiplicacion(float a, float b) {
      this.rFlt = a * b;
   }
   private void fnt_division(float a, float b) {
      this.rFlt = a / b;
   }

   public float getResultado() {
      return this.rFlt;
   }

}
