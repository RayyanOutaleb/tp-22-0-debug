package tptest;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test1() {
		assertEquals(FizzBuzz.fizzBuzz(1), "1");
	}
	@Test
	public void test2() {
		assertEquals(FizzBuzz.fizzBuzz(2), "2");
	}
	@Test
	public void test3() {
		assertEquals(FizzBuzz.fizzBuzz(4), "4");
	}
	@Test
	public void test4() {
		assertEquals(FizzBuzz.fizzBuzz(6), "Fizz");
	}

}
