package Lecture1_5;

import java.util.*;
public class FahToCelTable {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        while(S<=E){
            int cel =(S-32)*5/9;
            System.out.println(S+" "+cel);
            S=S+W;
        }
    }
}
