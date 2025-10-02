package concrete_observers;

import observer.Observer;

public class Follower implements Observer 
{
    private String name;

    public Follower(String name) 
    {
        this.name = name;
    }

    public void update(String content) 
    {
        System.out.println(name + " received notification: New post - " + content);
    }
}
