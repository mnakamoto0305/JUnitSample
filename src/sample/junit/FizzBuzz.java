package sample.junit;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> createFizzBuzzList(int num) {
		List<String> fizzBuzzList = new ArrayList<>();
		for (int i = 1; i < num + 1; i++) {
			if (i % 3 == 0 && i % 5 != 0) {
				fizzBuzzList.add("Fizz");
			} else if (i % 5 == 0 && i % 3 != 0) {
				fizzBuzzList.add("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				fizzBuzzList.add("FizzBuzz");
			} else {
				fizzBuzzList.add(Integer.toString(i));
			}
		}
		return fizzBuzzList;
	}

}
