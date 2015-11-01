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
    private int bNum;
    private int fatigue;
    private int strengthScore;
    private int agilityScore;
    private int accuracy;
    private int reach;
    private int punchTime = 1000;
    int punchNum =0;
    private RNG rng;
    private Point center;
    private AudioPlayer player;
    //    private ArrayList<Attack> attackList;
    //private block:Block
    //public location:(double,double)
    private int exp;

    private ArrayList<Observer> observers;

    public  boolean sentMessage = false;
    public  boolean didBLock = false;
    private  ChanceBot chance = new ChanceBot();



    public Boxer() {


        observers = new ArrayList<Observer>();

    }

    public void setid(int id, int bNum){
        this.id = id;
        this.bNum = bNum;

    }

    public int getid(){
        return this.id;
    }


public int selectMove(){
//    this.punchNum = i;
    //TODO random move

    checkForPunch();
    int choice =chance.getRandomChoice();
    if(choice==0){
    System.out.println("Boxer with id: " + this.id + " decided to punch"+ "Punch:  ");
    punch();
    }else if(choice==1) {
        System.out.println("Boxer with id: "+this.id+" decided to stand there");
    }else if(choice==3) {
        System.out.println("Boxer with id: " + this.id + " decided to stand there");

    }
    checkForPunch();


    return 0;
}

    public void setSentMessage(){
//        if(this.punchNum!=i) {
            sentMessage = true;
            System.out.println("Boxer with id: " + this.id + " got message about punch: ");
//        }

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

        public void notifyObserverOfPunch() {

            // Cycle through all observers and notifies them of
            // price changes

            for(Observer observer : observers){
                if(observer.getObserverId()!=this.bNum) {

                    observer.notifyPunch();//ibmPrice, aaplPrice, googPrice
                    System.out.println("Notifying Observer " + (observer.getObserverId()));
                }

            }
        }


    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes

        for(Observer observer : observers){
            if(observer.getObserverId()!=this.bNum) {

                observer.update();//ibmPrice, aaplPrice, googPrice
                System.out.println("Notifying Observer " + (observer.getObserverId()));
            }

        }
    }


    public void observerCheckDidBLock() {

        // Cycle through all observers and notifies them of
        // price changes

        for(Observer observer : observers){
            if(observer.getObserverId()!=this.bNum) {

                observer.observerCheckDidBLock();//ibmPrice, aaplPrice, googPrice
                System.out.println("Notifying Observer " + (observer.getObserverId()));
            }

        }
    }



    public void punch(){

            try {

                notifyObserverOfPunch();  //punch in motion
                Thread.sleep(punchTime);  // wait
//                checkForPunch();
                observerCheckDidBLock();  // see if blocked
//
            }catch(InterruptedException e)
                {}

        }

    public void checkDidBlock(){
        AudioPlayer player=AudioPlayer.getInstance();

        if(this.didBLock){
            System.out.println(this.id+" blocked punch");
            player.blockSound();
        }else{
            System.out.println(this.id+" got Punched in face");
            player.punchSound();
        }
//        player.punchSound();
        this.didBLock = false;
//        this.sentMessage= false;
        //return this.didBLock;

    }

    public void checkForPunch(){
        if(this.sentMessage){
            this.sentMessage= false;
            this.didBLock = true;
        }
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