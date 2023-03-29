import java.util.Scanner;

public class ExVogalCons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scanner.next();

        if (letra.length() > 1) {
            System.out.println("Por favor, digite apenas uma letra.");
        } else {
            char ch = letra.charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("A letra é uma vogal!");
            } else {
                System.out.println("A letra é uma consoante!");
            }
        }
    }
}