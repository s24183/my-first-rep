
package b_Money;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
	Currency SEK, DKK, NOK, EUR;
	
	@Before
	public void setUp() throws Exception {

/* Setup currencies with exchange rates */

		SEK = new Currency("SEK", 0.15);
		DKK = new Currency("DKK", 0.20);
		EUR = new Currency("EUR", 1.5);
	}

	@Test
	public void testGetName() {
		assertEquals("SEK", SEK.getName());
		assertEquals("DKK", DKK.getName());
		assertEquals("EUR", EUR.getName());


	}
	
	@Test
	public void testGetRate() {
		assertEquals(Double.valueOf(0.15), SEK.getRate());
		assertEquals(Double.valueOf(0.20), DKK.getRate());
		assertEquals(Double.valueOf(1.5), EUR.getRate());
		assertNotEquals(Double.valueOf(0.10), SEK.getRate());
		assertNotEquals(Double.valueOf(0.15), DKK.getRate());
		assertNotEquals(Double.valueOf(1.51), EUR.getRate());

	}
	
	@Test
	public void testSetRate() {
		 SEK.setRate(0.25);
		 DKK.setRate(0.35);
		 EUR.setRate(0.50);
		 assertEquals(Double.valueOf(0.25), SEK.getRate());
		 assertEquals(Double.valueOf(0.35), DKK.getRate());
		 assertEquals(Double.valueOf(0.50), EUR.getRate());
	}
	
	@Test
	public void testGlobalValue() {
		assertEquals(Integer.valueOf(15), SEK.universalValue(100));
	}
	
	@Test
	public void testValueInThisCurrency() {
		assertEquals("EURO TO SEK",Integer.valueOf(10),SEK.valueInThisCurrency(100,EUR));
	}

}
