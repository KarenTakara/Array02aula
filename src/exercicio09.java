import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {

        //Escreva um programa em Java que leia e armazene o nome e o salário dos
        //funcionários de uma empresa. Imprima no vídeo o total que a empresa gasta com a
        //folha de pagamento (soma do salário de todos os funcionários) e a média salarial
        //paga aos funcionários. Imprima o nome do funcionario com o maior salario


        int numeroDeFuncionarios;
        double total = 0;
        double maiorSalario = 0;
        int posicao = 0;
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Informe o total de funcionários:");
        numeroDeFuncionarios = sc.nextInt();

        String [] nome = new String [numeroDeFuncionarios];
        double [] salario = new double [numeroDeFuncionarios];


        //ENTRADA DE DADOS
        for (int i =0; i < numeroDeFuncionarios; i++) {               //nao usa length por que ja predefinido o numero
            System.out.println("Informe o nome do funcionario: ");
            nome[i] = sc.next();
            System.out.println("Informe o salário do Sr(a): ");
            salario[i] = sc.nextDouble();
            System.out.println();

            total = total + salario[i];


            if (salario[i] > maiorSalario) {
                maiorSalario = salario[i];
                posicao = i;
            }
        }

        System.out.println("Total da folha de pagamento: " + df.format(total));    //control D - usado para duplicar
        System.out.println("Total da folha de pagamento: " + df.format(total/numeroDeFuncionarios));
        System.out.println("Funcionario com o maior salário: " +nome[posicao]);









    }
}
