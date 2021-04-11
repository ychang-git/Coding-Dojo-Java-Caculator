
public class CalculatorTest {

	public static void main(String[] args) {
		//instance of a class
		Calculator c = new Calculator();
		c.setOperandOne(5.0);
		c.setOperandTwo(6.0);
		c.setOperation("+");
		c.performOperation();
		c.getresults();
		//method
		Calculator c2 = new Calculator();
		c2.performOperation(5.0, 9.0, "-");
		c2.getresults();
		// instance calling on the methods.
	}

}
