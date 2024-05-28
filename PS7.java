import java.util.Scanner;

public class PS7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c_pos =0, c_neg=0, c_zero=0;
        char choice;

        do{
            System.out.println("Enter the number");
            int number = input.nextInt();

            if(number>0){
                c_pos++;
            }else if(number<0)
            {
                c_neg++;
            }
            else
            {
                c_zero++;
            }
            System.out.print("Do you want to Continue y/n?");
            choice = input.next().charAt(0);
        }while(choice=='y'||choice=='Y');

        System.out.println("Positive numbers:"+c_pos);
        System.out.println("Negative numbers:"+c_neg);
        System.out.println("Zero numbers:"+c_zero);
    }
}
