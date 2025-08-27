import java.util.Random;

public class exemplo02 {
    public static void main(String[] args) {

        Random rd = new Random();

        /*double aux = Math.random()*10;    //control shift e barra para fazer um comentario
        int valor = (int)aux;
        System.out.println(aux);
        System.out.println(valor);*/

        int x = rd.nextInt(-2, 100);   //origin eh o minimo e o bound o maximo, porém, lembre-se que ele nunca sera 100
        System.out.println(x);                      // sera gerado um numero entre -1 a 99



    }
}
