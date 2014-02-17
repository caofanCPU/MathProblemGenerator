package com.mathproblemgenerator.app;

import java.text.DecimalFormat;

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
        DecimalFormat df = new DecimalFormat("0.00#");

        return String.format("%s %s %s", leftOperand, operator, rightOperand);
    }

    public double eval()
    {
        double result = Double.NaN;

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