import java.util.Scanner;

public class Main 
{
    private static boolean systemvalue=true;
    public static void main(String args[]) 
    {
        SatelliteCommand satelliteCmd = new SatelliteCommand();
        Scanner scanner = new Scanner(System.in);
        String command;
        
        System.out.println("   SATELLITE COMMAND CONTROL SYSTEM");
        System.out.println("Available Commands:");
        System.out.println("  - rotate");
        System.out.println("  - activatepanels");
        System.out.println("  - deactivatepanels");
        System.out.println("  - collectdata");
        System.out.println("  - undo");
        System.out.println("  - status");
        System.out.println("  - exit (to quit)");
        
        while(systemvalue) 
        {
            System.out.print("\nEnter command: ");
            command = scanner.nextLine().trim();
            
            if(command.equalsIgnoreCase("exit")) 
            {
                System.out.println("Shutting down Satellite Control System");
                break;
            }
            
            satelliteCmd.executeCommand(command);
        }
        scanner.close();
    }
}