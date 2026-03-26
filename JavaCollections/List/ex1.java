package JavaCollections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(25);

        // list.get(2);
        // list.remove(4);
        // list.add(1, 71);
        // list.size();
        // System.out.println(list);



        List<Integer> list2 = new ArrayList<>();
        list2.add(22);
        list2.add(239809);
        list2.add(249809);
        list2.add(259809);
        list2.add(259809);

        // System.out.println(list2);

        // list2.add(1, 232); // add's the elem on speficed index
        // list2.addFirst(121); // add's the elem to the first index
        // list2.addLast(65); // add's the elem to the last index
        // list2.addAll(list); // add another list - or we can say merge two lists
        // list2.addAll(2, list); // add' the hole list to specified index

        // boolean res = list2.contains(229809);  // return true or false if list contains elem
        // System.out.println(res);
        
        // boolean res = list2.containsAll(list); // this takes list as agrs returns true or fal se
        // System.out.println(res);

        // for(int elem : list2){
        //     System.out.println(elem);
        // }

        // System.out.println(list2.getFirst());  // returns the first elem of list
        // System.out.println(list2.getLast());  // returns the last elem of list
        // System.out.println(list2.isEmpty());  // return true of false

        Iterator<Integer> iterator =  list.iterator();
        while (iterator.hasNext()) {
            int items = iterator.next();
            System.out.println(items);
        }

        // System.out.println(list2);s
    }
}
