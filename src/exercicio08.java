import java.util.Random;

public class exercicio08 {
    public static void main(String[] args) {

        //Escreva um programa em Java que preencha um vetor de 10 posições
        // com número aleatórios inteiros não duplicados.


        Random rd = new Random();   //gerar numero aleatorio
        int [] x = new int [10];    //armazena 10 numeros
        int aux;
        boolean achou;

        for (int i = 0; i < x.length; ) {
            aux = rd.nextInt(15,30);
            achou = false;           //vou iniciar como se o numero nao estivesse la dentro


            for ( int k = 0; k < i; k++) {
                if (x [k] == aux) {       //o numero no k eh igual o numero que esta no i
                    achou = true;
                    break;
                }

            }

            if (achou == false) {
                x[i] = aux;
                System.out.print(x[i] + " ");
                i++;
            }

            //testar com numeros entre 1 e 11 para ter certeza que deu certo


        }










    }
}
