import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class alphabetReplacement{
	public static String replaceLetterWithPosition(String input) {
		Stream<String> stringStream= input.codePoints().mapToObj(c -> String.valueOf((char) c));
		//stringStream.reduce((s1, s2) -> s1 + " " + s2);
		String Answer =  stringStream.map(name -> name.toLowerCase())
				.map(name -> replaceLetter(name))
				.filter(Optional::isPresent)
				.map(Optional::get)
				.collect(Collectors.joining(" "))
				.toString();
	//	System.out.println(Answer);
		return Answer;
	}
	
	public static Optional <String> replaceLetter(String character) {
		Optional<String> result = Optional.empty();
		int chars = Character.codePointAt(character,0) - 96;
		if(chars>=1 && chars<=26) {
			result = Optional.of(Integer.toString(Character.codePointAt(character,0) - 96));
		}
		return result;
	}

	public static void main(String[] args){
		replaceLetterWithPosition("a s");
	}
}