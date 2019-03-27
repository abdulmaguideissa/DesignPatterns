
import java.util.ArrayList;

public class Channel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String channelName;
    private String status;

    public Channel(String channelName, String status){
        this.channelName = channelName;
        this.status = status;
    }

    public String getChannelName(){
        return this.channelName;
    }

    public void setChannelName(String channelName){
        this.channelName = channelName;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public void notifyObservers(){
        for (Observer observer_ : observers){
            observer_.update(status);
        }
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
}
