package b_Money;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {
	Currency SEK, DKK;
	Bank Nordea;
	Bank DanskeBank;
	Bank SweBank;
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		SweBank.openAccount("Alice");
		testAccount = new Account("Hans", SEK);
		testAccount.deposit(new Money(10000000, SEK));

		SweBank.deposit("Alice", new Money(1000000, SEK));
	}
	
	@Test
	public void testAddRemoveTimedPayment() {

		testAccount.addTimedPayment("1", 1, 1, new Money(10000, SEK), SweBank, "Alice" );
		assertTrue("Existed", testAccount.timedPaymentExists("1"));
		testAccount.removeTimedPayment("1");
		assertFalse("Not existed", testAccount.timedPaymentExists("1"));
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		testAccount.addTimedPayment("1", 2, 0, new Money(10000, SEK), SweBank, "Alice");
		for (int i = 0; i < 10; i++) {
			testAccount.tick();
		}
		assertEquals(Integer.valueOf(9960000), testAccount.getBalance().getAmount());

	}

	@Test
	public void testAddWithdraw() {
//		testAccount.deposit(new Money(2000,SEK));
		testAccount.withdraw(new Money(2000,SEK));
		assertEquals(Integer.valueOf("9998000"), testAccount.getBalance().getAmount());
	}
	
	@Test
	public void testGetBalance() {
		assertEquals(Integer.valueOf(10000000),testAccount.getBalance().getAmount());
//		assertEquals(10000000, testAccount.getBalance().value);
	}
}
