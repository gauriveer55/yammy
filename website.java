import java.util.Scanner;
public class website {
    public static void main (String args[]){
        Scanner Sc=new Scanner(System.in);
        String website=Sc.next();
        if(website .endsWith(".org")){
            System.out.println("This is an organizational website");
         }
         else if (website .endsWith(".com")){
            System.out.println("This is an commercial website");
         }
         else if (website .endsWith(".in")){
            System.out.println("This is indian website");
         }


    }
    
}
