import UbaBank.CAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CAccountTest {
    CAccount cAccount;

    @BeforeEach void startWith() {
        cAccount = new CAccount();
    }
    @Test void toDeposit(){
        cAccount.deposit(5000);
        assertEquals(cAccount.deposit());

    }
}
