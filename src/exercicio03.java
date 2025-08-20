import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        //Escreva um programa que peça as quatro notas de alunos, calcule
        // e armazene num vetor a média de cada aluno, imprima o número de
        // alunos com média maior ou igual a 6.0.


        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int total, aprovados = 0;
        double nota;

        System.out.println("Total de alunos:");
        total = sc.nextInt();

        double[] media = new double[total];

        for(int i = 0; i < media.length; i++) {
            System.out.println("Aluno " + (i+1));

            nota = 0;                                               //i++ diferente de i+1. i++ i recebe 1, ou seja voce muda o valor da variavel
            for(int k = 1; k <= 4; k++) {
                System.out.println("Nota" + k);
                nota += sc.nextDouble();
            }

            media[i] = nota /4;
            System.out.println("\n==================");


        }

        for (int i = 0; i < media.length; i++) {
            System.out.println("Aluno " + (i+1) + df.format(media[i]));

            if (media[i] >= 6) {
                aprovados++;
            }
        }

        System.out.println("Total de alunos aprovados" + aprovados);





    }
}


