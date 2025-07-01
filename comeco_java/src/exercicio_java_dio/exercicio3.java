package exercicio_java_dio;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a base do triângulo");

        int base = scanner.nextInt();

        System.out.println("Digite a altura do triângulo");

        int altura = scanner.nextInt();

        int area = base * altura;

        System.out.println("A área do quadrado é " + area);
        
        scanner.close();
    }
}
