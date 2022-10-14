package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import RRHH.Empleado;
import RRHH.Empleado.TipoEmpleado;


class EmpleadoTest {
	
	private TipoEmpleado te;
	private int ventasMe;
	private int horasEx;
	private int nominaBr;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		te = TipoEmpleado.Vendedor;
		ventasMe = 900;
		horasEx = 0;
		nominaBr = 2000;
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		te = TipoEmpleado.Encargado;
		float expected = 2500;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaVendedor() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaVentasMenor1000() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);		
	}

	@Test
	void testCalculoNominaBrutaVentasMenor1500() {
		ventasMe = 1400;
		float expected = 2100;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaVentasMayor1500() {
		ventasMe = 1800;
		float expected = 2200;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtra0() {
		float expected = 2000;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaBrutaHorasExtraMasDe0() {
		horasEx = 20;
		float expected = 2600;
		float actual = Empleado.calculoNominaBruta(te, ventasMe, horasEx);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNeta1() {
		float expected = 2000;
		float actual = Empleado.calculoNominaNeta(nominaBr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta2() {
		nominaBr = 2200;
		float expected = 1870;
		float actual = Empleado.calculoNominaNeta(nominaBr);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta3() {
		nominaBr = 2100;
		float expected = 1785;
		float actual = Empleado.calculoNominaNeta(nominaBr);
		assertEquals(expected, actual);
	}
	
	

}
