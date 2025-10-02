import singleton.Satellite;
import command.Command;
import concrete_commands.*;
import invoker.SatelliteController;
import observer.FileLogger;
import java.util.Scanner;

public class SatelliteCommand 
{
    private Satellite sat1;
    private SatelliteController controller;
    private Scanner scanner;

    public SatelliteCommand() 
    {
        sat1 = Satellite.getInstance();
        sat1.addObserver(new FileLogger("satellite_logs.txt"));
        controller = new SatelliteController();
        this.scanner = scanner;
    }
    
    public void executeCommand(String commandInput) 
    {
        Command command = null;
        
        switch(commandInput.toLowerCase()) 
        {
            case "rotate":
                System.out.print("Enter direction (North/South/East/West): ");
                Scanner sc = new Scanner(System.in);
                String direction = sc.nextLine();
                if (direction.equalsIgnoreCase("North") || direction.equalsIgnoreCase("South") || direction.equalsIgnoreCase("East") || direction.equalsIgnoreCase("West")) 
                {
                    command = new RotateCommand(sat1, direction);
                }
                else 
                {
                    System.out.println("Invalid direction. Please enter North, South, East, or West.");
                    return;
                }
                break;
                
            case "activatepanels":
                command = new ActivatePanelsCommand(sat1);
                break;
                
            case "deactivatepanels":
                command = new DeactivatePanelsCommand(sat1);
                break;
                
            case "collectdata":
                command = new CollectDataCommand(sat1);
                break;
                
            case "undo":
                controller.undo();
                return;
                
            case "status":
                sat1.displayStatus();
                return;
                
            default:
                System.out.println("Invalid command, Available commands:");
                System.out.println("  - rotate");
                System.out.println("  - activatepanels");
                System.out.println("  - deactivatepanels");
                System.out.println("  - collectdata");
                System.out.println("  - undo");
                System.out.println("  - status");
                return;
        }
        
        if(command != null) 
        {
            controller.executeCommand(command);
        }
    }
}