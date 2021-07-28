package ArraysAndStrings;

public class ArrayRotation {

    public static void rotateArrayBy90(int[][] matrix) {
        int length = matrix.length;
        int[][] result = new int[length][length];
        for(int i=0; i<length; i++)
            for(int j=0; j<length; j++)
                result[j][length-i-1] = matrix[i][j];

        for(int i=0; i<length; i++)
            for(int j=0; j<length; j++)
                matrix[i][j] = result[i][j];

    }



    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int length = matrix.length;
        rotateArrayBy90(matrix);
        for(int i=0; i<length; i++)
            for(int j=0; j<length; j++)
                System.out.println(matrix[i][j]);
    }
}
