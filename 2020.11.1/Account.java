import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double anualInterestRate;
    private Date dateCreated;
    //无参构造方法
    Account() {
    }
    //含参构造方法
    Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    // id访问器和修改器
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // balance访问器和修改器
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //anualInterestRate访问器和修改器
    public double getAnualInterestRate() {
        return this.anualInterestRate;
    }
    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    //dateCreated访问器
    public Date getDateCreated(){
        return dateCreated;
    }
    //返回月利率方法
    public double getMonthlyInterestRate(){
        return anualInterestRate/12;
    }
    //提取特定数额方法
    public void withDraw(double money){
        balance-=money;
    }
    //存储特定数额
    public void deposit(double money){
        balance+=money;
    }
}