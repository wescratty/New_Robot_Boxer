import java.awt.*;
import java.util.Objects;
//import java.util.Observable;
//import java.util.Observer;
import java.util.ArrayList;

/**
 * Created by wescratty on 10/31/15.
 */
public class Boxer implements Subject {

    private int id;
    private int fatigue;
    private int strengthScore;
    private int agilityScore;
    private int accuracy;
    private int reach;
    private int punchNum =0;
    private RNG rng;
    private Point center;
    //    private ArrayList<Attack> attackList;
    //private block:Block
    //public location:(double,double)
    private int exp;

    private ArrayList<Observer> observers;

    public  boolean sentMessage = false;
    private  ChanceBot chance = new ChanceBot();



    public Boxer() {


        observers = new ArrayList<Observer>();

    }

    public void setid(int id){
        this.id = id;
    }

    public int getid(){
        return this.id;
    }


public int selectMove(int i){
    this.punchNum = i;
    //TODO random move
    if(chance.getCoinFlip()==1){
    System.out.println("Boxer with id: " + this.id + " decided to punch");
    punch(i);
    }else{
        System.out.println("Boxer with id: "+this.id+" decided to stand there");
    }




    return 0;
}

    public void setSentMessage(int i){
        if(this.punchNum!=i) {
            sentMessage = true;
            System.out.println("Boxer with id: " + this.id + " got message");
        }

    }

// Uses the Subject interface to update all Observers




        public void register(Observer newObserver) {

            // Adds a new observer to the ArrayList

            observers.add(newObserver);

        }

        public void unregister(Observer deleteObserver) {

            // Get the index of the observer to delete

            int observerIndex = observers.indexOf(deleteObserver);

            // Print out message (Have to increment index to match)

            System.out.println("Observer " + (observerIndex+1) + " deleted");

            // Removes observer from the ArrayList

            observers.remove(observerIndex);

        }

        public void notifyObserver(int i) {

            // Cycle through all observers and notifies them of
            // price changes

            for(Observer observer : observers){

                observer.update(i);//ibmPrice, aaplPrice, googPrice

            }
        }

        public void punch(int i){


            notifyObserver(i);
//            Thread.sleep(punchTime);
//            getBlockState();

        }




}

//
////    public location move(): {
////
////    }
////    public Attack getAttack(){
////
////    }
//
//    private void updateAttacks(){
//
//    }
//
//    //    private Attack updateAttack(int fatigue, Attack attack){
////
////    }
//    public void getAction(){
//
//    }
//    //    public Block getBlock(){
////
////    }
////    public Block updateBlock(int fatigue, Block block){
////
////    }
//    public void reset(){
//
//    }
//    private void resetAttacks(){
//
//    }
//    private void resetBlocks(){
//
//    }
////    public grow()<String in to dialogue, string out of dialogue pipe delim, attribute order,unused points leader>