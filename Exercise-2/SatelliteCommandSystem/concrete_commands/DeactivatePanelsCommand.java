package concrete_commands;

import command.Command;
import singleton.Satellite;

public class DeactivatePanelsCommand implements Command 
{
    private Satellite satellite;
    
    public DeactivatePanelsCommand(Satellite satellite) 
    {
        this.satellite = satellite;
    }
    
    public void execute() 
    {
        satellite.deactivatePanels();
    }
    
    public void unexecute() 
    {
        satellite.activatePanels();
    }
}