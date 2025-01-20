// Java operators, User input


public class Main {
    public static void main(String[] args) {



        // Arithmetic operators
        int a = 20;
        int b = 10;
        int Addition = a + b; // Addition of two numbers
        int Subtraction = a - b; // subtraction of two numbers
        int Multiplication = a * b; // Multiplication of two numbers
        int Division = a / b; // Division of two numbers
        int Modulas = a % b; // Modulas of two numbers

        
        System.out.println("The operations of "+a+" and "+b+" is...");
        System.out.println("Additon: " + Addition);
        System.out.println("Subtraction: " + Subtraction);
        System.out.println("Multiplication: " + Multiplication);
        System.out.println("Division: " + Division);
        System.out.println("Modulas: " + Modulas); // remainder after division

        // Relational Operators
        int firstNumber = 10;
        int secondNumber = 20;

        System.out.println("Is Equal to: " + (firstNumber == secondNumber)); // is equal to
        System.out.println("Is Greater than: " + (firstNumber > secondNumber)); // greater then
        System.out.println("Is less then: " + (firstNumber < secondNumber)); // less then
        System.out.println("Is lnot equal to: " + (firstNumber != secondNumber)); // not equal to
        System.out.println("Is Greater than or Equal to: " + (firstNumber >= secondNumber)); // greater then or equal to
        System.out.println("Is less than or equal to: " + (firstNumber <= secondNumber)); // less then or equal to


        // Logical Operators
        a = 10;
        b = 20;

        System.out.println("Logical Operators...");
        System.out.println("AND: " + (a < 20 && b > 10)); // AND (if both true then true)
        System.out.println("OR: " + (a < 20 || b > 10)); // OR (if any one is true then true)
        System.out.println("NOT: " + !(a < 20 && b > 10)); // NOT (if true then false and vice versa)
        
    
    }
    

}