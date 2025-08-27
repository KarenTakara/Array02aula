import java.util.Random;

public class exercicio10 {
    public static void main(String[] args) {

        //Escrever um programa em Java que preencha um vetor de 10 posições com valores
        //aleatórios. Em seguida, colocar os valores do vetor em ordem crescente. Imprima no
        //vídeo os elementos do vetor antes e após a ordenação


        Random rd = new Random();
        int [] x = new int [10];
        int aux;


        // Antes da ordenação
        System.out.println("Antes da ordenação");

        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(55);
            System.out.print(x[i] + " ");
        }


        //Processo de ordenação --> ordem crescente

        for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length -1; i++) {
                if (x[i] > x[i +1]) {
                    aux = x[i];
                    x[i] = x [ i +1];
                    x[i +1] = aux;
                }
            }
        }


        //Impressão após a ordenação
        System.out.println("\nDepois da ordenação");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
