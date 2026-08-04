package d1.test;
import java.util.Scanner;
public class runpro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = 1456;
        int sum = 0;
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
            count++;
        }
        System.out.println(sum);
        System.out.println(rev);
    }
}