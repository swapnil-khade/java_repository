package db.ciit_guide.controller;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;


import org.junit.jupiter.api.*;

public class SampleTests {

	
	@BeforeAll						//This will execute only once and method must be static
	static void beforeAll() {
		System.out.println("This needs to run before all..");
		
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("before...");
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(2, 2,"String can be added!");
		assertFalse(false,"dummy String");
	}
	
	public void devide(int a, int b) {
		int c=a/b;
		System.out.println(c);
	}
	
	@Test
	@Disabled						//This will skip the test
	@DisplayName("Disabled test")
	public void test2() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("assertAll multiple statement")
	public void test3() {
		assertAll(
				()->assertEquals(2, 2,"String can be added!"),
				()->assertEquals(2, 2,"String can be added!"),
				()->assumeTrue(true)
				);
	}
	
	@Test
	@DisplayName("Testing testDevide method")
	public void testDevide() {
		boolean isServerUp=true;
		assumeTrue(isServerUp);		//if not true then don't run this test
									//e.g. If server is not running, don't run this test
		
		assertThrows(ArithmeticException.class, ()-> devide(2,0),"devide by 0 throws exception!");
	}
	@Nested
	@DisplayName("test class name")
	class AddTest{
		@Test
		@Tag("child")
		public void test() {
			//fail("Not yet implemented");
			assertEquals(2, 2,() -> "String can be added!");
		}
		
		@Test
		@Tag("child")
		public void test2() {
			//fail("Not yet implemented");
		}
	}
	
	@RepeatedTest(3)										//repeat test 3 times
	public void test4(RepetitionInfo repetitionInfo) {
		//int c=repetitionInfo.getTotalRepetitions();
		//fail("Not yet implemented");
	}

}
