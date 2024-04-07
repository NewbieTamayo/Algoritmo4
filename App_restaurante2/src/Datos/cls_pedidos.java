package Datos;

public class cls_pedidos {
    private String id_clienteStr;
    private String det_pedidoStr;
    private float totalFlt;
    
    public cls_pedidos(String id, String detalle, float total){
        this.det_pedidoStr = detalle;
        this.id_clienteStr = id;
        this.totalFlt = total;
    }
    
    public String getdetalle(){return this.det_pedidoStr;}
    public String getIdcliente(){return this.id_clienteStr;}
    public float getTotal(){return this.totalFlt;}
}
