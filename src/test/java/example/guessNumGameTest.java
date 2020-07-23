package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class guessNumGameTest {
    @Test
    void should_return_4A0B_when_guessNum_given_answer_is_1234_guess_is_1234() {
        //given
        String actual;
        String answer ="1234";
        String guess ="1234";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("4A0B",actual);
    }
}
