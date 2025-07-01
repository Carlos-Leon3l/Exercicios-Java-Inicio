package estrutura_de_controle.desafio_dio;

import java.util.Scanner;

public class desafio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var numero = scanner.nextInt();

        var verificar_result = true;
        while (verificar_result) {

            System.out.println(" Informe outro número");
            var numero2 = scanner.nextInt();

            if (numero2 < numero) {
                System.out.println("digite num número maior que o primeiro numero");
                continue;
            }
            
            var resultado = numero2 % numero;
            verificar_result = resultado == 0;
            System.out.printf("%s %% %s = %s", numero2, numero, resultado);
        } 
        scanner.close();
    }
}
