package estrutura_de_controle.desafio_dio;

import java.util.Scanner;

public class desafio1 {
    
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Escreva um número para fazer a tabuada dele");

        var numero = scanner.nextInt();

        int numero_tabuada = 10;

        for(int i = 0; i<=numero_tabuada; i++) {
               
            int total = numero * i;

            System.out.println(numero + " x "+ i + " = "+ total);;
        }

        scanner.close();
    }
}
