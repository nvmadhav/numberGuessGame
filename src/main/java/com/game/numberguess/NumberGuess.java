package com.game.numberguess;

/**
 * Created by Venumadhav Nondapaka on 2/22/2016.
 *
 * This class is used as a domain object to set the values required for number guess generator.
 */
public class NumberGuess {
    private int lowerLimit;
    private int upperLimit;
    private String resultText;
    private int nextGuess;

    public NumberGuess(int lowerLimit,int upperLimit){
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public int getLowerLimit() {
        return lowerLimit;
    }

    public int getUpperLimit() {
        return upperLimit;
    }

    public String getResultText() {
        return resultText;
    }

    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public int getNextGuess() {
        return nextGuess;
    }

    public void setNextGuess(int nextGuess) {
        this.nextGuess = nextGuess;
    }

    @Override
    public String toString() {
        return "LowerLimit:" + lowerLimit + " UpperLimit:"+upperLimit + " nextGuess:"+nextGuess;
    }
}
