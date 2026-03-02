import java.util.ArrayList;

//use an enhances for loop for activity 2
//activity 3, find avg of the min of each row

public class PracticeTwo {
    
    public static void main(String[]args){

        int[][] arr = { {1,2,3,4} , {4,5,6,7} , {7,8,9,0} };
        int num = arr.length + 1;

        System.out.println(findRowAvg(arr, num));

    }

    public static int findRowAvg(int[][]array, int numRows){

        ArrayList<Integer> count = new ArrayList<Integer>();
        int totalSum = 0;
        int tempSum = 0;

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                tempSum += array[row][col];

            }

            count.add(tempSum);
            tempSum = 0;

        }

        System.out.println(count);

        for(int numbys : count){

            totalSum += numbys;

        }

        return totalSum;
    }

}
