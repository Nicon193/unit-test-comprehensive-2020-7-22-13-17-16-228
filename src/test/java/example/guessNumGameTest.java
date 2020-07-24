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

    @Test
    void should_return_0A4B_when_guessNum_given_answer_is_1234_guess_is_4321() {
        //given
        String actual;
        String answer ="1234";
        String guess ="4321";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("0A4B",actual);
    }

    @Test
    void should_return_1A1B_when_guessNum_given_answer_is_1234_guess_is_1563() {
        //given
        String actual;
        String answer ="1234";
        String guess ="1563";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("1A1B",actual);
    }

    @Test
    void should_return_2A2B_when_guessNum_given_answer_is_1234_guess_is_1324() {
        //given
        String actual;
        String answer ="1234";
        String guess ="1324";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("2A2B",actual);
    }

    @Test
    void should_return_0A2B_when_guessNum_given_answer_is_1234_guess_is_7623() {
        //given
        String actual;
        String answer ="1234";
        String guess ="7623";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("0A2B",actual);
    }

    @Test
    void should_return_0A0B_when_guessNum_given_answer_is_1234_guess_is_7689() {
        //given
        String actual;
        String answer ="1234";
        String guess ="7689";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("0A0B",actual);
    }


    @Test
    void should_return_true_when_guessNum_given_answer_is_1234_guess_is_7689() {
        //given
        String actual;
        String answer ="1234";
        String guess ="7689";

        //when
        guessNumGame gNG =new guessNumGame(answer);
        actual=gNG.guessNum(guess);

        //then
        assertEquals("0A0B",actual);
    }



}
