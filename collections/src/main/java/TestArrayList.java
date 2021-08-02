import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
       for(int i=1;i<5;i++)
       {
           numbers.add(i);
       }
        // 1 2 3 4 5
        System.out.println("Printing the elements using Iterator");
       Iterator itr =  numbers.iterator();
       while (itr.hasNext())
       {
           Integer value = (Integer) itr.next();
           System.out.println(value);
           //numbers.remove(value);
           itr.remove();
       }
       //Collections.sort(numbers);
        numbers.sort(null);
    }
}
