public class SimpleInterest { // Main Class

  // Declare instance variables
  double p;
  double r;
  double t;


  public SimpleInterest(double p, double r, double t){  // Initialize the instance variables with the provided values.
    this.p = p;
    this.r = r;
    this.t = t;
    
  }
  public double calculate(){ // Method to calculate the total amount to be paid
    return (p*r*t)/100;
  }
  public static void main(String args[]){ 

     // Create an instance of the Loan class with specified parameters
    SimpleInterest simpleInterest = new SimpleInterest(100000, 5, 5); 

    double SI = simpleInterest.calculate(); // Calculate the total amount to be paid
    System.out.println("The simple interest is: "+" "+ SI); // Print The value of SI.
  }
}
