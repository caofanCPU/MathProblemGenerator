package com.mathproblemgenerator.app;

import junit.framework.TestCase;

public class BinaryExpressionTest extends TestCase
{
    /**
     * test that Binary Expression works as expected
     */
    public void testBinaryExpression()
    {
        BinaryExpression binexp = new BinaryExpression("-", 1.5, 1.0);
        assertEquals("1.5 - 1", binexp.toString());
        assertEquals(0.5, binexp.eval());

        assertEquals(0.0, (new BinaryExpression("*", 0.0, 23.123)).eval() );
        assertEquals(Double.POSITIVE_INFINITY, (new BinaryExpression("/", 1.0, 0.0)).eval() );
    }
}

