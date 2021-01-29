package GameStop;

import java.util.Random;

public class Dice {

    private int side;

    public int rolled() {
        //	GameStop.Dice dice1 = new GameStop.Dice();
        int side = getRandom(1, 6);
        //dice1.side = side;
        return side;
    }//roll

    int getRandom(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}///GameStop.Dice



