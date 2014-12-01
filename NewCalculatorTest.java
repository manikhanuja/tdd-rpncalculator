import static org.junit.Assert.*;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class NewCalculatorTest {
	
	private Calculator calculator;

	@Before
	public void createCalculator()
	{
		 calculator = new Calculator();
	}
	
	@Test
	public void testNewCalculatorAccumulatorWithDefaultValueZero()
	{
		
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
	}
	
	@Test
	public void testSettingAccumulatorValue()
	{
		//Calculator calculator = new Calculator();
		BigDecimal value = new BigDecimal(23);
		calculator.setAccumulator(value);
		assertEquals(value, calculator.getAccumulator());
	}

}
