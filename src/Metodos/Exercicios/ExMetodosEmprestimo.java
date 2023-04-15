package Metodos.Exercicios;

import java.util.Scanner;

public class ExMetodosEmprestimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o valor do empréstimo
        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = scanner.nextDouble();

        // Calcula o valor dos juros
        double juros = calcularJuros(valorEmprestimo);

        // Solicita o número de parcelas
        System.out.print("Digite o número de parcelas: ");
        int numParcelas = scanner.nextInt();

        // Calcula o valor da parcela
        double valorParcela = calcularValorParcela(valorEmprestimo, juros, numParcelas);

        // Exibe o resultado final
        exibirResultado(valorEmprestimo, juros, numParcelas, valorParcela);
    }

    public static double calcularJuros(double valorEmprestimo) {
        double juros;

        if (valorEmprestimo <= 1000) {
            juros = 0.1;
        } else if (valorEmprestimo <= 5000) {
            juros = 0.2;
        } else {
            juros = 0.3;
        }

        return juros;
    }

    public static double calcularValorParcela(double valorEmprestimo, double juros, int numParcelas) {
        double valorTotal = valorEmprestimo * (1 + juros);
        double valorParcela = valorTotal / numParcelas;

        return valorParcela;
    }

    public static void exibirResultado(double valorEmprestimo, double juros, int numParcelas, double valorParcela) {
        System.out.println("Valor do empréstimo: R$ " + valorEmprestimo);
        System.out.println("Juros: " + (juros * 100) + "%");
        System.out.println("Número de parcelas: " + numParcelas);
        System.out.println("Valor da parcela: R$ " + valorParcela);
        System.out.println("Valor total a pagar: R$ " + (valorParcela * numParcelas));
    }
}
