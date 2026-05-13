public class averagemarks {
public static void main(String[]args){
    float[]marks={45.7f,67.8f,63.4f,99.2f,100.0f};
    float Sum=0;
    for (float element:marks){
        Sum=Sum+element;
    }
    System.out.println("The value of average marks is"+(Sum/marks.length));
}    
}
