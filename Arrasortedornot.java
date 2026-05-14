public class Arrasortedornot {
    public static void main(String[] args) {
        Boolean issorted=true;
        int[]arr= {1,2,3,4,5,34,67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }

    if (issorted){
        System.out.println("The array is sorted");}
        else {
            System.out.println("The array is not sorted");
        }
    }
}


