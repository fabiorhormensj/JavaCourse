package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import entities.enums.AccountType;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Account> list = new ArrayList<>();

        System.out.print("Enter the number of accounts: ");
        int na = sc.nextInt();

        // Collects account information
        for (int i = 1; i <= na; i++) {
            System.out.println("Account #" + i);

            System.out.print("Enter the holder name: ");
            sc.nextLine();
            String holderName = sc.nextLine();

            System.out.print("Enter the number account: ");
            int numberAccount = sc.nextInt();

            System.out.print("Enter the initial balance: ");
            double balance = sc.nextDouble();

            String accountType;

            System.out.print("What type of account is it? Current account(cc) Savings account(sa) or Business account(ba)  ");
            accountType = sc.next();

            // Add objects to the list
            if (accountType.equalsIgnoreCase("sa")) {
                System.out.print("Enter the Interest Rate: ");
                double interestRate = sc.nextDouble();
                list.add(new SavingsAccount(numberAccount, holderName, balance, AccountType.SA, interestRate));
            } else if (accountType.equalsIgnoreCase("ba")) {
                System.out.print("Enter the Loan Limit: ");
                double loanLimit = sc.nextDouble();
                list.add(new BusinessAccount(numberAccount, holderName, balance, AccountType.BA, loanLimit));
            } else if (accountType.equalsIgnoreCase("cc")) {
                list.add(new Account(numberAccount, holderName, balance, AccountType.CC));
            }

            System.out.println();
        }

        System.out.println("\n\n");

        System.out.print("Select an account, using the Number account: ");
        int numberAccount = sc.nextInt();

        for (Account account : list) {
            if (numberAccount == account.getNUmberAccount()) {
                if (account.getAccountType() == AccountType.SA) {
                    SavingsAccount tempAccount = (SavingsAccount) account;
                    tempAccount.updateBalance();
                    System.out.print(tempAccount);
                } else {
                    System.out.print(account);
                }
            }
        }
        sc.close();
    }
}
