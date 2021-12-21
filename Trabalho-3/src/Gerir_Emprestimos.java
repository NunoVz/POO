import java.util.ArrayList;
import java.util.Scanner;

/**
 * The type Gerir emprestimos.
 * Controla o sistema de requisições da biblioteca
 */
public class Gerir_Emprestimos {
    private static ArrayList<Livro> livro = new ArrayList<>();
    private static ArrayList<Leitor> leitor = new ArrayList<>();
    private static ArrayList<Requesicao> requesitados = new ArrayList<>();

    /**
     * Gera dados para o sistema da biblioteca.
     */
    public static void criar_dados() {
        livro.add(new Livro("O moelas", "Igor"));
        livro.add(new Livro("ola", "xau"));
        livro.add(new Livro("O moelas 23", "Igor"));
        leitor.add(new Leitor("Nuno Vasques", 1234));
        leitor.add(new Leitor("Maria Bastoneta", 23123));
        leitor.add(new Leitor("Antonio Bastão", 12332));
    }


    /**
     * Mostra todos os livros requisitados.
     *
     * @param d the d
     */
    public static void listaRequisitados(Data d) {
        for (Requesicao b : requesitados)
            if (Gerenciar_Biblioteca.VerificarDatasMaior(b.getDataReq(), d) && Gerenciar_Biblioteca.VerificarDatasMaior(d, b.getDataDev()))
                System.out.println(b.getBook());
        }


    /**
     * Lista livros disponiveis.
     */
    public static void listaLivrosDisponiveis(){
        for (Livro b : livro) {System.out.println(b);}
    }

    /**
     * Requestita livro requesicao.
     *Recebe um livro e duas datas uma de requesição e uma de devolução
     * @param l     the l
     * @param dtReq the dt req
     * @param dtDev the dt dev
     * @return the requesicao
     */
    static Requesicao requestitaLivro(Leitor l, Data dtReq, Data dtDev){
         Scanner sc= new Scanner(System.in);
         System.out.print("Insira o Titulo do livro:");
         String tit= sc.nextLine();
         System.out.print("Insira o Autor do livro:");
         String aut= sc.nextLine();
         Requesicao r = null;
         int found=0;
         for (Livro b : livro) {
             if(b.getTitulo().equals(tit) && b.getAutor().equals(aut)){
                 livro.remove(b);
                 found=1;
                 r= new Requesicao(b,l,dtReq,dtDev);
             }
         }
         if(found==0)
             System.out.println("Não possuimos o seu livro!");

         return r;
    }


    /**
     * Adiciona a lista de arrays de requesições a nova requesição.
     *
     * @param l the l
     */
    public static void setArrayReq(Requesicao l){
        if (l!=null)
            requesitados.add(l);
    }


    /**
     * Devolve o Leitor.
     *
     * @return the array list
     */
    public static ArrayList<Leitor> getArrayLeitor(){
        return leitor;
    }


}

