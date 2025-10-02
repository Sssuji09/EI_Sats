package concrete_subject;

import subject.Subject;
import observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class Influencer implements Subject 
{
    private List<Observer> followers = new ArrayList<>();
    private String latestPost;

    public void registerObserver(Observer observer) 
    {
        followers.add(observer);
    }

    public void removeObserver(Observer observer) 
    {
        followers.remove(observer);

    }

    public void notifyObservers(String content) 
    {
        for (Observer follower : followers) 
        {
            follower.update(content);
        }
    }

    public void postContent(String content) 
    {
        this.latestPost = content;
        System.out.println("Influencer posted: " + content);
        notifyObservers(content);
    }
}
