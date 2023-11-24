import java.time.LocalDate;

public class MembershipPlan {
    // Attributes
    private LocalDate startDate;
    private int daysPerWeek;
    private int numberOfMonths;
    private double price;

    // Constructor
    public MembershipPlan(LocalDate startDate, int daysPerWeek, int numberOfMonths) {
        this.startDate = startDate;
        this.daysPerWeek = daysPerWeek;
        this.numberOfMonths = numberOfMonths;
        this.calculatePrice();
    }

    // Getter and Setter methods
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public void setNumberOfMonths(int numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
        this.calculatePrice(); // Recalculate price when the number of months is updated
    }

    public double getPrice() {
        return price;
    }

    // Calculate the price based on the membership details
    private void calculatePrice() {
        double basePricePerMonth = 50.0; // Base price per month
        double discountPercentage = 0.0; // Discount for >= 3 months

        if (numberOfMonths >= 3) {
            discountPercentage = 10.0; // 10% discount for 3 or more months
        }

        double discountedPrice = basePricePerMonth * (1 - discountPercentage / 100);
        price = discountedPrice * numberOfMonths;
    }

    // Example usage
    public static void main(String[] args) {
        // Creating a MembershipPlan object
        MembershipPlan membershipPlan = new MembershipPlan(LocalDate.now(), 6, 4);

        // Accessing and printing membership plan details
        System.out.println("Start Date: " + membershipPlan.getStartDate());
        System.out.println("Days Per Week: " + membershipPlan.getDaysPerWeek());
        System.out.println("Number of Months: " + membershipPlan.getNumberOfMonths());
        System.out.println("Price: $" + membershipPlan.getPrice());
    }
}
