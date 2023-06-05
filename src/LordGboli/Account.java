package LordGboli;

public class Account {
    public static void main(String[] args) {
        int number = 5;
        int result = square(number);
        System.out.println(result);
        System.out.println(number);
        Main account = new Main();
        account.setName("johnson");
        System.out.println(account);
        changeAccountName(account);
        System.out.println();
        System.out.println(account);
    }
    private static int square(int number){
        number*=number;
        return number;
    }
    private static void changeAccountName(Main account){
        account.setName("david");
    }
}
