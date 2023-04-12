package ControleFluxo.Exercicios;

import java.util.Scanner;

//Escreva um programa em Java que receba a idade de uma pessoa e
// verifique se ela pode votar ou não.


public class ExVoto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        boolean escolhaValida = false;
        boolean tituloEleitor = false;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        while (!escolhaValida) {
            System.out.println("Você possui título de eleitor? (sim/não)");
            String escolha = scanner.next();

            if (escolha.equalsIgnoreCase("sim")) {
                escolhaValida = true;
                tituloEleitor = true;
                break;
            } else if (escolha.equalsIgnoreCase("nao")) {
                escolhaValida = true;

                break;
            } else {
                System.out.println("Opção inválida, por favor escolha sim ou não");
            }
        }

        if (idade >= 16 && tituloEleitor){

            System.out.println("Você está apto a votar!");

        }
        else {
            System.out.println("Você não está apto a votar!");
        }

    }
}