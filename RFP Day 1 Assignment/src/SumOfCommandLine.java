import java.util.Scanner;

public class SumOfCommandLine {
    public static void main(String[] args) {
        System.out.println("Enter a two numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numbers");
        int a = sc.nextInt();
        System.out.println("Enter 2nd numbers");
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;
        if (a>0 && b>0){
            sum = a+b;
            System.out.println("Sum : " + sum);
        }
        else if (a<0 && b<0){
            count = 2;
            System.out.println("Invalid integer count : " + count);
        }
        else if (a<0 || b<0){
            count = 1;
            System.out.println("Invalid integer count : " + count);
        }
        else{

        }
    }
}
