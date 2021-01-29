package GameStop;

import java.util.Random;
import java.util.Scanner;

public class StartTheGame {
    int nPlayers;
    //String[] playerNames;
    //int[] diceArray;


    //Scanner scan = new Scanner (System.in);
    //int number = Integer.parseInt (scan.nextLine ());
    //String text = scan.nextLine ();


    Dice d1;
    Dice d2;
    Dice d3;
    Dice d4;
    Dice d5;
    /*
     *
     * Player
     * score
     * roll()
     * reRoll()
     * HoldDiceResults()
     *
     * GameStop.Dice
     * points[]
     *
     *
     *
     *
     * Game
     * GameStop.ScoreBoard [] (matrix)
     * SelectScoreboardRow()
     * int row [15]
     * Row
     * name
     * value
     * isFilled
     *
     * players[]
     *
     * GameStop.PlayerGo
     * dice[] roll1
     * dice[] roll2
     * dice[] roll3
     * */

    //Test
    void setUp() {
        d1 = new Dice();
        d2 = new Dice();
        d3 = new Dice();
        d4 = new Dice();
        d5 = new Dice();
    }

    //Test
    boolean isBetweenOneAndSix(int point) {
        if (point <= 6 && point > 0)
            return true;
        return false;
    }

    //Test
    int testRoll() {
        int point = d1.rolled();
        return point;
    }

    //Test
    private boolean slotsContainsDice(PlayerGo go) {
        for (Dice slot : go.round1)
            if (slot == null)
                return false;
        return true;
    }

    public void CountPlayers() {

        ScoreBoard KeepCount = new ScoreBoard(2);

        if (KeepCount.nPlayers == 2)
            System.out.println("Count = " +KeepCount.nPlayers);

        }

    void CheckOnePlayer() {

        ScoreBoard KeepCount = new ScoreBoard(1);

        //if (KeepCount.players[].RX1 == "Go team!!!")
           // System.out.println("Count = " +KeepCount.players);
            //System.out.println("Test fail = " +KeepCount.players);
    }


    public static void main(String[] args) {
        StartTheGame game = new StartTheGame();
        game.setUp();
        //Test 1
        System.out.println(game.isBetweenOneAndSix(game.testRoll()));

        PlayerGo go = new PlayerGo();

        //game.slotsContainsDice(go);
        StartTheGame game2 = new StartTheGame();
        System.out.println("That there are dice in the array is " + game2.slotsContainsDice(go));

        //System.out.println("Count" +game2.CountPlayers());
        game2.CountPlayers();
        game2.CheckOnePlayer();



    }

}



