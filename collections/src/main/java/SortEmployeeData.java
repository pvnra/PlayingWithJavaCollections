
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class SortEmployeeData {
    public static void main(String[] args) {
    //creating an arraylist
    ArrayList<Employee> employees = new ArrayList<Employee>();
    employees.add(new Employee("C",1));
    employees.add(new Employee("B",2));
    employees.add(new Employee("A",3));
    
     Collections.sort(employees);
        Iterator emp = employees.iterator();
        while(emp.hasNext())
        {
            Employee employee = (Employee) emp.next();
            System.out.println(employee);
        }
        
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                Integer o1id = o1.eid;
                Integer o2id = o2.eid;
                return o1id.compareTo(o2id);
            }
            
        });
         emp = employees.iterator();
        while(emp.hasNext())
        {
            Employee employee = (Employee) emp.next();
            System.out.println(employee);
        }
    }
    
    
    
}
