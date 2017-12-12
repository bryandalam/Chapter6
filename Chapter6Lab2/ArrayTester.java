
/**
 * Write a description of class ArrayTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayTester
{
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,}, {1,1,1}};
        System.out.println(ArrayCalculations.averageArray(arr));
        int[]  a = ArrayCalculations.sumColumns(arr);
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int[][] b = ArrayCalculations.squareArray(arr);
        for (int i = 0; i < b.length; i++) {
            for (int c = 0; i < b[0].length; c++) {
            System.out.println(b[i][c]);
           }
        }
  }
}
