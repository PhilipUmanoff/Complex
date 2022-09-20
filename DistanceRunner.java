import java.util.Scanner;

public class DistanceRunner {
  public static void main(String[] args) {

    //Read and store user inputs using scanner
    Scanner userIn = new Scanner(System.in);
    System.out.println("Enter a distance (in meters): ");
    double userMeters = userIn.nextDouble();  
    Distance u = new Distance (userMeters); 

    //Use functions to calculate then print conversions
    System.out.println("Meters: " + u.getMeters());
    System.out.println("Inches: " + u.getInches());
    System.out.println("Feet: " + u.getFeet());

  }
}