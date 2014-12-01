import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class CalculatorWithThreeValuesTest {
	private Calculator calculator;
	private BigDecimal value3;
	private BigDecimal value2;
	private BigDecimal value1;

	@Before
	public void createCalculatorWithThreeValues()
	{
		calculator = new Calculator();
		value1 = new BigDecimal(12);
		value2 = new BigDecimal(23);
		value3 = new BigDecimal(5);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}
	@Test
	public void testAccumulatorAfterPushingThreeValues()
	{
		assertEquals(value3, calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAfterSingleDrop()
	{
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAfterTwoDrops()
	{
		calculator.drop();
		calculator.drop();
		assertEquals(value1, calculator.getAccumulator());
		
	}

}
