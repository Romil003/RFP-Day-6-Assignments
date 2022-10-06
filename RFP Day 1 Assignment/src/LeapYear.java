import java.util.Scanner;

public class LeapYear {

    static void leapYear(int n){

        if (n>=1582){
            System.out.println("Year is valid");
            if(n%400 == 0){
                System.out.println(n + " is a Leap Year");
            }
            else if(n%4==0 && n%100!=0){
                System.out.println(n + " is a Leap Year");
            }
            else {
                System.out.println(n + " is not a Leap Year");

            }
        }
        else{
            System.out.println("Enter a valid year");
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter a Year : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        leapYear(a);
    }
}
