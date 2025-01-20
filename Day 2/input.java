import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your age: ");
        sc.nextLine(); // for String 
        sc.nextInt(); // for integer
        sc.nextDouble(); // for double
        

        // String age = sc.nextLine();
        
        // System.out.println("Your age is: " + age);
        sc.close(); // Always close the Scanner
    }
}
