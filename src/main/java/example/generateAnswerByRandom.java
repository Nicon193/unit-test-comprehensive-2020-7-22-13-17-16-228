package example;

import java.util.ArrayList;
import java.util.Collections;

public class generateAnswerByRandom implements CreateAnswer {
    private final int answerLength = 4;
    private final int maxNumber = 9;

    @Override
    public String generateAnswer() {
        StringBuilder answer =new StringBuilder();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= maxNumber; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        for (int i = 0; i < answerLength ; i++) {
            answer.append(arrayList.get(i));

        }

        return answer.toString();
    }
}
