package JavaExercise;

class Employee {
    int id;
    String name;

    public Employee() {
        id = 222;
        name = "John";
    }

    public Employee(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }
}

class Manager extends Employee {
    public Manager(int id, String name) {
        super(id, name);
    }
}

public class Test3 {
    public static void main(String[] args) {
        Employee e = new Manager(111, "Dave");
        System.out.println("Id " + e.id + " Name " + e.name);
    }
}

