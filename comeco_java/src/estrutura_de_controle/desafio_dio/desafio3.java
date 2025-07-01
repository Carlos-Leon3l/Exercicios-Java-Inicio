package estrutura_de_controle.desafio_dio;

import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        var numero1 = scanner.nextInt();

        System.out.println("Digite outro número que seja maior que o primeiro: ");
        var numero2 = scanner.nextInt();

        System.out.println("Você que fazer a conta de número impar ou par?");

        var escolha = scanner.next();

        if( escolha.equals("par")){
            System.out.println("passou aqui");
            for(int i = numero2; i>= numero1; i--) {
                if(i % 2 == 0) {
                    System.out.println(i);
                } 
            }

        }

        if( escolha.equals("impar")){
            System.out.println("passou aqui");
            for(int i = numero2; i>= numero1; i--) {
                if(i % 2 == 1) {
                    System.out.println(i);
                } 
            }

        }

        scanner.close();

    }
}
