import java.util.Scanner;

public class Model {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
           System.out.println("Enter patient name");
           String name=s.next();
           System.out.println("enter your age ");
           int age=s.nextInt();
           System.out.println("Enter your branch");
           String branch=s.next();
           System.out.println("Enter your pno");
           int pno=s.nextInt();
           System.out.println("address of patient");
           String address=s.next();
           System.out.println("usn");
           String usn=s.next();
           System.out.println("Name"+name);
           System.out.println("AGE"+age);
           System.out.println("BRANCH"+branch);
           System.out.println("USN"+usn);


    }
}
