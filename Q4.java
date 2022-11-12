package lap2.HomeWork2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // System.out.print("enter three number:");
       int a=17;
       int b= 16;
       int c= 19;
       if(a<=b){
           System.out.println("b="+b);
       }  else if(b<=a){
            System.out.println("a="+a);
        } else   if(b<=c){
            System.out.println("c="+c);
        }  else if(c<=b){
            System.out.println("b="+b);
        } else   if(a<=c) {
            System.out.println("c="+c);
        } else if(c<=a) {
            System.out.println("a"+a);
        }
    }

}
