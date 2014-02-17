package com.mathproblemgenerator.app;

public class Problem
{
    private BinaryExpression expr;

    public Problem(BinaryExpression e)
    {
        expr = e;
    }

    public Boolean solve(double result)
    {
        return expr.eval() == result;
    }
}

