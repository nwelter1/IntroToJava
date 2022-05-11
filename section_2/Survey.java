import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to the survey");
        int counter = 0;
        System.out.println("What is your name?");
        counter++;
        String name = scan.nextLine();
        counter++;
        System.out.println("How much money do you spend on coffee?");
        counter++;
        double coffeePrice = scan.nextDouble();
        System.out.println("How much money do you spend on lunch?");
        counter++;
        double foodPrice = scan.nextDouble();
        System.out.println("How many times a week do you buy coffee?");
        counter++;
        int coffeeFreq = scan.nextInt();
        System.out.println("How many times a week do you buy food?");
        counter++;
        int foodFreq = scan.nextInt();
        System.out.println("\nThank you " + name + " for answering all "+ counter + " questions!");
        System.out.println("\nYour food expenses are " + (foodPrice/coffeePrice) + " times more than your coffee expenses");
        System.out.println("Weekly Coffee Expense: $" + (coffeePrice*coffeeFreq));
        System.out.println("Weekly Food Expense: $" + (foodPrice*foodFreq));
        scan.close();
    }
}
