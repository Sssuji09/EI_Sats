package singleton;
import java.util.ArrayList;
import java.util.List;

import observer.SatelliteObserver;

public class Satellite 
{
    private static Satellite orbitalsatellite;
    private String orientation;
    private int data;
    private String panel;
    private List<SatelliteObserver> observers = new ArrayList<>();

    private Satellite() 
    {
        if(orbitalsatellite != null) 
        {
            System.out.println("satellite already created");
        }
        this.orientation = "Stationery";
        this.data = 0;
        this.panel = "Inactive";
    }
    
    public static synchronized Satellite getInstance() 
    {
        if(orbitalsatellite == null) 
        {
            orbitalsatellite = new Satellite();
        }
        return orbitalsatellite;
    }
    public void addObserver(SatelliteObserver obs) 
    {
         observers.add(obs); 
    }
    private void notify(String msg) 
    {
         observers.forEach(o -> o.update(msg)); 
    }

    public void rotate(String direction) 
    {
        this.orientation = direction;
        notify("Rotated to " + direction); 
    }    
    
    public String getOrientation() 
    {
        return orientation;
    }
    
    public void activatePanels() 
    {
        this.panel = "Active";
        notify("Panels Activated"); 
    }
    
    public void deactivatePanels() 
    {
        this.panel = "Inactive";
        notify("Panels Deactivated");
    }
    
    public boolean collectData() 
    {
        if (panel.equals("Active")) 
        {
            data = data + 10;
            notify("Data Collected: " + data);
            return true;
        }
        else
        {
            notify("Cannot collect data. Solar Panels are Inactive.");
            return false;
        }
    }
    
    public void removeData(int amount) 
    {
        data -= amount;
        if (data < 0) data = 0;
        notify("Data removed. Current data: " + data);
    }
    
    public void displayStatus() 
    {
        System.out.println("\n Satellite Status:");
        System.out.println("Orientation: " + orientation);
        System.out.println("Solar Panels: " + panel);
        System.out.println("Data Collected: " + data);
    }
}