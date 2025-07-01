package estrutura_de_controle.desafio_dio;

import java.util.Scanner;

public class desafio2 {
    
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Informe o seu peso");

        float peso = scanner.nextInt();

        System.out.println("informe sua altura");

        float altura = scanner.nextFloat();

        float imc = peso/(altura * altura);

        System.out.println("Seu imc é: " + imc);

        if( imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.6 && imc <=24.9) {
            System.out.println("Peso ideal");
        } else if(imc >= 25 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade Grau 1");
        } else if(imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}
