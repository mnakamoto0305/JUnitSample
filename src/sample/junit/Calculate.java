package sample.junit;

public class Calculate {

	public int divide(int x, int y) {
		if(y == 0) throw new IllegalArgumentException();
		return x / y;
	}
}
