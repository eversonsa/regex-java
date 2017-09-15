package estudo.regex;

public class SplitString {
	
	public static void main(String[] args) {
		String texto = "o2java6eh8uma9linguagem5orientada0a7objetos";
		
		String[] palavras = texto.split("\\d");
		for(String pa : palavras){
			System.out.println(pa);
		}
	}
}
