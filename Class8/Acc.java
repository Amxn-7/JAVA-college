package Class8;
class Account{
    private int id;
    private double balance;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id; 
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amt){
        balance-=amt;
    }
    public void deposit(double amt){
        balance+=amt;
    }


}
public class Acc {
    public static void main(String[] args) {
        Account a1= new Account();
        a1.setId(1);
        a1.setBalance(1000);
        a1.withdraw(200);
        a1.deposit(500);
        System.out.println(a1.getBalance());
    }
}