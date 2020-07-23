//import junit.framework.Test;
import org.junit.*;
import static org.junit.Assert.*;
//import org.junit.*;
public class CalculatorTest {
	Calculator cal;
	@Before
	public void objectCreation() {
		cal = new Calculator();
	}
	@Test
	public void test() throws Exception{
		assertEquals(8,cal.CalculatorComputation(4,2,"Multiply"));
	}
	@Test
	public void test1() throws Exception{
		assertEquals(2,cal.CalculatorComputation(4,2,"Divide"));
	}
	@Test
	public void test3() throws Exception{
		assertEquals(16,cal.CalculatorComputation(4,12,"Add"));
	}
	@Test
	public void test4() throws Exception{
		assertEquals(2,cal.CalculatorComputation(4,2,"Subract"));
	}
}
