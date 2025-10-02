package concrete_commands;

import command.Command;
import singleton.Satellite;

public class CollectDataCommand implements Command 
{
    private Satellite satellite;
    private boolean wasSuccessful;
    
    public CollectDataCommand(Satellite satellite) 
    {
        this.satellite = satellite;
        this.wasSuccessful = false;
    }
    
    public void execute() 
    {
        wasSuccessful = satellite.collectData();
    }
    
    public void unexecute() 
    {
        if (wasSuccessful) 
        {
            satellite.removeData(10);
        }
        else 
        {
            System.out.println("Nothing to undo - data collection was not successful");
        }
    }
}