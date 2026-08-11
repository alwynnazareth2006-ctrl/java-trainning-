package batch2;

public class st {
    public static void main(String[] args) {
        String str = "naman";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println("Reverse string:"+reverse);
        if(str.equals(reverse)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }


    }
}

