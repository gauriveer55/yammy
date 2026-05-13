public class Addmatrix {
    public static void main(String []args){
        int [][] Mat1={{1,2,3},{4,5,6}};
        int [][] Mat2={{2,6,13},{3,7,1}};
        int [][] result=new int [2][3];
        //printing the element of 2D array
        for(int i=0; i<Mat1.length;i++){      //row no.of times
        for(int j=0; j<Mat1[i].length;j++){   //coloum no.of time
        result [i][j]=Mat1[i][j]+Mat2[i][j];
        System.out.print(result[i][j]+" ");
        }
        System.out.println();
        }
    }
    }
