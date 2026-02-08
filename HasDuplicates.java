import java.util.ArrayList;

public class HasDuplicates{
    
public static boolean hasDuplicates(ArrayList<Integer>nums){

    for (int i = 0; i < nums.size(); i++){

        for (int j = i + 1; j < nums.size(); j++){

            if (nums.get(i).equals(nums.get(j))){

                    return true;

                }

            }

        }

        return false;

    }

    public static void accessConsecutivePairs(ArrayList<Integer> nums){

        for (int i = 0; i < nums.size() - 1; i++){
        
            System.out.println(nums.get(i) + ", " + nums.get(i + 1));

        }

    }

    public static void main(String[]args){

        ArrayList <Integer> list = new ArrayList<Integer>();

        accessConsecutivePairs(list);

        hasDuplicates(list);

    }

}