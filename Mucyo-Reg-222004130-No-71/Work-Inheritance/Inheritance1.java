public class Inheritance1 {
  /**
   * InnerInheritance1
   */
  public interface Team {
    public void PlayerInfo();
  }

  class GoalKeeper implements Team {
    public void PlayerInfo() {
      System.out.println("The player is Goal Keeper");
    }
  }

  class Defender extends GoalKeeper {
    public void ob1() {
      System.out.println("The Player is Defender");
    }
  }

  class Midfielder extends Defender {
    public void ob2() {
      System.out.println("The Player is Midfielder");
    }
  }

  class Winger extends Midfielder {
    public void ob3() {
      System.out.println("The Player is Winger");
    }
  }

  class Attacker extends Winger {
    public void ob4() {
      System.out.println("The Player is Attacker");
    }
  }

  class Staff extends Attacker {
    public void ob5() {
      System.out.println("Staff of Team");
    }
  }

  class Manager extends Staff {
    public void ob6() {
      System.out.println("Team Manager");
    }
  }

  class Fans extends Manager {
    public void ob7() {
      System.out.println("Team Fans");
    }
  }

  class Locate extends Fans {
    public void ob8() {
      System.out.println("Team Location is Rwanda");
    }
  }

  public static void main(String[] args) {
     Inheritance1 outerInstance = new Inheritance1();
    Locate PL = outerInstance.new Locate();
    
    PL.ob1();
    PL.ob2();
    PL.ob3();
    PL.ob4();
    PL.ob5();
    PL.ob6();
    PL.ob7();
    PL.ob8();
  }
}
