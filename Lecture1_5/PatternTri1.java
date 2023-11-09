package Lecture1_5;

import java.util.*;
public class PatternTri1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        int t = i; // Pattern Tri 3
        while(i <=n){
            int j=1;
//            int t =i; // Pattern Tri 2
            while (j<=i){
                System.out.print("*");
//                t++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
