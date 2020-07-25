package Day_2;


import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meal_cost = scanner.nextDouble();
        int tip_percent = scanner.nextInt();
        int tax_percent = scanner.nextInt();

        solve(meal_cost, tip_percent, tax_percent);

    }


    static void solve(double meal_cost, int tip_percent, int tax_percent){

        double tip = (meal_cost * tip_percent) /100;
        double tax = (meal_cost * tax_percent ) /100;
        double totalCost =meal_cost + tip + tax;

        long round=Math.round(totalCost);


        System.out.println(round);
    }
}
