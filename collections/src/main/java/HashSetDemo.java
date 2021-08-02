import java.util.*;
public class HashSetDemo {
        public static void main(String [] args)
        {
            HashSet test = new HashSet();
            test.add("B");
            test.add("B");
            test.add("B");
            test.add("B");
            test.add("C");
            test.add("D");
            test.add("Z");
            test.add(null);
            test.add(10);
            System.out.println(test);
        }
    
}
