package lab.ex09;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExDemo {

	public static void main(String[] args) {

		String a = "Das sind mehrere Saetze. Immer letztes Wort. Okay.";
		Pattern pattern = Pattern.compile("\\w*\\.");
		Matcher matcher = pattern.matcher(a);
		while (matcher.find()) {
			System.out.println(matcher.group() + "" + matcher.start() + "" + matcher.end());
		}
		
		
		
		
	}
}
