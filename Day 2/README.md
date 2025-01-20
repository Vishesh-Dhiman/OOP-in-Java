# Day 2

# Java Operators and User Input

## Overview
This README serves as a guide for understanding Java operators and how to handle user input. Whether you're a beginner or just brushing up on your Java skills, this document will provide clear examples and explanations.

---

## Java Operators
Operators are symbols that perform operations on variables and values. In Java, operators are categorized as follows:

### 1. **Arithmetic Operators**
Used to perform mathematical operations:

| Operator | Description      | Example       |
|----------|------------------|---------------|
| `+`      | Addition         | `a + b`       |
| `-`      | Subtraction      | `a - b`       |
| `*`      | Multiplication   | `a * b`       |
| `/`      | Division         | `a / b`       |
| `%`      | Modulus          | `a % b`       |

### 2. **Relational (Comparison) Operators**
Used to compare two values:

| Operator | Description                 | Example     |
|----------|-----------------------------|-------------|
| `==`     | Equal to                   | `a == b`    |
| `!=`     | Not equal to               | `a != b`    |
| `>`      | Greater than               | `a > b`     |
| `<`      | Less than                  | `a < b`     |
| `>=`     | Greater than or equal to   | `a >= b`    |
| `<=`     | Less than or equal to      | `a <= b`    |

### 3. **Logical Operators**
Used to combine multiple conditions:

| Operator | Description        | Example            |
|----------|--------------------|--------------------|
| `&&`     | Logical AND        | `a > 5 && b < 10` |
| `||`     | Logical OR         | `a > 5 || b < 10` |
| `!`      | Logical NOT        | `!(a > 5)`        |

### 4. **Assignment Operators**
Used to assign values to variables:

| Operator | Description        | Example   |
|----------|--------------------|-----------|
| `=`      | Assignment         | `a = 10`  |
| `+=`     | Add and assign     | `a += 5`  |
| `-=`     | Subtract and assign| `a -= 5`  |
| `*=`     | Multiply and assign| `a *= 5`  |
| `/=`     | Divide and assign  | `a /= 5`  |

---

## Handling User Input
In Java, you can use the `Scanner` class to accept user input from the console. Below are the steps and examples to handle user input:

### 1. **Import the Scanner Class**
You need to import the `java.util.Scanner` package to use the `Scanner` class.
```java
import java.util.Scanner;
```

### 2. **Create a Scanner Object**
Initialize a `Scanner` object to read input:
```java
Scanner scanner = new Scanner(System.in);
```

### 3. **Read Input**
Use various methods of the `Scanner` class to read different types of input:

#### Example: Reading a String
```java
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
```

#### Example: Reading an Integer
```java
System.out.print("Enter your age: ");
int age = scanner.nextInt();
System.out.println("You are " + age + " years old.");
```

#### Example: Reading a Double
```java
System.out.print("Enter your height: ");
double height = scanner.nextDouble();
System.out.println("Your height is " + height + " meters.");
```

### 4. **Close the Scanner**
Always close the `Scanner` object to prevent resource leaks:
```java
scanner.close();
```

---

## Putting It All Together
Here is a complete example that combines operators and user input:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user inputs
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform operations
        int sum = num1 + num2;
        int product = num1 * num2;

        // Display results
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);

        scanner.close();
    }
}
```

---

## Conclusion
By understanding operators and handling user input in Java, you can create interactive and functional programs. Practice writing and experimenting with the provided examples to strengthen your skills.

