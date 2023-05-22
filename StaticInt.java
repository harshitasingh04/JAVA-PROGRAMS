public class StaticInt {
    static int a = 4;
    static int b;
    //it only runs once when the first object is created
    //that is when the first time class is loades
    static {
        System.out.println("I am in static block");
        b = a *5;
    }
    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
        StaticInt.b += 3;
        StaticInt obj2 = new StaticInt();
        System.out.println(StaticInt.a + " " + StaticInt.b);
    }
}