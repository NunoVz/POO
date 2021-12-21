import java.util.ArrayList;

public class marina_albufeira {
    //Arrays to store the boats and the license plates
    static ArrayList<Barco> barcos = new ArrayList<>();
    static ArrayList<Integer> Matriculas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("--------------------------------------\n|         Marina de Albufeira        |\n--------------------------------------\n");

        //Generation of Boats
        for (int i = 0; i < 10; i++)
            barcos.add(geraBarco());

        //List of Boats
        for (Barco b : barcos)
            System.out.println(b+"\n");

    }

    public static Barco geraBarco(){
        //Variations of Boats
        String[] str={"Rígido","Semi-rigido"};
        String[] dimen={"Pequeno","Medio","Grande"};
        String[] tp={"Pesca de Cana","Pesca de Rede"};
        String[] arms={"Antiaéreas","antissubmarinas"};

        //Generation of general data
        String stru=str[RandomGenerator(0,1)];
        String dim=dimen[RandomGenerator(0,2)];

        //Generation of the plate number and verification if a boat has that plate number
        int mat=RandomGenerator(100000000,999999999);
        while(VerificaMat(mat))
            mat=RandomGenerator(100000000,999999999);

        //Creation of the boats and generation of specific data for those boats
        Barco x = null;
        switch(RandomGenerator(1,4)){
            case 1 -> x= new Recreio(stru,dim,mat,RandomGenerator(5,35));
            case 2 -> x= new Pesca(stru,dim,mat, tp[RandomGenerator(0,1)]);
            case 3 -> x= new Torpedeiro(stru,dim,mat,RandomGenerator(1,6));
            case 4 -> x= new Fragata(stru,dim,mat,arms[RandomGenerator(0,1)]);
        }
        return x;
    }

    /**
     * Fuction to verify the license plate
     *
     * @param mat the mat
     * @return the boolean
     */
    public static boolean VerificaMat(int mat){
        for (int b : Matriculas) {if (b==mat) return true;}return false;
    }

    /**
     * Random generator of int.
     *
     * @param Min the min
     * @param Max the max
     * @return the int
     */
    public static int RandomGenerator(int Min,int Max){
        return Min + (int)(Math.random() * ((Max - Min) + 1));
    }

}
