package entities;

import entities.enums.AccountType;

public class Account {
    private int numberAccount;
    private String holder;
    protected double balance;
    private AccountType accountType;

    public Account(){
        
    }
    
    public Account(int numberAccount, String holder, double balance, AccountType accountType){
        this.numberAccount = numberAccount;
        this.holder = holder;
        this.balance = balance;
        this.accountType = accountType;
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

    public AccountType getAccountType() {
        return accountType;
    }

    public void withdraw(double amount){
        balance -= amount - 5.0;
    }

    public void deposit(double amount){
        balance += amount;
    }

    @Override
    public String toString(){
        return "Number Account: " +
                getNUmberAccount() +
                 "\nHolder: " +
                getHolder() +
                "\nAccount Type: " +
                getAccountType() +
                "\nBalance: " +
                getBalance();
    }
}
