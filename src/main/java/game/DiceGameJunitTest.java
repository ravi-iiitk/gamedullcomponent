package game;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
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


    @Test
    public void verifyEmptyCase()
    {
        final DiceGame diceGame = new DiceGame();
        List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
        custOutComes.add(new ArrayList<Integer>());
        custOutComes.add(new ArrayList<Integer>());
        diceGame.setOutcomes(custOutComes);
        try
        {
            diceGame.checkTheWinner();
            diceGame.printTheWinner();
        }
        catch (IndexOutOfBoundsException iob)
        {
            System.out.println(""+iob.getMessage());
        }

    }

    @Test
    public void verifyGetDiceMethodLessOne()
    {
        try
        {
            DiceGame.getDiceString(0);
        }
        catch (IllegalArgumentException iarg)
        {
            Assert.assertEquals("not a dice value",iarg.getMessage());;
        }



    }

    @Test
    public void verifyGetDiceMethodGreaterSix()
    {
        try
        {
            DiceGame.getDiceString(7);;
        }
        catch (IllegalArgumentException iarg)
        {
            Assert.assertEquals("not a dice value",iarg.getMessage());;
        }

    }

    @Test
    public void verifyGetDiceMethodCorrectOne()
    {

          final String Expected =
                  "-----\n" +
                          "|   |\n" +
                          "| * |\n" +
                          "|   |\n" +
                          "-----\n";

        Assert.assertEquals(Expected,DiceGame.getDiceString(1));
    }

    @Test
    public void verifyGetDiceMethodCorrectTwo()
    {

        String Expected =
                        "-----\n" +
                        "|  *|\n" +
                        "|   |\n" +
                        "|*  |\n" +
                        "-----\n";
        Assert.assertEquals(Expected,DiceGame.getDiceString(2));
    }

    @Test
    public void verifyGetDiceMethodCorrectThree()
    {

        String Expected =
                        "-----\n" +
                        "|  *|\n" +
                        "| * |\n" +
                        "|*  |\n" +
                        "-----\n";
        Assert.assertEquals(Expected,DiceGame.getDiceString(3));
    }

    @Test
    public void verifyGetDiceMethodCorrectFour()
    {

        String Expected =
                        "-----\n" +
                        "|* *|\n" +
                        "|   |\n" +
                        "|* *|\n" +
                        "-----\n";

        Assert.assertEquals(Expected,DiceGame.getDiceString(4));
    }

    @Test
    public void verifyGetDiceMethodCorrectFive()
    {

        String Expected =
                         "-----\n" +
                        "|* *|\n" +
                        "| * |\n" +
                        "|* *|\n" +
                        "-----\n";

        Assert.assertEquals(Expected,DiceGame.getDiceString(5));
    }

    @Test
    public void verifyGetDiceMethodCorrectSix()
    {

        String Expected =
                         "-----\n" +
                        "|* *|\n" +
                        "|* *|\n" +
                        "|* *|\n" +
                        "-----\n";
        Assert.assertEquals(Expected,DiceGame.getDiceString(6));
    }

    @Test
    public void checkdrawDicesMethod()
    {
        final DiceGame diceGame = new DiceGame();
        List<Integer> retDic = new ArrayList<Integer>();
        retDic = diceGame.drawDices();
        Iterator<Integer> iterator = retDic.iterator();
        while (iterator.hasNext()) {
            Assert.assertTrue(iterator.next()<=6);
        }
    }

    @Test
    public void checkRollDiceMethod()
    {
        final DiceGame diceGame = new DiceGame();
        List<List<Integer>> custOutComes = new ArrayList<List<Integer>>();
        custOutComes = diceGame.rollTheDice();
        for (List<Integer> l : custOutComes) {
            for (Integer s : l) {
                Assert.assertTrue(s<=6);
            }

        }
    }

}
