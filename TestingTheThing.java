import java.util.ArrayList;

public class TestingTheThing {
    
    public static void main(String[]args){


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

        list.add(0,"c");
        list.add(1,"d");

        //for(int x = 0; x < list.size(); x++){
            
            //list.get(x);
            
        //}

        System.out.println(list);
                
    }

}
