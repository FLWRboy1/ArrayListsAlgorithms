import java.util.ArrayList;

public class FebFith {
    
    public static ArrayList <Integer> doublingSize(ArrayList <Integer> list){

        for(int i = 0; i < list.size(); i++){

            list.add(i+1, list.get(i));

        }

        return list;

    }

    public static void main(String[]args){

        ArrayList <Integer> newList = new ArrayList <Integer>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        System.out.println(doublingSize(newList));

    }

}