package game;

import game.DiceGame;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGameTest {

    public static void main(String args[]) throws IOException {
        final DiceGame diceGame = new DiceGame();

        System.out.println("A small dice game!");
        int n;
        do {
            System.out.println("1. Play");
            System.out.println("0. Exit");
            System.out.print("input: ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();

            switch (n) {
                case 0:
                    break;
                case 1:

                    List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
                    custOutComes.add(new ArrayList<Integer>());
                    custOutComes.get(0).add(5);
                    custOutComes.get(0).add(6);
                    custOutComes.add(new ArrayList<Integer>());
                    custOutComes.get(1).add(5);
                    custOutComes.get(1).add(5);
                    for (List<Integer> l : custOutComes) {
                        System.out.println("Start list");
                        for (Integer s : l) {
                            System.out.println("Entry:  " + s);
                        }
                    }
                    diceGame.setOutcomes(custOutComes);
                    System.out.println("Your score is: " + diceGame.getScore(0));
                    System.out.println("Computer's score: " + diceGame.getScore(1));
                    System.out.println("\n");
                    diceGame.checkTheWinner();
                    System.out.println(diceGame.printTheWinner());
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("Please enter either 1 or 0 ..!");
                    System.out.println("\n");
                    break;
            }

        } while (n != 0);

        System.out.println("\n");
        System.out.println("Bye bye!");
    }
}