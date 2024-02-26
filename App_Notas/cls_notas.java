public class cls_notas {
    private String fechaStr;
    private float nota1Flt;
    private float nota2Flt;
    private float nota3Flt;
    private float definitivaFlt;
    private String id_estudianteStr;
    private String asignaturaStr;
    public cls_notas(String fechaStr, float nota1Flt, float nota2Flt, float nota3Flt,String id_estudianteStr, String asignaturaStr) {
        this.fechaStr = fechaStr;
        this.nota1Flt = nota1Flt;
        this.nota2Flt = nota2Flt;
        this.nota3Flt = nota3Flt;
        this.definitivaFlt = (nota1Flt+nota2Flt+nota3Flt)/3;
        this.id_estudianteStr = id_estudianteStr;
        this.asignaturaStr = asignaturaStr;
    }
    public String getFechaStr() {
        return fechaStr;
    }
    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }
    public float getNota1Flt() {
        return nota1Flt;
    }
    public void setNota1Flt(float nota1Flt) {
        this.nota1Flt = nota1Flt;
    }
    public float getNota2Flt() {
        return nota2Flt;
    }
    public void setNota2Flt(float nota2Flt) {
        this.nota2Flt = nota2Flt;
    }
    public float getNota3Flt() {
        return nota3Flt;
    }
    public void setNota3Flt(float nota3Flt) {
        this.nota3Flt = nota3Flt;
    }
    public float getDefinitivaFlt() {
        return definitivaFlt;
    }
    public void setDefinitivaFlt(float definitivaFlt) {
        this.definitivaFlt = definitivaFlt;
    }
    public String getId_estudianteStr() {
        return id_estudianteStr;
    }
    public void setId_estudianteStr(String id_estudianteStr) {
        this.id_estudianteStr = id_estudianteStr;
    }
    public String getAsignaturaStr() {
        return asignaturaStr;
    }
    public void setAsignaturaStr(String asignaturaStr) {
        this.asignaturaStr = asignaturaStr;
    }

    
}
