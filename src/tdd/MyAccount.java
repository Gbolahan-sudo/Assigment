package tdd;

public class MyAccount {
    private int deposit;
    private int withdraw;
    private int invalidAccess;
    public void deposit(int a){
        deposit = a;
    }
    public int getDeposit() {
        return deposit;
    }
    public void withdraw(int a, int b) {
        if (b > a) withdraw = a;
        withdraw = a - b;
    }
    public int getWithdraw() {
        return withdraw;
    }
}
