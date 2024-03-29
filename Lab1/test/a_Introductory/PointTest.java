
package a_Introductory;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
	Point p1, p2, p3;
	
	@Before
	public void setUp() throws Exception {
		p1 = new Point(7, 9);
		p2 = new Point(-3, -30);
		p3 = new Point(-10, 3);
	}
	@Test
	public void testAdd() {
		Point res1 = p1.add(p2);
		Point res2 = p1.add(p3);
		
		assertSame(4, res1.x);
		assertSame(-21, res1.y);
		assertSame(-3, res2.x);
		assertSame(12, res2.y);
	}
	@Test
	public void testSub() {
		Point res1 = p1.sub(p2);
		Point res2 = p1.sub(p3);
		
		assertNotSame(4, res1.x);
		assertNotSame(-21, res1.y);
		assertNotSame(-3, res2.x);
		assertNotSame(12, res2.y);
	}

}
