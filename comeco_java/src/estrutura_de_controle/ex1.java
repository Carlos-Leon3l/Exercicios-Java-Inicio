package estrutura_de_controle;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        
        var nome = scanner.nextLine();

        System.out.println("informa sua idade");
        
        var idade = scanner.nextInt();

        var podeDirigir = (idade >= 18) || ( idade >= 16);

        var message  = podeDirigir ? 
            nome + ", você pode dirigir" : 
            nome + ", você não pode dirigir";

        System.out.println(message);

        scanner.close();
    }
}
