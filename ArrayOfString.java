import java.util.Scanner;
public class ArrayOfString {
    public static void main(String[] args){
        String arr[]=new String[5];
        int n;
        System.out.println("Please enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
          arr[i]=sc.nextLine();
        }
        sc.nextLine();
        for(int j=0;j<n;j++){
            System.out.print("Your Array is:");
            System.out.println(arr[j]);
        }
        sc.close();
    }
}
