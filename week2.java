import java.util.Scanner;

public class week2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Online Survey System =====");

        // User details
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Email: ");
        String email = sc.nextLine();

        // Survey Question
        System.out.println("\nHow do you rate our website?");
        System.out.println("1. Excellent");
        System.out.println("2. Good");
        System.out.println("3. Average");
        System.out.println("4. Poor");

        System.out.print("Enter your choice (1-4): ");
        int rating = sc.nextInt();
        sc.nextLine();

        // Suggestion
        System.out.print("Enter your suggestion: ");
        String suggestion = sc.nextLine();

        // Display result
        System.out.println("\n===== Survey Result =====");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);

        if(rating == 1)
            System.out.println("Rating: Excellent");
        else if(rating == 2)
            System.out.println("Rating: Good");
        else if(rating == 3)
            System.out.println("Rating: Average");
        else
            System.out.println("Rating: Poor");

        System.out.println("Suggestion: " + suggestion);

        System.out.println("\nThank you for completing the survey!");

        sc.close();
    }
}
