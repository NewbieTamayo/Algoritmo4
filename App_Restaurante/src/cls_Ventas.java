import java.time.LocalDateTime;
public class cls_Ventas {
    private int var_codigoint;
    private int var_cantidadint;
    private float var_totalflt;
    private LocalDateTime var_fechastr;
     /*
    La clase ventas nos permite manipular la información de las ventas, registrar una venta, almacenarlas en un arreglo de objetos y
    por último poder generar un reporte con todos los datos de todas las ventas que se hagan.
    */
    public cls_Ventas(int codigo, int cantidad,  float total, LocalDateTime fecha)
    {
        this.var_codigoint = codigo;
        this.var_cantidadint = cantidad;
        this.var_totalflt = total;
        this.var_fechastr = fecha;
    }
    
    //Metodos getter
    public int get_CodigoInt(){return this.var_codigoint;}
    public int get_CantidadInt(){return this.var_cantidadint;}
    public float get_TotalFlt(){return this.var_totalflt;}
    public LocalDateTime get_FechaStr(){return this.var_fechastr;}
    //Metodos setter
    public void setCodigoInt(int codigo){this.var_codigoint = codigo;}
    public void setCantidadInt(int cantidad){this.var_cantidadint = cantidad;}
    public void setTotalFlt(float total){this.var_totalflt = total;}
    public void setFechaStr(LocalDateTime fecha){this.var_fechastr = fecha;}
    
   
}
