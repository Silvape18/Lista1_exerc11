import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);

       int ni1, ni2;
       Double nreal;
       double resultado1, resultado2, resultado3;
       
       System.out.println("Por Favor, Digite um numero inteiro: ");
       ni1 = entrada.nextInt();
       System.out.println("Por Favor, digite um segundo numero inteiro: ");
       ni2 = entrada.nextInt();
       System.out.println("Por Favor, Digite um numero real: ");
       nreal = entrada.nextDouble();

       resultado1 = ni1 * 2 + ni2/2;
       resultado2 = ni1 * 3 + nreal;
       resultado3 = (nreal * nreal);

       System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + resultado1);
       System.out.println("A soma do triplo  do primeiro com terceiro é: " + resultado2);
       System.out.println("o terceito elevado ao cubo é: " + resultado3);




    }
}
