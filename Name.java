 import java.util.Scanner;
public class Name{
    public static void main(String[]args){
        System.out.println("What is your Name");
        Scanner sc=new Scanner(System.in);
        String Name=sc.next();
        System.out.println("Hello" + Name + "Have a good day!");
    }
}