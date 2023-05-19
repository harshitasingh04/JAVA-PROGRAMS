public class Final {
    //we have to initialize the primitive data type while declaring if we made it final
    final int num = 20;
    String name;
    public static void main(String[] args) {
        final Final student = new Final();
        student.name="Harshu";
        //final Final other = new Final();
        //when we make a non-primitive data type final
        //its attributes can be modified
        //but it cannot be.
        //student = other;
    }
}
