package com.mathproblemgenerator.app;

import java.text.DecimalFormat;

public class NumberExpression extends Expression
{
    private Double number;

    public NumberExpression(int num)
    {
        number = new Double((double)num);
    }

    public NumberExpression(Double num)
    {
        number = num;
    }

    @Override
    public Double eval()
    {
        return number;
    }

    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }

    public NumberExpression add(NumberExpression e)
    {
        return new NumberExpression(number + e.eval());
    }

    public NumberExpression subtract(NumberExpression e)
    {
        return new NumberExpression(number - e.eval());
    }

    public NumberExpression multiply(NumberExpression e)
    {
        return new NumberExpression(number * e.eval());
    }

    public NumberExpression divide(NumberExpression e)
    {
        return new NumberExpression(number / e.eval());
    }
}