import java.util.*;
public class Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check Leap Year");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Generate Fibonacci Series");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a year: ");
                    int year = sc.nextInt();
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= n; i++) {
                        factorial *= i;
                    }
                    System.out.println("Factorial of " + n + " is: " + factorial);
                    break;
                case 3:
                    System.out.print("Enter count of terms for Fibonacci series: ");
                    int countFib = sc.nextInt();
                    int n1 = 0, n2 = 1, nextTerm;
                    System.out.print("Fibonacci Series: " + n1 + " " + n2);
                    for (int i = 2; i < countFib; i++) {
                        nextTerm = n1 + n2;
                        System.out.print(" " + nextTerm);
                        n1 = n2;
                        n2 = nextTerm;
                    }
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        sc.close();
    }
}


