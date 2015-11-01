/**
 * Created by wescratty on 10/31/15.
 */
public interface Subject {


    void register(Observer o);

    void unregister(Observer o);

    void notifyObserver(int i);
    void setSentMessage(int i);





}