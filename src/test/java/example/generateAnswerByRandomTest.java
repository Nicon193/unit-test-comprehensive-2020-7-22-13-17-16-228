package example;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class generateAnswerByRandomTest {
    @Test
    void isVaildAnswer() {

        boolean isVaild ;
        boolean isFourNum;
        boolean isNotRepeat;
        HashSet<Character> set = new HashSet<>();
        Pattern pattern =Pattern.compile("[0-9]{4}");
        GenerateAnswerByRandom randomAnswer =new GenerateAnswerByRandom();

        String answer = randomAnswer.generateAnswer();

        isFourNum =pattern.matcher(answer).matches();

        for (int i = 0; i <answer.length() ; i++) {
            set.add(answer.charAt(i));

        }

        isNotRepeat= set.size() == answer.length();

        isVaild=isFourNum && isNotRepeat;

        assertTrue(isVaild);
    }
}
