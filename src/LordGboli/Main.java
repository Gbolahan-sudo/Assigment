package LordGboli;

import java.math.BigDecimal;

public class Main {
    private static String name;
    private BigDecimal balance;

    public static String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "Account{\n"+"name:"+name+"\nbalance:"+balance+"\n}";
    }
}
