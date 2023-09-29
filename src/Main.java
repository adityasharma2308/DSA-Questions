import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       String s=in.next();
       StringBuilder st =new StringBuilder();
       int temp=s.length();
       for(int i=1;i<=s.length();i++){
           st.append(s.charAt(temp-i));
       }
        System.out.println(st);
    }

}
//aditya