/**
 * Created by wescratty on 10/31/15.
 */
public interface Observer {

     void update(int i);
    //    HurtBox calculation;
     boolean  notifyRange();
     boolean  notifyPunch();
     void update();
     int notifyDamage();
     int  calculateDamage();

}