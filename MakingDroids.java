//Let's creat Droids, the fictional robots from starwars!
//Using the Class: 
public class Droid {

    //The instance fields:
  public int batteryLevel;
  public String name;
    //The constructor:
  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }
    //The toString function that will print actual useful information when we put an instance of the class in a printing statement:
  public String toString() {
    return "Hello, I am the Droid: " + name;
  }

  //Two methods for performing fun things:
  public void tellBatteryLevel() {
    System.out.println(name+"'s current battery level is: "+batteryLevel);
  }

  public void performTask(String task) {
    System.out.println(name + " is performing task: " + task);
    batteryLevel -= 10;
  }
    //The main function where the magic happens:
  public static void main(String[] args) {
    Droid first = new Droid("Codey");
    first.performTask("cook");
    first.tellBatteryLevel();
  }
}
