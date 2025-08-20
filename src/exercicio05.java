import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {

        // Escreva um programa que leia e armazene números inteiros em um vetor. Em
        //seguida, inverta os elementos inicialmente armazenados. Imprima no terminal os
        //elementos antes e após a inversão.


        Scanner sc = new Scanner(System.in);
        int total, aux;

        System.out.println("Informe o total de numeros:");
        total = sc.nextInt();

        int[] x = new int [total];


        //Entrada de dados
        for (int i = 0; i < x.length; i++) {
            System.out.println("valor:");

            x[i] = sc.nextInt();

        }

        System.out.println("\n Dados antes da inversão");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }


        //Processo de inversão

        for (int i = 0; i < x.length/2; i++) {
            aux = x[i];
            x[1] = x[x.length-1-i];
            x[x.length-1-i] = aux;
        }
        System.out.println("\n Dados depois da inversão");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }








    }
}
