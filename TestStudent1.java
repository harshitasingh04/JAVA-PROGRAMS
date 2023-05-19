class Student {
    int rollno;
    String name;
    float marks;
    Student() {
        this.rollno = 10;
        this.name = "Harshita";
        this.marks = 98;
    }
    Student(int rno, String name, float marks) {
        this.rollno = rno;
        this.name = name;
        this.marks = marks;
    }
}
class TestStudent1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        // student1.rollno = 10;
        // student1.name = "Harshita";
        // student1.marks = 98;
        System.out.println(student1.name);
        System.out.println(student1.rollno);
        System.out.println(student1.marks);
        Student student2 = new Student(12, "Krish", 92);
        System.out.println(student2.name);
        System.out.println(student2.rollno);
        System.out.println(student2.marks);
    }
}