import java.util.Scanner;

public class IFStatement { // Main Class.
  public static void main(String args[]){  

    Scanner scanner =  new Scanner(System.in); // This code allows the user to enter value.
    
    int age; // Declare int age.
    System.out.println("Please enter your age"); // Print the word Please enter your age.
    age = scanner.nextInt();
     
    // If and else if
    if (age < 18 ) {
      System.out.println("You're allowed 60% Discount");
    }else if( age >= 18 && age < 25){
      System.out.println("You're allowed 40% Discount");
    }else if ( age >= 25 && age < 35){
      System.out.println("You're allowed 35% Discount");
    }else if(age >=35 && age < 40){
      System.out.println("You're allowed 30% Discount");
    }else if(age >= 40 && age < 45){
      System.out.println("You're allowed 25% Discount");
    }else{
      System.out.println("You're not allowed Discount!");
    }
    }} 

  
