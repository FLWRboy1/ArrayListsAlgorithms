import java.util.ArrayList;

public class PracticeTwo {
    
    public static void main(String[]args){

        int[][] arr = { {1,2,3,4} , {4,5,6,7} , {7,8,9,0} };
        int num = arr.length + 1;

        System.out.println(findRowAvg(arr, num));
        System.out.println(findMinRowAvg(arr));

    }

    public static int findRowAvg(int[][]array, int numRows){

        ArrayList<Integer> count = new ArrayList<Integer>();
        int totalSum = 0;
        int avg = 0;

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                avg += array[row][col];

            }

            count.add(avg);
            avg = 0;

        }

        System.out.println(count);

        for(int numbys : count){

            totalSum += numbys;

        }

        return totalSum;

    }

    public static int findMinRowAvg(int[][]array){

    ArrayList<Integer> mins = new ArrayList<Integer>();
    int totalSum = 0;
    int avg = 0;

    for(int row = 0; row < array.length; row++){

        int min = array[row][0];

        for(int col = 0; col < array[0].length; col++){

            if(array[row][col] < min){

                min = array[row][col];

            }

        }

        mins.add(min);

    }

    System.out.println(mins);

    for(int num : mins){

        totalSum += num;

    }

    avg = totalSum / mins.size();

    return avg;
}

}
