import UbaBank.LGAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class LGAccountTest {
    LGAccount account;


    @BeforeEach void startWith() {
        account = new LGAccount("Lord","Gboli","8090029032","1212","5230317380HL3ZJ");;
    }
        @Test void testIfAccountIsExisting(){
        assertNotNull(account);
    }
    @Test void confirmFirstName(){
        account.confirmFirstName("Lord");
    }
    @Test void confirmLastname(){
        account.confirmLastname("Gboli");
    }
    @Test void setPin(){
        account.setPin("1212");
    }
    @Test void toDeposit(){
        double expected = account.deposit("8090029032", "Lord_Gboli", 5000);
        assertEquals(expected, 5000);
    }
    @Test void balance(){
        account.deposit("8090029032", "Lord_Gboli",5000);
       double expected= 5000;
        assertEquals(expected, account.balance());
    }
    @Test void toWithdraw(){
        account.deposit("8090029032", "Lord_Gboli",5000);
        account.withdraw("1212", 2000);
       double expected = 3000;
        assertEquals(expected, account.balance());
    }
    @Test void checkBalance(){
        account.checkBalance("1212");
        double expected = 3000;
        assertEquals(expected, 3000);
    }
}
