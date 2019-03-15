package examples;

import auxiliar.Person;

public class C_Polymorphism {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.eat();

        Programmer programmer = new Programmer();
        //call programmer methods
//        programmer.eat();
//        programmer.writeCode();

        Manager manager = new Manager();
        //call manager methods
//        manager.eat();
//        manager.reportProjectStatus();

        Employee[] team1 = new Employee[]{
                employee1,
                new Programmer(),
                new Manager()
        };

        for (Employee employee : team1) {
            employee.showJobTitle();
        }
    }
}

//extend Person in Employee to exemplify default vs protected access modifiers
class Employee extends Person {
    //add access modifier
    String name;
    String address;
    int age;
    String experience;

    //add constructor

    public void eat(){
        System.out.println("I am a human, I eat.");
    }

    //overriding this method
    public void showJobTitle() {
        System.out.println("I am just a generic employee");
    }

    //overide protected method from person using keyboard shortcuts
    @Override
    protected void breath() {
        System.out.println("An employee can also breath");

    }

}

class Programmer extends Employee {
    private String[] programmingLanguages;

    //add constructor
    //add super call

    public void writeCode() {
        System.out.println("I write code in java");
    }

    //change access modifier to default/protected/private
    public void showJobTitle() {
        System.out.println("I am a programmer");
    }


    //Overloading
    public String communicate(String message){
        System.out.println(message);
        return "I communicate one message as a normal employee";
    }

    // different parameters
    public String communicate(String message1, String message2){
        System.out.println(message1);
        System.out.println(message2);
        return "I communicate two messages as a normal employee";
    }

    //different return type
    public int communicate(){
        System.out.println("I communicate in 1 and 0");

        return 1;
    }

    //different return type but same parameter list
//    public int communicate(String message){
//        System.out.println("I communicate in 1 and 0");
//
//        return 1;
//    }

    //different access modifiers
    private String communicate(int i){
        return "I like the number " + i;
    }
}

class Manager extends Employee {
    private int teamSize;

    public void reportProjectStatus() {
        System.out.println("The project is going fine!");
    }


    public void showJobTitle() {
        System.out.println("I am a Manager");
    }

}



