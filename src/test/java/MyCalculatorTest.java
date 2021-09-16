import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCalculatorTest {

	

	@Test
	public void test1() {
		assertEquals(10,new MyCalculator().getSum(6, 4));
	}
	
	@Test
	public void test2() {
		assertEquals(0,new MyCalculator().getSum(-6, -6));
	}
	
	@Test
	public void test3() {
		assertEquals(100,new MyCalculator().getSum(66, 34));
	}

}
