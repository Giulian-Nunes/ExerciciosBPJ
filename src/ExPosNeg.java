import java.util.Scanner;

//Escreva um programa em Java que receba um número inteiro e verifique se ele é positivo,
// negativo ou zero.
public class ExPosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Digite um número inteiro: ");
        n = scanner.nextInt();
        if (n > 0) {
            System.out.println("Positivo");
        } else if (n < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }
    }

}
