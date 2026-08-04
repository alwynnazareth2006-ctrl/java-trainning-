package inheritance;

class Nitte{
    void display(){
        System.out.println("from nitte interface");
    }
}
class nsam extends Nitte{
    void nsam(){
        System.out.println("from nitte clg");
    }
}
class nmamit extends Nitte{
    void nmamit(){
        System.out.println("from nmamit clg");
    }
}
public class sample {
    public static void main(String[] args){
        nsam n1=new nsam();
        n1.display();
        n1.nsam();
        nmamit n2=new nmamit();
        n1.display();
        n2.nmamit();
    }
}
