package entities;

public class SavingsAccount extends Account{
    private final double interestRate;

    public SavingsAccount(int numberAccount, String holder, double balance, double interestRate){
        super(numberAccount,holder,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
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
                "\nBalance: " +
                getBalance() +
                "\nInterest Rate: " +
                getInterestRate();
    }
}
