import java.util.Random;

public class Funktioner {
    private static Random rand = new Random();
    private int pips;
    public Funktioner(){
        roll();
    }
    public  void roll(){
        pips = 1 + rand.nextInt(6);
    }


    public int getResult(){
        return pips;
    }


}
