package     desafios_logica;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lendo a entrada do usuário
        String url = scanner.nextLine();
        
        // TODO: Normalize a URL: removendo espaços e convertendo para minúsculas
        String urlFormatada = url.toLowerCase().strip();
        
        
        // TODO: Exiba a URL normalizada
        System.out.println(urlFormatada);
        
        scanner.close();
    }
}
