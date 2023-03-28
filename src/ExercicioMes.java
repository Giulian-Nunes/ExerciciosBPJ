import java.util.Scanner;

public class ExercicioMes {

     /*criar um simples projeto em java com if  que exiba
     o mes do ano de acordo com seu  numero, evite o efeito flecha,
     faça outro if que verifique se o mes eh julho, dezembro ou janeiro,
     para assim exibir o texto "ferias"*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 12 para representar o mês do ano:");
        int mes = sc.nextInt();
        sc.close();

        if (mes >= 1 && mes <= 12) {
            String nomeMes = "";
            if (mes == 1) {
                nomeMes = "Janeiro";
            } else if (mes == 2) {
                nomeMes = "Fevereiro";
            } else if (mes == 3) {
                nomeMes = "Março";
            } else if (mes == 4) {
                nomeMes = "Abril";
            } else if (mes == 5) {
                nomeMes = "Maio";
            } else if (mes == 6) {
                nomeMes = "Junho";
            } else if (mes == 7) {
                nomeMes = "Julho";
            } else if (mes == 8) {
                nomeMes = "Agosto";
            } else if (mes == 9) {
                nomeMes = "Setembro";
            } else if (mes == 10) {
                nomeMes = "Outubro";
            } else if (mes == 11) {
                nomeMes = "Novembro";
            } else if (mes == 12) {
                nomeMes = "Dezembro";
            }

            System.out.println("O mês correspondente ao número " + mes + " é " + nomeMes + ".");

            if (mes == 7 || mes == 12 || mes == 1) {
                System.out.println("Férias!");
            }
        } else {
            System.out.println("Número inválido. O número deve estar entre 1 e 12.");
        }
    }
}