package Arrayss;

public class SetMatrixZeroes {
    public static void main(String[] args) {
       
    }
    public static void setZeroes(int[][] matrix) {
        boolean firstrow=false;
        boolean firstcol=false;
        //1 set marker for the row and col
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0) {
                    if (i==0) {
                        firstrow=true;
                    }
                     if (j==0) {
                        firstcol=true;
                    }
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                    
                }
            }
        }

        //2 REPLACING INNER =1 MATRIX ACCORDING SET MARKERS
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0]==0 || matrix[0][j]==0) {
                    matrix[i][j]=0;
                }
            }
        }

        //3 LAST Reaming checks for the markers
        if(firstrow){
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j]=0;
            }
        }

        if(firstcol){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0]=0;
            }
        }
        
    }




}
