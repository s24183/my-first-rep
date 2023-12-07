package b_Money;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MoneyTest {
	Currency SEK, DKK, NOK, EUR;
	Money SEK100, EUR10, SEK200, EUR20, SEK0, EUR0, SEKn100;
	
	@Before
	public void setUp() throws Exception {
		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
		SEK100 = new Money(10000, SEK);
		EUR10 = new Money(1000, EUR);
		SEK200 = new Money(20000, SEK);
		EUR20 = new Money(2000, EUR);
		SEK0 = new Money(0, SEK);
		EUR0 = new Money(0, EUR);
		SEKn100 = new Money(-10000, SEK);
	}

	@Test
	public void testGetAmount() {
		assertEquals(Integer.valueOf(10000),SEK100.getAmount());
	}

	@Test
	public void testGetCurrency() {
		assertEquals(EUR, EUR10.getCurrency());
	}

	@Test
	public void testToString() {
		assertEquals("(Amount) 0 (CurrencyName) EUR", EUR0.toString());
	}

	@Test
	public void testGlobalValue() {
		assertEquals(Integer.valueOf(1500), EUR10.universalValue());
	}

	@Test
	public void testEqualsMoney() {
		assertTrue("Equals", SEK0.equals(EUR0));
		assertTrue("Equals", SEK100.equals(EUR10));
		assertFalse("Not equals", SEK0.equals(EUR10));
	}

	@Test
	public void testAdd() {
		assertEquals("20000", SEK100.add(EUR10).getAmount().toString() );
	}

	@Test
	public void testSub() {
	assertEquals(Integer.valueOf(0), SEK100.sub(EUR10).getAmount());
	}

	@Test
	public void testIsZero() {
		assertTrue("Should be zero",EUR0.isZero());
		assertFalse("Should not be zero", EUR10.isZero());
	}

	@Test
	public void testNegate() {
		assertEquals(Integer.valueOf(-1000),EUR10.negate().getAmount());
	}

	@Test
	public void testCompareTo() {
		assertEquals(0, SEK100.compareTo(SEK100));
		assertEquals(0,SEK0.compareTo(EUR0));
		assertEquals(1, EUR20.compareTo(EUR10));
		assertEquals(-1, EUR10.compareTo(EUR20));
	}
}
