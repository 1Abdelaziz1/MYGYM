import java.util.List;

public class Gym {
    // Attributes
    private String name;
    private String address;
    private String phoneNumber;
    private List<Equipment> sportsEquipments;
    private List<Coach> coaches;
    private List<String> subscriptions;

    // Constructor
    public Gym(String name, String address, String phoneNumber, List<Equipment> sportsEquipments,
               List<Coach> coaches, List<String> subscriptions) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sportsEquipments = sportsEquipments;
        this.coaches = coaches;
        this.subscriptions = subscriptions;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Equipment> getSportsEquipments() {
        return sportsEquipments;
    }

    public void setSportsEquipments(List<Equipment> sportsEquipments) {
        this.sportsEquipments = sportsEquipments;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public List<String> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    // Example usage
    public static void main(String[] args) {
        // Creating Gym object
        Gym gym = new Gym("FitZone", "123 Main St", "555-1234", null, null, List.of("Gold Plan", "Silver Plan"));

        // Setting up Equipment and Coach objects
        Equipment treadmill = new Equipment("Treadmill", "TM001", 5, "treadmill_photo.jpg");
        Equipment rowingMachine = new Equipment("Rowing Machine", "RM002", 3, "rowing_machine_photo.jpg");

        Coach coach1 = new Coach(101, "John Coach", 'M', "789 Pine St", "555-8765", "john.coach@example.com", 8);
        Coach coach2 = new Coach(102, "Jane Coach", 'F', "987 Oak St", "555-9876", "jane.coach@example.com", 6);

        // Adding Equipment and Coach objects to the Gym
        gym.setSportsEquipments(List.of(treadmill, rowingMachine));
        gym.setCoaches(List.of(coach1, coach2));

        // Using the Gym object
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Gym Address: " + gym.getAddress());
        System.out.println("Gym Phone Number: " + gym.getPhoneNumber());
        System.out.println("List of Subscriptions: " + gym.getSubscriptions());
    }
}
