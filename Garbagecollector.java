class Employee{
    int id;

    Employee(int id){
        this.id = id;
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Employee object " + id + "is garbage collected");
    }
}

public class Garbagecollector {
    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(102);
        Employee e3 = new Employee(103);

        e1 = null;
        e2 = e3;

        System.gc();
        System.out.println("Garbage collector requested");
    }
    
}

//Is GC guaranteed to run?
// No. System.gc() only requests JVM
// What happens if finalize() is removed?
// GC still works. Objects still removed
