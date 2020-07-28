package example;

import java.util.Scanner;

public class playGame {

    private static final String GAME_START = "Game Start";

    public static void main(String[] args) {
        int times = 6;
        generateAnswerByRandom randomAnswer = new generateAnswerByRandom();
        String answer = randomAnswer.generateAnswer();
        isNumVaild isNumVaild = new isNumVaild();

        guessNumGame guessNumGame = new guessNumGame(answer);
        Scanner scanner = new Scanner(System.in);

        System.out.println(GAME_START);

        while (times >= 1 && scanner.hasNextLine()) {
            String inputLine = scanner.nextLine();
            String inputNum = inputLine.replace(" ", "");

            if (!isNumVaild.isLegalNum(inputNum)) {
                System.out.println("Wrong Input，Input again");
                times--;
            } else {
                String output = guessNumGame.guessNum(inputNum);
                System.out.println(output);
                if (output.equals("4A0B")) {
                    System.out.print("you win ");
                    break;
                }
                times--;

            }

        }
        System.out.println(("answer is " + answer));

    }
}
