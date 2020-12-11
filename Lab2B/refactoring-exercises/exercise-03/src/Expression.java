public class Expression {

	public char op;
	public Expression left;
	public Expression right;
	public int constant;

	public Expression(int constant) {
		this.op = 'c';
		this.constant = constant;
	}

	public Expression(char op, Expression left, Expression right) {
		this.op = op;
		this.left = left;
		this.right = right;
	}

	public int evaluate() {
		switch (op) {
			case 'c':
				return constant;
			case '+':
				return casePlus();
			case '-':
				return caseMinus();
			case '*':
				return caseMultiply();
			case '/':
				return this.caseDivide();
			default:
				throw new IllegalStateException();
		}
	}

	public int caseDivide() {
		return left.evaluate() / right.evaluate();
	}

	public int caseMultiply() {
		return left.evaluate() * right.evaluate();
	}

	public int caseMinus() {
		return left.evaluate() - right.evaluate();
	}

	public int casePlus() {
		return left.evaluate() + right.evaluate();
	}

}