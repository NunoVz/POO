import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Introduza um numero positivo e sem algarismos repetidos:");
        Scanner sc = new Scanner(System.in);
        //recebe um numero inteiro
        while (!sc.hasNextInt()) sc.next();
        int num = sc.nextInt();

        //Verifica se o numero possui algarismos repetidos ou se é negativo
        if (num<0){
            System.out.println("Número Inválido");
            System.exit(1);
        }
        else if(!repetidos(num)){
            System.out.println("Número com algarismos repetidos");
            System.exit(1);

        }
        else{
            System.out.println("------------------");
            System.out.println("Desenhando");
            desenha(num);
        }


    }
    static int ocorrencias (int algarismo, int num){
        int contador=-1;int algarismotemp;
        while(num>0){
            //percorre um numero e verifica cada algarismo
            algarismotemp = num%10;
            num/=10;
            //caso os algarismos desse numero coincidam com o algarismo recebido na função aumenta o contador
            if(algarismotemp==algarismo){contador++;}
        }
        return contador;
    }
    static boolean repetidos (int num) {
        int numtemp = num;
        int algarismo;
        while (numtemp > 0) {
            algarismo = numtemp % 10;
            numtemp /= 10;
            if (ocorrencias(algarismo,num)>=1)
                return false;
        }
        return true;
    }

    static void desenha (int num){
        int countdown=9,algarismo,contador=0,contador2=0,Numinverso=0;
        //inverte o numero
        while(num!=0){
            int resto= num%10;
            Numinverso= Numinverso*10 + resto;
            num/=10;
            contador++;
        }
        //Se o algarismo for maior ou igual ao countdown ira ser imprimido um * se não será imprimido um " "
        while (countdown >0){
            int numtemp=Numinverso;
            while (numtemp >0){
                algarismo=numtemp % -10;
                numtemp /= 10;
                if(algarismo<countdown){System.out.print("  ");}
                else{System.out.print("* ");}
            }
            System.out.println();
            countdown--;
        }
        //Percorre o numero inverso e imprime algarismo a algarismo
        while (Numinverso >0){
            algarismo=Numinverso % -10;
            Numinverso /= 10;
            System.out.print(algarismo+" ");
            contador2++;
        }
        //Caso o numero acabe em Zero
        for (int i = 0; i < contador-contador2; i++) {
            System.out.println("0 ");
        }


    }
}
