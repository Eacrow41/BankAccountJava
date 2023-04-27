import javax.print.attribute.standard.JobName;

public class BankAccount {
    private double balance;
    private String name;

    public BankAccount(String name){
        this.name = name;
        balance = 0.0;
    }
    public double getBalance(){
        return balance;
    }

    public String getName(){
        return name;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println(name + " has $" + balance );
    }
    public void withdraw(double amount){
        if(amount < balance){
            balance -= amount;
            System.out.println(name + " has $ " + balance);
        }
        else {
            System.out.println("Withdraw by " + name + " fails");
        }
    }
    public void transfer(double amount, BankAccount acc){
        if(this.balance < amount){
            System.out.println("Transfer fails");
        }
        else {
            this.balance -= amount;
            acc.balance += amount;
            System.out.println("Account of " + acc.name + " becomes $ " + acc.balance );
        }
    }
}
