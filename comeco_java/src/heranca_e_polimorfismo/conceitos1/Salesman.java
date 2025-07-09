package conceitos1;
public class Salesman extends Employe {

    public Salesman(){

    }

    private double soldAmount;
    private double percentPerSold;

    public Salesman(String code, String name, String address, int age, double salary, double percentPerSold, double soldAmount){
        //super aciona algum comportamento da classe pai
        super(code,name,address,age,salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;

    }

    public double getPercentPerSold() {
        return percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode(){
        return "SL" + this.code;
    }

    //@Override
    public double fullSallary() {
        return this.salary + ((soldAmount * percentPerSold) / 100) ;
    }

    public double fullSallary(int salario, double renda) {
        return 0.0 ;
    }
    
}
