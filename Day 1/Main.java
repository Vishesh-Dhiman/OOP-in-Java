public class Main { // This is a Block
    public static void main(String[] args) {
        // Data types in java
        String name = "OOPS in Java"; // Stings
        int age = 180; // Integer Value
        char grade = 'A'; // for store sngle charecter
        boolean ifPassed = true; // boolean 
        boolean ifFailed = false;
        float pi = 3.14F; // float values with F


        // data type implicit conversion
        byte newAge = (byte)age;


        System.out.println("Hello Java!");
        System.out.println(3+4+334); // Caculator
        System.out.println(name);
        System.out.println(age);
        System.out.println(grade);
        System.out.println(ifPassed);
        System.out.println(ifFailed);
        System.out.println("New age: " + newAge);    
        System.out.println(pi);

        System.out.println(name + " " + age + " " + grade + " " + ifPassed + " " + ifFailed); // How to Access
    }
}
