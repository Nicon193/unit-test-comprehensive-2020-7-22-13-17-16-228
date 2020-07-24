package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class generateAnswerByRandomTest {
    @Test
    void isVaildAnswer() {

        boolean isVaild ;
        boolean isFourNum;
        boolean isNotRepeat;
        HashSet<Character> set = new HashSet<>();
        Pattern pattern =Pattern.compile("[0-9]{4}");
        generateAnswerByRandom randomAnswer =new generateAnswerByRandom();

        String answer = randomAnswer.generateAnswer();

        isFourNum =pattern.matcher(answer).matches();

        for (int i = 0; i <answer.length() ; i++) {
            set.add(answer.charAt(i));

        }

        isNotRepeat= set.size() == answer.length();

        isVaild=isFourNum && isNotRepeat;

       assertEquals(true,isVaild) ;
    }
}
