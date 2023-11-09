import java.util.*;
public class SumOfN {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i=1;
        int sum = 0;
        while (i<=num){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);


    }
}
