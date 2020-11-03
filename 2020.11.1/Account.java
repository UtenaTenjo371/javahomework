import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double anualInterestRate;
    private Date dateCreated;
    //�޲ι��췽��
    Account() {
    }
    //���ι��췽��
    Account(int id, int balance) {
        this.id = id;
        this.balance = balance;
    }

    // id���������޸���
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // balance���������޸���
    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //anualInterestRate���������޸���
    public double getAnualInterestRate() {
        return this.anualInterestRate;
    }
    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    //dateCreated������
    public Date getDateCreated(){
        return dateCreated;
    }
    //���������ʷ���
    public double getMonthlyInterestRate(){
        return anualInterestRate/12;
    }
    //��ȡ�ض������
    public void withDraw(double money){
        balance-=money;
    }
    //�洢�ض�����
    public void deposit(double money){
        balance+=money;
    }
}