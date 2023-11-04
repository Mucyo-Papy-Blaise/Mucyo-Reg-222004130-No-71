import java.util.Scanner;

public class Loops1 { // Main Class.
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in); // This code allow the user to enter Value
    String name = ""; // Declare String name.

    // Do while Loop
    do{
      System.out.println("Please enter your name");
      name = scanner.nextLine();
    }while(name.isBlank());
    System.out.println("Hello"+ " "+name);
  }
}
