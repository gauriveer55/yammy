public class Maxvalue {
    public static void main(String[]args){
        int []arr={1,2100,3,455,5,34,67};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
     System.out.println("The value of maximum elementis:"+max);
    }
    
}
