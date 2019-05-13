import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	@Test
	public void test1() {
		alphabetReplacement.replaceLetterWithPosition("");
	}
	@Test
	public void test2() {
		assertTrue(alphabetReplacement.replaceLetterWithPosition("a").equals("1"));
	}
	@Test
	public void test3() {
		assertTrue(alphabetReplacement.replaceLetterWithPosition("a ").equals("1"));
	}
	@Test
	public void test4() {
		assertTrue(alphabetReplacement.replaceLetterWithPosition("This NETbuilder assessment is way too easy.").equals("20 8 9 19 14 5 20 2 21 9 12 4 5 18 1 19 19 5 19 19 13 5 14 20 9 19 23 1 25 20 15 15 5 1 19 25"));
	}
	
	
}
