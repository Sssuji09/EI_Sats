package observer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements SatelliteObserver 
{
    private String filePath;

    public FileLogger(String filePath) 
    {
        this.filePath = filePath;
    }

    
    public void update(String message) 
    {
        try (FileWriter fw = new FileWriter(filePath, true)) 
        { 
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            fw.write("[" + timestamp + "] " + message + "\n");
        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
