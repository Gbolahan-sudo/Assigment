import UbaBank.LGAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class LGAccountTest {
    LGAccount Account;

    @BeforeEach void startWith() {
        Account = new LGAccount();
    }
    @Test void firstName(){
        Account.firstName("");
        assertEquals("");
    }
    @Test void confirmFirstName(){
        Account.confirmFirstName();
    }
    @Test void setPin(){
        Account.setPin("wale");
        double expected = Account.deposit(5000);
        assertEquals(expected,5000);
    }
    @Test void toDeposit(){
        double expected = Account.deposit(5000);
        assertEquals(expected, 5000);
    }
    @Test void balance(){
        Account.deposit(5000);
       double expected= 5000;
        assertEquals(expected, Account.balance());
    }
    @Test void toWithdraw(){
        Account.deposit(5000);
        Account.withdraw("wale", 2000);
       double expected = 3000;
        assertEquals(expected, Account.balance());
    }
    @Test void checkBalance(){
        Account.checkBalance("pin");
        double expected = 3000;
        assertEquals(expected, 3000);
    }
}
