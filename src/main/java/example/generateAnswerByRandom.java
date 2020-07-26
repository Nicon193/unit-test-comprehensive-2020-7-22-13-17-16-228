package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class generateAnswerByRandom implements createAnswer{
    @Override
    public String generateAnswer() {
        StringBuilder stringBuilder =new StringBuilder();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <=9 ; i++) {
            arrayList.add(i);
        }
        Collections.shuffle(arrayList);
        for (int i = 0; i <4 ; i++) {
            stringBuilder.append(arrayList.get(i));

        }

        return stringBuilder.toString();
    }
}
