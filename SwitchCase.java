import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        int a;
        System.out.println("Please enter a value:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        switch(a){
            case 1:
            System.out.println("Hello World");
            break;
            case 2:
            System.out.println("Hello Harshita");
            break;
            case 3:
            System.out.println("Hello baby");
            break;
            default:
            System.out.println("Go to Hell!!");
            break;
        }
        sc.close();
    }
}
