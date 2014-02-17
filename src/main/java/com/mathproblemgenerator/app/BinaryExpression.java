package com.mathproblemgenerator.app;

class BinaryExpression
{
	private String operator;
	private double leftOperand;
	private double rightOperand;

	public BinaryExpression(String op, double left, double right)
	{
		leftOperand = left;
		rightOperand = right;
		operator = op;
	}

	public String toString()
	{
		return "";
	}

	public double eval()
	{
		double result = Double.POSITIVE_INFINITY;

		if(operator == "+") {
			result = leftOperand + rightOperand;
		} else if (operator == "-") {
			result = leftOperand - rightOperand;
		} else if (operator == "*") {
			result = leftOperand * rightOperand;
		} else if (operator == "/") {
			result = leftOperand / rightOperand;
		}

		return result;
	}
}