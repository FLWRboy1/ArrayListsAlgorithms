import java.util.*;

public class FebSixth{

    public static boolean hasDuplicates(ArrayList<Integer> nums){
        
        boolean statement;

        for(int i = 0; i < nums.size(); i++){}

            for(int j = i; j < nums.size){

                if(nums.get(i).equals(nums.get(j))){


                }

            }

        }

    }

    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);

        for (int i = 0; i < 5; i++)
        {

            list.add(i);

        }

        boolean result1 = hasDuplicates(list);
        System.out.println("Your Result: " + result1);

    }
}
