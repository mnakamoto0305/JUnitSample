package sample.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class NumberUtilsTest {

	@Test
	public void isEvenは10でtrueを返す() throws Exception {
		NumberUtils sut = new NumberUtils();
		assertThat(sut.isEven(10), is(true));
	}

	@Test
	public void isEvenは7でfalseを返す() throws Exception {
		NumberUtils sut = new NumberUtils();
		assertThat(sut.isEven(7), is(false));
	}

}
