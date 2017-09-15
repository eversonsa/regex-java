package estudo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail {
	
	public static void main(String[] args) {
		
		String[] email = {"teste@teste.com", "mariaa@", "jose@maria", "evana@t.com"};
		
		Pattern padrao = Pattern.compile("\\w+@\\w+\\.\\w+");
		for(String e : email){
			Matcher matcher = padrao.matcher(e);
			if(matcher.matches()){
			  System.out.println(e + " é um email valido");
			}
		}
	}
}
