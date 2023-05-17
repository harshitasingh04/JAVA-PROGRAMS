import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        String a;
        System.out.println("Please enter the string");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextLine();
        System.err.println(a);
        scanner.close();
    }
}
