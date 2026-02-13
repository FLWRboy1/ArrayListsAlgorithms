//Frank Mullahy
//2/9/26

import java.util.ArrayList;

public class RemoveMe {
    
    public static ArrayList <Integer> removeMe(ArrayList <Integer> nums){

        for(int i = 0; i < nums.size(); i++){

            if(nums.get(i).equals(3)){

                nums.remove(i);

            }

        }

        return nums;

    } 

    public static void main(String[]args){

        ArrayList <Integer> list = new ArrayList <Integer> ();
        list.add(0);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(3);

        System.out.println(removeMe(list));

    }

}
