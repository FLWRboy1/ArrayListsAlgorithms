import java.util.ArrayList;
import java.util.Random;

public class RemoveDuplicates{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++){

            nums.add(rand.nextInt(10) + 1);

        }

        System.out.print("Original list: ");



        for (int i = 0; i < nums.size(); i++){

            System.out.print(nums.get(i) + " ");

        }

        System.out.println();

     

        ArrayList<Integer> noDuplicates = removeDuplicates(nums);

        System.out.print("List without Duplicates: ");

        for (int i = 0; i < noDuplicates.size(); i++){

            System.out.print(noDuplicates.get(i) + " ");

        }
    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){

        for (int i = 0; i < list.size(); i++){

            for (int j = i + 1; j < list.size(); j++){
            
                if (list.get(i).equals(list.get(j))){
                
                    System.out.println("Removed: " + list.get(j));
                    list.remove(j);
                    j--; 

                }

            }

        }

        return list;

    }
    
}
