import java.util.Scanner;

public class PS5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = 'Y';
        while(input=='Y'){
            System.out.println("Enter your age");

            int age = sc.nextInt();

            if(age>=18){
                System.out.println("Person is allowed to vote");
            } else{
                System.out.println("Person is not allowed to vote");
            }
            System.out.println("To continue press Y");
            System.out.println("To exit press another key");

            input = sc.next().charAt(0);
        }
        System.out.println("Person Terminated");
        sc.close();
    }
}
