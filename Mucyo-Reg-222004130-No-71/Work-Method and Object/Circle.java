import java.util.Scanner;

public class Circle { // main Class
  double radius;
  double pi;

  public Circle(double radius, double pi){ // circle Class.
    this.radius = radius;
    this.pi = pi;
  }
  public double area(){ // Return Area.
    return pi*radius*radius;
  }
  public double circumuferenec(){ // Return Circumference.
    return pi*2*radius;
  }
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in); // This allow the user to enter the value.

    System.out.println("Please enter Radius: ");
    double  radius = scanner.nextDouble();
    System.out.println("Please enter pi");
    double pi = scanner.nextDouble();

    Circle circle = new Circle(radius, pi); // New object circle with Class Class.
    double area= circle.area(); //Calling area Class.
    double circumuferenec = circle.circumuferenec(); // Calling Circumference with Class.
    System.out.println("The area is: " +" "+area); // Print Area
    System.out.println("The circumuference is:" +" "+ circumuferenec); // Print Circumference.
  }
}
