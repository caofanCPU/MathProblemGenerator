package com.mathproblemgenerator.app;

import junit.framework.TestCase;

public class ProblemTest extends TestCase
{
    /**
     * test that problem solving works
     */
    public void testProblem()
    {
        BinaryExpression e = new BinaryExpression("+", 
                                    new NumberExpression(1.0), 
                                    new NumberExpression(2.0));
        Problem p = new Problem(e);
        assertTrue( p.solve(3.0) );
    }
}

