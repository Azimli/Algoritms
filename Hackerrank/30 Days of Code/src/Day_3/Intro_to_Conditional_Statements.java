package Day_3;

import java.util.Scanner;

public class Intro_to_Conditional_Statements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n%2 == 1){
            System.out.println("Weird");
        }else if (n%2 == 0 && 2<=n &&  n <=5){
            System.out.println("Not Weird");
        }else if (n%2==0 && 6<=n && n<=20){
            System.out.println("Weird");
        }else if (n%2==0 && n>20){
            System.out.println("Not Weird");
        }
    }

}