import java.util.Scanner;

class Calculator {
   double a, b; 

   // Constructor to initialize the values
   public Calculator(double a, double b) {
      this.a = a;
      this.b = b;
   }

   public double add() {
      return a + b;
   }

   public double subtract() {
      return a - b;
   }

   public double multiply() {
      return a * b;
   }

   public double divide() {
      if (b == 0) {
         throw new ArithmeticException("Division by zero is not allowed.");
      }
      return a / b;
   }

   double calculate(String operation) {
      switch (operation.toLowerCase()) {
         case "add" -> {
             return add();
           }
         case "subtract" -> {
             return subtract();
           }
         case "multiply" -> {
             return multiply();
           }
         case "divide" -> {
             return divide();
           }
         default -> throw new IllegalArgumentException("Invalid operation: " + operation);
      }
   }
}

public class Problem1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter first number: ");
      double a = sc.nextDouble();
      
      System.out.print("Enter second number: ");
      double b = sc.nextDouble();

      sc.nextLine();
      System.out.print("Enter operation (add, subtract, multiply, divide): ");
      String operation = sc.nextLine();

      Calculator calculator = new Calculator(a, b);

      try {
         double result = calculator.calculate(operation);
         System.out.println("Result: " + result);
      } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
      } finally {
         sc.close();
      }
   }
}