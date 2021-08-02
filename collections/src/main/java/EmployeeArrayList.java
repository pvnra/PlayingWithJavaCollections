import java.util.ArrayList;

public class EmployeeArrayList {
    public static void main(String[] args) {
        // [0, 1, 2....110,111[]] 1921921921, 9999999
        ArrayList employee = new ArrayList();
        employee.add(111,"Alekhya");
        employee.add(112,"venkata");
        employee.add(113,"Naga");
        employee.add(114,"Raga");
        employee.add(115,"Pachipulusu");
       for(int i = 0; i<employee.size();i++) {
           System.out.println(i);
       }
    }
}
