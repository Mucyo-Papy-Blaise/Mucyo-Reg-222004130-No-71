import java.util.Scanner;

public class Loops2 { // Main Class
  public static void main(String args[]){
    // This allow the user to enter value.
    Scanner scanner = new Scanner(System.in);
    String name = "";

    while (name.isBlank()) {
      System.out.println("Please enter your name: ");
      name = scanner.nextLine();
    }
    System.out.println("Hello Mr/Mrs" + " " + name);
  }
}
