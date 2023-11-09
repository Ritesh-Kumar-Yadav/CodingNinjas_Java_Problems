package Lecture1_5;

import java.util.*;
public class Avgcal {
    public static void main(String[] args) {

        Scanner s  =new Scanner(System.in);
        System.out.println("Enter Your Name:");

        String ch = s.nextLine();
        System.out.println("Enter Your Three marks:");
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int T = ((m1+m2+m3)/3);
        System.out.println(  ch +"\n"+"Your Average marks is : "+T);

    }

}
