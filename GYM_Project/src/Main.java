import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InBody inBodyMetrics = new InBody(LocalDate.now(), 1.75, 70.0, 15.0, 3.0, 45.0, 60.0);

        // Displaying information about the InBody metrics
        System.out.println(inBodyMetrics);
    }
}