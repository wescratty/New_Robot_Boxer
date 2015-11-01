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
    public double getChance(){
        return random.nextDouble();

    }
    public boolean getCoinFlip(){
        boolean flip = false;
        double chance = random.nextDouble();
        if(chance > 0.5){
            flip = true;
        }
        return flip;
    }



}
