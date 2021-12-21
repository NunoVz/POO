public class Torpedeiro extends Marinha{
    private int torpedos;

    public Torpedeiro(String stru, String Dim, int mat,int torp) {
        super(stru,Dim,mat);
        this.torpedos=torp;}

    public void setTorpedos(int torpedos) {this.torpedos = torpedos;}

    public int getTorpedos() {return torpedos;}

    public String toString() {
        return "+---Torpedeiro---"
                +"\n|Estrutura= "+super.struct
                +"\n|Dimensão= "+super.dime
                +"\n|Matricula= "+super.mat
                +"\n|Torpedos= "+ this.torpedos
                +"\n+--------";
    }
}
