package entities;

public class Account {
    private int numberAccount;
    private String holder;
    protected double balance;

    public Account(){
        
    }
    
    public Account(int numberAcount, String holder, double balance){
        this.numberAccount = numberAcount;
        this.holder = holder;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public int getNUmberAccount(){
        return numberAccount;
    }

    public String getHolder(){
        return holder;
    }

    public void withdraw(double amount){
        balance -= amount - 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    
    public String toString(){
        return "Number Account: " +
                getNUmberAccount() +
                 "\nHolder: " +
                getHolder();
    }
}
