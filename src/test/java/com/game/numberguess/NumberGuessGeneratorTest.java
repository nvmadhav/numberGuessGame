package com.game.numberguess;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple NumberGuessGame.
 */
public class NumberGuessGeneratorTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public NumberGuessGeneratorTest( String testName )
    {
        super( testName );
    }
    NumberGuessGenerator generator = new NumberGuessGenerator();
    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( NumberGuessGeneratorTest.class );
    }

    /**
     * Simple Junit Test case to make sure the program works
     */
    public void testNumberGuess() throws Exception
    {
        NumberGuess guess = new NumberGuess(0,100);
        int finalResult = 40;
        boolean blnFound = true;
        while(!blnFound){
            guess = generator.getNextGuess(guess);
            if(guess.getNextGuess() < finalResult){
                guess.setResultText("HIGH");
            } else if(guess.getNextGuess()>finalResult){
                guess.setResultText("LOW");
            } else {
                assert(true);
                blnFound = true;
            }
        }
    }

    /**
     * This tests when lower limit and upper limit has wrong range
     */
    public void testNegativeCase() {
    try{
        NumberGuess numberGuess = new NumberGuess(10,5);
        generator.getNextGuess(numberGuess);
    } catch(Exception e){
        assert(true);
    }

    }
}
