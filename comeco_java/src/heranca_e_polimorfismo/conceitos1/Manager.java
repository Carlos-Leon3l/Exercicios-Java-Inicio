package conceitos1;
public class Manager extends Employe{

    public Manager(String code, String name, String address, int age, double salary, String login, String password, double comission) {

        super(code, name, address, age, salary);
        //construtor
        this.login = login;
        this.password = password;
        this.comission = comission;
    }
    public Manager() {

    }

    private String login;
    
    private String password;

    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
    
    // sobreescrita : sobreescrevendo um comportamento
    @Override
    public String getCode(){
        return "MN" + this.code;
    }

    // sobrecarga: definindo metodos com mesmo nomes mas con comportamento diferentes
    //@Override
    public double fullSallary() {
        // tem que fazer essa implementação em todos os outros que herdam de Employee, 
        return this.salary + this.comission;
    }

    public double fullSallary(double extra){
        return this.salary + extra;
    }
}
