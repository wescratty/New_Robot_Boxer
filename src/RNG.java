/**
 * Created by wescratty on 10/31/15.
 */

// TODO On Uml this is an interface but I have not found a way to make a singleton interface or should we just have all
// of the methods in here?
    //todo trying to find how to make this to interface rather than class not sure we can do this with statics might just have to go all abstract


//public class RNG  {
//    private static RNG ourInstance = new RNG();
public  abstract class RNG  {
    static RNG ourInstance = null;


    public static RNG getInstance() {

        return ourInstance;
    }

    public RNG(){}


    public abstract int getRandInstance();
    public abstract int getRandomAttackDelay();
    public abstract int getRandomChoice(int choices);
    public abstract double getChance();
    public  abstract int getCoinFlip();





}
