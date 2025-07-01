package exercicio_java_dio;

import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida do lado de um quadrado");

        int lado = scanner.nextInt();

        int area = lado * lado;

        System.out.println("A área do quadrado é " + area);

        scanner.close();
    }
}
