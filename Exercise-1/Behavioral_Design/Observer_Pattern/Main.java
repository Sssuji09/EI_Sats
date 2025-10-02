import observer.Observer;
import concrete_observers.Follower;
import concrete_subject.Influencer;

public class Main 
{
    public static void main(String[] args) 
    {
        Influencer influencer = new Influencer();

        Observer follower1 = new Follower("Sathya");
        Observer follower2 = new Follower("Thenmozhi");

        influencer.registerObserver(follower1);
        influencer.registerObserver(follower2);

        influencer.postContent("Hey guys! Check out my new vlog on travel tips!");
        
        influencer.removeObserver(follower1);

        influencer.postContent("Just uploaded a new cooking recipe reel!");
    }
}
