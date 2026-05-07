import java.util.Scanner;

public class passfail {
    public static void main(String []args){
        byte m1,m2,m3;
        Scanner Sc=new Scanner(System.in);
        System.out.println("ENter your marks in physics");
        m1=Sc.nextByte();

        System.out.println("ENter your marks in chemistry");
        m2=Sc.nextByte();

        System.out.println("ENter your marks in  Mathematics");
        m3=Sc.nextByte();

        float Avg=(m1+m2+m3)/3;
        System.out.println("your overall percentage is:"+Avg);
        if (Avg>=40&& m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulations,you have been promoted");
        }
        else{
            System.out.println("Sorry,you havr been not promoted!please try again");
        }
    }
    
}
