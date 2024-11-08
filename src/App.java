import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollno = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0); // Extract the first character

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.println("Gender: " + gender);

        sc.close();
    }
}
