import java.util.Scanner;

public class SwitchExample{ // Main Class.
  public static void main(String args[]){
    // This allow the user to enter Value.
    Scanner scanner = new Scanner(System.in);

    //Declare instance variable.
    int  Day;

    System.out.println("Enter Day!: ");
    Day = scanner.nextInt();

  // Switch case.
    switch (Day) {
      case 1: System.out.println("It's Monday");
        
        break;
      case 2: System.out.println("It's Tuesday");
        
        break;
      case 3: System.out.println("It's Wednesday");
        
        break;
      case 4: System.out.println("It's Thursday");
        
        break;
      case 5: System.out.println("It's Friday");
        
        break;
      case 6: System.out.println("It's Saturday");
        
        break;
      case 7: System.out.println("It's Sunday");
        
        break;
    
      default:System.out.println("none of the days of the week.");
        break;
    }
   } 
  } 

