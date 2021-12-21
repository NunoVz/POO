
public class Pesca extends Barco {
    private String tipo;

    public Pesca(String stru, String Dim, int mat,String tipo) {
        super(stru, Dim, mat);
        this.tipo=tipo;
    }

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}


    public String toString() {
        return "+---Barco de Pesca---"
                +"\n|Estrutura= "+super.struct
                +"\n|Dimensão= "+super.dime
                +"\n|Matricula= "+super.mat
                +"\n|Tipo de Barco= "+this.tipo
                +"\n+--------";

    }
}
