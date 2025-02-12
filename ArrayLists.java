import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);

        list.add(1,1);
        System.out.println(list);

        list.set(0,5);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        int size = list.size();
        System.out.println(size);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
