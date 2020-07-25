package Day_5;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(n +" x " + i + " = " + (n*i));
        }
    }
}
