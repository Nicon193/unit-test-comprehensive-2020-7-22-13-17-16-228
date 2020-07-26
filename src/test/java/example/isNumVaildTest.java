package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isNumVaildTest {
    @Test
    void should_return_false_when_isLegalNum_given_input_is_11() {
        //given
        String input = "11";
        boolean isLegal;

        //when
        isNumVaild judge =new isNumVaild();
        isLegal =judge.isLegalNum();

        //then
        assertEquals(false,isLegal);


    }
}
