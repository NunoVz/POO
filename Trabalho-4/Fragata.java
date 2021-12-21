public class Fragata extends Marinha{
    private String tipo;

    public Fragata(String stru, String Dim, int mat,String tip) {
        super(stru, Dim, mat);
        this.tipo=tip;}

    public String getTipo() {return tipo;}

    public void setTipo(String tipo) {this.tipo = tipo;}

    public String toString() {
        return "+---Fragata---"
                +"\n|Estrutura= "+super.struct
                +"\n|Dimensão= "+super.dime
                +"\n|Matricula= "+super.mat
                +"\n|Tipo de armas= "+ this.tipo
                +"\n+--------";

    }
}
