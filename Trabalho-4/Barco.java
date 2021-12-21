
public class Barco {

    protected int mat;
    protected String struct;
    protected String dime;


    public Barco(String stru, String Dim,int mat){
        this.struct=stru;
        this.dime=Dim;
        this.mat=mat;}


    public int getMat() {
        return mat;
    }

    public String getDime() {return dime;}

    public String getStruct() {
        return struct;
    }

    public void setDime(String dime) {this.dime = dime;}

    public void setMat(int mat) {this.mat = mat;}

    public void setStruct(String struct) {this.struct = struct;}

    @Override
    public String toString() {
        return "+---Barco---"
                +"\n|Estrutura= "+struct
                +"\n|Dimensão= "+dime
                +"\n|Matricula= "+mat
                +"\n+--------";
    }
}
