package sample.junit;

import org.junit.Test;

public class CalculateTest {

	@Test(expected = IllegalArgumentException.class)
	public void 第2引数に0を設定すると例外が送出される() throws Exception {
		// SetUp
		Calculate sut = new Calculate();
		// Exercise
		sut.divide(5, 0);
	}

}
