package conceitos1;
public class Main extends Manager {
    public static void main(String[] args) {  

        Employe employe = new Employe();
        Salesman salesman = new Salesman();
        Manager manager = new Manager();
        
        System.out.println(employe instanceof Employe);
        System.out.println(salesman instanceof Employe);
        System.out.println(manager instanceof Employe);
        System.out.println(employe instanceof Manager);
        //System.out.println(manager instanceof Salesman); // não existe realação de herança
    }
    public static void printEmployee(Employe employe){
        switch (employe) {
            case Manager manager -> {
                manager.setName("Carlos");
                manager.setLogin("car@gmail.com");
                manager.setCode("344");
                manager.setPassword("1234");
                manager.setSalary(2000);
                manager.setComission(1000);
                manager.setAddress("SP");
                manager.setAge(20);

                System.out.println(manager.getClass());
                System.out.println(manager.getName());
                System.out.println(manager.getCode());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getSalary());
                System.out.println(manager.getComission());
                System.out.println(manager.getAddress());
                System.out.println(manager.getAge());
                System.out.println(manager.fullSallary(500));
            }
            case Salesman salesman -> {
                salesman.setName("Carlos");
                salesman.setAge(20);
                salesman.setCode("2354");
                salesman.setSalary(2000);
                salesman.setPercentPerSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getClass());
                System.out.println(salesman.getName());
                System.out.println(salesman.getAge());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercentPerSold());
                System.out.println(salesman.getSoldAmount());
            }
            case Employe funcionario -> {
                funcionario.setName("Carlos");
                funcionario.setAge(20);
                funcionario.setCode("2354");
                funcionario.setSalary(2000);

                System.out.println(funcionario.getClass());
                System.out.println(funcionario.getName());
                System.out.println(funcionario.getAge());
                System.out.println(funcionario.getCode());
                System.out.println(funcionario.getSalary());
            } 
        }
        System.out.println();
        System.out.println("===============");
    }
}
