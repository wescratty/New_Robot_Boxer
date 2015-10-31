/**
 * Created by wescratty on 10/31/15.
 */
public class RNG extends ChanceBot {
    private static RNG ourInstance = new RNG();

    public static RNG getInstance() {
        return ourInstance;
    }

    private RNG() {
    }


    int temp =0;


    int i = getRandomAttackDelay();


    int l = getRandomChoice(temp);


    int j = getChance();


    int k = getCoinFlip();



}
