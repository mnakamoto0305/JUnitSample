package sample.junit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

public class NameTest extends Name {

	@Test
	public void aaaはaaaのまま出力される() throws Exception {
		// Exercise
		String expected = "aaa";
		String actual = Name.toSnakeCase("aaa");

		// Verify
		assertThat(actual, is(expected));
	}

	@Test
	public void HelloWorldはhello_worldに変換される() throws Exception {
		// Exercise
		String expected = "hello_world";
		String actual = Name.toSnakeCase("HelloWorld");
		// Verify
		assertThat(actual, is(expected));
	}

	@Test
	public void practiceJUnitはpractice_junitに変換される() throws Exception {
		// Exercise
		String expected = "practice_junit";
		String actual = Name.toSnakeCase("practiceJunit");
		// Verify
		assertThat(actual, is(expected));
	}
}
