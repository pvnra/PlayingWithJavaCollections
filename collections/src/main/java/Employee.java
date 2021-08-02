public class Employee implements Comparable<Employee>{
    //creating variables name and id .
   String ename;
    int eid;
    Employee( String name, int id){
        this.ename = name;
        this.eid = id;
    }
    
    @Override
    public int compareTo(Employee o) {
        return this.ename.compareTo(o.ename);
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "ename='" + ename + '\'' +
                ", eid=" + eid +
                '}';
    }
}
