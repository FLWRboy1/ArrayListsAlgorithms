public class Practicethree {
    
    public static void main(String[]args){

        String [][] arr = { {"Jack","Jill","Jane","Joey"} , {"Maura","Molly","Mason","Maureen"} , {"Emma","Eileen","Elizabeth","Emma"} };

        System.out.println( shortenMe(arr, arr.length, arr[0].length) );

    }

    public static String [][] shortenMe( String[][] array, int rows, int collums ){

        String [][] shortArray = new String [rows][collums];

        for(int row = 0; row < array.length; row++){

            for(int col = 0; col < array[0].length; col++){

                if(array[row][col].length() <= 3){

                    String x = array[row][col];
                    array[row][col] = x;

                }else{
    
                    String x = array[row][col].substring(0,4);
                    array[row][col] = x;

                }

            }

        }

        return shortArray;

    }

}