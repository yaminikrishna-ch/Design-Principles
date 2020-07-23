

public class Calculator {
	String Operator;
	//aa is the user testcase input which contains the first number to compute calculation.
	//ab is the 2nd input for the calculator to perform the operations.
	public int CalculatorComputation(int aa, int ab, String operator) throws Exception{
		//Creating object for the operation class
		//Operation op = new Operation();
		this.Operator = operator;
		//Creating a new Instance for the class that contains the operations  
		//based on the operator specified.
//		Class <?> clas = Class.forName(operator);
//		Object o = clas.newInstance();
//		//Calculate calculatingresult = (Calculate)o;
//		//op.PerformOperation(calculatingresult);
//		return op.calculatorResult(aa,ab);
		if(Operator.equals("Add")) {
			Add a = new Add();
			return a.calculatorResult(aa,ab);
		}
		else if(Operator.contentEquals("Subtract")) {
			Subract s = new Subract();
			return s.calculatorResult(aa,ab);
		}
		else if(Operator.contentEquals("Multiply")) {
			Multiply m = new Multiply();
			return m.calculatorResult(aa,ab);
		}
		else {
			Divide d = new Divide();
			return d.calculatorResult(aa,ab);
		}
	}
}
