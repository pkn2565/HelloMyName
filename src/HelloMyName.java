import java.util.Scanner;
public class HelloMyName {
public static void main(String [] args) {

    String name;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your Username");
        name = keyboard.nextLine();
        System.out.println("Enter Password");
        String password;
        password = keyboard.nextLine();
    System.out.print("Hello, " + name);
    System.out.print( " Welcome to CSC class! and Your password is " + password);
    }
}



