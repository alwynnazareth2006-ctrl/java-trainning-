package project;

import java.util.Arrays;

public class pr_1 {
    public static void main(String[] args) {
        //strings-collection of chars enclosed within ""--in build class
        //Immutable--once initialized/assigned cannot be changed

        //Mutable string--StringBuilder,StringBuffer
        StringBuilder s1=new StringBuilder("NSAMBsc");
        System.out.println(s1);
        StringBuilder s2=new StringBuilder("NSAMBca");
        System.out.println(s2);

        //insert(),delete(),replace(),reverse()
        StringBuilder s3=new StringBuilder("NSAM FIRST GRADE");
        System.out.println(s3);
        s3.append("College");
        System.out.println(s3);
        s3.insert(2,"abcd");
        System.out.println(s3);
        s3.replace(5,8,"xxxxxxx");
        System.out.println(s3);
        s3.delete(0,3);
        System.out.println(s3);
        s3.reverse();
        System.out.println(s3);

        //immutable strings--2 ways
        //1.Type 1 declaration
        String str="Java";
        //2.Type 2 declaration
        String str2=new String("Java");

        String x="Java";
        String y="Java";
        System.out.println(x==y);

        String p="Java";
        String q="Java";
        System.out.println(p==q);

        //in-built methods in string class
        String z="RajaRamMohanRoy";
        System.out.println(z.charAt(6));
        System.out.println(z.toLowerCase());
        System.out.println(z.toUpperCase());
        System.out.println(z.indexOf('R'));
        System.out.println(z.lastIndexOf('R'));
        System.out.println(z.substring(2,5));
        String a="nsam";
        String b="nSam";
        System.out.println(a.equalsIgnoreCase(b));

        char arr[]=z.toCharArray();
        System.out.println(Arrays.toString(arr));
        
    }
}
