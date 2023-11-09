package Lecture1_5;

import java.util.*;
public class PatternTri {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i =1;
        while(i <=n){
            int j=1;
            int stcahr = i;
            while (j<=i){
                System.out.print(stcahr);
                stcahr++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
