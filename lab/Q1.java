package lab;

import java.util.*;

// Write a following Java program using Flow control statements to get the value at 
// run time. 1. Given year is Leap year or not. 2. Given number is odd or even. 3. 
// Biggest of N numbers. 4. Factorial of a given number. 5. Fibonacci series of a 
// given count. 6. Find the student grade calculation with Grade A, B, C and Fail 

public class Q1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Check Leap Year");
            // System.out.println("2. Check Odd or Even");
            // System.out.println("3. Find Biggest of N numbers");
            System.out.println("2. Calculate Factorial");
            System.out.println("3. Generate Fibonacci Series");
            // System.out.println("6. Calculate Student Grade");
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
                // case 2:
                //     System.out.print("Enter a number: ");
                //     int num = sc.nextInt();
                //     if (num % 2 == 0) {
                //         System.out.println(num + " is Even.");
                //     } else {
                //         System.out.println(num + " is Odd.");
                //     }
                //     break;
                // case 3:
                //     System.out.print("Enter the count of numbers: ");
                //     int count = sc.nextInt();
                //     int[] numbers = new int[count];
                //     System.out.println("Enter the numbers:");
                //     for (int i = 0; i < count; i++) {
                //         numbers[i] = sc.nextInt();
                //     }
                //     int max = numbers[0];
                //     for (int i = 1; i < count; i++) {
                //         if (numbers[i] > max) {
                //             max = numbers[i];
                //         }
                //     }
                //     System.out.println("The biggest number is: " + max);
                //     break;
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
                // case 6:
                //     System.out.print("Enter student's marks: ");
                //     int marks = sc.nextInt();
                //     if (marks >= 90) {
                //         System.out.println("Grade: A");
                //     } else if (marks >= 80) {
                //         System.out.println("Grade: B");
                //     } else if (marks >= 70) {
                //         System.out.println("Grade: C");
                //     } else {
                //         System.out.println("Fail");
                //     }
                //     break;
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


