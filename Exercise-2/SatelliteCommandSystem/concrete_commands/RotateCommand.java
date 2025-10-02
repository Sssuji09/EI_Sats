package concrete_commands;

import command.Command;
import singleton.Satellite;

public class RotateCommand implements Command 
{
    private Satellite satellite;
    private String newDirection;
    private String previousDirection;
    
    public RotateCommand(Satellite satellite, String direction) 
    {
        this.satellite = satellite;
        this.newDirection = direction;
    }
    
    public void execute() 
    {
        previousDirection = satellite.getOrientation();
        satellite.rotate(newDirection);
    }
    
    public void unexecute() 
    {
        satellite.rotate(previousDirection);
    }
}