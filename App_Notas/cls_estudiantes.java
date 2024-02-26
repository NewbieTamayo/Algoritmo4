public class cls_estudiantes{
    private int idInt;
    private String nombreStr;
    private String contactoStr;
    private String correoStr;
    private String programaStr;
    private String semestreStr;

    public cls_estudiantes (int idInt,String nombreStr,String contactoStr, String correoStr, String programaStr,String semestreStr)
    {
        this.idInt = idInt;
        this.nombreStr = nombreStr;
        this.contactoStr = contactoStr;
        this.correoStr = correoStr;
        this.programaStr = programaStr;
        this.semestreStr = semestreStr;
    }

    public int getIdInt() {
        return idInt;
    }

    public void setIdInt(int idInt) {
        this.idInt = idInt;
    }

    public String getNombreStr() {
        return nombreStr;
    }

    public void setNombreStr(String nombreStr) {
        this.nombreStr = nombreStr;
    }

    public String getContactoStr() {
        return contactoStr;
    }

    public void setContactoStr(String contactoStr) {
        this.contactoStr = contactoStr;
    }

    public String getCorreoStr() {
        return correoStr;
    }

    public void setCorreoStr(String correoStr) {
        this.correoStr = correoStr;
    }

    public String getProgramaStr() {
        return programaStr;
    }

    public void setProgramaStr(String programaStr) {
        this.programaStr = programaStr;
    }

    public String getSemestreStr() {
        return semestreStr;
    }

    public void setSemestreStr(String semestreStr) {
        this.semestreStr = semestreStr;
    }


    
}