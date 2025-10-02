package concrete_commands;

import command.Command;
import singleton.Satellite;

public class ActivatePanelsCommand implements Command 
{
    private Satellite satellite;
    
    public ActivatePanelsCommand(Satellite satellite) 
    {
        this.satellite = satellite;
    }
     
    public void execute() 
    {
        satellite.activatePanels();
    }
    
    public void unexecute() 
    {
        satellite.deactivatePanels();
    }
}