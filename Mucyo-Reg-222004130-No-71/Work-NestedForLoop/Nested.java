import java.util.Scanner;

public class Nested { // Main Class
  public static void main(String args[]){
    // This allow the user to enter the value.
    Scanner scanner = new Scanner(System.in);

    //Declare instance variables
    int rows;
    int column;
    String Symbol = "";

    System.out.println("Enter rows: ");
    rows = scanner.nextInt();
    System.out.println("Enter colomn");
    column = scanner.nextInt();
    System.out.println("Enter Symbol");
    Symbol = scanner.next();

// For Loop.
    for(int i=1; i<=rows; i++){
      System.out.println();
    }
      for(int j=1; j<=column; j++){
        System.out.print(Symbol);
      }

    }
  }
