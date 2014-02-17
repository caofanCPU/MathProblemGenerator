package com.mathproblemgenerator.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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
    }
}

