package Metodos.Exercicios;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExMetodosHoraDia {

    public static void main(String[] args) {
        // obtém a hora atual do sistema
        LocalTime agora = LocalTime.now();

        // formata a hora para um formato de 24 horas (exemplo: 15:30)
        String horaFormatada = agora.format(DateTimeFormatter.ofPattern("HH:mm"));

        // determina a saudação a partir da hora
        String saudacao = getSaudacao(agora);

        // imprime a saudação
        System.out.println("Agora são " + horaFormatada + " horas. " + saudacao);
    }

    public static String getSaudacao(LocalTime hora) {
        if (hora.isBefore(LocalTime.of(12, 0))) {
            return "Bom dia!";
        } else if (hora.isBefore(LocalTime.of(18, 0))) {
            return "Boa tarde!";
        } else {
            return "Boa noite!";
        }
    }
}
