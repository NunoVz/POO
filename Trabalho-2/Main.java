import java.util.*;

public class Main {
    /**
     * Main
     * @param args
     */
    public static void main(String[] args) {
        int N = 0;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Indique o tamanho da tabela: ");
        //Verifica se é um numero inteiro
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Escreva um numero inteiro maior que 2");
        }
        N = sc.nextInt();

        // Se o numero for menor que 2 o programa acaba
        if (N <= 2)
            System.exit(1);

        //Criação da tabela com N tamanho
        int[] tabela = new int[N];
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Escreva o " + (i + 1) + "ª numero:");

            //Verificação se o numero é inteiro
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Erro!Volte a escrever um numero inteiro");
            }
            int num = sc.nextInt();

            //atribuição a posição i da tabela o valor num
            tabela[i] = num;
        }
        int posi=0, posf=0, stop = 0;
        for (int i = 0; i < tabela.length; i++) {
            for (int j = i + 1; j < tabela.length; j++) {

                //Primeiro Numero desordenado
                if (tabela[i] > tabela[j] && stop == 0) {
                    posi = i;
                    stop = 1;
                }
                //Ultimo numero desordenado
                if (tabela[i] > tabela[j])
                    posf = j+1;

            }
        }
        //Copia da tabela do primeiro numero desordenado a ultimo numero desordenado
        int subtabela[]= Arrays.copyOfRange(tabela,posi,posf);

        //Print da tabela
        System.out.println("Tabela = " + Arrays.toString(tabela));
        //Print da Sub-tabela
        System.out.println("Sub-tabela: \n"+Arrays.toString(subtabela));


    }


}
