package example;

import java.util.HashSet;

public class GuessNumGame {
    String answer;

    String result="%sA%sB";

    public GuessNumGame(String answer) {
        this.answer = answer;
    }

    public GuessNumGame(GenerateAnswerByRandom g) {
        this.answer = g.generateAnswer();
    }

    public String guessNum(String guess) {


        int absoluteCorrectNumber= countTotalCorrectNumber(guess);
        int containsNumber= countExistNumber(guess);

        return String.format(result,absoluteCorrectNumber,containsNumber-absoluteCorrectNumber);
    }

    public  int countTotalCorrectNumber(String guess){
        int absoluteCorrectNumber=0;
        for (int i = 0; i <answer.length() ; i++) {
            if (answer.charAt(i)==guess.charAt(i)){
                absoluteCorrectNumber++;
            }
        }
        return absoluteCorrectNumber;
    }

    public int countExistNumber(String guess){
        int containsNumber=0;
        HashSet<Character> answerSet= new HashSet<>();

        for(char number : answer.toCharArray()){
            answerSet.add(number);
        }

        for (int i = 0; i <guess.length() ; i++) {
            if (!answerSet.add(guess.charAt(i))){
                containsNumber++;
            }
        }
        return containsNumber;
    }


}
