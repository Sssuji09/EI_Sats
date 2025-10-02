import component.Approver;
import composite.ApprovalGroup;
import leaf.*;

public class Main 
{
    public static void main(String[] args) 
    {
        Approver manager1 = new Manager("Rakesh");
        Approver hr1 = new HR("Thenmozhi");

        ApprovalGroup approvalChain = new ApprovalGroup();
        approvalChain.addApprover(manager1);
        approvalChain.addApprover(hr1);

        System.out.println("Leave Request Approval Workflow:");
        approvalChain.approveLeave("Sathya");
    }
}
