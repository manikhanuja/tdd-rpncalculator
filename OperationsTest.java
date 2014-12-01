import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class OperationsTest {
	
	private Calculator calculator;
	
	@Before
	public void createCalculatorWithInitialValues()
	{
		calculator = new Calculator();
		calculator.setAccumulator(new BigDecimal(20));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}

	@Test
	public void testAdd()
	{
		calculator.add();
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}
	
	@Test
	public void testSubstract()
	{
		calculator.Substract();
		assertEquals(new BigDecimal(16), calculator.getAccumulator());
	}
}
