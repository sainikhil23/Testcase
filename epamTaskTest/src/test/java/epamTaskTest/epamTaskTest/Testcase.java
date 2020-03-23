package epamTaskTest.epamTaskTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Testcase {

	DeleteA d;

	@BeforeEach
	void createObject() {
		d = new DeleteA();
	}

	@Test
	void test1() {
		assertEquals("BCDE", d.del("ABCDE"));
	}

	@Test
	void test2() {
		assertEquals("DC", d.del("AADC"));
	}

	@Test
	void test3() {
		assertEquals("BBAA", d.del("BBAA"));
	}

	@Test
	void test4() {
		assertEquals("", d.del("A"));
	}

	@Test
	void test5() {
		assertEquals("", d.del("AA"));
	}

	@Test
	void test6() {
		assertEquals("BBD", d.del("BABD"));
	}

}