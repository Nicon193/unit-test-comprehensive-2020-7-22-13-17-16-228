package example;

import java.util.HashSet;
import java.util.regex.Pattern;

public class isNumVaild {

    private final String FOUR_NUMBER_PATTERN = "[0-9]{4}";

    public boolean isLegalNum(String input) {
        boolean isVaild ;
        boolean isFourNum;
        boolean isNotRepeat;
        HashSet<Character> set = new HashSet<>();
        Pattern pattern =Pattern.compile(FOUR_NUMBER_PATTERN);

        isFourNum =pattern.matcher(input).matches();

        for (int i = 0; i <input.length() ; i++) {
            set.add(input.charAt(i));
        }

        isNotRepeat= set.size() == input.length();

        isVaild=isFourNum && isNotRepeat;
        return  isVaild;
    }
}
