package Metodos.Exercicios;/*Calcule as 4 operações básicas:
 soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.*/
import java.util.Scanner;
public class ExMetodosOpMath {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n1;
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();

        double n2;
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();

        String operacao;
        System.out.println("Digite a operação que deseja fazer: ");
        operacao = scanner.next();


        if(operacao.equals("soma")) {
            System.out.println("Resultado: " + somar(n1, n2));
        } else if (operacao.equals("subtracao")) {
            System.out.println("Resultado: " + subtrair(n1, n2));
        } else if (operacao.equals("multiplicacao")) {
            System.out.println("Resultado: " + multiplicar(n1, n2));
        } else if (operacao.equals("divisao")) {
            System.out.println("Resultado: " + dividir(n1, n2));
        } else {
            System.out.println("Por favor escolha uma operação valida. (soma, subtracao, multiplicacao, divisao)");
        }



    }
    public static double somar (double n1,double n2){
        double resultado = n1 + n2;

        return resultado;
    }
    public static double subtrair (double n1,double n2){
        double resultado = n1 - n2;

        return resultado;

    }

    public static double multiplicar (double n1,double n2){
        double resultado = n1 * n2;

        return resultado;

    }

    public static double dividir (double n1,double n2){
        double resultado = n1 / n2;

        return resultado;

    }
}
