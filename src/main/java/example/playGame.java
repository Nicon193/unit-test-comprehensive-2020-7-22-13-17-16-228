package example;

import java.util.Scanner;

public class playGame {
    public static void main(String[] args) {
        int times = 6;
        generateAnswerByRandom randomAnswer = new generateAnswerByRandom();
        String answer = randomAnswer.generateAnswer();
        isNumVaild isNumVaild = new isNumVaild();

//        System.out.println("answer is "+answer);
        guessNumGame guessNumGame = new guessNumGame(answer);
        Scanner scan = new Scanner(System.in);

        System.out.println("Game Start");

        while (times >= 1 && scan.hasNextLine()) {
            String inputLine = scan.nextLine();
            String inputNum = inputLine.replace(" ", "");
            // System.out.println(inputNum);
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
