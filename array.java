package d1.test;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a[]=new String[5];
        System.out.println("enter the elements:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.next();
        }
        System.out.println("array elements are");
        System.out.println(Arrays.toString(a));
    }
}
