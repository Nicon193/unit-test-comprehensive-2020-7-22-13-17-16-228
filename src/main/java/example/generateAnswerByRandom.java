package example;

import java.util.ArrayList;
import java.util.Random;

public class generateAnswerByRandom implements createAnswer{
    @Override
    public String generateAnswer() {
        StringBuilder stringBuilder =new StringBuilder();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <9 ; i++) {
            arrayList.add(i);
        }
        Random random = new Random();

        for (int i = 0; i <4 ; i++) {
            int index =random.nextInt(arrayList.size());
            stringBuilder.append(arrayList.indexOf(index));
            arrayList.remove(index);

        }

        return stringBuilder.toString();
    }
}
