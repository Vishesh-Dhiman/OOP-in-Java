import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name: "); //Taking  name input
        String name = sc.nextLine();

        System.out.print("What is your age: "); // taking age input
        int age = sc.nextInt();

        System.out.print("your name is "+name+" And you're "+age+ "year old"); // displaying name and age with text
        
    }
}
