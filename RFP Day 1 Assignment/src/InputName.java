import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        System.out.print("Enter a name : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("Name is " + a);
    }
}
