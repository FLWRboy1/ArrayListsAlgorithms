//frank mullahy
//2/26/26

public class TwodPractice {
    public static void main(String[]args){

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        returnsElements(arr);

    }

    public static String returnsElements(int [][] array){

        String randomStringSoThisWillWork = " ";

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                System.out.print(array[row][col]);

            }
            
            System.out.println();        

        }

        return randomStringSoThisWillWork;

    }

}