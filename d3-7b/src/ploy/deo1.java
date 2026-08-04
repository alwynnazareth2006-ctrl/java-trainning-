package ploy;

class parent {
    void display(){
        System.out.println("hi");
    }
}
class child extends parent{
    void display(){
        System.out.println("from child class");
    }
}
public class deo1{
    public static void main(String[] args){
        parent p=new child();
        p.display();
        child c=(child) p;
        p.display();
    }
}
