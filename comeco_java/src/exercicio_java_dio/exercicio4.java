package exercicio_java_dio;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");

        String nome = scanner.next();

        System.out.println("Digite sua idade");

        int idade = scanner.nextInt();

        System.out.println("Seu nome é " + nome + " e sua idade é " + idade);


        System.out.println("Digite seu o nome da segunda pessoa");

        String nome2 = scanner.next();

        System.out.println(nome2);

        System.out.println("Digite a idade da segunda pessoa");

        int idade2 = scanner.nextInt();

        System.out.println("Seu nome é " + nome2 + " e sua idade é " + idade2);

        int diferenca = idade - idade2 ;

        System.out.println("A diferença da idade é "+ diferenca);

        scanner.close();
    }
}
