package com.mathproblemgenerator.app;

import java.text.DecimalFormat;

public class BinaryExpression
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
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s %s %s", df.format(leftOperand), 
                                         operator, 
                                         df.format(rightOperand));
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