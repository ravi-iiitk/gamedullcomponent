package game;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class DiceGameJunitTest {
    @Test
    public void verifyWinnerCase()
    {
        final DiceGame diceGame = new DiceGame();
        List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(0).add(5);
        custOutComes.get(0).add(6);
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(1).add(5);
        custOutComes.get(1).add(5);
        int count=0;
        for (List<Integer> l : custOutComes) {
            for (Integer s : l) {
                if(count==0)
                    System.out.println("Score Set for Player -1 :  " + s);
                else
                    System.out.println("Score Set for Player -2 :  " + s);
            }
            count++;
        }
        diceGame.setOutcomes(custOutComes);
        System.out.println("\n");
        diceGame.checkTheWinner();
        Assert.assertEquals("Great you won :)...!!",diceGame.printTheWinner());
    }

    @Test
    public void verifyLossCase()
    {
        final DiceGame diceGame = new DiceGame();
        List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(0).add(5);
        custOutComes.get(0).add(4);
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(1).add(5);
        custOutComes.get(1).add(5);
        int count=0;
        for (List<Integer> l : custOutComes) {
            for (Integer s : l) {
                if(count==0)
                    System.out.println("Score Set for Player -1 :  " + s);
                else
                    System.out.println("Score Set for Player -2 :  " + s);
            }
            count++;
        }
        diceGame.setOutcomes(custOutComes);
        System.out.println("\n");
        diceGame.checkTheWinner();
        Assert.assertEquals("I am sorry you lost :(...!!",diceGame.printTheWinner());
    }

    @Test
    public void verifyTieCase()
    {
        final DiceGame diceGame = new DiceGame();
        List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(0).add(5);
        custOutComes.get(0).add(5);
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.get(1).add(5);
        custOutComes.get(1).add(5);
        int count=0;
        for (List<Integer> l : custOutComes) {
            for (Integer s : l) {
                if(count==0)
                    System.out.println("Score Set for Player -1 :  " + s);
                else
                    System.out.println("Score Set for Player -2 :  " + s);
            }
            count++;
        }
        diceGame.setOutcomes(custOutComes);
        System.out.println("\n");
        diceGame.checkTheWinner();
        Assert.assertEquals("Not bad, its a tie...!!",diceGame.printTheWinner());
    }


}
