package sample.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void createFizzBuzzに16を渡す() throws Exception {
		List<String> actual = FizzBuzz.createFizzBuzzList(16);
		assertThat(actual, is(notNullValue()));
		assertThat(actual.size(), is(16));
		assertThat(actual.get(0), is("1"));
		assertThat(actual.get(1), is("2"));
		assertThat(actual.get(2), is("Fizz"));
		assertThat(actual.get(3), is("4"));
		assertThat(actual.get(4), is("Buzz"));
		assertThat(actual.get(5), is("Fizz"));
		assertThat(actual.get(6), is("7"));
		assertThat(actual.get(7), is("8"));
		assertThat(actual.get(8), is("Fizz"));
		assertThat(actual.get(9), is("Buzz"));
		assertThat(actual.get(10), is("11"));
		assertThat(actual.get(11), is("Fizz"));
		assertThat(actual.get(12), is("13"));
		assertThat(actual.get(13), is("14"));
		assertThat(actual.get(14), is("FizzBuzz"));
		assertThat(actual.get(15), is("16"));

	}

}
