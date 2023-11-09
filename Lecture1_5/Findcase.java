package Lecture1_5;

import java.util.*;
public class Findcase {
    public static void main(String args[]){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter a Character:");
            char ch = s.next().charAt(0);
            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("1");
            } else if (ch >= 'a' && ch <= 'z') {
                System.out.println("0");
            } else
                System.out.println("-1");

        }
    }



