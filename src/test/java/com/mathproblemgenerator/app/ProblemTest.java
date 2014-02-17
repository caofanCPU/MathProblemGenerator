package com.mathproblemgenerator.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class ProblemTest extends TestCase
{
    /**
     * test that score is initially 0
     */
    public void testProblem()
    {
        BinaryExpression e = new BinaryExpression("+", 1, 2);
        Problem p = new Problem(e);
        assertTrue( p.solve(3) );
    }
}

