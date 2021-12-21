
public class Recreio extends Barco {
    private int ocupação;

    public Recreio(String stru, String Dim, int mat,int ocu) {
        super(stru, Dim, mat);
        this.ocupação=ocu;}

    public void setOcupação(int ocupação) {this.ocupação = ocupação;}

    public int getOcupação() {return ocupação;}

    public String toString() {
        return "+---Barco de Recreio---"
                +"\n|Estrutura= "+super.struct
                +"\n|Dimensão= "+super.dime
                +"\n|Matricula= "+super.mat
                +"\n|Ocupação Máxima= "+this.ocupação
                +"\n+--------";
    }
}
