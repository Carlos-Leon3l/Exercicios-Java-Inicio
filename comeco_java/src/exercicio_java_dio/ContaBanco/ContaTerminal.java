package exercicio_java_dio.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        String nomeCli;
        String agencia;
        int numAgencia;
        float saldo;

        Scanner scanner = new Scanner(System.in);   

        System.out.println("Insira seu nome completo");

        nomeCli = scanner.nextLine();

        System.out.println("Insira sua Agência ex:067-8");

        agencia = scanner.nextLine();

        System.out.println("Insira seu saldo ex: 1295,57");

        saldo = scanner.nextFloat();

        System.out.println("Por favor, digite o número da agência!");

        numAgencia = scanner.nextInt();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque", nomeCli, agencia, numAgencia, saldo);

        scanner.close();
    }

}
