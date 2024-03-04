package Controlador;
public class cls_informacionpersonal {
    private String identificacionStr;
    private String nombreStr;
    private String apellidoStr;
    private String celularStr;
    private String correoStr;
    private String direccionStr;
    private String fechanacimientoStr;
    private String descripcionperfilStr;

    public cls_informacionpersonal(String identificacionStr, String nombreStr, String apellidoStr, String celularStr,
            String correoStr, String direccionStr, String fechanacimientoStr, String descripcionperfilStr) {
        this.identificacionStr = identificacionStr;
        this.nombreStr = nombreStr;
        this.apellidoStr = apellidoStr;
        this.celularStr = celularStr;
        this.correoStr = correoStr;
        this.direccionStr = direccionStr;
        this.fechanacimientoStr = fechanacimientoStr;
        this.descripcionperfilStr = descripcionperfilStr;
    }

    public String getIdentificacionStr() {
        return identificacionStr;
    }

    public void setIdentificacionStr(String identificacionStr) {
        this.identificacionStr = identificacionStr;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getApellidoStr() {
        return apellidoStr;
    }

    public void setApellidoStr(String apellidoStr) {
        this.apellidoStr = apellidoStr;
    }

    public String getCelularStr() {
        return celularStr;
    }

    public void setCelularStr(String celularStr) {
        this.celularStr = celularStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public String getDireccionStr() {
        return direccionStr;
    }

    public void setDireccionStr(String direccionStr) {
        this.direccionStr = direccionStr;
    }

    public String getFechanacimientoStr() {
        return fechanacimientoStr;
    }

    public void setFechanacimientoStr(String fechanacimientoStr) {
        this.fechanacimientoStr = fechanacimientoStr;
    }

    public String getDescripcionperfilStr() {
        return descripcionperfilStr;
    }

    public void setDescripcionperfilStr(String descripcionperfilStr) {
        this.descripcionperfilStr = descripcionperfilStr;
    }

    
}