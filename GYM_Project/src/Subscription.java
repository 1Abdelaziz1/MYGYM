import java.time.LocalDate;

public class Subscription {
    // Attributes
    private int customerId;
    private int assignedCoachId;
    private MembershipPlan membershipPlan;

    // Constructor
    public Subscription(int customerId, int assignedCoachId, MembershipPlan membershipPlan) {
        this.customerId = customerId;
        this.assignedCoachId = assignedCoachId;
        this.membershipPlan = membershipPlan;
    }

    // Getter and Setter methods
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAssignedCoachId() {
        return assignedCoachId;
    }

    public void setAssignedCoachId(int assignedCoachId) {
        this.assignedCoachId = assignedCoachId;
    }

    public MembershipPlan getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(MembershipPlan membershipPlan) {
        this.membershipPlan = membershipPlan;
    }
}







//    // Example usage
//    public static void main(String[] args) {
//        // Creating a MembershipPlan object
//        MembershipPlan membershipPlan = new MembershipPlan(LocalDate.now(), 6, 4);
//
//        // Creating a Subscription object
//        Subscription subscription = new Subscription(1, 101, membershipPlan);
//
//        // Accessing and printing subscription details
//        System.out.println("Customer ID: " + subscription.getCustomerId());
//        System.out.println("Assigned Coach ID: " + subscription.getAssignedCoachId());
//        System.out.println("Membership Plan Details: " + subscription.getMembershipPlan());
//    }