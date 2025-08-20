import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {

        //Um array é considerado especial se cada par de seus elementos adjacentes contém
        //dois números com paridades diferentes. Você deverá escrever um programa que leia
        //uma quantidade de elementos e armazene em um array. Em seguida imprima uma
        //mensagem no terminal informando se o array é ou não é especial. Por exemplo: [1] é
        //um array especial; [2, 1, 4] tem dois pares (2, 1) e (1, 4) e é um array especial; [4, 3, 1,
        //6] não é um array especial porque dois números ímpares são adjacentes


        Scanner sc = new Scanner(System.in);
        int total;
        boolean especial = true;

        System.out.println("Informe a quantidade de números:");
        total = sc.nextInt();

        int [] x = new int [total];

        for (int i = 0; i < x.length; i++) {      //nunca colocar <=
            System.out.println("valor:");

            x[i] = sc.nextInt();

        }


        //Verificar se o array é especial ou não
        for(int i = 0; i < x.length-1; i++) {
            if (x[i] % 2 == x[i + 1] % 2) {
                especial = false;
                break;
            }
        }

        if (especial) {
            System.out.println("Array é especial!!");
        }

        else {
            System.out.println("Array não é especial!!");
        }




    }
}
