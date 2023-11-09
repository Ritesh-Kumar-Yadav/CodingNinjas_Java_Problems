import java.util.*;
public class PatternSq {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int i= 1;
        while (i<=c){
            int r = 1;
            while(r<=c){
                System.out.print(c);
                r++;
            }
            System.out.println();
            i++;
        }
    }


}
