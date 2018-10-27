package regexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String [] args) {
		int matches = 0,matchesWithFlags=0;
		
		String regex="[[Ii]nd[[Bb]us][[Gg]ov]][a-zA-Z-]*";
		String regex2="(ind|bus|gov)[a-zA-Z-]*";
		String regex3="((?i)ind|(?i)bus|gov)[a-zA-Z-]*";
		String text="individual-serices Individual-services business-serives Business-services government-serives Government-Serives halla sababala http : localhost \\";
//		matches=runTest(regex,text);
		matchesWithFlags=runTest(regex2,text,Pattern.CASE_INSENSITIVE);
		System.out.printf("matches: %d\nmatches with flags: %d",matches,matchesWithFlags);
	}

	private static int runTest(String regex, String text) {
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		
		int matches=0;
		while(matcher.find()) {
			
			System.out.println(matcher.toString());
			matches++;
		}
		return matches;
	}
	private static int runTest(String regex, String text,int flags) {
		Pattern pattern=Pattern.compile(regex,flags);
		Matcher matcher=pattern.matcher(text);
		
		int matches=0;
		while(matcher.find()) {
			
			System.out.println(matcher.toString());
			matches++;
		}
		return matches;
	}
}
