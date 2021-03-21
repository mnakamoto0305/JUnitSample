package sample.junit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Name {

	public static String toSnakeCase(String name) {
		if (name == null) {
			throw new NullPointerException("text = null.");
		}
		String snake = name;
		Pattern p = Pattern.compile("([A-Z])");
		while (true) {
			Matcher m = p.matcher(snake);
			if (!m.find()) break;
			snake = m.replaceFirst("_" + m.group(1).toLowerCase());
		}
		return snake.replaceFirst("^_", "");
	}
}
