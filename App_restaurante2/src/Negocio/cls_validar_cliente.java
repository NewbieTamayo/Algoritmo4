package Negocio;

import javax.swing.JOptionPane;

public class cls_validar_cliente {
    private boolean val = false;
    private String msn;
    
    public void validarDatosEntrada(
    String id, String n, String contacto, String correo
    ){
        if(id.equals("")||n.equals("")||contacto.equals("")||correo.equals("")){
            this.msn = "Debe ingresar todos los datos";
        }else{
            this.val = true;
            this.msn = "El cliente "+n+" ha sido registrado con éxito";
        }
    }
    
    public String getMsn(){return this.msn;}
    public boolean getVal(){return this.val;}
}
