import java.util.stream.Collectors;
import java.util.stream.Stream;

public class alphabetReplacement{
	public static String replaceLetterWithPosition(String input) {
		Stream<String> stringStream= input.codePoints().mapToObj(c -> String.valueOf((char) c));
		System.out.println(Integer.toString(Character.codePointAt("a",0) - 96));
		//stringStream.reduce((s1, s2) -> s1 + " " + s2);
		String Answer =  stringStream.map(name -> name.toLowerCase())
				.map(name -> replaceLetter(name))
				.collect(Collectors.joining(" "))
				.toString();
		return Answer;
	}
	
	public static String replaceLetter(String character) {
		int chars = Character.codePointAt(character,0) - 96;
		if(chars>0 && chars<=26) {
			return Integer.toString(Character.codePointAt(character,0) - 96);
		}
		else
			return "";
	}

	public static void main(String[] args){
		replaceLetterWithPosition("a");
	}
}