import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {

        //checkpoint

        //Escreva um programa que receba a temperatura média de cada mês do ano passado e
        //armazene-as em uma lista (vetor). Em seguida, calcule a média anual das temperaturas
        //e mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram
        //(mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ).


        Scanner sc = new Scanner(System.in);
        String [] mes = {"Janeiro", "Fevereiro","Março","Abril","Maio","Junho","Julho",
                "Agosto", "Setembro","Outubro","Novembro","Dezembro"};


        double[] temperatura = new double [mes.length];
        double media = 0;


        //Entrada das temperaturas
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Informe a temperatura de" +mes[i]);
            temperatura[i] = sc.nextDouble();

            media = media + temperatura[i];
        }

        //Cálculo da média
        media = media / mes.length;
        System.out.println("Temperatura média anual: " + media);

        for (int i = 0; i < temperatura.length; i++) {

            if (temperatura[i] > media) {
                System.out.println(mes[i] + temperatura[i]);
            }
        }

    }
}

