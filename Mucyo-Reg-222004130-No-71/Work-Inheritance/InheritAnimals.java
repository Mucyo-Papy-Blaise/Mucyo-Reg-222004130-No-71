public class InheritAnimals {
  /**
   * InnerInheritance1
   */
  public interface Wild {
    public void PlayerInfo();
  }

  class Lion implements Wild {
    public void PlayerInfo() {
      System.out.println("Roar");
    }
  }

  class Dog extends Lion {
    public void An1() {
      System.out.println("Bark, Woof");
    }
  }

  class Birds extends Dog {
    public void An2() {
      System.out.println("Chirps, whistles");
    }
  }

  class Cats extends Birds {
    public void An3() {
      System.out.println("Meows, purrs");
    }
  }

  class Frog extends Cats {
    public void An4() {
      System.out.println("Croaks and ribbits");
    }
  }

  class Whales extends Frog {
    public void An8() {
      System.out.println("Songs of the deep");
    }
  }

  public static void main(String[] args) {
    InheritAnimals outerInstance = new InheritAnimals();
    Whales PL = outerInstance.new Whales();

    PL.An1();
    PL.An2();
    PL.An3();
    PL.An4();
    PL.An8();
  }
}
