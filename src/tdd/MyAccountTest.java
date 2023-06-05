package tdd;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class MyAccountTest {
    MyAccount account = new MyAccount();
    @Test
    public void TestIfAccountCanDeposit() {
        account.deposit(5000);
        assertEquals(5000,account.getDeposit());
    }
    @Test
    public void TestIfAccountCanWithdraw(){
        account.withdraw(5000, 2000);
        assertEquals(3000,account.getWithdraw());
    }
}
