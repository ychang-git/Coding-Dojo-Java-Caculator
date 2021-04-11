
public class Calculator {
	// member variables are private
	private Double operandOne;
	
	private Double operandTwo;
	
	private String operation;
	
	private Double number;

	//setting the rules on how we create our instances! 
	public Calculator() {

		this.operandOne = 0.0;
		this.operandTwo = 0.0;
		this.operation = "";
		this.number = 0.0;
	}
// setter because the member is private 
//setter because we are setting the numbers. and it is NOT getters because we are not pulling from the private.  
	
	public void setOperandOne(Double operandOne) {
		this.operandOne = operandOne;
	}

	public void setOperandTwo(Double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		
	}

	public Double performOperation() {
		if(operation.equals("+")) {
			number = operandOne + operandTwo;
		}
		if(operation.equals("-")) {
			number = operandOne - operandTwo;
		}
		return number;
	}

	public Double performOperation(Double operandOne, Double operandTwo, String operation) {
		if(operation.equals("-")) {
			number = operandOne - operandTwo;
		}
		if(operation.equals("+")) {
			number = operandOne + operandTwo;
		}
		return number;
	}
	
	public void getresults() {
		System.out.println("The results are " + number);
	}
}
