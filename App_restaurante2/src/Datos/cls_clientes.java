package Datos;

public class cls_clientes {
    private String idStr;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private int estadoInt;//0: Inactivo - 1: Activo
    
    public cls_clientes(String id,String n,String co,String cor){
        this.idStr = id;
        this.nombreStr = n;
        this.contactoStr = co;
        this.correoStr = cor;
        this.estadoInt = 0;  
    }
    
    public int getEstado(){return this.estadoInt;}
    public void setEstado(int e){this.estadoInt = e;}
    public String getIdStr(){return idStr;}
    public String getNombreStr(){return nombreStr;}
    public String getcontactoStr(){return contactoStr;}
    public String getcorreoStr(){return correoStr;}
}
