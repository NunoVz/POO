import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * The type Gerenciar biblioteca.
 */
public class Gerenciar_Biblioteca {
    /**
     * The constant DATE_FORMAT.
     */
    final static String DATE_FORMAT = "dd-MM-yyyy";

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Gerir_Emprestimos.criar_dados();
        while(true) {
            if(menu()==4)
                System.exit(1);
        }

    }

    /**
     * Menu do programa.
     *
     * @return the int
     */
    public static int menu() {
        System.out.print("O que deseja fazer?\n\t1-Mostrar livros disponiveis\n\t2-Mostrar livros requesitados\n\t3-Requesitar um livro\n\t4-Exit\nInsira um numero entre 1 e 3: ");
        int num;
        Scanner sc = new Scanner(System.in);
        while ((!sc.hasNextInt())) {
            sc.next();
            System.out.print("Escreva um numero entre 1 e 3");
        }
        num = sc.nextInt();
        switch(num) {
            case 1:
                Gerir_Emprestimos.listaLivrosDisponiveis();
                break;
            case 2:
                Data d = data();
                Gerir_Emprestimos.listaRequisitados(d);
                break;
            case 3:
                System.out.println("-----Insira a data de Requesição-----");
                Data d1 = data();
                System.out.println("-----Insira a data de Entrega-----");
                Data d2 = data();
                while (!VerificarDatasMaior(d1, d2)) {
                    System.out.println("Data de entrega errada, insira uma nova por favor!");
                    d2 = data();
                }

                System.out.println("Escolha o seu cartão de Leitor:");
                for (int i = 0; i < Gerir_Emprestimos.getArrayLeitor().size(); i++) {
                    System.out.println("\t" + i + " -> " + Gerir_Emprestimos.getArrayLeitor().get(i).getNome());
                }
                System.out.print("Insira o numero do seu leitor:");
                while ((!sc.hasNextInt())) {
                    sc.next();
                    System.out.println("Escreva um numero entre os valores apresentados");
                }
                int l = sc.nextInt();
                System.out.println("Leitor " + Gerir_Emprestimos.getArrayLeitor().get(l).getNome() + " selecionado");

                Leitor leitor = Gerir_Emprestimos.getArrayLeitor().get(l);
                Requesicao Req = Gerir_Emprestimos.requestitaLivro(leitor, d1, d2);
                Gerir_Emprestimos.setArrayReq(Req);
                break;
        }
        return num;
    }

    /**
     * Metodo para receber a data.
     *
     * @return the data
     */
    public static Data data(){
        Scanner sc = new Scanner(System.in);
        int[] datas = new int[3];
        System.out.println("Por favor insira a data");

        do{
            System.out.print("\tInsira o ano:");
            while ((!sc.hasNextInt())) {sc.next();System.out.print("Ano incorreto, insira outra vez:");}
            datas[2]=sc.nextInt();
        }while (datas[2]<0);

        do{
            System.out.print("\tInsira o mes:");
            while ((!sc.hasNextInt())) {sc.next();System.out.print("Mes incorreto, insira outra vez");}
            datas[1]=sc.nextInt();
        }while (datas[1]<=0 || datas[1]>12);

        do{
            System.out.print("\tInsira o dia:");
            while ((!sc.hasNextInt())) {sc.next();System.out.print("Dia incorreto, insira outra vez");}
            datas[0]=sc.nextInt();
        }while (!verificadata(datas[2],datas[1],datas[0]));

        return new Data(datas[0], datas[1], datas[2]);
    }

    /**
     * Verifica se a data é o possivel.
     *
     * @param year  the year
     * @param month the month
     * @param day   the day
     * @return the boolean
     */
    public static boolean verificadata(int year, int month, int day) {
        try {
            DateFormat df = new SimpleDateFormat(DATE_FORMAT);
            df.setLenient(false);
            df.parse(day + "-" + month + "-" + year);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    /**
     * Verifica se uma data é mais cedo do que a outra.
     * Se o 1º parametro for mais recente que o 2º devolve falso
     *
     * @param Req the req
     * @param Ent the ent
     * @return the boolean
     */
    public static boolean VerificarDatasMaior(Data Req, Data Ent) {
        int[] dataReq =Req.getdata();
        int[] dataEnt =Ent.getdata();
        if (dataEnt[2]>dataReq[2]){
            return true;
        }
        else if (dataEnt[2]==dataReq[2] && dataEnt[1]>dataReq[1]){
            return true;
        }
        else return dataEnt[2] == dataReq[2] && dataEnt[1] == dataReq[1] && dataEnt[0] > dataReq[0];

    }
}
