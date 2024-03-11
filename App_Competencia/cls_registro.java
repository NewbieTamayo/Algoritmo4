public class cls_registro{
    private String nombreStr;
    private String equipoStr;
    private int puntosInt;
    private String nacionalidadStr;
    private boolean resBln;

    public cls_registro(String n, String e, int p, String nac) {
        this.nombreStr = n;
        this.equipoStr = e;
        this.puntosInt = p;
        this.nacionalidadStr = nac;
        if(this.puntosInt>=0&&this.puntosInt<10){this.resBln=false;}
        else{this.resBln=true;}
    }
    public boolean getResultado(){return this.resBln;}
    public String getNombre(){return this.nombreStr;}
    public String getEequipo(){return this.equipoStr;}
    public int getPuntos(){return this.puntosInt;}
    public String getNacionalidad(){return this.nacionalidadStr;}

 

}