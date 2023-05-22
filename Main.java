public class Main {
    public static void main(String[] args) {
        //why is main method static?
        //static mean we can access a method without creating an object of that class
        //main is the driver code 
        //main is the first thing which runs when code executes
        //so we cannot create any object without getting main to run
        //this is why we make main method static
        Human harshita = new Human("Harshita,", 21, 100000, false);
        System.out.println(harshita.name);
        System.out.println(harshita.age);
        System.out.println(harshita.salary);
        System.out.println(harshita.married);
    }
}