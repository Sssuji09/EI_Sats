package composite;

import component.Approver;
import java.util.ArrayList;
import java.util.List;

public class ApprovalGroup implements Approver 
{
    private List<Approver> approvers = new ArrayList<>();

    public void addApprover(Approver approver) 
    {
        approvers.add(approver);
    }

    public void removeApprover(Approver approver) 
    {
        approvers.remove(approver);
    }

    public void approveLeave(String employeeName) 
    {
        for (Approver approver : approvers) 
        {
            approver.approveLeave(employeeName);
        }
    }
}
