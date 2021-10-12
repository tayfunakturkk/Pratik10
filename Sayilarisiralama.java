package Pratik10;
import java.util.Scanner;
public class Sayilarisiralama {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter number1:");
        n1 = input.nextInt();

        System.out.print("Please enter number2:");
        n2 = input.nextInt();

        System.out.print("Please enter number3:");
        n3 = input.nextInt();

        if(n1<n2 && n1<n3){
            if (n2<n3){
                System.out.println("n1<n2<n3");
            }
            else{
                System.out.println("n1<n3<n2");
            }
        }
        else if(n2<n1 && n2<n3){
            if (n1<n3){
                System.out.println("n2<n1<n3");


            }
            else if (n3<n1){
                System.out.println("n2<n3<n1");
            }
        }


        else if(n3<n1 && n3<n2) {
            if (n2<n1){
            System.out.println("n3<n2<n1");
        }
            else if(n1<n2){
                System.out.println("n3<n1<n2");
            }
        }

    }
}
