import java.util.ArrayList;

public class Reverse {
    
    public static void main(String[]args){

        ArrayList <String> originalList = new ArrayList<String>();

        originalList.add("a");
        originalList.add("b");
        originalList.add("c");
        originalList.add("d");
        originalList.add("e");
        originalList.add("f");
        originalList.add("g");

        System.out.println(reverseThis(originalList));

    }

    public static ArrayList <String> reverseThis(ArrayList <String> list){

        ArrayList <String> placeholder = new ArrayList<String>();

        for(int i = list.size()-1; i >= 0; i--){

            placeholder.add(list.get(i));

        }

        return placeholder;

    }

}