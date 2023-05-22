public class Human {
    String name;
    int age;
    long salary;
    boolean married;
    //static variables are independent of objects
    //whenever you use/modify/access static variable 
    //do it by using class eg. Human.population
    //dont refer it using object/this eg. this.population or harshita.population
    static long population;
    public Human(String name, int age, long salary, Boolean married) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
    }
}