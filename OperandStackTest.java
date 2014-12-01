import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


public class OperandStackTest {
	private OperandStack stack;

	@Before
	public void createOperandStack()
	{
	 stack = new OperandStack(); 	
	}
	
	@Test
	public void testNewOperandStackWithDefaultValueZero()
	{
		
		assertEquals(BigDecimal.ZERO, stack.peek());
	}

	@Test
	public void testPushingNewValueOnOperandStack()
	{
		BigDecimal value1 = new BigDecimal(12);
		stack.push(value1);
		assertEquals(value1, stack.peek());
	}
	
	@Test
	public void testReplaceValueOnTopOfStack()
	{
		stack.push(new BigDecimal(22));
		BigDecimal value = new BigDecimal(33);
		stack.replaceTop(value);
		assertEquals(value,stack.peek());
			
	}
	
	@Test
	public void testReplaceValueOnTopOfEmptyStack()
	{
		BigDecimal value = new BigDecimal(39);
		stack.replaceTop(value);
		assertEquals(value,stack.peek());
		
	}
	
	@Test
	public void testPoppingValuesFromStack()
	{
		BigDecimal value = new BigDecimal(95);
		stack.push(value);
		stack.push(new BigDecimal(88));
		stack.pop();
		assertEquals(value, stack.peek());
	}
	
	@Test
	public void testPoppingOnEmptyStack()
	{
		stack.pop();
		assertEquals(BigDecimal.ZERO, stack.peek());
	}
}
