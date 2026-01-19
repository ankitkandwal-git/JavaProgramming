package Loops.WhileLoop;

public class Main {
    public static void main(String[] args){
        int count = 1;
        while(count <= 5){
            System.out.println("Count is: " + count);
            count++;
        }
        System.out.println();
        int table = 5;
        int i=1;
        while(i<=10){
            System.out.println(table + " x " + i + " = " + (table * i));
            i++;
        }
    }
}
