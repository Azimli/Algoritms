package Day_1;

import java.util.Scanner;

public class Data_Types {
    public static void main(String[] args) {
        int i=4;
        double d= 4.0;
        String s = "HackerRank ";

        Scanner scanner = new Scanner(System.in);

        int i1 = scanner.nextInt();
        double d1 = scanner.nextDouble();
        scanner.nextLine();
        String s1 = scanner.nextLine();



        System.out.println(i+i1);
        System.out.println(d+d1);

        System.out.print(s+s1);
    }
}
