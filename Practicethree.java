public class Practicethree {
    
    public static void main(String[]args){

        String [][] arr = { {"Jack","Jill","Jane","Joey"} , {"Maura","Molly","Mason","Maureen"} , {"Emma","Eileen","Elizabeth","Emma"} };

        String [][] shortened = shortenMe(arr, arr.length, arr[0].length);
        printArray(shortened);

        System.out.println( countduplicates(arr) );

        String [][] shifted = shiftMe(arr);
        printArray(shifted);

    }

    public static String [][] shortenMe( String[][] array, int rows, int collums ){

        String [][] shortArray = new String [rows][collums];

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                if(array[row][col].length() <= 3){

                    shortArray[row][col] = array[row][col];

                }else{
    
                    shortArray[row][col] = array[row][col].substring(0,3);

                }

            }

        }

        return shortArray;

    }

    public static int countduplicates( String [][] array ){

        int maxRow = 0;
        int maxDuplicates = 0;

        for(int row = 0; row < array.length; row++){

            int duplicates = 0;

            for(int i = 0; i < array[row].length; i++){

                for(int j = i + 1; j < array[row].length; j++){

                    if(array[row][i].equals(array[row][j])){

                        duplicates++;

                    }

                }

            }

            if(duplicates > maxDuplicates){

                maxDuplicates = duplicates;
                maxRow = row;

            }

        }

        return maxRow;

    }

    public static String [][] shiftMe( String [][] array ){

        int rows = array.length;
        int cols = array[0].length;

        String [][] shifted = new String[rows][cols];

        shifted[0][0] = array[rows - 1][cols - 1];

        int r = 0;
        int c = 1;

        for(int row = 0; row < rows; row++){

            for(int col = 0; col < cols; col++){

                if(row == rows - 1 && col == cols - 1){

                    continue;

                }

                shifted[r][c] = array[row][col];

                c++;

                if(c == cols){

                    c = 0;
                    r++;

                }

            }

        }

        return shifted;

    }

    public static void printArray( String [][] array ){

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                System.out.print(array[row][col] + "\t");

            }

            System.out.println();

        }

        System.out.println();

    }

}