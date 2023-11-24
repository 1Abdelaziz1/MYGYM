import java.util.ArrayList;
import java.util.List;

public class Coach extends Person {
    private static final int MAX_CUSTOMERS = 10;
    private int maxWorkingHoursPerDay;
    private List<Customer> customers;

    public Coach(int id, String name, char gender, String address, String phoneNumber, String email,
                 int maxWorkingHoursPerDay) {
        super(id, name, gender, address, phoneNumber, email);
        this.maxWorkingHoursPerDay = maxWorkingHoursPerDay;
        this.customers = new ArrayList<>();
    }

    public int getMaxWorkingHoursPerDay() {
        return maxWorkingHoursPerDay;
    }

    public void setMaxWorkingHoursPerDay(int maxWorkingHoursPerDay) {
        this.maxWorkingHoursPerDay = maxWorkingHoursPerDay;
    }

    public void addCustomer(Customer customer) {
        if (customers.size() < MAX_CUSTOMERS) {
            customers.add(customer);
            System.out.println("Customer added successfully.");
        } else {
            System.out.println("Cannot add more customers. Maximum limit reached.");
        }
    }

    public void showCustomerList() {
        System.out.println("List of Coach's Customers:");
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
        }
    }

    public List<String> getInBodyHistory(int customerId) {
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                return customer.getInBodyInfo();
            }
        }
        return null;
    }

    public Customer getCustomerDetailsByName(String customerName) {
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public void showFemaleCustomers() {
        System.out.println("List of Female Customers:");
        for (Customer customer : customers) {
            if (customer.getGender() == 'F') {
                System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
            }
        }
    }

    public void showMaleCustomers() {
        System.out.println("List of Male Customers:");
        for (Customer customer : customers) {
            if (customer.getGender() == 'M') {
                System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());
            }
        }
    }

}











//    // Example usage
//    public static void main(String[] args) {
//        // Creating a Coach object
//        Coach coach = new Coach(101, "John Coach", 'M', "789 Pine St", "555-8765", "john.coach@example.com", 8);
//
//        // Creating Customer objects
//        Customer customer1 = new Customer(1, "Alice Doe", 'F', "456 Oak St", "555-5678", "alice.doe@example.com",
//                "Gold Plan", List.of("Date: 2023-01-01, Weight: 65kg, Body Fat: 22%"));
//        Customer customer2 = new Customer(2, "Bob Smith", 'M', "789 Birch St", "555-4321", "bob.smith@example.com",
//                "Silver Plan", List.of("Date: 2023-01-01, Weight: 80kg, Body Fat: 18%"));
//
//        // Adding customers to the coach's list
//        coach.addCustomer(customer1);
//        coach.addCustomer(customer2);
//
//        // Using the additional functionalities
//        coach.showCustomerList();
//        int customerId = 1;
//        System.out.println("In-Body History for Customer ID " + customerId + ": " + coach.getInBodyHistory(customerId));
//        String customerName = "Bob Smith";
//        System.out.println("Details for Customer '" + customerName + "': " + coach.getCustomerDetailsByName(customerName));
//        coach.showFemaleCustomers();
//        coach.showMaleCustomers();
    }

