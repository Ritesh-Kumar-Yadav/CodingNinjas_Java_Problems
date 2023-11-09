import java.util.*;
public class CharPatternP2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i =1;
        while(i<=n){
            int j =1;
            char stchar =  (char)('A'+ n-1 + i );
            while(j<=i){
                System.out.print(stchar);
                stchar = (char)(stchar - 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
