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
        bank.deposit("Account number", 50_000);
        assertEquals(50_000,bank.checkBalance());
    }

    @Test void toCheckBalance() {
        bank.deposit("Account number", 50_000);
        assertEquals(50_000, bank.checkBalance());
    }
    @Test void toWithdraw() {
        bank.deposit("Account number", 50_000);
        bank.withdraw("Account number", 700, "pin");
        double expected = 49_000;
    assertEquals(expected, bank.checkBalance());
    }
}
