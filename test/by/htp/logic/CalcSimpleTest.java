package by.htp.logic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import by.pvt.junit.logic.Calc;

public class CalcSimpleTest {

	private Calc calc;

	@Before
	public void initTestData() {
		calc = new Calc();
	}

	@Test
	public void positiveSumIntTest() {
		int x = 2 + 2;
		int result = calc.sum(2, 2);
		assertEquals("The was calculated incorrectly", x, result);
	}

}
