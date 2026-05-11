public class sumeven {
    public static void main (String[]args){
        //int sum=0;
        //int n=3;
        //for (int i = 0; i <n; i++) {
          //  sum=sum+(2*i);
        //}
        //System.out.println("Sum of even number is"+sum);


        //What is the  FActorial of the n=n*n-1*n-2.....1
        //5!=5*4*3*2*1
        int n=3;
        int i=1;
        int factorial=1;
        while(i<=n){
            factorial *=i;
            i++;
        }
        System.out.println("Factorial="+factorial);
    }
    }
    

