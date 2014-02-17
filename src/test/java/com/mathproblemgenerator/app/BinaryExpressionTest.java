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
    	BinaryExpression binexp = new BinaryExpression("+", 1, -1);
    	assertEquals(binexp.toString(), "1 - 1");
    	assertEquals(binexp.eval(), 0.0);
    }
}

