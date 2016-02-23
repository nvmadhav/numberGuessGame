package com.game.numberguess;

/**
 * Created by Venumadhav Nondapaka on 2/22/2016.
 *
 * This class is used to get the next guess number using binary search pattern.
 */
public class NumberGuessGenerator {
    private static final String NUMBER_HIGH = "HIGH";
    private static final String NUMBER_LOW = "LOW";

    /**
     * This method is used to get the next guess number based on the binary search pattern.
     * First it starts with middle number then starts search either end based on the user response.
     * @param numberGuess
     * @return NumberGuess object
     */
    public NumberGuess getNextGuess(NumberGuess numberGuess) throws Exception{
        if(numberGuess.getResultText()!=null && numberGuess.getResultText().equalsIgnoreCase(NUMBER_HIGH)) {
            numberGuess.setLowerLimit(numberGuess.getNextGuess());
        } else if(numberGuess.getResultText()!=null && numberGuess.getResultText().equalsIgnoreCase(NUMBER_LOW)) {
            numberGuess.setUpperLimit(numberGuess.getNextGuess());
        }
        if(numberGuess.getUpperLimit()<numberGuess.getLowerLimit()){
            //TODO: Implement custom exceptions and have meaningful name. Method should never throw regular EXCEPTION
            throw new Exception("System Error Occured. Please try again and make sure you input the values properly");
        }
        int nextGuess = numberGuess.getLowerLimit() + ((numberGuess.getUpperLimit()-numberGuess.getLowerLimit())/2);
        numberGuess.setNextGuess(nextGuess);
        System.out.println(numberGuess.toString());
        return numberGuess;
    }
}
