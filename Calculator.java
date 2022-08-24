/*
  This program create a class called Calculator with has some methods: add, subtract, multiply, divide, and modulo.
  This program creates a main too instancing a new Calculator and using their methods. 
*/
public class Calculator{
    public Calculator(){
  
    }
  
    public int add(int a, int b){
      return a + b;
    }
  
    public int subtract(int a, int b){
      return a - b;
    }
  
    public int multiply(int a, int b){
      return a * b;
    }
  
    public int divide(int a, int b){
      return a / b;
    }
  
    public int modulo(int a, int b){
      return a % b;
    }
  
    public static void main(String[] args){
      Calculator myCalculator = new Calculator();
      System.out.println(myCalculator.add(5,7));
      System.out.println(myCalculator.subtract(45,11));
  
    }
  }