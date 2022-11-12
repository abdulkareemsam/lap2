package lap2.HomeWork2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner intput=new Scanner(System.in);
        int area;
        System.out.print("Enter the height=");
        int height = intput.nextInt();
        System.out.print("Enter the show=");
        int show = intput.nextInt();
        System.out.print("Rectangle area=");
        System.out.println(area=height * show);
        System.out.println("---------------------------------------------------");

        int perimeter;

        System.out.print("perimeter of rectangle=");
        System.out.println(perimeter=(height*show)*2);

    }

}
