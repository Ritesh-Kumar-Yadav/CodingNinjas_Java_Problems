import java.util.Scanner;
public class SumOfOddAndEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int evensum = 0 , oddsum = 0;
        while (num>0){
            int last = num % 10;
            if(last %2 == 0){
                evensum += last;
            }
            else{
              oddsum += last;
            }
            num = num / 10;
        }
        System.out.println(evensum + " " + oddsum);
    }
}