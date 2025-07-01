package exercicio_java_dio;

import java.util.Scanner;

public class exercicio1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");

        String nome = scanner.next();

        System.out.println(nome);

        System.out.println("Digite sua idade");

        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);

        scanner.close();
    }
}
