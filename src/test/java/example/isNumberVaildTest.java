package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class isNumberVaildTest {
    @Test
    void should_return_false_when_isLegalNum_given_input_is_11() {
        //given
        String input = "11";
        boolean isLegal;

        //when
        IsNumberVaild judge =new IsNumberVaild();
        isLegal =judge.isLegalNum(input);

        //then
        assertEquals(false,isLegal);


    }

    @Test
    void should_return_false_when_isLegalNum_given_input_is_1124() {
        //given
        String input = "1124";
        boolean isLegal;

        //when
        IsNumberVaild judge =new IsNumberVaild();
        isLegal =judge.isLegalNum(input);

        //then
        assertEquals(false,isLegal);

    }

    @Test
    void should_return_true_when_isLegalNum_given_input_is_1234() {
        //given
        String input = "1234";
        boolean isLegal;

        //when
        IsNumberVaild judge =new IsNumberVaild();
        isLegal =judge.isLegalNum(input);

        //then
        assertEquals(true,isLegal);

    }

    @Test
    void should_return_false_when_isLegalNum_given_input_is_11234() {
        //given
        String input = "11234";
        boolean isLegal;

        //when
        IsNumberVaild judge =new IsNumberVaild();
        isLegal =judge.isLegalNum(input);

        //then
        assertEquals(false,isLegal);

    }
}
