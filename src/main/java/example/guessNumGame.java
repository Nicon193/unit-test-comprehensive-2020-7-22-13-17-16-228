package example;

import java.util.HashSet;

public class guessNumGame {
    String answer;
    String result="%sA%sB";

    public guessNumGame(String answer) {
        this.answer = answer;
    }

    public String guessNum(String guess) {


        int a=countTotalCorrectNum(guess);
        int b=countExistNum(guess);

        return String.format(result,a,b-a);
    }

    public  int countTotalCorrectNum(String guess){
        int a=0;
        for (int i = 0; i <answer.length() ; i++) {
            if (answer.charAt(i)==guess.charAt(i)){
                a++;
            }
        }
        return a;
    }

    public int countExistNum(String guess){
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
