public class cls_productos{
private String CodigoStr;	
private String NombreStr;
private int ExistenciasInt;	
private String Fecha_regStr;
private float PrecioFlt;

public cls_productos(String codigoStr, String nombreStr, int existenciasInt, String fecha_regStr, float precioFlt) {
    CodigoStr = codigoStr;
    NombreStr = nombreStr;
    ExistenciasInt = existenciasInt;
    Fecha_regStr = fecha_regStr;
    PrecioFlt = precioFlt;
}

public String getCodigoStr() {
    return CodigoStr;
}

public void setCodigoStr(String codigoStr) {
    CodigoStr = codigoStr;
}

public String getNombreStr() {
    return NombreStr;
}

public void setNombreStr(String nombreStr) {
    NombreStr = nombreStr;
}

public int getExistenciasInt() {
    return ExistenciasInt;
}

public void setExistenciasInt(int existenciasInt) {
    ExistenciasInt = existenciasInt;
}

public String getFecha_regStr() {
    return Fecha_regStr;
}

public void setFecha_regStr(String fecha_regStr) {
    Fecha_regStr = fecha_regStr;
}

public float getPrecioFlt() {
    return PrecioFlt;
}

public void setPrecioFlt(float precioFlt) {
    PrecioFlt = precioFlt;
}




}