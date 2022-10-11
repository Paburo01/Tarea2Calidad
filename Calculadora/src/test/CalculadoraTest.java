package test;
import static org.junit.jupiter.api.Assertions.*;
import Principal.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

	private int value1;
	private int value2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all");
	}

	@BeforeEach
	void setUp() throws Exception {
		value1=3;
		value2=5;
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected=8;
		int actual= Calculadora.suma(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected=-2;
		int actual= Calculadora.Resta(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testMultiplica() {
		int expected=15;
		int actual= Calculadora.Multiplica(value1, value2);
		assertEquals(expected, actual);
	}

	@Test
	void testDivide() {
		int expected=0;
		int actual= Calculadora.Divide(value1, value2);
		assertEquals(expected, actual);
	}

}
