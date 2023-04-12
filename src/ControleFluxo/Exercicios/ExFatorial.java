package ControleFluxo.Exercicios;

import java.util.Scanner;

public class ExFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. O número deve ser inteiro e positivo.");
        } else {
            int fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.printf("%d! = %d", numero, fatorial);
        }
    }
}