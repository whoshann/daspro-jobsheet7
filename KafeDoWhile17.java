package jobsheet9;

import java.util.Scanner;

public class KafeDoWhile17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int coffeePrice = 12000;
        int teaPrice = 7000;
        int breadPrice = 20000;
        String customerName;
        int coffee;
        int teas;
        int breads;
        int total;

        do {
            System.out.print("Enter customer Name, (type cancel to exit): ");
            customerName = sc.nextLine();

            if (customerName.equals("cancel")) {
                break;
            }

            System.out.print("Number of coffes : ");
            coffee = sc.nextInt();
            System.out.print("Number of teas : ");
            teas = sc.nextInt();
            System.out.print("Number of breads : ");
            breads = sc.nextInt();

            total = (coffee * coffeePrice) + (teas * teaPrice) + (breads * breadPrice);

            System.out.println("Total to be paid is : " + total);
            sc.nextLine();

        } while (true);

        System.out.println("All transaction completed.");

        sc.close();
    }
}
