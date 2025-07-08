package desafios_logica;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Lendo a string (nome)
        String nome = scanner.nextLine().toLowerCase();

        // Lendo o número inteiro (ID)
        int id = scanner.nextInt();

        // TODO: Formate o identificador (minúsculas e sem espaços):
        String identificador = nome + "-" + id;
    
        // TODO: Exiba o resultado:
        System.out.println(identificador);

        // Fechando o scanner
        scanner.close();
    }
}
