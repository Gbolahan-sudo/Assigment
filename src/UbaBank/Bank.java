package UbaBank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<LGAccount> accounts = new ArrayList<>();
    private String registerCustomer;
    private int balance;


    public void registerCustomer(String registerCustomer) {
        this.registerCustomer = registerCustomer;
    }

    public String generateAccountNumber(String phoneNumber) {
        String accountNumber = phoneNumber.substring(1);
        return accountNumber;
    }

    public int sizeAccount() {
        return accounts.size();
    }

    public String RegisterCustomer() {
        return registerCustomer;
    }

    public void deposit(String accountNumber, int amount) {
        this.balance += amount;
    }

    public int checkBalance() {
        return this.balance;
    }

    public void withdraw(String accountNumber, int amount, String pin) {
        this.balance -= amount;
        if (balance > 0 && balance < amount) {

        } else {
            System.out.println("Insufficient balance");

        }
    }


    public void transfer(String accountNumber, String receiverAccount,int amount, String pin) {
        this.balance -= amount;
        if (balance == amount){
            System.out.println("Transaction successful");
        }else{
            System.out.println("Wrong transaction");
        }
    }
}
