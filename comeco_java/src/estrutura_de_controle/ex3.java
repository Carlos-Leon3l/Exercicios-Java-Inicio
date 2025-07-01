package estrutura_de_controle;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        for(int i = 1; i<=10; i++) {
            System.out.println(i);
            System.out.println("Fim da execução");
        }
        scanner.close();
    }
    
}
