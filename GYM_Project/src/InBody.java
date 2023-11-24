import java.time.LocalDate;

public class InBody {
    // Attributes
    private LocalDate dateOfInBody;
    private double height;
    private double totalWeight;
    private double bodyFatMass;
    private double minerals;
    private double totalBodyWater;
    private double protein;

    // Constructor
    public InBody(LocalDate dateOfInBody, double height, double totalWeight,
                  double bodyFatMass, double minerals, double totalBodyWater, double protein) {
        this.dateOfInBody = dateOfInBody;
        this.height = height;
        this.totalWeight = totalWeight;
        this.bodyFatMass = bodyFatMass;
        this.minerals = minerals;
        this.totalBodyWater = totalBodyWater;
        this.protein = protein;
    }

    // Getter and Setter methods
    public LocalDate getDateOfInBody() {
        return dateOfInBody;
    }

    public void setDateOfInBody(LocalDate dateOfInBody) {
        this.dateOfInBody = dateOfInBody;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public double getBodyFatMass() {
        return bodyFatMass;
    }

    public void setBodyFatMass(double bodyFatMass) {
        this.bodyFatMass = bodyFatMass;
    }

    public double getMinerals() {
        return minerals;
    }

    public void setMinerals(double minerals) {
        this.minerals = minerals;
    }

    public double getTotalBodyWater() {
        return totalBodyWater;
    }

    public void setTotalBodyWater(double totalBodyWater) {
        this.totalBodyWater = totalBodyWater;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

}







//    // Example usage
//    public static void main(String[] args) {
//        // Creating an InBody object
//        InBody inBody = new InBody(LocalDate.now(), 1.75, 70.5, 15.3, 3.2, 50.0, 12.5);
//
//        // Accessing and printing InBody details
//        System.out.println("Date of InBody: " + inBody.getDateOfInBody());
//        System.out.println("Height: " + inBody.getHeight() + " m");
//        System.out.println("Total Weight: " + inBody.getTotalWeight() + " kg");
//        System.out.println("Body Fat Mass: " + inBody.getBodyFatMass() + " kg");
//        System.out.println("Minerals: " + inBody.getMinerals() + " kg");
//        System.out.println("Total Body Water: " + inBody.getTotalBodyWater() + " kg");
//        System.out.println("Protein: " + inBody.getProtein() + " kg");
//    }
//
