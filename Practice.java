//Frank Mullahy
//2/2/26
//rapper class

import java.util.*;
import java.util.ArrayList;

public class Practice{

    public static void main(String[]args){

        Double d = 40.3;
        Integer i = 30;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int newInt = i;
        double newDouble = d;

        System.out.println(newInt * newDouble);



        ArrayList <String> list = new ArrayList <String> ();

        list.add("Ywatch");
        System.out.println(list);
        list.add("Allucard");
        System.out.println(list);
        list.add("Aizen");
        System.out.println(list);
        list.add(1,"Riccardo");    //the number is the location in the array that it will be inserted
        System.out.println(list);

        String store = list.set(2,"Gojo");
        String store2 = list.get(3);
        String store3 = list.remove(1); 


    }

}