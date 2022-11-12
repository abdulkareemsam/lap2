package lap2.HomeWork2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the twq number:");
        int x= in.nextInt();
        int y=in.nextInt();
        int max=x;
        int min=x;
        double avg;
     //    double dis;

        System.out.print("Sum=");
        System.out.println(x+y);

        System.out.print("Difference=");
        System.out.println(x-y);

        System.out.print("Product=");
        System.out.println(x*y);

        System.out.print("Average=");
        System.out.println(avg=(x+y)/2);

        if (y>max)
            max=y;

        if (y<min)
            min=y;

        System.out.print("Distance=");
        System.out.println(max-min);

        System.out.println(" the maximum= " + max);
        System.out.println("the minimum= "+min);

















    }
}
