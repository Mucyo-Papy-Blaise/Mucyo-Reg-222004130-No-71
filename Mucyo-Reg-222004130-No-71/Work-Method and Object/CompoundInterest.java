public class CompoundInterest { // Main Class

  // Declare instance variables
  double Principal;
  double Rate;
  double time;
  double number;

  public CompoundInterest(double Principal, double Rate, double time, double number){

    // Initialize the instance variables with the provided values.
    this.Principal = Principal;
    this.Rate = Rate;
    this.time = time;
    this.number = number;
  }
  public double calculate(){  // Method to calculate the total amount to be paid
    return Principal*Math.pow((1+(Rate/number)), number*time);
  }
  public static void main(String args[]){
     // Create an instance of the Loan class with specified parameters
    CompoundInterest compoundinterest = new CompoundInterest(500000, 0.18, 3, 12);
    
     // Calculate the total amount to be paid
    double CI = compoundinterest.calculate();
    System.out.println("MR BOB Compund interest is:"+" " + CI); // Print The compound Interest.
  }
}
