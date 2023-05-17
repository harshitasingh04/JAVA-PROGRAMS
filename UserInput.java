import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        int a;
        System.out.println("Please enter an integer:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.println(a);
        sc.nextLine();
        String b;
        System.out.println("Please enter a String:");
        b=sc.nextLine();
        System.out.println(b);
        sc.close();
    }
}
