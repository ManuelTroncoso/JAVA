package calculadora;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	static Calculadora calc;
	//BeforeClass se ejecuta solamente una a diferencia del before que se ejecuta antes de cada metodo.
	@BeforeClass
	public static void BeforeClass() 
	{
		calc= new Calculadora();
	}
	
	@Before
	public void Before() 
	{
		calc.clear();
	}
	
	@AfterClass
	public static void AfterClass() 
	{
		System.out.println("AfterClass");
	}
	
	//Se ejecuta antes de cualquier metodo de test
	/*@Before
	public void Before() 
	{
		calc = new Calculadora();
	}
	//Se ejecuta despues de cualquier metodo de test
	@After
	public void After() 
	{
		calc.clear();
	}*/
	
	@Test
	public void testSuma() {

		int resultado = Calculadora.Suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testResta() {
		
		int resutlado = Calculadora.Resta(3, 2);
		int esperado = 1;
		assertEquals(esperado, resutlado);
	}
	
	@Test
	public void testAnsSum() 
	{
		calc.Add(3,2);
		int resul = calc.ans();
		int esper = 5;
		assertEquals(esper,resul);
	}
	
	@Test
	public void testAnsSub() 
	{
		calc.Sub(3,2);
		int resul = calc.ans();
		int esper = 1;
		assertEquals(esper,resul);
	}
		
	@Test
	public void testDiv() 
	{
		calc.div(5, 2);
	}

	@Test(expected =  ArithmeticException.class)
	public void testDivPorCero() 
	{
		calc.div(5, 0);
	}
	
	@Test(timeout = 3000)
	public void testAlgoritmoOptimo() 
	{
		calc.OperacionOptima();
	}
	
}
