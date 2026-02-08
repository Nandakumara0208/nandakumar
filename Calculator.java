public class Calculator {
    
    // Add two numbers
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Subtract two numbers
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiply two numbers
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Divide two numbers
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
    
    // Main method to test the calculator
    public static void main(String[] args) {
        double num1 = 20;
        double num2 = 5;
        
        System.out.println("Calculator Operations:");
        System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
    }
}
