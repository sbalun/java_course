package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(21);
        person.setName("Scott");
        person.setGender("Male");

        Employee employee = new Employee();
        employee.setName("Jerry");
        employee.setAge(420);

        var age = employee.getAge();
        var name = employee.getName();
        System.out.println(age);
        System.out.println(name);
    }

}
