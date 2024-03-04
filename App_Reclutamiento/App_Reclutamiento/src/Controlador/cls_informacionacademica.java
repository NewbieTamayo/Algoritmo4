package Controlador;
public class cls_informacionacademica {
    private String identificacionStr;
    private String nombreinstitucionStr;
    private String tituloStr;
    private String añogradoStr;
    private String nivelStr;
    private String contactoStr;

    public cls_informacionacademica(String identificacionStr, String nombreinstitucionStr, String tituloStr,
            String añogradoStr, String nivelStr, String contactoStr) {
        this.identificacionStr = identificacionStr;
        this.nombreinstitucionStr = nombreinstitucionStr;
        this.tituloStr = tituloStr;
        this.añogradoStr = añogradoStr;
        this.nivelStr = nivelStr;
        this.contactoStr = contactoStr;
    }

    public String getIdentificacionStr() {
        return identificacionStr;
    }

    public void setIdentificacionStr(String identificacionStr) {
        this.identificacionStr = identificacionStr;
    }

    public String getNombreinstitucionStr() {
        return nombreinstitucionStr;
    }

    public void setNombreinstitucionStr(String nombreinstitucionStr) {
        this.nombreinstitucionStr = nombreinstitucionStr;
    }

    public String gettituloStr() {
        return tituloStr;
    }

    public void settituloStr(String tituloStr) {
        this.tituloStr = tituloStr;
    }

    public String getAñogradoStr() {
        return añogradoStr;
    }

    public void setAñogradoStr(String añogradoStr) {
        this.añogradoStr = añogradoStr;
    }

    public String getNivelStr() {
        return nivelStr;
    }

    public void setNivelStr(String nivelStr) {
        this.nivelStr = nivelStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

}