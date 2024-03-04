package Controlador;
public class cls_informacionlaboral {
    private String identificacionStr;
    private String empresaStr;
    private String cargoStr;
    private String tiempoStr;
    private String direccionStr;
    private String telefonoStr;
    private String emailStr;
    private String funcionesStr;

    public cls_informacionlaboral(String identificacionStr, String empresaStr, String cargoStr, String tiempoStr
            , String direccionStr, String telefonoStr, String emailStr, String funcionesStr) {
        this.identificacionStr = identificacionStr;
        this.empresaStr = empresaStr;
        this.cargoStr = cargoStr;
        this.tiempoStr = tiempoStr;
        this.direccionStr = direccionStr;
        this.telefonoStr = telefonoStr;
        this.emailStr = emailStr;
        this.funcionesStr = funcionesStr;
    }

    public String getIdentificacionStr() {
        return identificacionStr;
    }

    public void setIdentificacionStr(String identificacionStr) {
        this.identificacionStr = identificacionStr;
    }

    public String getEmpresaStr() {
        return empresaStr;
    }

    public void setEmpresaStr(String empresaStr) {
        this.empresaStr = empresaStr;
    }

    public String getCargoStr() {
        return cargoStr;
    }

    public void setCargoStr(String cargoStr) {
        this.cargoStr = cargoStr;
    }

    public String getTiempoStr() {
        return tiempoStr;
    }

    public void setTiempoStr(String tiempoStr) {
        this.tiempoStr = tiempoStr;
    }

   
    public String getDireccionStr() {
        return direccionStr;
    }

    public void setDireccionStr(String direccionStr) {
        this.direccionStr = direccionStr;
    }

    public String getTelefonoStr() {
        return telefonoStr;
    }

    public void setTelefonoStr(String telefonoStr) {
        this.telefonoStr = telefonoStr;
    }

    public String getEmailStr() {
        return emailStr;
    }

    public void setEmailStr(String emailStr) {
        this.emailStr = emailStr;
    }

    public String getFuncionesStr() {
        return funcionesStr;
    }

    public void setFuncionesStr(String funcionesStr) {
        this.funcionesStr = funcionesStr;
    }



}
