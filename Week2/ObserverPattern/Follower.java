
public class Follower implements Observer {
    private String followerName;

    public Follower(String followerName){
        this.followerName = followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    public String getFollowerName(){
        return this.followerName;
    }

    public void update(String status){

    }

    public void play(){

    }
}
