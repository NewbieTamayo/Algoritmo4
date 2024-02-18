public class cls_Platos {
    private int var_codigoint;
    private String var_nombrestr;
    private float var_precioflt;
    private String var_tipostr;
    /*
    La clase platos nos permite manipular la información de un plato, consultar, guardar y editar un plato.
    */
    public cls_Platos(int codigo,String nombre,float precio,String tipo)//Metodo constructor
    {
        this.var_codigoint = codigo;
        this.var_nombrestr = nombre;
        this.var_precioflt = precio;
        this.var_tipostr = tipo;
    }
    
    //Metodos getters
    public int get_CodigoInt(){return this.var_codigoint;}
    public String get_NombreStr(){return this.var_nombrestr;}
    public float get_PrecioFlt(){return this.var_precioflt;}
    public String get_TipoStr(){return this.var_tipostr;}
    
    //Metodos seters
    public void setNombreStr(String nombre){this.var_nombrestr = nombre;}
    public void setPrecioFlt(float precio){this.var_precioflt = precio;}
    public void setTipoStr(String tipo){this.var_tipostr = tipo;}
    
}
