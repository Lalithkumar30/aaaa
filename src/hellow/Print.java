package hellow;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Print {

	public static void main(String[] args) {

	
		try {
			String words = new String("isa This is5 a funxction 5is");
			badmethod(words);
		}
		catch(Exception e) {
			System.err.println("heloooo");
		}
		
	}
	
	public static void badmethod(String words) {
		
		Pattern pattern;
		Matcher matcher;
		pattern = Pattern.compile("([^a-zA-Z]+is+[^a-zA-Z])");
	    matcher = pattern.matcher(words);
	    
	    
	    
	    StringBuffer resultStr = new StringBuffer(matcher.replaceAll(" is not "));
	    
	    pattern = Pattern.compile("(is+[^a-zA-Z])");
	    matcher = pattern.matcher(words);
	    
	    //System.out.println(resultStr);

	    
	    if(words.startsWith("is")) {
	    	pattern = Pattern.compile("(is+[^a-zA-Z])");
		    matcher = pattern.matcher(words);
		    resultStr = new StringBuffer(matcher.replaceAll(" is not "));
	    	//resultStr.replace(0, 2, " is not ");
	    }
	    
	    if(words.endsWith("is")) {
	    	resultStr.replace(0, 2, "is not");
	    } 
	    System.out.println(resultStr);

	}

}
