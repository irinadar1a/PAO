package tasks.task4;


public class Main {
    public static void main(String args[]){
        int[][] matrix = {{5,2,1},{3,9,8},{5,7,3}};
        for (int i = 0 ; i < matrix.length; i++)
        {
            for(int j=0 ; j < matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------------------");

        for( int[] row : matrix) {
            for( int item : row){
                System.out.print(item);
            }
            System.out.println();
        }
    }
}
