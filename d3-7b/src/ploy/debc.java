package ploy;

public class debc {
    void add(int a,int b){
        System.out.println("sum"+(a+b));
    }
    void add(int a,float b){
        System.out.println("sum"+(a+b));
    }
    void add(int a,int b,int c){
        System.out.println("sum"+(a+b+c));
    }
    public static void main(String[] args){
        debc d=new debc();
        d.add( 10,20);
        d.add(10,20.96f);
        d.add(10,20,30);
    }
}
