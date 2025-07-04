package tratativas_excessoes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import tratativas_excessoes.dao.UserDAO;
import tratativas_excessoes.exception.CustomException;
import tratativas_excessoes.exception.EmptyStorageException;
import tratativas_excessoes.exception.UserNotFoundExcception;
import tratativas_excessoes.exception.ValidatorException;
import tratativas_excessoes.model.MenuOption;
import tratativas_excessoes.model.UserModel;
import tratativas_excessoes.Validator.UserValidator;

public class MainUser {
    
    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        while (true) {
            System.out.println("Bem vindo ao cadastro de usuários, selecione uma operação ");

            System.out.println("1- Cadastrar");
            System.out.println("2- Atualizar");
            System.out.println("3- Excluir");
            System.out.println("4- Buscar por identificador");
            System.out.println("5- Listar");
            System.out.println("6- Sair");
            var userInput = scanner.nextInt();

            var selectedOption = MenuOption.values()[userInput - 1];

            switch (selectedOption) {
                case SAVE -> { 
                    try{
                        var user = requestToSave();
                        dao.save(user);
                        System.out.println("O usuario "+ user + " foi salvo");
                    } catch (CustomException ex){
                        System.out.println(ex.getMessage());
                        ex.printStackTrace();
                    }
                }
                case UPDATE -> {
                    try {

                    dao.update(requestToUpdate());
                    System.out.println("O usuario foi atualizado");
                    } catch (UserNotFoundExcception | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    } catch (CustomException ex) {
                        System.out.println(ex.getMessage());
                    }

                }   
                case DELETE -> {
                    try {
                        dao.delete(requestId());
                        System.out.println("O usuario foi excluido");
                    } catch (UserNotFoundExcception | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                    
                }

                case FIND_BY_ID -> {
                    try {
                        var id = requestId();
                        var user = dao.findById(id);
                        System.out.println("Usuario com id :"+ id);
                        System.out.println(user);
                    } catch (UserNotFoundExcception | EmptyStorageException ex){
                        System.out.println(ex.getMessage());
                    }
                    
                }
                case FIND_ALL ->  {
                    var users=dao.findAll();                    
                    System.out.println("Usuarios cadastrados:");
                    users.forEach(System.out::println);
                }   
                case EXIT -> System.exit(0);

            }
            
        }

        

    }
    private static long requestId() {
        System.out.println("Informe o identificador do usuário");
        return scanner.nextLong();

    }
    private static UserModel requestToSave(){
        System.out.println("Informe o nome do usuario");
        var name = scanner.next();
        System.out.println("Infor o email do usuario");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário (DD/MM/YYYY)");
        var datanascString = scanner.next();
        var formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var datanasc = LocalDate.parse(datanascString, formato);
        return ValidateInput(0, name, email, datanasc);
    }

    private static UserModel ValidateInput(final long id, final String name, final String email, final LocalDate datanasc){
        try {
            var user = new UserModel(0, name, email, datanasc);
            UserValidator.VerificarModel(user);
        return user;
        } catch(ValidatorException ex) {
            throw new CustomException("O seu usuario contém erros"+ ex.getMessage(), ex);
        }
    }

    private static UserModel requestToUpdate(){
        System.out.println("informe o identificador do usuário");
        var id = scanner.nextLong();
        System.out.println("Informe o nome do usuario");
        var name = scanner.next();
        System.out.println("Infor o email do usuario");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário (DD/MM/YYYY)");
        var datanascString = scanner.next();
        var formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var datanasc = LocalDate.parse(datanascString, formato);
        return ValidateInput(id, name, email, datanasc);
    }

}
