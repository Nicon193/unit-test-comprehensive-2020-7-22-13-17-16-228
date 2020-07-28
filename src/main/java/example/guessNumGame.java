package example;

import java.util.HashSet;

public class guessNumGame {
    String answer;

    String result="%sA%sB";

    public guessNumGame(String answer) {
        this.answer = answer;
    }

    public guessNumGame(generateAnswerByRandom g) {
        this.answer = g.generateAnswer();
    }

    public String guessNum(String guess) {


        int absoluteCorrectNumber= countTotalCorrectNumber(guess);
        int containsNumber= countExistNumber(guess);

        return String.format(result,absoluteCorrectNumber,containsNumber-absoluteCorrectNumber);
    }

    public  int countTotalCorrectNumber(String guess){
        int a=0;
        for (int i = 0; i <answer.length() ; i++) {
            if (answer.charAt(i)==guess.charAt(i)){
                a++;
            }
        }
        return a;
    }

    public int countExistNumber(String guess){
        int b=0;
        HashSet<Character> set= new HashSet<>();

        for(char c : answer.toCharArray()){
            set.add(c);
        }

        for (int i = 0; i <guess.length() ; i++) {
            if (!set.add(guess.charAt(i))){
                b++;
            }
        }
        return b;
    }


}
