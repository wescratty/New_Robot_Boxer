import java.util.Random;

/**
 * Created by wescratty on 10/31/15.
 */
public class ChanceBot {
    private Random random= new Random();

    public ChanceBot(){


    public ChanceBot(){
        super();
        random= new Random();
        ourInstance = this;
    }



    public int getRandInstance(){
        return random.nextInt();

    }
    public int getRandomAttackDelay(){
        return random.nextInt(1000);

    }
    public int getRandomChoice(int choices){
        return random.nextInt(3);

    }
    public double getChance(){
        return random.nextDouble();

    }
    public int getCoinFlip(){

        return random.nextInt(2);



    }

}
