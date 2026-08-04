package d1.test;
import java .util.Arrays;

public class array2 {
    public static void main(String[] args){
      int a[]={10,20,30,40};
      int b[][]={
              {10,20,30},
              {40,50,60},
              {70,80,90}
      };
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
          sum=sum+a[i];
      }
        System.out.println("sum 10"+sum);
       int sum2=0;
       for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                sum2=sum2+b[i][j];
            }
        }
    System.out.println("sum 20"+sum2);
    }
}
