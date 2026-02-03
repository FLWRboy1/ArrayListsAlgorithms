import java.io.IOException;
import java.util.ArrayList;

public class TestingTheThing{
    
    public static void main(String[]args) throws IOException{


        ArrayList<String> names = new ArrayList<String>();
        names.add(0,"a");
        names.add(1,"b");
        int i = 0;

        while(i < names.size()){

            names.get(i);

            i++;

        }

        System.out.println(names);



        ArrayList<String> list = new ArrayList<String>();

        list.add("ab");
        list.add("cd");
        list.add("ef");
        list.add("gh");
        list.add("abcdefgh");

        for(int x = 0; x < list.size(); x++){
            
            if(list.get(x).substring(0,1).equals("a")){

                list.set(x,"starts with a");

            }

        }

        System.out.println(list);



        ArrayList<String> listNO2 = new ArrayList<String>();

        list.add("ab");
        list.add("cd");
        list.add("ef");
        list.add("gh");
        list.add("abcdefgh");

        int index = 0;

        while(i < listNO2.size()){

            if(listNO2.get(index).indexOf("ef") >= 0){

                listNO2.remove(index);

            }

        }
               
        
        
        //ArrayList<String> arrays = new ArrayList<String>();

        //for(String array : arrays){

            //arrays.get();

        //}

    }

}
