
/**
 * Write a description of class ArrayCalculations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayCalculations
{
    public static double averageArray(int[][] nums) {
        double sum = 0;
        double average = 0;
        for(int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                sum += nums[row][col];
            }
        }
        average = sum/(nums.length * nums[0].length);
        return average;
    }
    public static int[] sumColumns(int[][] nums) {
        int sum = 0;
        int[] arrSum = new int[nums[0].length];
        
        for(int col = 0; col < nums[0].length; col++) {
            sum = 0;
            for(int row = 0; row <nums.length; row++){
            sum += nums[row][col];
            }
            arrSum[col] = sum;
        }
        return arrSum;
    }
    public static int[][] squareArray(int[][] nums) {
        for(int row = 0; row < nums.length; row++) {
            for(int col = 0; col < nums[0].length; col++) {
                nums[row][col] = nums[row][col] * nums[row][col];
            }
        }
        return nums;
    }
}
