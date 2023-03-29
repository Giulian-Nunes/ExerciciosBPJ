import java.util.Scanner;

//Escreva um programa em Java que receba três números e determine qual é o maior.
public class ExNumMaior {
    public static void main(String[] args) {
        int maior;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int n3 = scanner.nextInt();

        if (n1 > n2)
            maior = n1;
         else if (n2 > n3)
            maior = n2;
         else
             maior = n3;

        System.out.println("O maior número é: " +maior);


    }
}
