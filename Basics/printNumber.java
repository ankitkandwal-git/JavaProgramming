package Basics;
import java.util.Scanner;
public class printNumber{
    public static void main(String args[]){
            System.out.println("Printing a number:");
            try(Scanner sc = new Scanner(System.in)){
            int n  = sc.nextInt();
            System.out.println(n);
    }
}
}