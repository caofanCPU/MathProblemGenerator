package com.mathproblemgenerator.app;

import junit.framework.TestCase;

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

