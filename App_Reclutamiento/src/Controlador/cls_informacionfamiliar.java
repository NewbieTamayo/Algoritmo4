package Controlador;
public class cls_informacionfamiliar {
    private String identificacionStr;
    private String nombrecompletoStr;
    private String celularStr;
    private String parentescoStr;
    private String ocupacionStr;

    public cls_informacionfamiliar(String identificacionStr, String nombrecompletoStr, String celularStr,
            String parentescoStr, String ocupacionStr) {
        this.identificacionStr = identificacionStr;
        this.nombrecompletoStr = nombrecompletoStr;
        this.celularStr = celularStr;
        this.parentescoStr = parentescoStr;
        this.ocupacionStr = ocupacionStr;
    }

    public String getIdentificacionStr() {
        return identificacionStr;
    }

    public void setIdentificacionStr(String identificacionStr) {
        this.identificacionStr = identificacionStr;
    }

    public String getNombrecompletoStr() {
        return nombrecompletoStr;
    }

    public void setNombrecompletoStr(String nombrecompletoStr) {
        this.nombrecompletoStr = nombrecompletoStr;
    }

    public String getCelularStr() {
        return celularStr;
    }

    public void setCelularStr(String celularStr) {
        this.celularStr = celularStr;
    }

    public String getParentescoStr() {
        return parentescoStr;
    }

    public void setParentescoStr(String parentescoStr) {
        this.parentescoStr = parentescoStr;
    }

    public String getOcupacionStr() {
        return ocupacionStr;
    }

    public void setOcupacionStr(String ocupacionStr) {
        this.ocupacionStr = ocupacionStr;
    }

}
