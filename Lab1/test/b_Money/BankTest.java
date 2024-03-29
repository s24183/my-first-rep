package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
	Currency SEK, DKK;
	Bank SweBank, Nordea, DanskeBank;
	
	@Before
	public void setUp() throws Exception {
		DKK = new Currency("DKK", 0.20);
		SEK = new Currency("SEK", 0.15);
		SweBank = new Bank("SweBank", SEK);
		Nordea = new Bank("Nordea", SEK);
		DanskeBank = new Bank("DanskeBank", DKK);
		SweBank.openAccount("Ulrika");
		SweBank.openAccount("Bob");
		Nordea.openAccount("Bob");
		DanskeBank.openAccount("Gertrud");
	}

	@Test
	public void testGetName() {
		assertNotNull(SweBank.getName());
//		assertNull(SweBank.getName());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(SEK,SweBank.getCurrency());

	}

	@Test
	public void testOpenAccount() throws AccountExistsException, AccountDoesNotExistException {

		Nordea.openAccount("FirstID");
		assertEquals(Integer.valueOf("0"), Nordea.getBalance("FirstID"));
		//Try to get the value of the account to be sure that the account existed
	}

	@Test
	public void testDeposit() throws AccountDoesNotExistException {
		SweBank.deposit("Bob",new Money(1000,SEK));
		assertEquals(Integer.valueOf(1000), SweBank.getBalance("Bob"));
	}

	@Test
	public void testWithdraw() throws AccountDoesNotExistException {
		SweBank.withdraw("Bob", new Money(500,SEK));
		assertEquals(Integer.valueOf(500), SweBank.getBalance("Bob"));
	}
	
	@Test
	public void testGetBalance() throws AccountDoesNotExistException {
		SweBank.deposit("Bob",new Money(1000,SEK));

		assertEquals(Integer.valueOf(1000), SweBank.getBalance("Bob"));
//		assertNotEquals(Integer.valueOf(500), SweBank.getBalance("Bib"));
	}
	
	@Test
	public void testTransfer() throws AccountDoesNotExistException {

		SweBank.transfer("Ulrika", "Bob", new Money(1000,SEK));
//		assertEquals(Integer.valueOf(1000), );
	}
	
	@Test
	public void testTimedPayment() throws AccountDoesNotExistException {
		SweBank.deposit("Bob", new Money(10000, SEK));

		SweBank.addTimedPayment("Bob", "1", 10, 5, new Money(10000, SEK), SweBank, "Ulrika");
		SweBank.tick();
		assertEquals(Integer.valueOf(10000), SweBank.getBalance("Bob"));
	}
}
