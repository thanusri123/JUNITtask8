package task8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test1char {

	/*
	 //TODO list
     1.	"ABCD"=>"BCD" -SUCCESS
	 2. "AACD"=>"CD"  -SUCCESS
	 3. "BACD"=>"BCD" -SUCCESS
	 4."BBAA"=>"BBAA" -SUCCESS
	 5. "AABAA"=>"BAA"  -SUCCESS
	
	
	@BeforeEach
	void setUp() {
		removeCharA=new RemoveCharA();
	}
	*/
	
	@Test
	void testAt1stChar() {
		assertEquals("BCD",RemoveCharA.removeAt("ABCD"));
	}
	
	@Test
	void testAt2ndChar() {
		assertEquals("BCD",RemoveCharA.removeAt("BACD"));
	}
	
	@Test
	void test2AChars() {
		assertEquals("CD",RemoveCharA.removeAt("AACD"));
	}
	
	@Test
	void testACharAt3rd() {
			assertEquals("BBAA",RemoveCharA.removeAt("BBAA"));
	}
	
	@Test
	void testACharAtAll() {
		assertEquals("BAA",RemoveCharA.removeAt("AABAA"));
	}
	
}
