import java.util.Scanner;

public class tax {
    public static void main(String[]args){
        Scanner Sc=new Scanner (System.in);
        System.out.println("Enter your income in lakh per annun");
        float Tax=0;
        float income=Sc.nextFloat();
        if (income <=2.5){
            Tax=Tax+0;
        }
        else if (income>2.5f&&income<=5f){
            Tax=Tax+0.05f*(income-2.5f);
        }
        else if (income>5f && income<=10.0f){
            Tax=Tax+0.05f*(5.0f-2.5f);
            Tax=Tax+0.2f*(income-5f);
        }
        else if (income>10.0f){
            Tax=Tax+0.05f*(5.0f-2.5f);
            Tax=Tax+0.2f*(10.0f-5f);
            Tax=Tax+0.3f*(income-10.0f);

        }
        System.out.println("The totol tax paid by the employee is"+Tax);

    }
    
}
