
import java.util.Scanner;
public class Takinginput {
    public static void main(String[]args){
        System.out.println("Taking input from the user");
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter number1");
        int a=Sc.nextInt();
        System.out.println("Enter number 2");
        int b=Sc.nextInt();
        int sum=a+b;
        System.out.println("The sum of these numbersis"+sum);
    }

    
}
