package example;

import java.util.Scanner;

public class playGame {

    private static final String GAME_START = "Game Start";
    private static final String WRONG_MESSAGE = "Wrong Input，Input again";
    private static final String GAME_ANSWER = "4A0B";
    private static final String YOU_WIN = "you win ";
    private static final String ANSWER_IS = "answer is ";

    public static void main(String[] args) {
        int times = 6;
        GenerateAnswerByRandom randomAnswer = new GenerateAnswerByRandom();
        String answer = randomAnswer.generateAnswer();
        IsNumberVaild IsNumberVaild = new IsNumberVaild();

        GuessNumGame guessNumGame = new GuessNumGame(answer);
        Scanner scanner = new Scanner(System.in);

        System.out.println(GAME_START);

        while (times >= 1 && scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            String inputNumber = inputLine.replace(" ", "");

            if (!IsNumberVaild.isLegalNum(inputNumber)) {
                System.out.println(WRONG_MESSAGE);
                times--;
            } else {
                String output = guessNumGame.guessNum(inputNumber);
                System.out.println(output);
                if (output.equals(GAME_ANSWER)) {
                    System.out.print(YOU_WIN);
                    break;
                }
                times--;

            }

        }
        System.out.println((ANSWER_IS + answer));

    }
}
