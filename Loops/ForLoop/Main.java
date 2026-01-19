package Loops.ForLoop;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        System.out.println("Enter the  table of:" );
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(n + " x "+i+" = "+(n*i));
            }
        }
    }
}
