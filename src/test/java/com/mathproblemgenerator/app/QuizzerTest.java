package com.mathproblemgenerator.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QuizzerTest extends TestCase
{
    /**
     * test that score is initially 0
     */
    public void testQuizzer()
    {
        Quizzer q = new Quizzer();
        assertEquals(q.score(), 0);
    }
}

