package leaf;

import component.Approver;

public class HR implements Approver 
{
    private String name;

    public HR(String name) 
    {
        this.name = name;
    }

    public void approveLeave(String employeeName) 
    {
        System.out.println("HR " + name + " approved leave for " + employeeName);
    }
}
