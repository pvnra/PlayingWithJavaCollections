import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        LinkedList L1=new LinkedList();
        L1.add("venkata");
        L1.add(30);
        L1.add(null);
        L1.add("alekhya");
        System.out.println(L1);
        L1.set(0,"pachipulusu");
        L1.add(0,"alex");
        L1.addFirst("pvnr");
        System.out.println(L1);
    }
    
}
