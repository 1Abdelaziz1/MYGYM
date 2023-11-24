import java.util.List;

public class Customer extends Person {
    // Additional attributes for Customer
    private String subscription;
    private List<String> inBodyInfo;

    // Constructor
    public Customer(int id, String name, char gender, String address, String phoneNumber, String email,
                    String subscription, List<String> inBodyInfo) {
        super(id, name, gender, address, phoneNumber, email);
        this.subscription = subscription;
        this.inBodyInfo = inBodyInfo;
    }

    // Getter and Setter methods for additional attributes
    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public List<String> getInBodyInfo() {
        return inBodyInfo;
    }

    public void setInBodyInfo(List<String> inBodyInfo) {
        this.inBodyInfo = inBodyInfo;
    }

    // Additional functionalities
    public void getCoachInfo(String coachName, String coachPhoneNumber, String workingHours) {
        System.out.println("Coach Information:");
        System.out.println("Name: " + coachName);
        System.out.println("Phone Number: " + coachPhoneNumber);
        System.out.println("Working Hours: " + workingHours);
    }

    public void displayGymEquipment() {
        System.out.println("List of Gym Equipment:");
        // Display the list of gym equipment
        // You can add the actual equipment details here
    }

    public void displayMembershipPlanDetails() {
        System.out.println("Membership Plan Details:");
        // Display the details of the membership plan
        // You can add the actual plan details here
    }

    public void displayInBodyInfo(String date) {
        System.out.println("In-Body Information at " + date + ":");
        // Display in-body information at a specific date
        // You can add the actual in-body information details here
    }

    public void displayWeightLossGoal() {
        System.out.println("Weight Loss Goal:");
        // Display the calculation for how many kilos need to be reduced
        // You can perform the calculation based on the customer's body details
        // and provide the result here
    }
}









    // Example usage
//    public static void main(String[] args) {
//        // Creating a Customer object
//        Customer customer = new Customer(1, "Jane Doe", 'F', "456 Oak St", "555-5678", "jane.doe@example.com",
//                "Gold Plan", List.of("Date: 2023-01-01, Weight: 70kg, Body Fat: 25%"));
//
//        // Using the additional functionalities
//        customer.getCoachInfo("John Trainer", "555-9876", "9 AM - 5 PM");
//        customer.displayGymEquipment();
//        customer.displayMembershipPlanDetails();
//        customer.displayInBodyInfo("2023-01-01");
//        customer.displayWeightLossGoal();
//    }

