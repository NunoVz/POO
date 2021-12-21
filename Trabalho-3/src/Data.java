/**
 * The type Data.
 */
public class Data {
    private int dia, mes, ano;


    /**
     * Instantiates a new Data.
     *
     * @param dia the dia
     * @param mes the mes
     * @param ano the ano
     */
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Retorna um array de numeros inteiros que correspondem a data.
     *
     * @return the int [ ]
     */
    public int[] getdata(){
        int[] data= new int[3];
        data[0]=this.dia;
        data[1]=this.mes;
        data[2]=this.ano;
        return data;
    }

}
