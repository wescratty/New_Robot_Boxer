import java.util.Random;

/**
 * Created by wescratty on 10/31/15.
 */
public class ChanceBot {
    private Random random= new Random();

    public ChanceBot(){


    }



//    public int getInstance(){
//        return random.nextInt();
//
//    }
    public int getRandomAttackDelay(){
        return random.nextInt();

    }
    public int getRandomChoice(int choices){
        return random.nextInt(choices);

    }
    public int getChance(){
        return random.nextInt();

    }
    public int getCoinFlip(){
        return random.nextInt();

    }

}
