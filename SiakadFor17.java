package jobsheet9;

import java.util.Scanner;

public class SiakadFor17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade, highest = 0;
        double lowest = 100;
        int passed = 0, failed = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = input.nextDouble();

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }

            if (grade >= 60) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("The highest grade is " + highest);
        System.out.println("The lowest grade is " + lowest);
        System.out.println("Student Passed " + passed);
        System.out.println("Student Failed " + failed);

        input.close();
    }
}
