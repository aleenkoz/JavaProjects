/*My first program using the idea of classes, constructors, and methods.
and it represents a simple calculator*/

//The calculator class:
public class Calculator{

//The claculator constructor:
  public Calculator(){

  }

//methods for adding, subtracting, multiplying, dividing, and modulo.

  public int add(int a, int b){
    return a+b;
  }
  public int subtract(int a, int b){
    return a-b;
  }
  public int multiply(int a, int b){
    return a*b;
  }
  public int divide(int a, int b){
    return a/b;
  }
  public int modulo(int a, int b){
    return a%b;
  }

//The main method, where all that wwe wrote come to action.
  public static void main(String[]args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5,7));
    System.out.println(myCalculator.subtract(45,11));

  }
}