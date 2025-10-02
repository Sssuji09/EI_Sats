package leaf;

import component.Approver;

public class Manager implements Approver 
{
    private String name;

    public Manager(String name) 
    {
        this.name = name;
    }

    public void approveLeave(String employeeName) 
    {
        System.out.println("Manager " + name + " approved leave for " + employeeName);
    }
}
