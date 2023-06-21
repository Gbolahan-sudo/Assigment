import UbaBank.Bank;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    Bank bank;

    @BeforeEach void startWith() {
        bank = new Bank();
    }

    @Test void toRegisterNewCustomer() {
        bank.registerCustomer("Chucks Nelson");
        assertNotNull(bank.RegisterCustomer());
    }
    @Test void generateAccountNumber(){
      String acc =  bank.generateAccountNumber("08090029032");
        assertEquals("8090029032", acc);
    }

    @Test void toDeposit() {
        bank.deposit("8090029032", 50_000);
        assertEquals(50_000,bank.checkBalance());
    }

    @Test void toCheckBalance() {
        bank.deposit("8090029032", 50_000);
        assertEquals(50_000, bank.checkBalance());
    }
    @Test void toWithdraw() {
        bank.deposit("8090029032", 50_000);
        bank.withdraw("8090029032", 10_000, "pin");
        double expected = 40_000;
    assertEquals(expected, bank.checkBalance());
    }
    @Test void toTransfer(){
        bank.deposit("8090029032",10_000);
        bank.transfer("8090029032","8090038032",5_000,"1212");
    }
}