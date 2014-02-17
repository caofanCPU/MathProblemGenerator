package com.mathproblemgenerator.app;

import java.text.DecimalFormat;

public class BinaryExpression extends Expression
{
    private String operator;
    private NumberExpression leftOperand;
    private NumberExpression rightOperand;

    public BinaryExpression(String op, NumberExpression left, NumberExpression right)
    {
        leftOperand = left;
        rightOperand = right;
        operator = op;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s", leftOperand.toString(),
                                         operator, 
                                         rightOperand.toString());
    }

    @Override
    public Double eval()
    {
        NumberExpression result;

        if(operator == "+") {
            result = leftOperand.add(rightOperand);
        } else if (operator == "-") {
            result = leftOperand.subtract(rightOperand);
        } else if (operator == "*") {
            result = leftOperand.multiply(rightOperand);
        } else if (operator == "/") {
            result = leftOperand.divide(rightOperand);
        } else {
            result = new NumberExpression(Double.NaN);
        }

        return result.eval();
    }
}