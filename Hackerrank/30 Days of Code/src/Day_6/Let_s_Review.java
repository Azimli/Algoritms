package Day_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Let_s_Review {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            String a=sc.next();
            for(int j =0;j<a.length();j++){
                if(j%2==0)
                    System.out.print(a.charAt(j));
            }
            System.out.print(" ");
            for(int j=0;j<a.length();j++){
                if(j%2==1)
                    System.out.print(a.charAt(j));
            }
            System.out.println();
        }

        }





}
