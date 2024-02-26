public class cls_ventas{
private String FechaStr;
private String Cod_productoStr;
private int CantidadInt;
private float SubtotalFlt;
private float IvaFlt;
private float TotalFlt;

public cls_ventas(String fechaStr, String cod_productoStr, int cantidadInt,float SubtotalFlt) {
    this.FechaStr = fechaStr;
    this.Cod_productoStr = cod_productoStr;
    this.CantidadInt = cantidadInt;
    this.SubtotalFlt = SubtotalFlt;
    this.IvaFlt = SubtotalFlt*19/100;
    this.TotalFlt = SubtotalFlt+IvaFlt;
}
public String getFechaStr() {
    return FechaStr;
}
public void setFechaStr(String fechaStr) {
    FechaStr = fechaStr;
}
public String getCod_productoStr() {
    return Cod_productoStr;
}
public void setCod_productoStr(String cod_productoStr) {
    Cod_productoStr = cod_productoStr;
}
public int getCantidadInt() {
    return CantidadInt;
}
public void setCantidadInt(int cantidadInt) {
    CantidadInt = cantidadInt;
}
public float getSubtotalFlt() {
    return SubtotalFlt;
}
public void setSubtotalFlt(float subtotalFlt) {
    SubtotalFlt = subtotalFlt;
}
public float getIvaFlt() {
    return IvaFlt;
}
public void setIvaFlt(float ivaFlt) {
    IvaFlt = ivaFlt;
}
public float getTotalFlt() {
    return TotalFlt;
}
public void setTotalFlt(float totalFlt) {
    TotalFlt = totalFlt;
}



}