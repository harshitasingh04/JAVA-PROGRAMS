class Person{
    String name;
    int age;
    public void speak(){
        System.out.println("My name is"+ name);
    }
    int calculateAge(){
        int yearsLeft=65-age;
        return yearsLeft;
    }
}
public class Methods {
    public static void main(String[] args){
       Person person1=new Person();
       person1.name="Harshita";
       person1.speak();
       person1.age=25;
       int years=person1.calculateAge();
       System.out.println("Years till retirement");
       System.out.println(years);
    }
}
