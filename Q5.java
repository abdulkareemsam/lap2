package lap2.HomeWork2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        System.out.print("Enter the last(a) number=");
        int a=in.nextInt();
        System.out.print("Enter the second(b) number=");
        int b=in.nextInt();
       int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("="+b);

    }

}
