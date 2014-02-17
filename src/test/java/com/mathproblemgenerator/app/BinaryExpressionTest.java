package com.mathproblemgenerator.app;

import junit.framework.TestCase;

public class BinaryExpressionTest extends TestCase
{
    /**
     * test that Binary Expression works as expected
     */
    public void testBinaryExpression()
    {
        BinaryExpression binexp = new BinaryExpression("-", 
            new NumberExpression(1.5),
            new NumberExpression(1));
        assertEquals("1.5 - 1", binexp.toString());
        assertEquals(0.5, binexp.eval());
    }
}
