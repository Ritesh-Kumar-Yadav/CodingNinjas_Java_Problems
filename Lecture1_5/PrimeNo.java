package Lecture1_5;

import java.util.*;
public class PrimeNo {
    public static void main(String args[]) {
        Scanner s= new Scanner (System.in);
        System.out.println("Enter a Number");
        int num = s.nextInt();
        int i = 2;
        while(i <= num-1){
            if(num % i ==0){
                System.out.println("Number is not Prime");
                return;
            }
            i = i+1;
        }
        System.out.println(num+" Is a Prime Number  ");
    }
}