package estrutura_de_controle;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Informe um número de 1 até 7");

        var option = scanner.nextInt();

        var message = switch (option){
            case 1 -> "Segunda";
            case 2 -> "Terça";
            case 3 -> "Qaurta";
            case 4 -> "Quinta";
            case 5 -> "Sexta";
            case 6, 7 -> {
                var day = option == 6 ? "sabado :D" : "domingo a noite :c";
                yield String.format("E %s, ainda é fim de semana", day);
            }
            default -> "opção invalida";
        };

        System.out.println(message);

        scanner.close();
    }
}
