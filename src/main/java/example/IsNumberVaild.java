package example;

import java.util.HashSet;
import java.util.regex.Pattern;

public class IsNumberVaild {

    private final String FOUR_NUMBER_PATTERN = "[0-9]{4}";

    public boolean isLegalNum(String input) {
        boolean isVaild ;
        boolean isFourNum;
        boolean isNotRepeat;
        HashSet<Character> inputSet = new HashSet<>();
        Pattern pattern =Pattern.compile(FOUR_NUMBER_PATTERN);

        isFourNum =pattern.matcher(input).matches();

        for (int i = 0; i <input.length() ; i++) {
            inputSet.add(input.charAt(i));
        }

        isNotRepeat= inputSet.size() == input.length();

        isVaild=isFourNum && isNotRepeat;
        return  isVaild;
    }
}
