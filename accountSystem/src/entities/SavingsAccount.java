package entities;

import entities.enums.AccountType;

public class SavingsAccount extends Account{
    private final double interestRate;

    public SavingsAccount(int numberAccount, String holder, double balance, AccountType accountType, double interestRate) {
        super(numberAccount, holder, balance, accountType);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void updateBalance(){
        balance = balance * interestRate;
    }

    @Override
    public void withdraw(double amount){
        balance -= amount - 20.00;
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
                getBalance() +
                "\nInterest Rate: " +
                getInterestRate();
    }
}
