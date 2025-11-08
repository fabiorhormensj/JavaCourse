package entities;


public class BusinessAccount extends Account {

    private final double loanLimit;
    
    public BusinessAccount(int numberAccount, String holder, double balance, double loanLimit){
        super(numberAccount,holder,balance);
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit(){
        return loanLimit;
    }

    public void loan(double amount){
        if(amount <=loanLimit){
            balance += amount - 10.0;
        }
    }

    @Override
    public String toString(){
        return "Number Account: " +
                getNUmberAccount() +
                 "\nHolder: " +
                getHolder() +
                "\nBalance: " +
                getBalance() +
                "\nLoan Limit: " +
                getLoanLimit();
    }
}
