package Lecture1_5;

import java.util.*;
public class CalculateSalary {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your basic Salary:");
        float basic = sc.nextInt();
        System.out.println("Enter Your Grade:");
        char grade = sc.next().charAt(0);
        float hra=(basic*20)/100;
        float da=(basic*50)/100;
        float pf=(basic*11)/100;
        while(grade=='A'){
            float allow =1700;
            float Totalsalary =(basic+hra+da+allow)-pf;
            System.out.println("Your Total Salary is : " + Math.round(Totalsalary));
            break;
        }
        while(grade=='B'){
            float allow =1500;
            float Totalsalary =(basic+hra+da+allow)-pf;
            System.out.println("Your Total Salary is : " + Math.round(Totalsalary));
            break;
        }
        while (grade >= 'C' && grade <= 'Z' || grade >= 'a' && grade <= 'z' ){
            float allow =1300;
            float Totalsalary =(basic+hra+da+allow)-pf;
            System.out.println("Your Total Salary is : " + Math.round(Totalsalary));
            break;
        }
    }
}
