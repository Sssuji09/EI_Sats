package invoker;

import command.Command;
import java.util.Stack;

public class SatelliteController 
{
    private Stack<Command> commandHistory = new Stack<>();
    
    public void executeCommand(Command command) 
    {
        command.execute();
        commandHistory.push(command);
    }
    
    public void undo() 
    {
        if (!commandHistory.isEmpty()) 
        {
            Command command = commandHistory.pop();
            System.out.println("Undoing last command");
            command.unexecute();
        } 
        else 
        {
            System.out.println("Nothing to undo");
        }
    }
    public int getHistorySize() 
    {
        return commandHistory.size();
    }
}
